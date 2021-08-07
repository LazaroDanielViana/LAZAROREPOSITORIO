package planilhaeltronica.excel;

import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.util.CellReference;

public class SpreadsheetWriterImpl implements SpreadsheetWriter {

	private static final String XML_ENCODING = "UTF-8";

	private final Writer _out;
	private int _rownum;

	SpreadsheetWriterImpl(Writer out) {
		_out = out;
	}

	@Override
	public SpreadsheetWriter closeFile() throws IOException {
		_out.close();

		return this;
	}

	@Override
	public SpreadsheetWriter beginSheet() throws IOException {
		_out.write("<?xml version=\"1.0\" encoding=\"" + XML_ENCODING + "\"?>"
				+ "<worksheet xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\">");
		_out.write("<sheetData>\n");

		return this;
	}

	@Override
	public SpreadsheetWriter endSheet() throws IOException {
		_out.write("</sheetData>");
		_out.write("</worksheet>");

		closeFile();
		return this;
	}

	/**
	 * Insert a new row
	 * 
	 * @param rownum 0-based row number
	 */
	@Override
	public SpreadsheetWriter insertRow(int rownum) throws IOException {
		_out.write("<row r=\"" + (rownum + 1) + "\">\n");
		this._rownum = rownum;

		return this;
	}

	/**
	 * Insert row end marker
	 */
	@Override
	public SpreadsheetWriter endRow() throws IOException {
		_out.write("</row>\n");

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, String value, int styleIndex) throws IOException {
		String ref = new CellReference(_rownum, columnIndex).formatAsString();
		_out.write("<c r=\"" + ref + "\" t=\"inlineStr\"");
		if (styleIndex != -1) {
			_out.write(" s=\"" + styleIndex + "\"");
		}
		_out.write(">");
		_out.write("<is><t>" + value + "</t></is>");
		_out.write("</c>");

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, String value) throws IOException {
		createCell(columnIndex, value, -1);

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, double value, int styleIndex) throws IOException {
		String ref = new CellReference(_rownum, columnIndex).formatAsString();
		_out.write("<c r=\"" + ref + "\" t=\"n\"");
		if (styleIndex != -1) {
			_out.write(" s=\"" + styleIndex + "\"");
		}
		_out.write(">");
		_out.write("<v>" + value + "</v>");
		_out.write("</c>");

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, double value) throws IOException {
		createCell(columnIndex, value, -1);

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, Calendar value, int styleIndex) throws IOException {
		createCell(columnIndex, DateUtil.getExcelDate(value, false), styleIndex);

		return this;
	}

	@Override
	public SpreadsheetWriter createCell(int columnIndex, Calendar value) throws IOException {
		createCell(columnIndex, value, -1);

		return this;
	}
}
