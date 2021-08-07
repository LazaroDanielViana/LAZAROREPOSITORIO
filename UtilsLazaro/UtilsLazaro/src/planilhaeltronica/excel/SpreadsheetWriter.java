package planilhaeltronica.excel;

import java.io.IOException;
import java.util.Calendar;

public interface SpreadsheetWriter {

	SpreadsheetWriter closeFile() throws IOException;

	SpreadsheetWriter beginSheet() throws IOException;

	SpreadsheetWriter endSheet() throws IOException;

	SpreadsheetWriter insertRow(int rownum) throws IOException;

	SpreadsheetWriter endRow() throws IOException;

	SpreadsheetWriter createCell(int columnIndex, String value, int styleIndex) throws IOException;

	SpreadsheetWriter createCell(int columnIndex, String value) throws IOException;

	SpreadsheetWriter createCell(int columnIndex, double value, int styleIndex) throws IOException;

	SpreadsheetWriter createCell(int columnIndex, double value) throws IOException;

	SpreadsheetWriter createCell(int columnIndex, Calendar value, int styleIndex) throws IOException;

	SpreadsheetWriter createCell(int columnIndex, Calendar value) throws IOException;

}
