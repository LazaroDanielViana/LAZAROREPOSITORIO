package modelFCE;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import DAO.MovimentoDao;
import efdUtil.EscreveEmArquivo;
import efdUtil.LogFactory;
import modelBloco0.Bloco0;
import modelBloco0.R0000;
import modelBloco0.R0200;
import modelBlocoC.C100;
import modelBlocoC.C170;
import readobject.utils.ReadObject;
import utilLazaro.ToExcel;
import writeobject.utils.WriteObject;

public class FCEBasica implements FCE, Serializable {
	
	private static final long serialVersionUID = 1L;

	MovimentoESS si = new MovimentoESS();

	private double totalDeCompras;
	private int numCompras;
		
	//nem toda entrada é compra (pode ser transferência,devolução de venda, por exemplo)
	private double totalEntradas;
	private int numEntradas;

	private double totalDeVendas;
	private int numVendas;
		
	//nem toda saída é venda (pode ser transferência,doação, por exemplo)
	private double totalSaidas;
	private int numSaidas;

	List<MovimentoESS> movimentos;
	StringBuffer buf;

	public FCEBasica() {
		this.movimentos = new ArrayList<MovimentoESS>();
		this.movimentos.add(si);
	}

	public FCEBasica(List<MovimentoESS> movimentos) {
		if(this.movimentos == null) {
			this.movimentos = new ArrayList<MovimentoESS>();
			this.movimentos.add(si);
			si.setHistorico("Movimento Inicial");
		}
		this.movimentos.addAll(movimentos);
	}

	public void doNothing() {
		System.out.println("nothing");
	}

	@Override
	public String toString() {
		buf = new StringBuffer();
		for (MovimentoESS movESS : movimentos) {
			buf.append(movESS.toString());
		}
		return buf.toString();
	}

	public static Map<String, FCEBasica> getMapFCEBasica(List<C100> listC100, Bloco0 bloco0) {

		Map<String, R0200> mapR0200 = Bloco0.getMapR0200(bloco0);
		Map<String, FCEBasica> mapFCEBasica = new HashMap<>();
		// PARA PEGAR APENAS FCEBASICAS COM MOVIMENTOS			
		for (R0200 r0200 : mapR0200.values()) {
			mapFCEBasica.put(r0200.getCOD_ITEM_R0200(), new FCEBasica());
		}
		for (C100 c100 : listC100) {
			for (C170 c170 : c100.getListC170()) {
				MovimentoESS movESS = new MovimentoESS(c170, bloco0,mapFCEBasica.get(c170.getCOD_ITEMC170()).getMovimentos()  );
				mapFCEBasica.get(c170.getCOD_ITEMC170()).getMovimentos().add(movESS);
			}
		}				
		
		Map<String, FCEBasica> mapFCEBasica2 = new HashMap<>();
		int contador = 0;
		Logger log = null;		
		StringBuffer bufLog = new StringBuffer();
		
		for (Map.Entry<String, FCEBasica> pairFCE : mapFCEBasica.entrySet()) {
			if (!pairFCE.getValue().movimentos.isEmpty()) {
				mapFCEBasica2.put(pairFCE.getKey(), pairFCE.getValue());
				if(contador %10 == 0) {
					//System.out.println(pairFCE.getKey() +" : "+pairFCE.getValue().toString());
					bufLog.append(pairFCE.getKey() +" : "+pairFCE.getValue().toString()+"\n");
				}
				if (pairFCE.getValue().getMovimentos().size() >= 2) {
					pairFCE.getValue().getMovimentos().get(0)
							.setDescricao(pairFCE.getValue().getMovimentos().get(1).getDescricao());
				}
				contador++;
			}
		}
	
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter(new File("D:\\LAZAROREPOSITORIO\\APURACAOCMV\\SERIAL\\MyLogFile.log"))  );
			bfw.append(bufLog.toString());			
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(bfw != null) {
				try {
					bfw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return mapFCEBasica2;
	}

	public static void escreveListaFCEBasica(List<FCEBasica> listFceBasica, String diretorio, String filename) {
		
		List<FCEBasica> listFceBasicaCopia = new ArrayList<FCEBasica>();
		for (FCEBasica fceB : listFceBasica) {
			if (fceB.getMovimentos().size() > 1) {
				//ToExcel.exportaExcel(tablez);
				FCEBasica copia = calculoMedioPonderadaMovel(fceB, null);
				if(copia != null) {
					listFceBasicaCopia.add(copia);
				}						
			}
		}//END FOR		
		
		if(listFceBasicaCopia.size()> 0 ) {
			//WriteObject.writeObject(diretorio, filename, listFceBasicaCopia);
			ObjectOutputStream out = null;
			try 
			{
				
				out = new ObjectOutputStream(new FileOutputStream(diretorio+"\\"+filename));
				out.writeObject(listFceBasicaCopia); //Write byte stream to file system.
				out.close();
			} 
			catch(IOException ex){
				ex.printStackTrace();
				System.out.println("Entrou no catch da escrita");
			}
			finally {
				if(out != null) {
					try {
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Problemas na escrita em escreveListaFCEBasica(List<FCEBasica> listFceBasica, String diretorio, String filename)");
						e.printStackTrace();
					}
				}
			}
		}
		else {
			System.out.println("listFceBasicaCopia.size() == 0");
		}
	}

	public static void escreveFCEBasica(FCEBasica fceBasica, String diretorio, String filename) {		
		  escreveListaFCEBasica(Arrays.asList(fceBasica), diretorio, filename);		
	}

	public static void adicionaBD(FCEBasica fceBasica, MovimentoDao mdao) throws SQLException {
		for (MovimentoESS mov : fceBasica.getMovimentos()) {
			mdao.adiciona(mov);
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
		} 
		catch (ClassNotFoundException cnfe) {
			System.out.printf("Erro: %s", cnfe.getMessage());
			cnfe.printStackTrace();
			return null;
		}		

	}
	public static List<FCEBasica> leFCEBasica(String filename, String placeHolder)  {
		List<FCEBasica> fceBasica = null;
		//ObjectInputStream ois = null;
		//FileInputStream fis = null;
		//BufferedInputStream bis = null;
		ObjectInputStream in = null;
		try {
			//fis = new FileInputStream(filename);
			//bis = new BufferedInputStream(fis);
			//ois = new ObjectInputStream(bis);
			//fceBasica = (List<FCEBasica>) ois.readObject();
			in = new ObjectInputStream(new FileInputStream(filename));
			fceBasica = (List<FCEBasica>) in.readObject();
			in.close();
			return fceBasica;
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
			return null;
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problemas com IOException em leFCEBasica(String filename, String placeHolder)");
			return Collections.emptyList();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problemas com ClassNotFoundException em leFCEBasica(String filename, String placeHolder)");
			return null;
		}
		finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		/*finally {
			if(ois!= null) {
				try {
					ois.close();
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bis != null)
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/

	}
	//segundo parâmetro usado unicamente para ser possível o overload com outro tipo de retorno
	public static List<FCEBasica> leFCEBasica(String filename, int i) {
		List<FCEBasica> fceBasica = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		try{
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis ) ;
		
			fceBasica = (ArrayList<FCEBasica>) in.readObject();
			fis.close();
			bis.close();
			in.close();
			return fceBasica;
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		finally {
			if(fis!= null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}//end finaly
		return fceBasica;
		
	}
	
	public static FCEBasica leFCEBasica(String filename, Class<FCEBasica> classT, FCEBasica fceb) {
		FCEBasica fceReturn;
		try {
			fceReturn = ReadObject.readObject(filename, classT, fceb, null);
			return fceReturn;	
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
			
	}
	
	public static List<FCEBasica> leFCEBasica2(String filename, int i) {
		List<FCEBasica> fceBasica = null;
		
		try(FileInputStream fis = new FileInputStream(filename); BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream in = new ObjectInputStream(bis);){
			fceBasica = (ArrayList<FCEBasica>) in.readObject();	
			if(in != null)
				in.close();
			if(bis != null)
				bis.close();
			if(fis != null)
				fis.close();
			return fceBasica;
			
		}		
		catch (ClassNotFoundException |IOException ex) {
			ex.printStackTrace();
			
			return null;
		} 
		
	}

	
		

	public FCEBasica calculoPorLotesGlobais(FCEBasica fceBasica) {
		return fceBasica;
	}

	public static class InformacaoCusto implements Serializable{
		private static final long serialVersionUID = 1L;
		double custoUnitario = 0;
		double quantidadeSaldo = 0;
		double custoSaldo = 0;
		double totalSaldo = 0;
	}

	public static InformacaoCusto calculaInformacaoCusto(MovimentoESS movimento, MovimentoESS movimentoInicial,
			FCEBasica fceBasica, int contador) {
		InformacaoCusto informacaoCusto = new InformacaoCusto();

		if (contador == 0) {
			if (movimento.getFonteInformacao() instanceof C170) {

				C170 c170 = (C170) movimento.getFonteInformacao();

				if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
					informacaoCusto.custoUnitario = movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();

					informacaoCusto.quantidadeSaldo = movimento.getQuantidadeUnitario()
							+ (movimentoInicial != null ? movimentoInicial.getQuantidadeSaldo() : 0);
					informacaoCusto.totalSaldo = movimento.getTotalUnitario()
							+ (movimentoInicial != null ? movimentoInicial.getTotalSaldo() : 0);
					informacaoCusto.custoSaldo = informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo;
				} 
				else {

					informacaoCusto.custoUnitario = movimentoInicial != null ? movimentoInicial.getCustoSaldo()
							: -1.11111111111;
					informacaoCusto.quantidadeSaldo = movimentoInicial != null
							? (movimentoInicial.getQuantidadeSaldo() - movimento.getQuantidadeUnitario())
							: -movimento.getQuantidadeUnitario();
					informacaoCusto.totalSaldo = movimentoInicial != null ? movimentoInicial.getTotalSaldo() : 0;

					informacaoCusto.custoSaldo = movimentoInicial.getCustoSaldo() != 0
							? movimentoInicial.getCustoSaldo()
							: 0;
				}

			}

		} // END contador == 0
		else {// contador != 0
			if (movimento.getFonteInformacao() instanceof C170) {

				C170 c170 = (C170) movimento.getFonteInformacao();
				if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
					informacaoCusto.custoUnitario = movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();

					informacaoCusto.quantidadeSaldo = movimento.getQuantidadeUnitario()
							+ fceBasica.getMovimentos().get(contador - 1).getQuantidadeSaldo();
					informacaoCusto.totalSaldo = movimento.getTotalUnitario()
							+ fceBasica.getMovimentos().get(contador - 1).getTotalSaldo();

					if (informacaoCusto.quantidadeSaldo == 0) {
						informacaoCusto.custoSaldo = informacaoCusto.custoUnitario;
					} 
					else {
						informacaoCusto.custoSaldo = informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo;
					}
				} 
				else {
					informacaoCusto.custoUnitario = fceBasica.getMovimentos().get(contador - 1).getCustoSaldo();
					informacaoCusto.quantidadeSaldo = fceBasica.getMovimentos().get(contador - 1).getQuantidadeSaldo()
							- movimento.getQuantidadeUnitario();
					informacaoCusto.totalSaldo = fceBasica.getMovimentos().get(contador - 1).getTotalSaldo();
					if (informacaoCusto.quantidadeSaldo == 0) {
						informacaoCusto.custoSaldo = fceBasica.getMovimentos().get(contador - 1).getCustoSaldo();
					} else {
						informacaoCusto.custoSaldo = Math
								.abs(informacaoCusto.totalSaldo / informacaoCusto.quantidadeSaldo);
					}
				}
			}
		}
		return informacaoCusto;
	}

	public static FCEBasica calculoMedioPonderadaMovel(FCEBasica fceBasica, MovimentoESS movimentoInicial) {
		Collections.sort(fceBasica.getMovimentos(), new FCEComparator());
		int contador = 0;

		double custoUnitario = 0;
		double quantidadeSaldo = 0;
		double custoSaldo = 0;
		double totalSaldo = 0;

		for (MovimentoESS movimento : fceBasica.getMovimentos()) {
			InformacaoCusto informacaoCusto = calculaInformacaoCusto(movimento, movimentoInicial, fceBasica, contador);

			/*
			 * if (contador == 0) { if (movimento.getFonteInformacao() instanceof C170) {
			 * 
			 * C170 c170 = (C170) movimento.getFonteInformacao(); if
			 * (c170.getC100().getIND_OPERC100().equals("Entrada")) { custoUnitario =
			 * movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
			 * quantidadeSaldo = movimento.getQuantidadeUnitario() + (movimentoInicial !=
			 * null ? movimentoInicial.getQuantidadeSaldo() : 0); totalSaldo =
			 * movimento.getTotalUnitario() + (movimentoInicial != null ?
			 * movimentoInicial.getTotalSaldo() : 0); custoSaldo = totalSaldo /
			 * quantidadeSaldo; } else {
			 * 
			 * custoUnitario = movimentoInicial.getCustoSaldo() != 0 ?
			 * movimento.getTotalUnitario() / movimento.getQuantidadeUnitario() : 0;
			 * quantidadeSaldo = movimentoInicial.getCustoSaldo() != 0 ?
			 * movimento.getQuantidadeUnitario() : 0 + (movimentoInicial != null ?
			 * movimentoInicial.getQuantidadeSaldo() : 0); totalSaldo =
			 * (movimentoInicial.getCustoSaldo() != 0 ? movimentoInicial.getTotalSaldo() :
			 * 0) - movimento.getTotalUnitario(); custoSaldo =
			 * movimentoInicial.getCustoSaldo() != 0 ? Math.abs(totalSaldo /
			 * quantidadeSaldo) : 0;
			 * 
			 * }
			 * 
			 * }
			 * 
			 * } else {// if(contador == 0) if (movimento.getFonteInformacao() instanceof
			 * C170) {
			 * 
			 * C170 c170 = (C170) movimento.getFonteInformacao(); if
			 * (c170.getC100().getIND_OPERC100().equals("Entrada")) { custoUnitario =
			 * movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
			 * quantidadeSaldo = movimento.getQuantidadeUnitario() +
			 * fceBasica.getMovimentos().get(contador).getQuantidadeSaldo(); totalSaldo =
			 * movimento.getTotalUnitario() +
			 * fceBasica.getMovimentos().get(contador).getTotalSaldo(); custoSaldo =
			 * totalSaldo / quantidadeSaldo; } else { custoUnitario =
			 * movimento.getTotalUnitario() / movimento.getQuantidadeUnitario();
			 * quantidadeSaldo =
			 * fceBasica.getMovimentos().get(contador).getQuantidadeSaldo() -
			 * movimento.getQuantidadeUnitario(); totalSaldo =
			 * fceBasica.getMovimentos().get(contador).getTotalSaldo() -
			 * movimento.getTotalUnitario(); custoSaldo = Math.abs(totalSaldo /
			 * quantidadeSaldo);
			 * 
			 * }
			 * 
			 * } }
			 */
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

					if (p1.getData().compareTo(p2.getData()) != 0 ) {
						if (p1.getData().before(p2.getData())) {
							return -1;
						} 
						else {
							return 1;
						}

					} 
					else {
						return 0;
					}
				}// end if (p1.getData() != null && p2.getData() != null)
				else {
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
