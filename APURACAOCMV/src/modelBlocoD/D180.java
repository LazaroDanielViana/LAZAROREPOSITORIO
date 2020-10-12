package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D180 {
	String REG_D180;
	int NUM_SEQ_D180;
	String IND_EMIT_D180, CNPJ_CPF_EMIT_D180, UF_EMIT_D180, IE_EMIT_D180;
	int COD_MUN_ORIG_D180;
	String CNPJ_CPF_TOM_D180, UF_TOM_D180, IE_TOM_D180;
	int COD_MUN_DEST_D180;
	String COD_MOD_D180, SER_D180;
	int SUB_D180, NUM_DOC_D180;
	Calendar DT_DOC_D180 = new GregorianCalendar();
	float VL_DOC_D180;
	
	D100 d100;

	public String getREG_D180() {
		return REG_D180;
	}

	public void setREG_D180(String rEG_D180) {
		REG_D180 = rEG_D180;
	}

	public int getNUM_SEQ_D180() {
		return NUM_SEQ_D180;
	}

	public void setNUM_SEQ_D180(int nUM_SEQ_D180) {
		NUM_SEQ_D180 = nUM_SEQ_D180;
	}

	public String getIND_EMIT_D180() {
		return IND_EMIT_D180;
	}

	public void setIND_EMIT_D180(String iND_EMIT_D180) {
		IND_EMIT_D180 = iND_EMIT_D180;
	}

	public String getCNPJ_CPF_EMIT_D180() {
		return CNPJ_CPF_EMIT_D180;
	}

	public void setCNPJ_CPF_EMIT_D180(String cNPJ_CPF_EMIT_D180) {
		CNPJ_CPF_EMIT_D180 = cNPJ_CPF_EMIT_D180;
	}

	public String getUF_EMIT_D180() {
		return UF_EMIT_D180;
	}

	public void setUF_EMIT_D180(String uF_EMIT_D180) {
		UF_EMIT_D180 = uF_EMIT_D180;
	}

	public String getIE_EMIT_D180() {
		return IE_EMIT_D180;
	}

	public void setIE_EMIT_D180(String iE_EMIT_D180) {
		IE_EMIT_D180 = iE_EMIT_D180;
	}

	public int getCOD_MUN_ORIG_D180() {
		return COD_MUN_ORIG_D180;
	}

	public void setCOD_MUN_ORIG_D180(int cOD_MUN_ORIG_D180) {
		COD_MUN_ORIG_D180 = cOD_MUN_ORIG_D180;
	}

	public String getCNPJ_CPF_TOM_D180() {
		return CNPJ_CPF_TOM_D180;
	}

	public void setCNPJ_CPF_TOM_D180(String cNPJ_CPF_TOM_D180) {
		CNPJ_CPF_TOM_D180 = cNPJ_CPF_TOM_D180;
	}

	public String getUF_TOM_D180() {
		return UF_TOM_D180;
	}

	public void setUF_TOM_D180(String uF_TOM_D180) {
		UF_TOM_D180 = uF_TOM_D180;
	}

	public String getIE_TOM_D180() {
		return IE_TOM_D180;
	}

	public void setIE_TOM_D180(String iE_TOM_D180) {
		IE_TOM_D180 = iE_TOM_D180;
	}

	public int getCOD_MUN_DEST_D180() {
		return COD_MUN_DEST_D180;
	}

	public void setCOD_MUN_DEST_D180(int cOD_MUN_DEST_D180) {
		COD_MUN_DEST_D180 = cOD_MUN_DEST_D180;
	}

	public String getCOD_MOD_D180() {
		return COD_MOD_D180;
	}

	public void setCOD_MOD_D180(String cOD_MOD_D180) {
		COD_MOD_D180 = cOD_MOD_D180;
	}

	public String getSER_D180() {
		return SER_D180;
	}

	public void setSER_D180(String sER_D180) {
		SER_D180 = sER_D180;
	}

	public int getSUB_D180() {
		return SUB_D180;
	}

	public void setSUB_D180(int sUB_D180) {
		SUB_D180 = sUB_D180;
	}

	public int getNUM_DOC_D180() {
		return NUM_DOC_D180;
	}

	public void setNUM_DOC_D180(int nUM_DOC_D180) {
		NUM_DOC_D180 = nUM_DOC_D180;
	}

	public Calendar getDT_DOC_D180() {
		return DT_DOC_D180;
	}

	public void setDT_DOC_D180(Calendar dT_DOC_D180) {
		DT_DOC_D180 = dT_DOC_D180;
	}

	public float getVL_DOC_D180() {
		return VL_DOC_D180;
	}

	public void setVL_DOC_D180(float vL_DOC_D180) {
		VL_DOC_D180 = vL_DOC_D180;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D180() {
	}

	public D180(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D180(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setNUM_SEQ_D180(Integer.parseInt(strs1.get(1)));
		this.setIND_EMIT_D180(strs1.get(2));
		this.setCNPJ_CPF_EMIT_D180(strs1.get(3));
		this.setUF_EMIT_D180(strs1.get(4));
		this.setIE_EMIT_D180(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setCOD_MUN_ORIG_D180(Integer.parseInt(strs1.get(6)));
		this.setCNPJ_CPF_TOM_D180(strs1.get(7));
		this.setUF_TOM_D180(strs1.get(8));
		this.setIE_TOM_D180(strs1.get(9));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setCOD_MUN_DEST_D180(Integer.parseInt(strs1.get(10)));
		this.setCOD_MOD_D180(strs1.get(11));
		this.setSER_D180(strs1.get(12));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setSUB_D180(Integer.parseInt(strs1.get(13)));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setNUM_DOC_D180(Integer.parseInt(strs1.get(14)));
		if (strs1.get(15).length() == 8) {
			ano = Integer.parseInt(strs1.get(15).substring(4, 8));
			mes = Integer.parseInt(strs1.get(15).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(15).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D180(calendar);
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_DOC_D180(Float.parseFloat(strs1.get(16).replace(",", ".")));
	}

}
