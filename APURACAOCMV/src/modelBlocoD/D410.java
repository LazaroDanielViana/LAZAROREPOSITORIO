package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D410 {
	String REG_D410, COD_MOD_D410, SER_D410;
	int SUB_D410, NUM_DOC_INI_D410, NUM_DOC_FIN_D410;
	Calendar DT_DOC_D410 = new GregorianCalendar();
	int CST_ICMS_D410, CFOP_D410;
	float ALIQ_ICMS_D410, VL_OPR_D410, VL_DESC_D410, VL_SERV_D410, VL_BC_ICMS_D410, VL_ICMS_D410;
	D400 d400;

	ArrayList<D411> listD411 = new ArrayList<>();

	public String getREG_D410() {
		return REG_D410;
	}

	public void setREG_D410(String rEG_D410) {
		REG_D410 = rEG_D410;
	}

	public String getCOD_MOD_D410() {
		return COD_MOD_D410;
	}

	public void setCOD_MOD_D410(String cOD_MOD_D410) {
		COD_MOD_D410 = cOD_MOD_D410;
	}

	public String getSER_D410() {
		return SER_D410;
	}

	public void setSER_D410(String sER_D410) {
		SER_D410 = sER_D410;
	}

	public int getSUB_D410() {
		return SUB_D410;
	}

	public void setSUB_D410(int sUB_D410) {
		SUB_D410 = sUB_D410;
	}

	public int getNUM_DOC_INI_D410() {
		return NUM_DOC_INI_D410;
	}

	public void setNUM_DOC_INI_D410(int nUM_DOC_INI_D410) {
		NUM_DOC_INI_D410 = nUM_DOC_INI_D410;
	}

	public int getNUM_DOC_FIN_D410() {
		return NUM_DOC_FIN_D410;
	}

	public void setNUM_DOC_FIN_D410(int nUM_DOC_FIN_D410) {
		NUM_DOC_FIN_D410 = nUM_DOC_FIN_D410;
	}

	public Calendar getDT_DOC_D410() {
		return DT_DOC_D410;
	}

	public void setDT_DOC_D410(Calendar dT_DOC_D410) {
		DT_DOC_D410 = dT_DOC_D410;
	}

	public int getCST_ICMS_D410() {
		return CST_ICMS_D410;
	}

	public void setCST_ICMS_D410(int cST_ICMS_D410) {
		CST_ICMS_D410 = cST_ICMS_D410;
	}

	public int getCFOP_D410() {
		return CFOP_D410;
	}

	public void setCFOP_D410(int cFOP_D410) {
		CFOP_D410 = cFOP_D410;
	}

	public float getALIQ_ICMS_D410() {
		return ALIQ_ICMS_D410;
	}

	public void setALIQ_ICMS_D410(float aLIQ_ICMS_D410) {
		ALIQ_ICMS_D410 = aLIQ_ICMS_D410;
	}

	public float getVL_OPR_D410() {
		return VL_OPR_D410;
	}

	public void setVL_OPR_D410(float vL_OPR_D410) {
		VL_OPR_D410 = vL_OPR_D410;
	}

	public float getVL_DESC_D410() {
		return VL_DESC_D410;
	}

	public void setVL_DESC_D410(float vL_DESC_D410) {
		VL_DESC_D410 = vL_DESC_D410;
	}

	public float getVL_SERV_D410() {
		return VL_SERV_D410;
	}

	public void setVL_SERV_D410(float vL_SERV_D410) {
		VL_SERV_D410 = vL_SERV_D410;
	}

	public float getVL_BC_ICMS_D410() {
		return VL_BC_ICMS_D410;
	}

	public void setVL_BC_ICMS_D410(float vL_BC_ICMS_D410) {
		VL_BC_ICMS_D410 = vL_BC_ICMS_D410;
	}

	public float getVL_ICMS_D410() {
		return VL_ICMS_D410;
	}

	public void setVL_ICMS_D410(float vL_ICMS_D410) {
		VL_ICMS_D410 = vL_ICMS_D410;
	}
	

	public D400 getD400() {
		return d400;
	}

	public void setD400(D400 d400) {
		this.d400 = d400;
	}

	public ArrayList<D411> getListD411() {
		return listD411;
	}

	public void setListD411(ArrayList<D411> listD411) {
		this.listD411 = listD411;
	}

	public D410() {
	}

	public D410(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D410(strs1.get(0));
		this.setCOD_MOD_D410(strs1.get(1));
		this.setSER_D410(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setSUB_D410(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNUM_DOC_INI_D410(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setNUM_DOC_FIN_D410(Integer.parseInt(strs1.get(5)));
		if (strs1.get(6).length() == 8) {
			ano = Integer.parseInt(strs1.get(6).substring(4, 8));
			mes = Integer.parseInt(strs1.get(6).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(6).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D410(calendar);
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setCST_ICMS_D410(Integer.parseInt(strs1.get(7)));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setCFOP_D410(Integer.parseInt(strs1.get(8)));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setALIQ_ICMS_D410(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_OPR_D410(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_DESC_D410(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_SERV_D410(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_BC_ICMS_D410(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_ICMS_D410(Float.parseFloat(strs1.get(14).replace(",", ".")));
	}

}
