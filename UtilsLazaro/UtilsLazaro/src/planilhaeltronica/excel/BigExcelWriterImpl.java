package planilhaeltronica.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;


public class BigExcelWriterImpl implements BigExcelWriter {

private static final String  XML_ENCODING = "UTF-8";

@Nonnull
private final File outputFile ;

@Nullable
private final File tempFileOutputDir;

@Nullable
private File templateFile = null;

@Nullable
private XSSFWorkbook workbook = null;

@Nonnull
private LinkedHashMap<String, XSSFSheet> addedSheets = new LinkedHashMap<String, XSSFSheet>();

@Nonnull
private Map<XSSFSheet, File> sheetTempFiles = new HashMap<XSSFSheet, File>();

BigExcelWriterImpl(@Nonnull File outputFile) {
    this.outputFile = outputFile;
    this.tempFileOutputDir = outputFile.getParentFile();
}

@Override
public BigExcelWriter createWorkbook() {
    workbook = new XSSFWorkbook();
    return this;
}

@Override
public BigExcelWriter addSheets(String... sheetNames) {
    checkState(workbook != null, "workbook must be created before adding sheets");

    for (String sheetName : sheetNames) {
        XSSFSheet sheet = workbook.createSheet(sheetName);
        addedSheets.put(sheetName, sheet);
    }

    return this;
}

@Override
public BigExcelWriter writeWorkbookTemplate() throws IOException {
    checkState(workbook != null, "workbook must be created before writing template");
    checkState(templateFile == null, "template file already written");

    templateFile = File.createTempFile(FilenameUtils.removeExtension(outputFile.getName())
            + "-template", ".xlsx", tempFileOutputDir);
    System.out.println(templateFile);
    FileOutputStream os = new FileOutputStream(templateFile);
    workbook.write(os);
    os.close();

    return this;
}

@Override
public SpreadsheetWriter createSpreadsheetWriter(String sheetName) throws IOException {
    if (!addedSheets.containsKey(sheetName)) {
        addSheets(sheetName);
    }

    return createSpreadsheetWriter(addedSheets.get(sheetName));
}

@Override
public SpreadsheetWriter createSpreadsheetWriter(XSSFSheet sheet) throws IOException {
    checkState(!sheetTempFiles.containsKey(sheet), "writer already created for this sheet");

    File tempSheetFile = File.createTempFile(
            FilenameUtils.removeExtension(outputFile.getName())
                    + "-sheet" + sheet.getSheetName(), ".xml", tempFileOutputDir);

    Writer out = null;
    try {
        out = new OutputStreamWriter(new FileOutputStream(tempSheetFile), XML_ENCODING);
        SpreadsheetWriter sw = new SpreadsheetWriterImpl(out);

        sheetTempFiles.put(sheet, tempSheetFile);
        return sw;
    } 
    catch (RuntimeException e) {
        if (out != null) {
            out.close();
        }
        throw e;
    }
}

private void checkState(boolean b, String string) {
	if(b) {
		System.out.println(string);
	}
}

private static Function<XSSFSheet, String> getSheetName = new Function<XSSFSheet, String>() {

    @Override
    public String apply(XSSFSheet sheet) {
        return sheet.getPackagePart().getPartName().getName().substring(1);
    }
};

@Override
public File completeWorkbook() throws IOException {
    FileOutputStream out = null;
    try {
        out = new FileOutputStream(outputFile);
        ZipOutputStream zos = new ZipOutputStream(out);

        Iterable<String> sheetEntries = Iterables.transform(sheetTempFiles.keySet(), getSheetName);
        System.out.println("Sheet Entries: " + sheetEntries);
        copyTemplateMinusEntries(templateFile, zos, sheetEntries);

        for (Map.Entry<XSSFSheet, File> entry : sheetTempFiles.entrySet()) {
            XSSFSheet sheet = entry.getKey();
            substituteSheet(entry.getValue(), getSheetName.apply(sheet), zos);
        }
        zos.close();
        out.close();

        return outputFile;
    } finally {
        if (out != null) {
            out.close();
        }
    }
}

private static void copyTemplateMinusEntries(File templateFile,
        ZipOutputStream zos, Iterable<String> entries) throws IOException {

    ZipFile templateZip = new ZipFile(templateFile);

    @SuppressWarnings("unchecked")
    Enumeration<ZipEntry> en = (Enumeration<ZipEntry>) templateZip.entries();
    while (en.hasMoreElements()) {
        ZipEntry ze = en.nextElement();
        if (!Iterables.contains(entries, ze.getName())) {
            System.out.println("Adding template entry: " + ze.getName());
            zos.putNextEntry(new ZipEntry(ze.getName()));
            InputStream is = templateZip.getInputStream(ze);
            copyStream(is, zos);
            is.close();
        }
    }
}

private static void substituteSheet(File tmpfile, String entry, ZipOutputStream zos)       throws IOException {
    System.out.println("Adding sheet entry: " + entry);
    zos.putNextEntry(new ZipEntry(entry));
    InputStream is = new FileInputStream(tmpfile);
    copyStream(is, zos);
    is.close();
}

private static void copyStream(InputStream in, OutputStream out) throws IOException {
    byte[] chunk = new byte[1024];
    int count;
    while ((count = in.read(chunk)) >= 0) {
        out.write(chunk, 0, count);
    }
}

@Override
public Workbook getWorkbook() {
    return workbook;
}

@Override
public ImmutableList<XSSFSheet> getSheets() {
    return ImmutableList.copyOf(addedSheets.values());
}

}

