package efdUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeEscreveExcel {

	public static Map<String, String> leExcel()   {

		String filePath = "CFOP_tabela.xlsx";
		
		Map<String, String> keyValue = new HashMap<String, String>();
		
		
		try {
			// Abrindo o arquivo e recuperando a planilha
			FileInputStream file = new FileInputStream(new File(filePath));
			XSSFWorkbook workbook = null;
			try {
				workbook = new XSSFWorkbook(file);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// Descartando a primeira linha com o header
				if (row.getRowNum() == 0) {
					continue;
				}

				Iterator<Cell> cellIterator = row.cellIterator();
				String key = "";
				String value = "";
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						key =  cell.getStringCellValue();
						break;
					case 1:
						value = cell.getStringCellValue();
						break;

					}
				} // end inner while
				keyValue.put(key, value);

			} // end outer while

			file.close();
			workbook.close();
			
			return keyValue;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
public static void main(String[] args) throws IOException {
	Map<String, String> keyValue = leExcel();
	
	if(keyValue != null) {
		for(String value : keyValue.values()) {
			System.out.println(value);
		}
	}else {
		System.out.println("keyValue é null.");
	}
}
/*
public static void main( String[] args )
{
// Criando o arquivo e uma planilha chamada "Product"
HSSFWorkbook workbook = new HSSFWorkbook();
HSSFSheet sheet = workbook.createSheet("Product");
// Definindo alguns padroes de layout
sheet.setDefaultColumnWidth(15);
sheet.setDefaultRowHeight((short)400);

//Carregando os produtos
List products = getProducts();

int rownum = 0;
int cellnum = 0;
Cell cell;
Row row;

//Configurando estilos de células (Cores, alinhamento, formatação, etc..)
HSSFDataFormat numberFormat = workbook.createDataFormat();

CellStyle headerStyle = workbook.createCellStyle();
headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
headerStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

CellStyle textStyle = workbook.createCellStyle();
textStyle.setAlignment(CellStyle.ALIGN_CENTER);
textStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

CellStyle numberStyle = workbook.createCellStyle();
numberStyle.setDataFormat(numberFormat.getFormat(“#,##0.00”));
numberStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

// Configurando Header
row = sheet.createRow(rownum++);
cell = row.createCell(cellnum++);
cell.setCellStyle(headerStyle);
cell.setCellValue(“Code”);

cell = row.createCell(cellnum++);
cell.setCellStyle(headerStyle);
cell.setCellValue(“Name”);

cell = row.createCell(cellnum++);
cell.setCellStyle(headerStyle);
cell.setCellValue(“Price”);

// Adicionando os dados dos produtos na planilha
for (Product product : products) {
row = sheet.createRow(rownum++);
cellnum = 0;

cell = row.createCell(cellnum++);
cell.setCellStyle(textStyle);
cell.setCellValue(product.getId());
ell = row.createCell(cellnum++);
cell.setCellStyle(textStyle);
cell.setCellValue(product.getName());

cell = row.createCell(cellnum++);
cell.setCellStyle(numberStyle);
cell.setCellValue(product.getPrice());
}

try {

//Escrevendo o arquivo em disco
FileOutputStream out = new FileOutputStream(new File(“/tmp/products.xls”));
workbook.write(out);
out.close();
workbook.close();
System.out.println(“Success!!”);

} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}
}
*/
}
