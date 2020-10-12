package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D160 {

	String REG_D160, DESPACHO_D160, CNPJ_CPF_REM_D160, IE_REM_D160;
	int COD_MUN_ORI_D160;
	String CNPJ_CPF_DEST_D160, IE_DEST_D160;
	int COD_MUN_DEST_D160;
	D100 d100;

	D161 d161 = new D161();

	List<D162> listD162 = new ArrayList<>();

	public String getREG_D160() {
		return REG_D160;
	}

	public void setREG_D160(String rEG_D160) {
		REG_D160 = rEG_D160;
	}

	public String getDESPACHO_D160() {
		return DESPACHO_D160;
	}

	public void setDESPACHO_D160(String dESPACHO_D160) {
		DESPACHO_D160 = dESPACHO_D160;
	}

	public String getCNPJ_CPF_REM_D160() {
		return CNPJ_CPF_REM_D160;
	}

	public void setCNPJ_CPF_REM_D160(String cNPJ_CPF_REM_D160) {
		CNPJ_CPF_REM_D160 = cNPJ_CPF_REM_D160;
	}

	public String getIE_REM_D160() {
		return IE_REM_D160;
	}

	public void setIE_REM_D160(String iE_REM_D160) {
		IE_REM_D160 = iE_REM_D160;
	}

	public int getCOD_MUN_ORI_D160() {
		return COD_MUN_ORI_D160;
	}

	public void setCOD_MUN_ORI_D160(int cOD_MUN_ORI_D160) {
		COD_MUN_ORI_D160 = cOD_MUN_ORI_D160;
	}

	public String getCNPJ_CPF_DEST_D160() {
		return CNPJ_CPF_DEST_D160;
	}

	public void setCNPJ_CPF_DEST_D160(String cNPJ_CPF_DEST_D160) {
		CNPJ_CPF_DEST_D160 = cNPJ_CPF_DEST_D160;
	}

	public String getIE_DEST_D160() {
		return IE_DEST_D160;
	}

	public void setIE_DEST_D160(String iE_DEST_D160) {
		IE_DEST_D160 = iE_DEST_D160;
	}

	public int getCOD_MUN_DEST_D160() {
		return COD_MUN_DEST_D160;
	}

	public void setCOD_MUN_DEST_D160(int cOD_MUN_DEST_D160) {
		COD_MUN_DEST_D160 = cOD_MUN_DEST_D160;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D161 getD161() {
		return d161;
	}

	public void setD161(D161 d161) {
		this.d161 = d161;
	}

	public List<D162> getListD162() {
		return listD162;
	}

	public void setListD162(ArrayList<D162> listD162) {
		this.listD162 = listD162;
	}

	public D160() {
	}

	public D160(ArrayList<String> strs1) {
		this.setREG_D160(strs1.get(0));
		this.setDESPACHO_D160(strs1.get(1));
		this.setCNPJ_CPF_REM_D160(strs1.get(2));
		this.setIE_REM_D160(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setCOD_MUN_ORI_D160(Integer.parseInt(strs1.get(4)));
		this.setCNPJ_CPF_DEST_D160(strs1.get(5));
		this.setIE_DEST_D160(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setCOD_MUN_DEST_D160(Integer.parseInt(strs1.get(7)));
	}

}
