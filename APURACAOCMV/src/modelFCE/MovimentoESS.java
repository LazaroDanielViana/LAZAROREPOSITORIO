package modelFCE;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

import efdUtil.ConcatenarArrays;
import efdUtil.LeEscreveExcel;
import modelBloco0.Bloco0;
import modelBloco0.R0000;
import modelBloco0.R0200;
import modelBloco0.R0200.TIPO_ITEM_R0200;
import modelBlocoC.C170;

public class MovimentoESS implements Serializable, Comparable<MovimentoESS> {
	//private static final long serialVersionUID = 1L;

	//int numColuna = 0;
	int id;
	String CNPJ;

	Calendar data;

	String historico;

	String codigoMercadoria;

	String descricao;

	String NCM;

	int numNotaFiscal;

	String CFOP;

	int CST_ICMS;

	double quantidadeUnitario;

	double custoUnitario;

	double totalUnitario;

	double vlItem;

	double vlICMS;

	double vlICMSST;

	int CEST;

	double vlCOFINS;

	double vlPIS;

	// Saldo saldo = new Saldo();

	double quantidadeSaldo;
	double custoSaldo;
	double totalSaldo;
	Object objetoFonteInformacao;
	public static Set<String> set = new HashSet<String>();

	// TIPO_MOVIMENTO tipoMovimento;

	public static Map<String, String> keyValueMap = LeEscreveExcel.leExcel();

	/*
	 * public static Map<String, String> getKeyValueMap(){ if(keyValueMap == null) {
	 * keyValueMap = LeEscreveExcel.leExcel(); return keyValueMap; } else { return
	 * keyValueMap; } }
	 */

	public MovimentoESS() {

	}

	public MovimentoESS(C170 c170, Bloco0 bloco0, List<MovimentoESS> listMovESS) {		
		
		this.CNPJ = bloco0.getR0000().getCNPJ_R0000();
		this.data = c170.getC100().getDT_DOCC100();
		setHistorico(keyValueMap, c170);
		this.codigoMercadoria = c170.getCOD_ITEMC170();
		Map<String, R0200> mapR0200 = Bloco0.getMapR0200(bloco0);
		this.descricao = mapR0200.get(c170.getCOD_ITEMC170()).getDESCR_ITEM_R0200();
		this.NCM = mapR0200.get(c170.getCOD_ITEMC170()).getCOD_NCM_R0200();
		this.numNotaFiscal = c170.getC100().getNUM_DOCC100();
		this.CFOP = c170.getCFOPC170();
		this.CST_ICMS = c170.getCST_ICMSC170();		
		
		this.CEST = mapR0200.get(c170.getCOD_ITEMC170()).getCEST_R0200();
		this.quantidadeUnitario = c170.getQTDC170();
		this.custoUnitario = 0;
		this.totalUnitario = c170.getVL_ITEMC170();
		// setQtdCustoTotalUnitario(c170, listMovESS);

		this.vlItem = c170.getVL_ITEMC170();
		this.vlICMS = c170.getVL_ICMSC170();
		this.vlICMSST = c170.getVL_ICMS_STC170();
		this.vlCOFINS = c170.getVL_COFINSC170();
		this.vlPIS = c170.getVL_PISC170();
		this.quantidadeSaldo =  0;
		this.custoSaldo = 0;
		this.totalSaldo = 0;
		objetoFonteInformacao = c170;
	}

	/*
	 * public MovimentoESS(Calendar data, String historico, String codigoMercadoria,
	 * String descricao, String NCM, double quantidade, double custo, double total,
	 * double vlItem, double vlICMS, double vlICMSST, double vlCOFINS, double vlPIS,
	 * Saldo saldo) {
	 * 
	 * this.data = data; this.historico = historico; this.codigoMercadoria =
	 * codigoMercadoria; this.descricao = descricao; this.NCM = NCM;
	 * 
	 * this.quantidadeUnitario = quantidade;
	 * 
	 * this.custoUnitario = custo;
	 * 
	 * this.totalUnitario = total;
	 * 
	 * this.vlItem = vlItem; this.vlICMS = vlICMS; this.vlICMSST = vlICMSST;
	 * this.vlCOFINS = vlCOFINS; this.vlPIS = vlPIS; this.saldo = saldo; //
	 * this.tipoMovimento = tipoMovimento; }
	 */
	public static void veTabelaExcel() {

		if (keyValueMap != null) {
			System.out.println("Mostrando os valores de keyValueMap");
			for (Map.Entry<String, String> pair : keyValueMap.entrySet()) {
				System.out.println("Chave: " + pair.getKey());
				System.out.println("VAlor: " + pair.getValue());
			}
		} else {
			System.out.println("keyValueMap é null.");
		}
	}

	/*
	 * public Saldo getSaldo(List<MovimentoESS> listMovimentoESS) { int size =
	 * listMovimentoESS.size() - 1; if (size > 0) { // PEGA O SALDO DO ÚLTIMO
	 * ELEMENTO DA LISTA return new
	 * Saldo(listMovimentoESS.get(size).getSaldo().getQuantidadeSaldo(),
	 * listMovimentoESS.get(size).getSaldo().getCustoSaldo(),
	 * listMovimentoESS.get(size).getSaldo().getTotalSaldo()); } else { return new
	 * Saldo(0, 0, 0); }
	 * 
	 * // return valorEntradas / numeroEntradas; }
	 */
	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return "MovimentoESS [data=" + df.format(data) + ", historico=" + historico + ", quantidade="
				+ quantidadeUnitario + ", custo=" + custoUnitario + ", total=" + totalUnitario + ", tipoMovimento="
				+ "]";
	}

	public static String[] columnIdentifiers() {

		String[] movimentoIdentifiers = { "Data", "Histórico", "Código", "Descrição", "Qtd", "Custo", "Total",
				"Valor Item", "Valor ICMS", "Valor ICMS-ST", "Valor COFINS", "Valor PIS" };

		
		String[] saldoIdentifiers = { "Qtd - Saldo", "Custo-Saldo", "Total-Saldo" };

		String[] arr = ConcatenarArrays.concat(String.class, movimentoIdentifiers, saldoIdentifiers);
		return arr;
	}
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Coluna(posicao = 0, nome = "CNPJ")
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Coluna(posicao = 1, nome = "Data", formato="%1$td/%1$tm/%1$tY")
	public	Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	@Coluna(posicao = 2, nome = "Historico")
	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public void setHistorico(Map<String, String> keyValueMap, C170 c170) {
		String historicoMapa;
		historicoMapa = keyValueMap.get(c170.getCFOPC170());

		if (historicoMapa != null) {
			this.historico = c170.getC100().getIND_OPERC100() + " - " + historicoMapa;
			System.out.println("HistóricoMapa obtido: " + historicoMapa);
		} else {
			this.historico = c170.getC100().getIND_OPERC100() + " " + c170.getCFOPC170();
			set.add("CFOP sem descrição -> " + c170.getCFOPC170());
		}
	}

	@Coluna(posicao = 3, nome = "codigoMercadoria")
	public String getCodigoMercadoria() {
		return codigoMercadoria;
	}

	public void setCodigoMercadoria(String codigoMercadoria) {
		this.codigoMercadoria = codigoMercadoria;
	}

	@Coluna(posicao = 4, nome = "descricao")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Coluna(posicao = 5, nome = "NCM")
	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	@Coluna(posicao = 6, nome = "numNotaFiscal")
	public int getNumNotaFiscal() {
		return numNotaFiscal;
	}

	public void setNumNotaFiscal(int numNotaFiscal) {
		this.numNotaFiscal = numNotaFiscal;
	}

	@Coluna(posicao = 7, nome = "CFOP")
	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	@Coluna(posicao = 8, nome = "CST_ICMS")
	public int getCST_ICMS() {
		return CST_ICMS;
	}

	public void setCST_ICMS(int cST_ICMS) {
		CST_ICMS = cST_ICMS;
	}

	// seta quantidadeUnitario, custoUnitário e TotalUnitário
	/*
	 * public void setQtdCustoTotalUnitario(C170 c170, List<MovimentoESS>
	 * listMovESS) { if (c170.getC100().getIND_OPERC100().equals("Saída")) {
	 * this.quantidadeUnitario = -c170.getQTDC170();
	 * 
	 * this.custoUnitario = this.getSaldo(listMovESS).getCustoSaldo();
	 * 
	 * this.totalUnitario = this.getQuantidadeUnitario() * this.getCustoUnitario();
	 * }
	 * 
	 * else if (c170.getC100().getIND_OPERC100().equals("Entrada")) {
	 * this.quantidadeUnitario = c170.getQTDC170();
	 * 
	 * this.custoUnitario = (c170.getVL_ITEMC170() - c170.getVL_ICMSC170() -
	 * c170.getVL_COFINSC170() - c170.getVL_PISC170());
	 * 
	 * this.totalUnitario = this.getQuantidadeUnitario() * this.getCustoUnitario();
	 * }
	 * 
	 * }
	 */
	@Coluna(posicao = 9, nome = "quantidadeUnitario")
	public double getQuantidadeUnitario() {
		return quantidadeUnitario;
	}

	public void setQuantidadeUnitario(double quantidade) {
		this.quantidadeUnitario = quantidade;
	}

	@Coluna(posicao = 10, nome = "custoUnitario", formato="R$ %,#.2f")
	public double getCustoUnitario() {
		return custoUnitario;
	}

	public void setCustoUnitario(double custo) {
		this.custoUnitario = custo;
	}

	@Coluna(posicao = 11, nome = "totalUnitario", formato="R$ %,#.2f")
	public double getTotalUnitario() {
		return totalUnitario;
	}

	public void setTotalUnitario(double total) {
		this.totalUnitario = total;
	}

	@Coluna(posicao = 12, nome = "vlItem", formato="R$ %,#.2f")
	public double getVlItem() {
		return vlItem;
	}

	public void setVlItem(double vlItem) {
		this.vlItem = vlItem;
	}

	@Coluna(posicao = 13, nome = "vlICMS",formato="R$ %,#.2f")
	public double getVlICMS() {
		return vlICMS;
	}

	public void setVlICMS(float vlICMS) {
		this.vlICMS = vlICMS;
	}

	@Coluna(posicao = 14, nome = "vlICMSST",formato="R$ %,#.2f")
	public double getVlICMSST() {
		return vlICMSST;
	}

	public void setVlICMSST(double vlICMSST) {
		this.vlICMSST = vlICMSST;
	}

	@Coluna(posicao = 15, nome = "CEST")
	public int getCEST() {
		return CEST;
	}

	public void setCEST(int cEST) {
		CEST = cEST;
	}

	@Coluna(posicao = 16, nome = "vlCOFINS",formato="R$ %,#.2f")

	public double getVlCOFINS() {
		return vlCOFINS;
	}

	public void setVlCOFINS(float vlCOFINS) {
		this.vlCOFINS = vlCOFINS;
	}

	@Coluna(posicao = 17, nome = "vlPIS",formato="R$ %,#.2f")
	public double getVlPIS() {
		return vlPIS;
	}

	public void setVlPIS(float vlPIS) {
		this.vlPIS = vlPIS;
	}

	/*
	 * public double getQuantidadeSaldo() { return quantidadeSaldo; }
	 * 
	 * public void setQuantidadeSaldo(double quantidadeSaldo) { this.quantidadeSaldo
	 * = quantidadeSaldo; }
	 * 
	 * public double getCustoSaldo() { return custoSaldo; }
	 * 
	 * public void setCustoSaldo(double custoSaldo) { this.custoSaldo = custoSaldo;
	 * }
	 * 
	 * public double getTotalSaldo() { return totalSaldo; }
	 * 
	 * public void setTotalSaldo(double totalSaldo) { this.totalSaldo = totalSaldo;
	 * }
	 */
	public void setVlICMS(double vlICMS) {
		this.vlICMS = vlICMS;
	}

	public void setVlCOFINS(double vlCOFINS) {
		this.vlCOFINS = vlCOFINS;
	}

	public void setVlPIS(double vlPIS) {
		this.vlPIS = vlPIS;
	}

	@Coluna(posicao = 18, nome = "quantidadeSaldo")
	public double getQuantidadeSaldo() {
		return quantidadeSaldo;
	}

	public void setQuantidadeSaldo(double quantidadeSaldo) {
		this.quantidadeSaldo = quantidadeSaldo;
	}

	@Coluna(posicao = 19, nome = "custoSaldo",formato="R$ %,#.2f")
	public double getCustoSaldo() {
		return custoSaldo;
	}

	public void setCustoSaldo(double custoSaldo) {
		this.custoSaldo = custoSaldo;
	}

	@Coluna(posicao = 20, nome = "totalSaldo",formato="R$ %,#.2f")
	public double getTotalSaldo() {
		return totalSaldo;
	}

	public void setTotalSaldo(double totalSaldo) {
		this.totalSaldo = totalSaldo;
	}
	
	public Object getFonteInformacao() {
		return objetoFonteInformacao;
	}

	public void setObjetoFonteInformacao(Object objetoFonteInformacao) {
		this.objetoFonteInformacao = objetoFonteInformacao;
	}

	/*
	 * public void setSaldo(List<MovimentoESS> listMovESS, C170 c170) { int size =
	 * listMovESS.size() - 1;
	 * 
	 * // Considera os valores do último elemento da lista if (size > 0) { //
	 * if(c170.getC100().getIND_OPERC100().equals("Entrada")) { //pega a quantidade
	 * do último saldo da lista de movimentos e ? deve somar ou subtrair?
	 * this.saldo.setQuantidadeSaldo(listMovESS.get(size).getSaldo().
	 * getQuantidadeSaldo() + this.quantidadeUnitario); // }else
	 * if(c170.getC100().getIND_OPERC100().equals("Saída")) { //
	 * this.saldo.setQuantidadeSaldo(listMovESS.get(size).getSaldo().
	 * getQuantidadeSaldo() // + this.quantidadeUnitario); // }
	 * 
	 * if (c170.getC100().getIND_OPERC100().equals("Entrada")) { double custoSaldoL
	 * = (listMovESS.get(size).getSaldo().getTotalSaldo() + this.totalUnitario) /
	 * (listMovESS.get(size).getSaldo().getQuantidadeSaldo() +
	 * this.quantidadeUnitario); this.saldo.setCustoSaldo(custoSaldoL); } else if
	 * (c170.getC100().getIND_OPERC100().equals("Saída")) {
	 * this.saldo.setCustoSaldo(listMovESS.get(size).getSaldo().getCustoSaldo()); }
	 * 
	 * this.saldo.setTotalSaldo(listMovESS.get(size).getSaldo().getTotalSaldo() +
	 * this.totalUnitario); } //if (size > 0) else if (size == 0) { if
	 * (c170.getC100().getIND_OPERC100().equals("Entrada")) {
	 * this.saldo.setQuantidadeSaldo(this.quantidadeUnitario);
	 * this.saldo.setCustoSaldo(this.custoUnitario);
	 * this.saldo.setTotalSaldo(this.totalUnitario); } else if
	 * (c170.getC100().getIND_OPERC100().equals("Saída")) {
	 * this.saldo.setQuantidadeSaldo(this.quantidadeUnitario);
	 * this.saldo.setCustoSaldo(0); this.saldo.setTotalSaldo(0); }
	 * 
	 * } }
	 */
	@Override
	public int compareTo(MovimentoESS o) {
		// TODO Auto-generated method stub

		int resultado = 0;
		if (this.data.before(o.data)) {
			resultado = -1;
		} else {
			resultado = 1;
		}

		return resultado;
	}

	/*
	 * public TIPO_MOVIMENTO getTipoMovimento() { return tipoMovimento; }
	 * 
	 * public void setTipoMovimento(TIPO_MOVIMENTO tipoMovimento) {
	 * this.tipoMovimento = tipoMovimento; }
	 */

	public enum TIPO_MOVIMENTO {
		// 00 – Mercadoria para Revenda; 01 – Matéria-Prima; 02 – Embalagem; 03 –
		// Produto em Processo;
		// 04 – Produto Acabado; 05 – Subproduto; 06 – Produto Intermediário; 07 –
		// Material de Uso e Consumo;
		// 08 – Ativo Imobilizado; 09 – Serviços; 10 – Outros insumos; 99 – Outras

		ENTRADA(0, "Entrada"), SAIDA(1, "Saída"), SALDO(2, "Saldo");

		private int codigo;

		private String valor;

		// Construtor de cada registro da tabela de dom�nio
		TIPO_MOVIMENTO(int codigo, String valor) {
			this.codigo = codigo;
			this.valor = valor;
		}

		public int getCodigo() {
			return codigo;
		}

		public String getValor() {
			return valor;
		}

		/**
		 * Localiza um registro dado o seu c�digo (�til quando a refer�ncia � feita
		 * atrav�s de um c�digo entre uma tabela de dados e a tabela de dom�nio)
		 */
		public static TIPO_MOVIMENTO getTIPO_MOVIMENTO(int codigo) {
			// Este c�digo n�o � eficiente para muitos dados (uso de
			// LOOP)
			for (TIPO_MOVIMENTO tipo : values()) {
				if (tipo.getCodigo() == codigo)
					return tipo;
			}
			return null; // N�o achou o valor associado ao c�digo!
		}

		public void setTIPO_MOVIMENTO(TIPO_MOVIMENTO t) {
			this.codigo = t.getCodigo();
			this.valor = t.getValor();

		}

	}// END enum TIPO_MOVIMENTO

}
