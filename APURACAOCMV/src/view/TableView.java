package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import efdUtil.ImportaSped;
import excelText.ToExcel_InCMV;
import excelText.ToTxtSPEDIPI;
import modelBloco0.R0200;
import modelFCE.CarregaFCE;
import modelFCE.FCEBasica;

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

	/*
	try {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	*/
	
	
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
		
		JDialog tela = new JDialog();// pairFCE.getValue().getDescricaoMercadoria()
		tela.setBounds(0, 0, 2000, 2000);
		tela.setTitle(String.valueOf(tabela.getValueAt(0, 3)));
		System.out.println("Valor na célula 0,0: "+tabela.getValueAt(0, 0));
		System.out.println("Valor na célula 0,1: "+tabela.getValueAt(0, 1));
		JPanel panel = CarregaFCE.carregaPanelComTabela(tabela);
		
		//carr.escreveJTable(tabela);
		tela.add(panel, BorderLayout.CENTER);
		tela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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

}
