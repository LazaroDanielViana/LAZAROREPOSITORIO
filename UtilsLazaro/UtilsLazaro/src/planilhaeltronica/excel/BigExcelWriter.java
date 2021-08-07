package planilhaeltronica.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.google.common.collect.ImmutableList;

public interface BigExcelWriter {

	BigExcelWriter createWorkbook();

	BigExcelWriter addSheets(String[] sheetNames);

	SpreadsheetWriter createSpreadsheetWriter(XSSFSheet sheet) throws IOException;

	File completeWorkbook() throws IOException;

	BigExcelWriter writeWorkbookTemplate() throws IOException;

	SpreadsheetWriter createSpreadsheetWriter(String sheetName) throws IOException;

	Workbook getWorkbook();

	ImmutableList<XSSFSheet> getSheets();
	
}
