package modelFCE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import modelBloco0.Bloco0;
import modelBloco0.R0000;
import modelBloco0.R0200;
import modelBlocoC.C100;
import modelBlocoC.C170;
import utilLazaro.ToExcel;

public class FCEBasica implements FCE, Serializable {
	private static final long serialVersionUID = 1L;

	MovimentoESS si = new MovimentoESS();

	// MovimentoESS sf;

	private double totalDeCompras;
	private int numCompras;
	// private double precoMedioCompra;
	private double totalEntradas;
	private int numEntradas;

	private double totalDeVendas;
	private int numVendas;
	// private double precoMedioVenda;
	private double totalSaidas;
	private int numSaidas;

	List<MovimentoESS> movimentos;

	public FCEBasica() {
		this.movimentos = new ArrayList<MovimentoESS>();
		this.movimentos.add(si);
	}

	public FCEBasica(List<MovimentoESS> movimentos) {
		this.movimentos = new ArrayList<MovimentoESS>();
		this.movimentos.add(si);
		si.setHistorico("Movimento Inicial");
		this.movimentos.addAll(movimentos);

	}

	public void doNothing() {
		System.out.println("nothing");

	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (MovimentoESS movESS : movimentos) {
			buf.append(movESS.toString());
		}

		return buf.toString();
	}

	public static Map<String, FCEBasica> getMapFCEBasica(List<C100> listC100, Bloco0 bloco0) {

		Map<String, R0200> mapR0200 = Bloco0.getMapR0200(bloco0);
		Map<String, FCEBasica> mapFCEBasica = new HashMap<>();

		for (R0200 r0200 : mapR0200.values()) {
			mapFCEBasica.put(r0200.getCOD_ITEM_R0200(), new FCEBasica());
		}

		for (C100 c100 : listC100) {
			for (C170 c170 : c100.getListC170()) {
				// movESS = new MovimentoESS();//PORQUE DOIS CONSTRUTORES?
				MovimentoESS movESS = new MovimentoESS(c170, bloco0,
						mapFCEBasica.get(c170.getCOD_ITEMC170()).getMovimentos());
				mapFCEBasica.get(c170.getCOD_ITEMC170()).getMovimentos().add(movESS);
			}
		}

		// PEGAR APENAS FCEBASICAS COM MOVIMENTOS
		Map<String, FCEBasica> mapFCEBasica2 = new TreeMap<>();
		// usado para setar o Saldo inicial
		int contador = 0;
		for (Map.Entry<String, FCEBasica> pairFCE : mapFCEBasica.entrySet()) {

			if (!pairFCE.getValue().movimentos.isEmpty()) {
				mapFCEBasica2.put(pairFCE.getKey(), pairFCE.getValue());
				if (pairFCE.getValue().getMovimentos().size() >= 2) {
					pairFCE.getValue().getMovimentos().get(0)
							.setDescricao(pairFCE.getValue().getMovimentos().get(1).getDescricao());
				}
			}
		}

		return mapFCEBasica2;
	}

	public static void escreveFCEBasica(FCEBasica fceBasica) {
		if (fceBasica.getMovimentos().size() > 1) {
			JTable tablez;
			tablez  = preencheTabela(fceBasica);
			if(tablez != null) {
				System.out.println("A tabela tem o seguinte número de linhas" + tablez.getModel().getRowCount());
				
			}
			else {
				System.out.println("tablez é nula");
			}
			ToExcel.exportaExcel(tablez);
			FCEBasica copia = calculoMedioPonderadaMovel(fceBasica, null);
			String diretorio = "D:\\JavaCode\\APURACAOCMV\\SERIAL\\";
			String filename = copia.getMovimentos().get(1).getCodigoMercadoria() + ".laz";
			// SerialClass time = new SerialClass(); // We will write this object to file
			// system.
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(diretorio + filename));
				out.writeObject(copia); // Write byte stream to file system.
				out.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static FCEBasica leFCEBasica(String filename) {
		FCEBasica fceBasica = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
			fceBasica = (FCEBasica) in.readObject();
			in.close();
			return fceBasica;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return null;
		}
		// print out restored time
		// System.out.println("Restored time: " + time.getTime());

	}

	public static JTable preencheTabela(FCEBasica fce) {
		JTable tabela = new JTable();
		// DefaultTableModel dtm = new DefaultTableModel();
		// dtm.setColumnIdentifiers(columnIdentifiers);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		if (fce != null) {

			if (fce.getMovimentos().isEmpty()) {
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

		TableRowSorter sorterModelTabela = new TableRowSorter<>(new FCEBasicaTableModel(fce));
		tabela.setModel(new FCEBasicaTableModel(fce));
		tabela.setRowSorter(sorterModelTabela);
		sorterModelTabela.toggleSortOrder(0);

		// tabela.setName(this.fce.getMovimentos().get(0).getDescricao());

		return tabela;

	}

	public FCEBasica calculoPorLotesGlobais(FCEBasica fceBasica) {

		return fceBasica;

	}
	public static class InformacaoCusto {
		double custoUnitario = 0;
		double quantidadeSaldo = 0;
		double custoSaldo = 0;
		double totalSaldo = 0;	
	}
	public static InformacaoCusto calculaInformacaoCusto(MovimentoESS movimento, MovimentoESS movimentoInicial,FCEBasica fceBasica, int contador) {
		InformacaoCusto informacaoCusto = new InformacaoCusto();
		
		if (contador == 0) {
			if (movimento.getFonteInformacao() instanceof C170) {

				C170 c170 = (C170) movimento.getFonteInformacao();
				
				if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
					informacaoCusto.custoUnitario =  movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
					
					informacaoCusto.quantidadeSaldo = movimento.getQuantidadeUnitario()
							+ (movimentoInicial != null ? movimentoInicial.getQuantidadeSaldo() : 0);
					informacaoCusto.totalSaldo = movimento.getTotalUnitario()
							+ (movimentoInicial != null ? movimentoInicial.getTotalSaldo() : 0);
					informacaoCusto.custoSaldo = informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo;
				} 
				else {
					
					informacaoCusto.custoUnitario = movimentoInicial != null ? movimentoInicial.getCustoSaldo() : -1.11111111111;
					informacaoCusto.quantidadeSaldo = movimentoInicial != null ? (movimentoInicial.getQuantidadeSaldo() - movimento.getQuantidadeUnitario()) :
						- movimento.getQuantidadeUnitario() ;
					informacaoCusto.totalSaldo = movimentoInicial != null ? movimentoInicial.getTotalSaldo() : 0;
							
					informacaoCusto.custoSaldo = movimentoInicial.getCustoSaldo() != 0 ? movimentoInicial.getCustoSaldo() : 0;

				}

			}
			
		}//END contador == 0
		
		else {// if(contador == 0)
			if (movimento.getFonteInformacao() instanceof C170) {

				C170 c170 = (C170) movimento.getFonteInformacao();
				if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
					informacaoCusto.custoUnitario = movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
					
					informacaoCusto.quantidadeSaldo = movimento.getQuantidadeUnitario()
							+ fceBasica.getMovimentos().get(contador -1).getQuantidadeSaldo();
					informacaoCusto.totalSaldo = movimento.getTotalUnitario()
							+ fceBasica.getMovimentos().get(contador -1).getTotalSaldo();
					
					if(informacaoCusto.quantidadeSaldo == 0) {
						informacaoCusto.custoSaldo = informacaoCusto.custoUnitario;
					}
					else {
						informacaoCusto.custoSaldo = informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo;
					}
				} 
				else {
					informacaoCusto.custoUnitario = fceBasica.getMovimentos().get(contador -1).getCustoSaldo();
					informacaoCusto.quantidadeSaldo = fceBasica.getMovimentos().get(contador-1).getQuantidadeSaldo()
							- movimento.getQuantidadeUnitario();
					informacaoCusto.totalSaldo = fceBasica.getMovimentos().get(contador-1).getTotalSaldo();
					if(informacaoCusto.quantidadeSaldo == 0) {
						informacaoCusto.custoSaldo = fceBasica.getMovimentos().get(contador -1).getCustoSaldo();
					}
					else {
						informacaoCusto.custoSaldo = Math.abs(informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo);
					}

				}

			}				
		}	
		
		return informacaoCusto;
		
	}
	public static FCEBasica calculoMedioPonderadaMovel(FCEBasica fceBasica, MovimentoESS movimentoInicial) {
		Collections.sort(fceBasica.getMovimentos(), new FCEComparator() );
		int contador = 0;
		
		double custoUnitario = 0;
		double quantidadeSaldo = 0;
		double custoSaldo = 0;
		double totalSaldo = 0;
		
		for (MovimentoESS movimento : fceBasica.getMovimentos()) {
			InformacaoCusto informacaoCusto = calculaInformacaoCusto(movimento,movimentoInicial,fceBasica, contador);
			
			/*if (contador == 0) {
				if (movimento.getFonteInformacao() instanceof C170) {

					C170 c170 = (C170) movimento.getFonteInformacao();
					if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
						custoUnitario =  movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
						quantidadeSaldo = movimento.getQuantidadeUnitario()
								+ (movimentoInicial != null ? movimentoInicial.getQuantidadeSaldo() : 0);
						totalSaldo = movimento.getTotalUnitario()
								+ (movimentoInicial != null ? movimentoInicial.getTotalSaldo() : 0);
						custoSaldo = totalSaldo / quantidadeSaldo;
					} 
					else {
						
						custoUnitario = movimentoInicial.getCustoSaldo() != 0 ? movimento.getTotalUnitario() / movimento.getQuantidadeUnitario() : 0;
						quantidadeSaldo = movimentoInicial.getCustoSaldo() != 0 ? movimento.getQuantidadeUnitario() : 0 
								+ (movimentoInicial != null ? movimentoInicial.getQuantidadeSaldo() : 0);
						totalSaldo = (movimentoInicial.getCustoSaldo() != 0 ? movimentoInicial.getTotalSaldo() : 0)
								- movimento.getTotalUnitario();
						custoSaldo = movimentoInicial.getCustoSaldo() != 0 ? Math.abs(totalSaldo / quantidadeSaldo) : 0;

					}

				}
				
			} 
			else {// if(contador == 0)
				if (movimento.getFonteInformacao() instanceof C170) {

					C170 c170 = (C170) movimento.getFonteInformacao();
					if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
						custoUnitario = movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
						quantidadeSaldo = movimento.getQuantidadeUnitario()
								+ fceBasica.getMovimentos().get(contador).getQuantidadeSaldo();
						totalSaldo = movimento.getTotalUnitario()
								+ fceBasica.getMovimentos().get(contador).getTotalSaldo();
						custoSaldo = totalSaldo / quantidadeSaldo;
					} else {
						custoUnitario = movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
						quantidadeSaldo = fceBasica.getMovimentos().get(contador).getQuantidadeSaldo()
								- movimento.getQuantidadeUnitario();
						totalSaldo = fceBasica.getMovimentos().get(contador).getTotalSaldo()
								- movimento.getTotalUnitario();
						custoSaldo = Math.abs(totalSaldo / quantidadeSaldo);

					}

				}				
			}*/
			contador++;
			
			movimento.setCustoUnitario(informacaoCusto.custoUnitario);
			movimento.setQuantidadeSaldo(informacaoCusto.quantidadeSaldo);
			movimento.setTotalSaldo(informacaoCusto.totalSaldo);
			movimento.setCustoSaldo(informacaoCusto.custoSaldo);

		} // END FOR
		return fceBasica;
	}

	public List<MovimentoESS> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<MovimentoESS> movimentos) {
		this.movimentos = movimentos;
	}

	public double getTotalDeCompras() {
		return totalDeCompras;
	}

	public void setTotalDeCompras(double totalDeCompras) {
		this.totalDeCompras = totalDeCompras;
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}

	public double getTotalEntradas() {
		return totalEntradas;
	}

	public void setTotalEntradas(double totalEntradas) {
		this.totalEntradas = totalEntradas;
	}

	public int getNumEntradas() {
		return numEntradas;
	}

	public void setNumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}

	public double getTotalSaidas() {
		return totalSaidas;
	}

	public void setTotalSaidas(double totalSaidas) {
		this.totalSaidas = totalSaidas;
	}

	public int getNumSaidas() {
		return numSaidas;
	}

	public void setNumSaidas(int numSaidas) {
		this.numSaidas = numSaidas;
	}

	public static class FCEComparator implements Comparator<MovimentoESS> {

		@Override
		public int compare(MovimentoESS p1, MovimentoESS p2) {

			if (p1 != null && p2 != null) {

				if (p1.getData() != null && p2.getData() != null) {

					if (p1.getData().compareTo(p2.getData()) != 0) {
						if (p1.getData().before(p2.getData())) {
							return -1;

						} else {
							return 1;
						}

					} else {
						return 0;
					}
				} else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}// END int compare

	}// END FCEComparator

	/*
	 * public String getCodigoMercadoria() { return codigoMercadoria; }
	 * 
	 * public void setCodigoMercadoria(String codigoMercadoria) {
	 * this.codigoMercadoria = codigoMercadoria; }
	 * 
	 * public String getDescricaoMercadoria() { return descricaoMercadoria; }
	 * 
	 * public void setDescricaoMercadoria(String descricaoMercadoria) {
	 * this.descricaoMercadoria = descricaoMercadoria; }
	 * 
	 */

}
