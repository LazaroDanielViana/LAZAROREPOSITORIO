package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D300 {
	String REG_D300, COD_MOD_D300, SER_D300;

	int SUB_D300, NUM_DOC_INI_D300, NUM_DOC_FIN_D300, CST_ICMS_D300, CFOP_D300;
	float ALIQ_ICMS_D300;
	Calendar DT_DOC_D300 = new GregorianCalendar();
	float VL_OPR_D300, VL_DESC_D300, VL_SERV_D300, VL_SEG_D300, VL_OUT_D300, VL_BC_ICMS_D300, VL_ICMS_D300,
			VL_RED_BC_D300;
	String COD_OBS_D300, COD_CTA_D300;

	ArrayList<D301> listD301 = new ArrayList<>();
	ArrayList<D310> listD310 = new ArrayList<>();

	public String getREG_D300() {
		return REG_D300;
	}

	public void setREG_D300(String rEG_D300) {
		REG_D300 = rEG_D300;
	}

	public String getCOD_MOD_D300() {
		return COD_MOD_D300;
	}

	public void setCOD_MOD_D300(String cOD_MOD_D300) {
		COD_MOD_D300 = cOD_MOD_D300;
	}

	public String getSER_D300() {
		return SER_D300;
	}

	public void setSER_D300(String sER_D300) {
		SER_D300 = sER_D300;
	}

	public int getSUB_D300() {
		return SUB_D300;
	}

	public void setSUB_D300(int sUB_D300) {
		SUB_D300 = sUB_D300;
	}

	public int getNUM_DOC_INI_D300() {
		return NUM_DOC_INI_D300;
	}

	public void setNUM_DOC_INI_D300(int nUM_DOC_INI_D300) {
		NUM_DOC_INI_D300 = nUM_DOC_INI_D300;
	}

	public int getNUM_DOC_FIN_D300() {
		return NUM_DOC_FIN_D300;
	}

	public void setNUM_DOC_FIN_D300(int nUM_DOC_FIN_D300) {
		NUM_DOC_FIN_D300 = nUM_DOC_FIN_D300;
	}

	public int getCST_ICMS_D300() {
		return CST_ICMS_D300;
	}

	public void setCST_ICMS_D300(int cST_ICMS_D300) {
		CST_ICMS_D300 = cST_ICMS_D300;
	}

	public int getCFOP_D300() {
		return CFOP_D300;
	}

	public void setCFOP_D300(int cFOP_D300) {
		CFOP_D300 = cFOP_D300;
	}

	public float getALIQ_ICMS_D300() {
		return ALIQ_ICMS_D300;
	}

	public void setALIQ_ICMS_D300(float aLIQ_ICMS_D300) {
		ALIQ_ICMS_D300 = aLIQ_ICMS_D300;
	}

	public Calendar getDT_DOC_D300() {
		return DT_DOC_D300;
	}

	public void setDT_DOC_D300(Calendar dT_DOC_D300) {
		DT_DOC_D300 = dT_DOC_D300;
	}

	public float getVL_OPR_D300() {
		return VL_OPR_D300;
	}

	public void setVL_OPR_D300(float vL_OPR_D300) {
		VL_OPR_D300 = vL_OPR_D300;
	}

	public float getVL_DESC_D300() {
		return VL_DESC_D300;
	}

	public void setVL_DESC_D300(float vL_DESC_D300) {
		VL_DESC_D300 = vL_DESC_D300;
	}

	public float getVL_SERV_D300() {
		return VL_SERV_D300;
	}

	public void setVL_SERV_D300(float vL_SERV_D300) {
		VL_SERV_D300 = vL_SERV_D300;
	}

	public float getVL_SEG_D300() {
		return VL_SEG_D300;
	}

	public void setVL_SEG_D300(float vL_SEG_D300) {
		VL_SEG_D300 = vL_SEG_D300;
	}

	public float getVL_OUT_D300() {
		return VL_OUT_D300;
	}

	public void setVL_OUT_D300(float vL_OUT_D300) {
		VL_OUT_D300 = vL_OUT_D300;
	}

	public float getVL_BC_ICMS_D300() {
		return VL_BC_ICMS_D300;
	}

	public void setVL_BC_ICMS_D300(float vL_BC_ICMS_D300) {
		VL_BC_ICMS_D300 = vL_BC_ICMS_D300;
	}

	public float getVL_ICMS_D300() {
		return VL_ICMS_D300;
	}

	public void setVL_ICMS_D300(float vL_ICMS_D300) {
		VL_ICMS_D300 = vL_ICMS_D300;
	}

	public float getVL_RED_BC_D300() {
		return VL_RED_BC_D300;
	}

	public void setVL_RED_BC_D300(float vL_RED_BC_D300) {
		VL_RED_BC_D300 = vL_RED_BC_D300;
	}

	public String getCOD_OBS_D300() {
		return COD_OBS_D300;
	}

	public void setCOD_OBS_D300(String cOD_OBS_D300) {
		COD_OBS_D300 = cOD_OBS_D300;
	}

	public String getCOD_CTA_D300() {
		return COD_CTA_D300;
	}

	public void setCOD_CTA_D300(String cOD_CTA_D300) {
		COD_CTA_D300 = cOD_CTA_D300;
	}

	public ArrayList<D301> getListD301() {
		return listD301;
	}

	public void setListD301(ArrayList<D301> listD301) {
		this.listD301 = listD301;
	}

	public ArrayList<D310> getListD310() {
		return listD310;
	}

	public void setListD310(ArrayList<D310> listD310) {
		this.listD310 = listD310;
	}

	public D300() {
	}

	public D300(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D300(strs1.get(0));
		this.setCOD_MOD_D300(strs1.get(1));
		this.setSER_D300(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setSUB_D300(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNUM_DOC_INI_D300(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setNUM_DOC_FIN_D300(Integer.parseInt(strs1.get(5)));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setCST_ICMS_D300(Integer.parseInt(strs1.get(6)));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setCFOP_D300(Integer.parseInt(strs1.get(7)));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setALIQ_ICMS_D300(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() == 8) {
			ano = Integer.parseInt(strs1.get(9).substring(4, 8));
			mes = Integer.parseInt(strs1.get(9).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(9).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D300(calendar);
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_OPR_D300(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_DESC_D300(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_SERV_D300(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_SEG_D300(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_OUT_D300(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_BC_ICMS_D300(Float.parseFloat(strs1.get(15).replace(",", ".")));
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_ICMS_D300(Float.parseFloat(strs1.get(16).replace(",", ".")));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_RED_BC_D300(Float.parseFloat(strs1.get(17).replace(",", ".")));
		this.setCOD_OBS_D300(strs1.get(18));
		this.setCOD_CTA_D300(strs1.get(19));
	}

}
