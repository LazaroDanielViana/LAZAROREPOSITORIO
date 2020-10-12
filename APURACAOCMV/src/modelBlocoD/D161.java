package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D161 {
	String REG_D161;
	byte IND_CARGA_D161;
	String CNPJ_CPF_COL_D161, IE_COL_D161;
	int COD_MUN_COL_D161;
	String CNPJ_CPF_ENTG_D161, IE_ENTG_D161;
	int COD_MUN_ENTG_D161;
	D160 d160;

	public String getREG_D161() {
		return REG_D161;
	}

	public void setREG_D161(String rEG_D161) {
		REG_D161 = rEG_D161;
	}

	public byte getIND_CARGA_D161() {
		return IND_CARGA_D161;
	}

	public void setIND_CARGA_D161(byte iND_CARGA_D161) {
		IND_CARGA_D161 = iND_CARGA_D161;
	}

	public String getCNPJ_CPF_COL_D161() {
		return CNPJ_CPF_COL_D161;
	}

	public void setCNPJ_CPF_COL_D161(String cNPJ_CPF_COL_D161) {
		CNPJ_CPF_COL_D161 = cNPJ_CPF_COL_D161;
	}

	public String getIE_COL_D161() {
		return IE_COL_D161;
	}

	public void setIE_COL_D161(String iE_COL_D161) {
		IE_COL_D161 = iE_COL_D161;
	}

	public int getCOD_MUN_COL_D161() {
		return COD_MUN_COL_D161;
	}

	public void setCOD_MUN_COL_D161(int cOD_MUN_COL_D161) {
		COD_MUN_COL_D161 = cOD_MUN_COL_D161;
	}

	public String getCNPJ_CPF_ENTG_D161() {
		return CNPJ_CPF_ENTG_D161;
	}

	public void setCNPJ_CPF_ENTG_D161(String cNPJ_CPF_ENTG_D161) {
		CNPJ_CPF_ENTG_D161 = cNPJ_CPF_ENTG_D161;
	}

	public String getIE_ENTG_D161() {
		return IE_ENTG_D161;
	}

	public void setIE_ENTG_D161(String iE_ENTG_D161) {
		IE_ENTG_D161 = iE_ENTG_D161;
	}

	public int getCOD_MUN_ENTG_D161() {
		return COD_MUN_ENTG_D161;
	}

	public void setCOD_MUN_ENTG_D161(int cOD_MUN_ENTG_D161) {
		COD_MUN_ENTG_D161 = cOD_MUN_ENTG_D161;
	}
	
	

	public D160 getD160() {
		return d160;
	}

	public void setD160(D160 d160) {
		this.d160 = d160;
	}

	public D161() {
	}

	public D161(ArrayList<String> strs1) {
		this.setREG_D161(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setIND_CARGA_D161(Byte.parseByte(strs1.get(1)));
		this.setCNPJ_CPF_COL_D161(strs1.get(2));
		this.setIE_COL_D161(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setCOD_MUN_COL_D161(Integer.parseInt(strs1.get(4)));
		this.setCNPJ_CPF_ENTG_D161(strs1.get(5));
		this.setIE_ENTG_D161(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setCOD_MUN_ENTG_D161(Integer.parseInt(strs1.get(7)));
	}

}
