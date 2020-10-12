package excelText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import modelBlocoC.C100;
import modelBlocoC.C170;

import java.io.BufferedWriter;

public class ToExcel_InCMV {

	SimpleDateFormat sdf;

	public ToExcel_InCMV() {

	}

	public ToExcel_InCMV(JTable tabela) {

		JFileChooser fc = new JFileChooser();
		int option = fc.showSaveDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			String filename = fc.getSelectedFile().getName();

			String path = fc.getSelectedFile().getPath();

			int lenPath = path.length();
			int len = filename.length();
			String path2 = path.substring(0, lenPath - len);
			String ext = "";
			String file = "";

			if (len > 4) {
				ext = filename.substring(len - 4, len);
			}
			if (ext.equals(".xls")) {
				file = path2 + filename;
				JOptionPane.showMessageDialog(null, file);
			} else {
				file = path2 + filename + ".xls";
				JOptionPane.showMessageDialog(null, file);
			}
			try {
				exportaExcel(tabela, new File(file));
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		} // END if (option == JFileChooser.APPROVE_OPTION)
	}

	public void exportaExcel(JTable tabela, File file) throws IOException {
		TableModel model = tabela.getModel();
		FileWriter writer = new FileWriter(file);

		sdf = new SimpleDateFormat("dd/MM/yyyy");

		// BufferedWriter writer = new BufferedWriter(excel);

		for (int i = 0; i < model.getColumnCount(); i++) {
			writer.write(model.getColumnName(i) + "\t");
		}
		writer.write("\n");

		/*
		 * for (int i = 0; i < model.getColumnCount(); i++) {
		 * writer.write(model.getColumnName(i) + "\t"); } writer.write("\n");
		 */

		for (int i = 0; i < model.getRowCount(); i++) {
			for (int j = 0; j < model.getColumnCount(); j++) {
				
				writer.write(model.getValueAt(i, j).toString() + "\t");
				if (model.getColumnCount() == 7)
					writer.write(sdf.format(model.getValueAt(i, j)) + "\t");
			}
			writer.write("\n");

		}
		writer.close();
		// excel.close();
		System.out.println("write out to: " + file);
	}

	public ToExcel_InCMV(List<? extends C100> lista, JTable tabela) {

		JFileChooser fc = new JFileChooser();
		int option = fc.showSaveDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			String filename = fc.getSelectedFile().getName();

			String path = fc.getSelectedFile().getPath();

			int lenPath = path.length();
			int len = filename.length();
			String path2 = path.substring(0, lenPath - len);

			String ext = "";
			String file = "";

			if (len > 4) {
				ext = filename.substring(len - 4, len);
			}
			if (ext.equals(".xls")) {
				file = path2 + filename;
				JOptionPane.showMessageDialog(null, file);
			} else {
				file = path2 + filename + ".xls";
				JOptionPane.showMessageDialog(null, file);
			}
			try {
				exportaExcelLista(lista, tabela, new File(file));
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

	public void exportaExcelLista(List<? extends C100> lista, JTable tabela, File file) throws IOException {
		TableModel model = tabela.getModel();
		FileWriter excel = new FileWriter(file);

		BufferedWriter writer = new BufferedWriter(excel);

		sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 0; i < model.getColumnCount(); i++) {
			writer.write(model.getColumnName(i) + "\t");
		}
		writer.write("\n");

		for (int i = 0; i < lista.size(); i++) {

			
			
			
			
			//writer.write(lista.get(i).getId() + "\t");
			// writer.write(lista.get(i).getNomeCalculo() + "\t");
			// writer.write(lista.get(i).getCapital() + "\t");

			// writer.write(lista.get(i).getTaxa() + "\t");
			// writer.write(lista.get(i).getPeriodo() + "\t");
			// writer.write(lista.get(i).getMontante() + "\t");
			// writer.write(lista.get(i).getJuros() + "\t");
			// writer.write(sdf.format(lista.get(i).getData()));

			// writer.write("\n");

			// }
			// writer.close();
			// excel.close();
			// System.out.println("write out to: " + file);
		}
	}
	
	
	public static void listToExcel(List<? extends C100> lista) throws IOException {
		//TableModel model = tabela.getModel();
		
		long timeInicial = System.currentTimeMillis();
		String pathExcel = "C:\\JavaCode\\Desktop\\teste.xls";
		FileWriter excel = new FileWriter(new File(pathExcel));

		BufferedWriter writer = new BufferedWriter(excel);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		//for (int i = 0; i < model.getColumnCount(); i++) {
		//	writer.write(model.getColumnName(i) + "\t");
		//}
		//writer.write("\n");

		for (int i = 0; i < lista.size(); i++) {

			writer.write(lista.get(i).getIdC100().toString()	+ "\t");
			writer.write(lista.get(i).getREGC100()	+ "\t");
			writer.write(lista.get(i).getIND_OPERC100()	+ "\t");			
			writer.write(lista.get(i).getIND_EMITC100()	+ "\t");
			writer.write(lista.get(i).getCOD_PARTC100()	+ "\t");
			writer.write(lista.get(i).getCOD_MODC100()	+ "\t");
			writer.write(lista.get(i).getCOD_SITC100()	+ "\t");
			writer.write(lista.get(i).getSERC100()	+ "\t");
			writer.write(lista.get(i).getNUM_DOCC100()	+ "\t");
			writer.write(lista.get(i).getCHV_NFEC100()+"\t");
			writer.write(sdf.format(lista.get(i).getDT_DOCC100().getTimeInMillis()) +"\t");
			writer.write(sdf.format(lista.get(i).getDT_E_SC100().getTimeInMillis() ) +"\t");
			writer.write(lista.get(i).getVL_DOCC100()+"\t");
			writer.write(lista.get(i).getIND_PGTOC100()+"\t");
			writer.write(lista.get(i).getVL_DESCC100()+"\t");
			writer.write(lista.get(i).getVL_ABAT_NT()+"\t");
			writer.write(lista.get(i).getVL_MERC() +"\t");
			writer.write(lista.get(i).getIND_FRTC100()+"\t");
			
			writer.write(lista.get(i).getVL_FRTC100()+"\t");			
			writer.write(lista.get(i).getVL_SEGC100()+"\t");
			writer.write(lista.get(i).getVL_OUT_DAC100()+"\t");
			writer.write(lista.get(i).getVL_BC_ICMSC100()+"\t");
			writer.write(lista.get(i).getVL_ICMSC100()+"\t");
			writer.write(lista.get(i).getVL_BC_ICMS_STC100()+"\t");
			writer.write(lista.get(i).getVL_ICMS_STC100()+"\t");
			writer.write(lista.get(i).getVL_IPIC100()+"\t");
			writer.write(lista.get(i).getVL_PISC100()+"\t");
			writer.write(lista.get(i).getVL_COFINSC100()+"\t");
			writer.write(lista.get(i).getVL_PIS_STC100()+"\t");
			writer.write(lista.get(i).getVL_COFINS_STC100()+"\t");
			//writer.write(lista.get(i).getLinhaC100()+"\t");
			writer.write(lista.get(i).getCNPJFILIAL()+"\t");
			

			writer.write("\n");

		}
		writer.close();
		excel.close();
		
		long timeFinal = System.currentTimeMillis();
		
		System.out.println("Tempo gasto em segundos no para escrever lista na planilha: " + (timeFinal-timeInicial)/1000);	
		//System.out.println("write out to: " + file);
		
	}
	
	public static void listToExcelC170(List<C170> listaC170) throws IOException {		
		
		long timeInicial = System.currentTimeMillis();
		String pathExcel = "C:\\JavaCode\\Desktop\\teste.xls";
		FileWriter excel = new FileWriter(new File(pathExcel));

		BufferedWriter writer = new BufferedWriter(excel);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		//for (int i = 0; i < model.getColumnCount(); i++) {
		//	writer.write(model.getColumnName(i) + "\t");
		//}
		//writer.write("\n");

		for (int i = 0; i < listaC170.size(); i++) {

			writer.write(listaC170.get(i).getIdC170()+"\t");
			writer.write(listaC170.get(i).getREGC170()+"\t");
			writer.write(listaC170.get(i).getNUM_ITEMC170()+"\t");
			writer.write(listaC170.get(i).getCOD_ITEMC170()+"\t");
			writer.write(listaC170.get(i).getDESCR_COMPLC170()+"\t");
			writer.write(listaC170.get(i).getQTDC170()+"\t");
			writer.write(listaC170.get(i).getUNIDC170()+"\t");
			writer.write(listaC170.get(i).getVL_ITEMC170()+"\t");
			writer.write(listaC170.get(i).getVL_DESCC170()+"\t");
			writer.write(listaC170.get(i).getIND_MOVC170()+"\t");
			writer.write(listaC170.get(i).getCST_ICMSC170()+"\t");
			writer.write(listaC170.get(i).getCFOPC170()+"\t");
			
			writer.write(listaC170.get(i).getCOD_NATC170()+"\t");
			
			writer.write(listaC170.get(i).getVL_BC_ICMSC170()+"\t");
			writer.write(listaC170.get(i).getALIQ_ICMSC170()+"\t");
			writer.write(listaC170.get(i).getVL_ICMSC170()+"\t");
			writer.write(listaC170.get(i).getVL_BC_ICMS_STC170()+"\t");
			writer.write(listaC170.get(i).getALIQ_STC170()+"\t");
			writer.write(listaC170.get(i).getVL_ICMS_STC170()+"\t");
			
			writer.write(listaC170.get(i).getIND_APURC170()+"\t");
			writer.write(listaC170.get(i).getCST_IPIC170()+"\t");
			writer.write(listaC170.get(i).getCOD_ENQC170()+"\t");
			
			writer.write(listaC170.get(i).getVL_BC_IPIC170()+"\t");			
			writer.write(listaC170.get(i).getALIQ_IPIC170()+"\t");
			writer.write(listaC170.get(i).getVL_IPIC170()+"\t");
			
			writer.write(listaC170.get(i).getCST_PISC170()+"\t");
			
			
			writer.write(listaC170.get(i).getVL_BC_PISC170()+"\t");
			writer.write(listaC170.get(i).getALIQ_PISC170()+"\t");
			writer.write(listaC170.get(i).getQUANT_BC_PISC170()+"\t");			
			writer.write(listaC170.get(i).getALIQ_PISVC170()+"\t");
			writer.write(listaC170.get(i).getVL_PISC170()+"\t");
			
			writer.write(listaC170.get(i).getCST_COFINSC170()+"\t");
			
			writer.write(listaC170.get(i).getVL_BC_COFINSC170()+"\t");
			writer.write(listaC170.get(i).getALIQ_COFINSC170()+"\t");
			writer.write(listaC170.get(i).getQUANT_BC_COFINSC170()+"\t");
			writer.write(listaC170.get(i).getALIQ_COFINSVC170()+"\t");
			writer.write(listaC170.get(i).getVL_COFINSC170()+"\t");
			
			writer.write(listaC170.get(i).getCOD_CTAC170()+"\t");
			
			writer.write(listaC170.get(i).getC100()+"\t");
			

			writer.write("\n");

		}
		writer.close();
		excel.close();
		
		long timeFinal = System.currentTimeMillis();
		
		System.out.println("Tempo gasto em segundos no para escrever listaC170 na planilha: " + (timeFinal-timeInicial)/1000);	
		//System.out.println("write out to: " + file);
		
	}

	public static void exportaExcel(JTable tablez) {
		// TODO Auto-generated method stub
		
	}

	

}




/*
 * toExcel(Lista lista)
 * 
 * private String titleReport;
 * 
 * private String[] nameHeaders; private JTable jTable;
 * 
 * public BaseReport(String reportTitle, String[] headerNames) {
 * this.titleReport = reportTitle; this.nameHeaders = headerNames; }
 * 
 * public void runReport(JTable jtable, String pathSaveFile, String fileName)
 * throws Exception { this.jTable = jtable;
 * 
 * Document document = new Document(); PdfWriter.getInstance(document, new
 * FileOutputStream(pathSaveFile + "/" + fileName + ".pdf")); document.open();
 * document.add(getPdfPTable()); document.close();
 * 
 * }
 * 
 * private PdfPTable getPdfPTable() throws Exception { PdfPTable tab = new
 * PdfPTable(nameHeaders.length); tab.addCell(getCellTitle());
 * tab.addCell(getCellTitle2());
 * 
 * 
 * for (int i = 0; i < nameHeaders.length; i++) { tab.addCell(nameHeaders[i]); }
 * 
 * int rowCount = jTable.getRowCount(); int collumCount =
 * jTable.getColumnCount(); for (int x = 0; x < rowCount; x++) { for (int y = 0;
 * y < collumCount; y++) {
 * 
 * tab.addCell(GetData(jTable, x, y).toString()); }
 * 
 * } return tab; }
 * 
 * private Object GetData(JTable table, int row_index, int col_index) throws
 * Exception { return table.getModel().getValueAt(row_index, col_index); }
 * 
 * private PdfPCell getCellTitle() {
 * 
 * PdfPCell cell = new PdfPCell(new Paragraph(titleReport)); cell.setColspan(4);
 * cell.setHorizontalAlignment(Element.ALIGN_CENTER);
 * cell.setBackgroundColor(Color.GREEN); return cell; } private PdfPCell
 * getCellTitle2() {
 * 
 * PdfPCell cell = new PdfPCell(new Paragraph("\n")); cell.setColspan(4);
 * //cell.setHorizontalAlignment(Element.ALIGN_CENTER);
 * //cell.setBackgroundColor(Color.GREEN); return cell; }
 * 
 */
