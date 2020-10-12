package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C350 {

	String REG_C350, SER_C350, SUB_SER_C350;

	int NUM_DOC_C350;
	Calendar DT_DOC_C350 = new GregorianCalendar();

	String CNPJ_CPF_C350;
	float VL_MERC_C350, VL_DOC_C350, VL_DESC_C350, VL_PIS_C350, VL_COFINS_C350;

	String COD_CTA_C350;

	ArrayList<C370> listC370 = new ArrayList<>();
	ArrayList<C390> listC390 = new ArrayList<>();

	public String getREG_C350() {
		return REG_C350;
	}

	public void setREG_C350(String rEG_C350) {
		REG_C350 = rEG_C350;
	}

	public String getSER_C350() {
		return SER_C350;
	}

	public void setSER_C350(String sER_C350) {
		SER_C350 = sER_C350;
	}

	public String getSUB_SER_C350() {
		return SUB_SER_C350;
	}

	public void setSUB_SER_C350(String sUB_SER_C350) {
		SUB_SER_C350 = sUB_SER_C350;
	}

	public int getNUM_DOC_C350() {
		return NUM_DOC_C350;
	}

	public void setNUM_DOC_C350(int nUM_DOC_C350) {
		NUM_DOC_C350 = nUM_DOC_C350;
	}

	public Calendar getDT_DOC_C350() {
		return DT_DOC_C350;
	}

	public void setDT_DOC_C350(Calendar dT_DOC_C350) {
		DT_DOC_C350 = dT_DOC_C350;
	}

	public String getCNPJ_CPF_C350() {
		return CNPJ_CPF_C350;
	}

	public void setCNPJ_CPF_C350(String cNPJ_CPF_C350) {
		CNPJ_CPF_C350 = cNPJ_CPF_C350;
	}

	public float getVL_MERC_C350() {
		return VL_MERC_C350;
	}

	public void setVL_MERC_C350(float vL_MERC_C350) {
		VL_MERC_C350 = vL_MERC_C350;
	}

	public float getVL_DOC_C350() {
		return VL_DOC_C350;
	}

	public void setVL_DOC_C350(float vL_DOC_C350) {
		VL_DOC_C350 = vL_DOC_C350;
	}

	public float getVL_DESC_C350() {
		return VL_DESC_C350;
	}

	public void setVL_DESC_C350(float vL_DESC_C350) {
		VL_DESC_C350 = vL_DESC_C350;
	}

	public float getVL_PIS_C350() {
		return VL_PIS_C350;
	}

	public void setVL_PIS_C350(float vL_PIS_C350) {
		VL_PIS_C350 = vL_PIS_C350;
	}

	public float getVL_COFINS_C350() {
		return VL_COFINS_C350;
	}

	public void setVL_COFINS_C350(float vL_COFINS_C350) {
		VL_COFINS_C350 = vL_COFINS_C350;
	}

	public String getCOD_CTA_C350() {
		return COD_CTA_C350;
	}

	public void setCOD_CTA_C350(String cOD_CTA_C350) {
		COD_CTA_C350 = cOD_CTA_C350;
	}

	public ArrayList<C370> getListC370() {
		return listC370;
	}

	public void setListC370(ArrayList<C370> listC370) {
		this.listC370 = listC370;
	}

	public ArrayList<C390> getListC390() {
		return listC390;
	}

	public void setListC390(ArrayList<C390> listC390) {
		this.listC390 = listC390;
	}

	public C350() {
	}

	public C350(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C350(strs1.get(0));
		this.setSER_C350(strs1.get(1));
		this.setSUB_SER_C350(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNUM_DOC_C350(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() == 8) {
			ano = Integer.parseInt(strs1.get(4).substring(4, 8));
			mes = Integer.parseInt(strs1.get(4).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(4).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_C350(calendar);
		this.setCNPJ_CPF_C350(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_MERC_C350(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_DOC_C350(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_DESC_C350(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_PIS_C350(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_COFINS_C350(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setCOD_CTA_C350(strs1.get(11));
	}

}
