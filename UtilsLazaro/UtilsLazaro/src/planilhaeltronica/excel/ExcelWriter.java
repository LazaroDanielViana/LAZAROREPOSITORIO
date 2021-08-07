package planilhaeltronica.excel;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelWriter {

	protected void writeResultsetToExcelFile(ResultSet rs, int numSheets, String fileNameAndPath, String tipoExcel) throws Exception {

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileNameAndPath));
		int numColumns = rs.getMetaData().getColumnCount();

		Workbook wb = ExcelFileUtil.createExcelWorkBook(true, numSheets);
		Row heading = wb.getSheetAt(0).createRow(1);

		ResultSetMetaData rsmd = rs.getMetaData();

		for (int x = 0; x < numColumns; x++) {
			Cell cell = heading.createCell(x + 1);
			cell.setCellValue(rsmd.getColumnLabel(x + 1));
		}

		int rowNumber = 2;
		int sheetNumber = 0;

		while (rs.next()) {

			if (rowNumber == 65001) {
				log("Sheet " + sheetNumber + "written; moving onto to sheet " + (sheetNumber + 1));
				sheetNumber++;
				rowNumber = 2;
			}

			Row row = wb.getSheetAt(sheetNumber).createRow(rowNumber);
			for (int y = 0; y < numColumns; y++) {
				row.createCell(y + 1).setCellValue(rs.getString(y + 1));
				wb.write(bos);
			}

			rowNumber++;
		}

		// wb.write(bos);

		bos.close();
	}

}
