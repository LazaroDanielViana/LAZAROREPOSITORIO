package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D400 {
	String REG_D400, COD_PART_D400, COD_MOD_D400;
	byte COD_SIT_D400;
	String SER_D400;
	int SUB_D400, NUM_DOC_D400;
	Calendar DT_DOC_D400 = new GregorianCalendar();

	float VL_DOC_D400, VL_DESC_D400, VL_SERV_D400, VL_BC_ICMS_D400, VL_ICMS_D400, VL_PIS_D400, VL_COFINS_D400;
	String COD_CTA_D400;

	ArrayList<D410> listD410 = new ArrayList<>();
	ArrayList<D420> listD420 = new ArrayList<>();

	public String getREG_D400() {
		return REG_D400;
	}

	public void setREG_D400(String rEG_D400) {
		REG_D400 = rEG_D400;
	}

	public String getCOD_PART_D400() {
		return COD_PART_D400;
	}

	public void setCOD_PART_D400(String cOD_PART_D400) {
		COD_PART_D400 = cOD_PART_D400;
	}

	public String getCOD_MOD_D400() {
		return COD_MOD_D400;
	}

	public void setCOD_MOD_D400(String cOD_MOD_D400) {
		COD_MOD_D400 = cOD_MOD_D400;
	}

	public byte getCOD_SIT_D400() {
		return COD_SIT_D400;
	}

	public void setCOD_SIT_D400(byte cOD_SIT_D400) {
		COD_SIT_D400 = cOD_SIT_D400;
	}

	public String getSER_D400() {
		return SER_D400;
	}

	public void setSER_D400(String sER_D400) {
		SER_D400 = sER_D400;
	}

	public int getSUB_D400() {
		return SUB_D400;
	}

	public void setSUB_D400(int sUB_D400) {
		SUB_D400 = sUB_D400;
	}

	public int getNUM_DOC_D400() {
		return NUM_DOC_D400;
	}

	public void setNUM_DOC_D400(int nUM_DOC_D400) {
		NUM_DOC_D400 = nUM_DOC_D400;
	}

	public Calendar getDT_DOC_D400() {
		return DT_DOC_D400;
	}

	public void setDT_DOC_D400(Calendar dT_DOC_D400) {
		DT_DOC_D400 = dT_DOC_D400;
	}

	public float getVL_DOC_D400() {
		return VL_DOC_D400;
	}

	public void setVL_DOC_D400(float vL_DOC_D400) {
		VL_DOC_D400 = vL_DOC_D400;
	}

	public float getVL_DESC_D400() {
		return VL_DESC_D400;
	}

	public void setVL_DESC_D400(float vL_DESC_D400) {
		VL_DESC_D400 = vL_DESC_D400;
	}

	public float getVL_SERV_D400() {
		return VL_SERV_D400;
	}

	public void setVL_SERV_D400(float vL_SERV_D400) {
		VL_SERV_D400 = vL_SERV_D400;
	}

	public float getVL_BC_ICMS_D400() {
		return VL_BC_ICMS_D400;
	}

	public void setVL_BC_ICMS_D400(float vL_BC_ICMS_D400) {
		VL_BC_ICMS_D400 = vL_BC_ICMS_D400;
	}

	public float getVL_ICMS_D400() {
		return VL_ICMS_D400;
	}

	public void setVL_ICMS_D400(float vL_ICMS_D400) {
		VL_ICMS_D400 = vL_ICMS_D400;
	}

	public float getVL_PIS_D400() {
		return VL_PIS_D400;
	}

	public void setVL_PIS_D400(float vL_PIS_D400) {
		VL_PIS_D400 = vL_PIS_D400;
	}

	public float getVL_COFINS_D400() {
		return VL_COFINS_D400;
	}

	public void setVL_COFINS_D400(float vL_COFINS_D400) {
		VL_COFINS_D400 = vL_COFINS_D400;
	}

	public String getCOD_CTA_D400() {
		return COD_CTA_D400;
	}

	public void setCOD_CTA_D400(String cOD_CTA_D400) {
		COD_CTA_D400 = cOD_CTA_D400;
	}

	public ArrayList<D410> getListD410() {
		return listD410;
	}

	public void setListD410(ArrayList<D410> listD410) {
		this.listD410 = listD410;
	}

	public ArrayList<D420> getListD420() {
		return listD420;
	}

	public void setListD420(ArrayList<D420> listD420) {
		this.listD420 = listD420;
	}

	public D400() {
	}

	public D400(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D400(strs1.get(0));
		this.setCOD_PART_D400(strs1.get(1));
		this.setCOD_MOD_D400(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCOD_SIT_D400(Byte.parseByte(strs1.get(3)));
		this.setSER_D400(strs1.get(4));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setSUB_D400(Integer.parseInt(strs1.get(5)));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setNUM_DOC_D400(Integer.parseInt(strs1.get(6)));
		if (strs1.get(7).length() == 8) {
			ano = Integer.parseInt(strs1.get(7).substring(4, 8));
			mes = Integer.parseInt(strs1.get(7).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(7).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D400(calendar);
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_DOC_D400(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_DESC_D400(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_SERV_D400(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_BC_ICMS_D400(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_ICMS_D400(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_PIS_D400(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_COFINS_D400(Float.parseFloat(strs1.get(14).replace(",", ".")));
		this.setCOD_CTA_D400(strs1.get(15));
	}

}
