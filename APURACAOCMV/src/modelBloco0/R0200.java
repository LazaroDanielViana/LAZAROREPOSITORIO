package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0200 {

	public enum TIPO_ITEM_R0200 {
		// 00 – Mercadoria para Revenda; 01 – Matéria-Prima; 02 – Embalagem; 03 –
		// Produto em Processo;
		// 04 – Produto Acabado; 05 – Subproduto; 06 – Produto Intermediário; 07 –
		// Material de Uso e Consumo;
		// 08 – Ativo Imobilizado; 09 – Serviços; 10 – Outros insumos; 99 – Outras

		MERCADORIA_PARA_REVENDA(0, "Mercadoria para Revenda"), MATERIA_PRIMA(1, "Matéria-Prima"),
		EMBALAGEM(2, "Embalagem"), PRODUTO_EM_PROCESSO(3, "Produto em Processo"), PRODUTO_ACABADO(4, "Produto Acabado"),
		SUBPRODUTO(5, "Subproduto"), PRODUTO_INTERMEDIARIO(6, "Produto Intermediário"),
		MATERIAL_DE_USO_E_CONSUMO(7, "Material de Uso e Consumo"), ATIVO_IMOBILIZADO(8, "Ativo Imobilizado"),
		SERVICOS(9, "Serviços"), OUTROS_INSUMOS(10, "Outros insumos"), OUTRAS(99, "Outras");

		private int codigo;

		private String valor;

		// Construtor de cada registro da tabela de dom�nio
		TIPO_ITEM_R0200(int codigo, String valor) {
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
		public static TIPO_ITEM_R0200 getTipoTIPO_ITEM_R0200(int codigo) {
			// Este c�digo n�o � eficiente para muitos dados (uso de
			// LOOP)
			for (TIPO_ITEM_R0200 tipo : values()) {
				if (tipo.getCodigo() == codigo)
					return tipo;
			}
			return null; // N�o achou o valor associado ao c�digo!
		}
	}// END enum TIPO_ITEM_R0200

	String REG_R0200, COD_ITEM_R0200, DESCR_ITEM_R0200, COD_BARRA_R0200, COD_ANT_ITEM_R0200, UNID_INV_R0200;

	byte TIPO_ITEM_R0200;// TODO substituir pela enum

	String COD_NCM_R0200, EX_IPI_R0200;
	byte COD_GEN_R0200;
	String COD_LST_R0200;
	float ALIQ_ICMS_R0200;
	int CEST_R0200;

	R0001 r0001;

	List<R0205> listR0205 = new ArrayList<>();
	R0206 r0206 = new R0206();
	List<R0210> listR0210 = new ArrayList<>();
	List<R0220> listR0220 = new ArrayList<>();

	public String getREG_R0200() {
		return REG_R0200;
	}

	public void setREG_R0200(String rEG_R0200) {
		REG_R0200 = rEG_R0200;
	}

	public String getCOD_ITEM_R0200() {
		return COD_ITEM_R0200;
	}

	public void setCOD_ITEM_R0200(String cOD_ITEM_R0200) {
		COD_ITEM_R0200 = cOD_ITEM_R0200;
	}

	public String getDESCR_ITEM_R0200() {
		return DESCR_ITEM_R0200;
	}

	public void setDESCR_ITEM_R0200(String dESCR_ITEM_R0200) {
		DESCR_ITEM_R0200 = dESCR_ITEM_R0200;
	}

	public String getCOD_BARRA_R0200() {
		return COD_BARRA_R0200;
	}

	public void setCOD_BARRA_R0200(String cOD_BARRA_R0200) {
		COD_BARRA_R0200 = cOD_BARRA_R0200;
	}

	public String getCOD_ANT_ITEM_R0200() {
		return COD_ANT_ITEM_R0200;
	}

	public void setCOD_ANT_ITEM_R0200(String cOD_ANT_ITEM_R0200) {
		COD_ANT_ITEM_R0200 = cOD_ANT_ITEM_R0200;
	}

	public String getUNID_INV_R0200() {
		return UNID_INV_R0200;
	}

	public void setUNID_INV_R0200(String uNID_INV_R0200) {
		UNID_INV_R0200 = uNID_INV_R0200;
	}

	public byte getTIPO_ITEM_R0200() {
		return TIPO_ITEM_R0200;
	}

	public void setTIPO_ITEM_R0200(byte tIPO_ITEM_R0200) {
		TIPO_ITEM_R0200 = tIPO_ITEM_R0200;
	}

	public String getCOD_NCM_R0200() {
		return COD_NCM_R0200;
	}

	public void setCOD_NCM_R0200(String cOD_NCM_R0200) {
		COD_NCM_R0200 = cOD_NCM_R0200;
	}

	public String getEX_IPI_R0200() {
		return EX_IPI_R0200;
	}

	public void setEX_IPI_R0200(String eX_IPI_R0200) {
		EX_IPI_R0200 = eX_IPI_R0200;
	}

	public byte getCOD_GEN_R0200() {
		return COD_GEN_R0200;
	}

	public void setCOD_GEN_R0200(byte cOD_GEN_R0200) {
		COD_GEN_R0200 = cOD_GEN_R0200;
	}

	public String getCOD_LST_R0200() {
		return COD_LST_R0200;
	}

	public void setCOD_LST_R0200(String cOD_LST_R0200) {
		COD_LST_R0200 = cOD_LST_R0200;
	}

	public float getALIQ_ICMS_R0200() {
		return ALIQ_ICMS_R0200;
	}

	public void setALIQ_ICMS_R0200(float aLIQ_ICMS_R0200) {
		ALIQ_ICMS_R0200 = aLIQ_ICMS_R0200;
	}

	public int getCEST_R0200() {
		return CEST_R0200;
	}

	public void setCEST_R0200(int cEST_R0200) {
		CEST_R0200 = cEST_R0200;
	}

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public List<R0205> getListR0205() {
		return listR0205;
	}

	public void setListR0205(List<R0205> listR0205) {
		this.listR0205 = listR0205;
	}

	public R0206 getR0206() {
		return r0206;
	}

	public void setR0206(R0206 r0206) {
		this.r0206 = r0206;
	}

	public List<R0210> getListR0210() {
		return listR0210;
	}

	public void setListR0210(List<R0210> listR0210) {
		this.listR0210 = listR0210;
	}

	public List<R0220> getListR0220() {
		return listR0220;
	}

	public void setListR0220(List<R0220> listR0220) {
		this.listR0220 = listR0220;
	}

	public R0200() {
	}

	public R0200(List<String> strs1, R0000 r0000) {
		this.setREG_R0200(strs1.get(0));
		this.setCOD_ITEM_R0200(strs1.get(1));
		this.setDESCR_ITEM_R0200(strs1.get(2));
		this.setCOD_BARRA_R0200(strs1.get(3));
		this.setCOD_ANT_ITEM_R0200(strs1.get(4));
		this.setUNID_INV_R0200(strs1.get(5));
		if (strs1.get(6).length() >= 1)
			this.setTIPO_ITEM_R0200(Byte.parseByte(strs1.get(6)));
		this.setCOD_NCM_R0200(strs1.get(7));
		this.setEX_IPI_R0200(strs1.get(8));
		if (strs1.get(9).length() >= 1)
			this.setCOD_GEN_R0200(Byte.parseByte(strs1.get(9)));
		this.setCOD_LST_R0200(strs1.get(10));
		if (strs1.get(11).length() >= 1)
			this.setALIQ_ICMS_R0200(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (r0000.getDT_FIN_R0000().YEAR >= 2017) {
			if (strs1.get(12).length() >= 1)
				this.setCEST_R0200(Integer.parseInt(strs1.get(12)));
		}

	}
}
