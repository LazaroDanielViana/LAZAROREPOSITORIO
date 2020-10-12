package modelFCE;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import efdUtil.EscreveEmArquivo;
import modelBloco0.Bloco0;
import modelBloco0.R0000;
import modelBloco0.R0200;
import modelBlocoC.C100;
import modelBlocoC.BlocoC;

import view.TableView;

public class CarregaFCE {

	FCEBasica fce = new FCEBasica();
	List<FCEBasica> listFCE = new ArrayList<FCEBasica>();

	String[] columnIdentifiers = MovimentoESS.columnIdentifiers();

	public CarregaFCE(FCEBasica fce) {
		this.fce = fce;
	}

	public CarregaFCE(List<FCEBasica> listFCE) {
		this.listFCE = listFCE;
	}
	

	public static void mostraTableView(BlocoC blocoC, Bloco0 bloco0) {

		List<C100> listC100 = blocoC.getListC100();

		Map<String, FCEBasica> mapFCEBasica;// = new HashMap<>();

		
		//Mapa com o código do item de mercadoria e com seus demais valores (descrição, ncm, etc)
		Map<String, R0200> mapR0200 = new HashMap<>();

		for (R0200 r0200 : bloco0.getR0001().getListR0200()) {
			mapR0200.put(r0200.getCOD_ITEM_R0200(), r0200);
		}

		// PONTO CENTRAL DA APLICAÇÃO
		mapFCEBasica = FCEBasica.getMapFCEBasica(listC100, bloco0);		
	
		
		
		
		TableView tableView = new TableView(mapFCEBasica, mapR0200);

		//TableView tableViewList = new TableView(mapFCEBasica);
	}

	public JTable preencheTabela() {
		JTable tabela = new JTable();
		// DefaultTableModel dtm = new DefaultTableModel();

		// dtm.setColumnIdentifiers(columnIdentifiers);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		if (this.fce != null) {

			if (this.fce.getMovimentos().isEmpty()) {
				System.out.println("this.fce.getMovimentos().isEmpty() em preencheTabela");
				JOptionPane.showMessageDialog(null, "this.fce.getMovimentos().isEmpty() em preecheTabela");
				return null;
			} else {
				//System.out.println("this.fce não nulo e não vazio");
			}

			/*
			 * for (MovimentoESS movESS : this.fce.getMovimentos()) { if (movESS != null) {
			 * Object[] objects = movESS.carregaObjetoTabela(movESS); dtm.addRow(objects); }
			 * }
			 */
		} else {
			return null;
		}
		tabela.setModel(new FCEBasicaTableModel(this.fce));
		// tabela.setName(this.fce.getMovimentos().get(0).getDescricao());
		//tabela.setBorder(BorderFactory.createTitledBorder("Dados da Empresa"));
		return tabela;

	}

	/*
	public JTable preencheTabelaComLista() {

		JTable tabela = new JTable();
		// DefaultTableModel dtm = new DefaultTableModel();

		// dtm.setColumnIdentifiers(columnIdentifiers);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		int contaFCE = 0;
		int contaFCEGeral = 0;

		if (!this.listFCE.isEmpty()) {

			/*
			 * for (FCEBasica fceBasica : this.listFCE) {
			 * 
			 * if (!fceBasica.getMovimentos().isEmpty()) {
			 * 
			 * 
			 * for (MovimentoESS movESS : fceBasica.getMovimentos()) {
			 * 
			 * Object[] objects = movESS.carregaObjetoTabela(movESS); dtm.addRow(objects);
			 * 
			 * } } }
			 */
			
		/*tabela.setModel(new FCEBasicaTableModel(this.listFCE));
			tabela.setName("Debug FCE");

			return tabela;
		}
		return null;

	}
	*/
	public static JPanel carregaPanelComTabela(JTable tabela) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		JScrollPane paneFCE = new JScrollPane(tabela/*JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED*/); 
		paneFCE.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//paneFCE.add(tabela);
		panel.add(paneFCE);
		//panel.setBorder(BorderFactory.createTitledBorder("Dados da Empresa"));
		
		return panel;

	}

	
	/*
	public void escreveJTable(JTable tabela) {
		int numeroDeLinhas = tabela.getRowCount();
		JOptionPane.showMessageDialog(null, "O número de linhas da tabela é " + numeroDeLinhas);

		FCEBasicaTableModel tm = (FCEBasicaTableModel) tabela.getModel();

		// Vector<Vector> vectorTable = tm.getDataVector();

		EscreveEmArquivo e = new EscreveEmArquivo();

		for (FCEBasica f : tm.getListFceBasica()) {

			if (f != null) {
				System.out.println("Objeto da tabela: " + f.toString());
				e.escreveNoArquivo(f.toString() + "|");
				e.escreveNoArquivo("Lolla");
			} else {
				System.out.println("|" + "\t");
				e.escreveNoArquivo("|" + "\t");
				e.escreveNoArquivo("Lolla");
			}

		}
		e.escreveNoArquivo("\n");
	}*/
	
	/*
	public static Map<String, FCEBasica> getFCESBasicas(BlocoC blocoC, Bloco0 bloco0) {

		List<C100> listC100 = blocoC.getListC100();

		Map<String, FCEBasica> mapFCEBasica;// = new HashMap<>();

		
		//Mapa com o código do item de mercadoria e com seus demais valores (descrição, ncm, etc)
		Map<String, R0200> mapR0200 = new HashMap<>();

		for (R0200 r0200 : bloco0.getR0001().getListR0200()) {
			mapR0200.put(r0200.getCOD_ITEM_R0200(), r0200);
		}

		// PONTO CENTRAL DA APLICAÇÃO
		mapFCEBasica = FCEBasica.getMapFCEBasica(listC100, mapR0200);		
	
		return mapFCEBasica;
		
		
		
	}
	*/
}
