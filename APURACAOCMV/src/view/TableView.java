package view;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableRowSorter;

import efdUtil.EscreveEmArquivo;
import efdUtil.ImportaSped;
import excelText.ToExcel_InCMV;
import excelText.ToTxtSPEDIPI;
import modelBloco0.R0200;
import modelFCE.CarregaFCE;
import modelFCE.FCEBasica;
import modelFCE.FCEBasicaTableModel;

public class TableView {	
	
	public TableView(Map<String, FCEBasica> mapFCEBasica, Map<String, R0200> mapR0200) {
		int contador = 0;
		for (Map.Entry<String, FCEBasica> pairFCE : mapFCEBasica.entrySet()) {
			if (!pairFCE.getValue().getMovimentos().isEmpty()) {

				CarregaFCE carr = new CarregaFCE(pairFCE.getValue());
				mostraFrame(carr,pairFCE.getValue().getMovimentos().get(1).getDescricao() );//pairFCE.getValue().getDescricaoMercadoria());
				contador++;				
				if (contador > 5) {
					break;
				}
					
			} // end if (! pairFCE.getValue().getMovimentos().isEmpty())
		}
	}	
	
	public static void mostraFrame(CarregaFCE carr, String titulo) {
		JFrame tela = new JFrame(titulo);// pairFCE.getValue().getDescricaoMercadoria()
		tela.setBounds(0, 0, 2000, 2000);
		
		JTable tabela = carr.preencheTabela();
		if(tabela == null) {
			System.out.println("carr.preencheTabela() está retornando null");
			return;
		}
		
		//carr.escreveJTable(tabela);
		tela.add(carr.carregaPanelComTabela(tabela), BorderLayout.CENTER);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setExtendedState(2);
		tela.setVisible(true);
	}
	
	public static void mostraTabela(JTable tabela) {
		//tabela.getRowSorter().toggleSortOrder(0);
		
		//JDialog tela = new JDialog();// pairFCE.getValue().getDescricaoMercadoria()
		JFrame tela = new JFrame();
		tela.setBounds(0, 0, 2000, 2000);
		if(tabela != null) {
			System.out.println("Número de linhas da tabela: "+tabela.getRowCount());
			System.out.println("Número de colunas da tabela: "+tabela.getColumnCount());
			
			String tituloTela  = "Padrão";///tabela.getValueAt(0, 3) != null ? String.valueOf("Pasta"/*tabela.getValueAt(0, 3)*/) : "TituloPadrao" ;
			tela.setTitle(tituloTela);
			//System.out.println("Valor na célula 0,0: "+tabela.getValueAt(0, 0) != null ? tabela.getValueAt(0, 0) : "Null title");
			//System.out.println("Valor na célula 0,1: "+tabela.getValueAt(0, 1) != null ? tabela.getValueAt(0, 1) : "Null title");
			JPanel panel = CarregaFCE.carregaPanelComTabela(tabela);
			
			//carr.escreveJTable(tabela);
			tela.add(panel, BorderLayout.CENTER);
		}
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//tela.setExtendedState(2);
		tela.setVisible(true);
	}
	/*
	public static void mostraFrameLista(CarregaTableFCE carr, String titulo) {
		JFrame tela = new JFrame(titulo);// pairFCE.getValue().getDescricaoMercadoria()
		tela.setBounds(0, 0, 2000, 2000);
		
		JTable tabela = carr.preencheTabelaComLista();
		
		
		//carr.escreveJTable(tabela);
		tela.add(carr.carregaPanelComTabela(tabela), BorderLayout.CENTER);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setExtendedState(2);
		tela.setVisible(true);
	}
	*/
	
	/*
	public TableView(Map<String, FCEBasica> mapFCEBasica) {

		List<FCEBasica> listFCEBasica = new ArrayList<>();

		for (Map.Entry<String, FCEBasica> pair : mapFCEBasica.entrySet()) {
			if (! pair.getValue().getMovimentos().isEmpty()) {
				listFCEBasica.add(pair.getValue());
			}
		}
		
		
		CarregaTableFCE carr1 = new CarregaTableFCE(listFCEBasica);
		if(carr1 != null)
			mostraFrameLista(carr1, "FCEBasica");

	}*/
	public static JTable preencheTabela(FCEBasica fce) {
		/*JTable tabela = new JTable();
		// DefaultTableModel dtm = new DefaultTableModel();
		// dtm.setColumnIdentifiers(columnIdentifiers);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		if (fce != null) {
			if (fce.getMovimentos().isEmpty()) {
				System.out.println("this.fce.getMovimentos().isEmpty() em preencheTabela");
				JOptionPane.showMessageDialog(null, "this.fce.getMovimentos().isEmpty() em preecheTabela");
				return null;
			} else {
				// System.out.println("this.fce não nulo e não vazio");
			}

			/*
			 * for (MovimentoESS movESS : this.fce.getMovimentos()) { if (movESS != null) {
			 * Object[] objects = movESS.carregaObjetoTabela(movESS); dtm.addRow(objects); }
			 * }
			 */
		/*} 
		else {
			return null;
		}

		TableRowSorter sorterModelTabela = new TableRowSorter<>(new FCEBasicaTableModel(fce));
		tabela.setModel(new FCEBasicaTableModel(fce));
		tabela.setRowSorter(sorterModelTabela);
		sorterModelTabela.toggleSortOrder(0);
		// tabela.setName(this.fce.getMovimentos().get(0).getDescricao());
		return tabela;*/
		return preencheTabela(Arrays.asList(fce));
		
	}
	
	public static JTable preencheTabela(List<FCEBasica> listFCE) {
		JTable tabela = new JTable();
		// DefaultTableModel dtm = new DefaultTableModel();
		// dtm.setColumnIdentifiers(columnIdentifiers);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		List<FCEBasica> listFceBasicaCopia = new ArrayList<>();
		int imprimeOuNao = 0;
		String fullPath = "D:\\LAZAROREPOSITORIO\\APURACAOCMV\\SERIAL\\debug.txt";	
		//EscreveEmArquivo eEA = new EscreveEmArquivo(fullPath);
		
		if(listFCE != null) {
			for (FCEBasica fceB : listFCE) {
				if (fceB != null && fceB.getMovimentos().size() > 0) {
					// ToExcel.exportaExcel(tablez);
					
					FCEBasica copia = FCEBasica.calculoMedioPonderadaMovel(fceB, null);
					listFceBasicaCopia.add(copia);
					
					if(imprimeOuNao % 10 == 0) {
						//eEA.escreveNoArquivo(fceB.toString());					
						//eEA.escreveNoArquivo(copia.toString());
					}
					imprimeOuNao++;
				}
			}//END FOR		
			//eEA.closeArquivo();
			TableRowSorter sorterModelTabela = new TableRowSorter<>(new FCEBasicaTableModel(listFceBasicaCopia));
			tabela.setModel(new FCEBasicaTableModel(listFceBasicaCopia));
			tabela.setRowSorter(sorterModelTabela);
			sorterModelTabela.toggleSortOrder(0);

		// tabela.setName(this.fce.getMovimentos().get(0).getDescricao());
			return tabela;
		}//end if if(listFCE != null)
		else {
			
			return null;
		}
		
		
	}


}
