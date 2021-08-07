package planilhaeltronica.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SXSSFexample {
	public static void main(String[] args) throws Throwable {
        long t1 = System.currentTimeMillis();
		FileInputStream inputStream = new FileInputStream("mytemplate.xlsx");
        XSSFWorkbook wb_template = new XSSFWorkbook(inputStream);
        inputStream.close();

        SXSSFWorkbook wb = new SXSSFWorkbook(wb_template); 
        wb.setCompressTempFiles(true);

        SXSSFSheet sh = (SXSSFSheet) wb.getSheetAt(0);
        sh.setRandomAccessWindowSize(100);// keep 100 rows in memory, exceeding rows will be flushed to disk
        
        SXSSFSheet sh1 = (SXSSFSheet) wb.createSheet("Teste2");
        sh1.setRandomAccessWindowSize(100);// keep 100 rows in memory, exceeding rows will be flushed to disk
        
	    for(int rownum = 4; rownum < 1000000; rownum++){
	        Row row = sh.createRow(rownum);
	        for(int cellnum = 0; cellnum < 10; cellnum++){
	            Cell cell = row.createCell(cellnum);
	            String address = new CellReference(cell).formatAsString();
	            cell.setCellValue(address);
	        }	
	    }
	    
	    for(int rownum = 4; rownum < 1000000; rownum++){
	        Row row = sh1.createRow(rownum);
	        for(int cellnum = 0; cellnum < 10; cellnum++){
	            Cell cell = row.createCell(cellnum);
	            String address = new CellReference(cell).formatAsString();
	            cell.setCellValue(address);
	        }	
	    }

	    FileOutputStream out = new FileOutputStream("tempsxssf.xlsx");
	    wb.write(out);
	    out.close();
	    
	    long t2 = System.currentTimeMillis();
	    System.out.println("Tempo gasto: " + (t2-t1) + " segundos!");
}

}


