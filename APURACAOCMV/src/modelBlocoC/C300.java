package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C300 {

	String REG_C300, COD_MOD_C300, SER_C300, SUB_C300;
	int NUM_DOC_INI_C300, NUM_DOC_FIN_C300;
	Calendar DT_DOC_C300;
	float VL_DOC_C300, VL_PIS_C300, VL_COFINS_C300;
	String COD_CTA_C300;

	ArrayList<C310> listC310 = new ArrayList<>();
	ArrayList<C320> listC320 = new ArrayList<>();

	public String getREG_C300() {
		return REG_C300;
	}

	public void setREG_C300(String rEG_C300) {
		REG_C300 = rEG_C300;
	}

	public String getCOD_MOD_C300() {
		return COD_MOD_C300;
	}

	public void setCOD_MOD_C300(String cOD_MOD_C300) {
		COD_MOD_C300 = cOD_MOD_C300;
	}

	public String getSER_C300() {
		return SER_C300;
	}

	public void setSER_C300(String sER_C300) {
		SER_C300 = sER_C300;
	}

	public String getSUB_C300() {
		return SUB_C300;
	}

	public void setSUB_C300(String sUB_C300) {
		SUB_C300 = sUB_C300;
	}

	public int getNUM_DOC_INI_C300() {
		return NUM_DOC_INI_C300;
	}

	public void setNUM_DOC_INI_C300(int nUM_DOC_INI_C300) {
		NUM_DOC_INI_C300 = nUM_DOC_INI_C300;
	}

	public int getNUM_DOC_FIN_C300() {
		return NUM_DOC_FIN_C300;
	}

	public void setNUM_DOC_FIN_C300(int nUM_DOC_FIN_C300) {
		NUM_DOC_FIN_C300 = nUM_DOC_FIN_C300;
	}

	public Calendar getDT_DOC_C300() {
		return DT_DOC_C300;
	}

	public void setDT_DOC_C300(Calendar dT_DOC_C300) {
		DT_DOC_C300 = dT_DOC_C300;
	}

	public float getVL_DOC_C300() {
		return VL_DOC_C300;
	}

	public void setVL_DOC_C300(float vL_DOC_C300) {
		VL_DOC_C300 = vL_DOC_C300;
	}

	public float getVL_PIS_C300() {
		return VL_PIS_C300;
	}

	public void setVL_PIS_C300(float vL_PIS_C300) {
		VL_PIS_C300 = vL_PIS_C300;
	}

	public float getVL_COFINS_C300() {
		return VL_COFINS_C300;
	}

	public void setVL_COFINS_C300(float vL_COFINS_C300) {
		VL_COFINS_C300 = vL_COFINS_C300;
	}

	public String getCOD_CTA_C300() {
		return COD_CTA_C300;
	}

	public void setCOD_CTA_C300(String cOD_CTA_C300) {
		COD_CTA_C300 = cOD_CTA_C300;
	}

	public ArrayList<C310> getListC310() {
		return listC310;
	}

	public void setListC310(ArrayList<C310> listC310) {
		this.listC310 = listC310;
	}

	public ArrayList<C320> getListC320() {
		return listC320;
	}

	public void setListC320(ArrayList<C320> listC320) {
		this.listC320 = listC320;
	}

	public C300() {
	}

	public C300(List<String> strs1) {
		int ano, mes, dia;
		this.setCOD_MOD_C300(strs1.get(0));
		this.setSER_C300(strs1.get(1));
		this.setSUB_C300(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNUM_DOC_INI_C300(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNUM_DOC_FIN_C300(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() == 8) {
			ano = Integer.parseInt(strs1.get(5).substring(4, 8));
			mes = Integer.parseInt(strs1.get(5).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(5).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_C300(calendar);
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_DOC_C300(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_PIS_C300(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_COFINS_C300(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setCOD_CTA_C300(strs1.get(9));
	}

}
