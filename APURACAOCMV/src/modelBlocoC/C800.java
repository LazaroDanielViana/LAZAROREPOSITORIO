package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C800 {
	String REG_C800, COD_MOD_C800;
	int COD_SIT_C800, NUM_CFE_C800;
	Calendar DT_DOC_C800 = new GregorianCalendar();

	float VL_CFE_C800, VL_PIS_C800, VL_COFINS_C800;
	String CNPJ_CPF_C800;
	int NR_SAT_C800;
	String CHV_CFE_C800;
	float VL_DESC_C800, VL_MERC_C800, VL_OUT_DA_C800, VL_ICMS_C800, VL_PIS_ST_C800, VL_COFINS_ST_C800;

	ArrayList<C850> listC850 = new ArrayList<>();

	public String getREG_C800() {
		return REG_C800;
	}

	public void setREG_C800(String rEG_C800) {
		REG_C800 = rEG_C800;
	}

	public String getCOD_MOD_C800() {
		return COD_MOD_C800;
	}

	public void setCOD_MOD_C800(String cOD_MOD_C800) {
		COD_MOD_C800 = cOD_MOD_C800;
	}

	public int getCOD_SIT_C800() {
		return COD_SIT_C800;
	}

	public void setCOD_SIT_C800(int cOD_SIT_C800) {
		COD_SIT_C800 = cOD_SIT_C800;
	}

	public int getNUM_CFE_C800() {
		return NUM_CFE_C800;
	}

	public void setNUM_CFE_C800(int nUM_CFE_C800) {
		NUM_CFE_C800 = nUM_CFE_C800;
	}

	public Calendar getDT_DOC_C800() {
		return DT_DOC_C800;
	}

	public void setDT_DOC_C800(Calendar dT_DOC_C800) {
		DT_DOC_C800 = dT_DOC_C800;
	}

	public float getVL_CFE_C800() {
		return VL_CFE_C800;
	}

	public void setVL_CFE_C800(float vL_CFE_C800) {
		VL_CFE_C800 = vL_CFE_C800;
	}

	public float getVL_PIS_C800() {
		return VL_PIS_C800;
	}

	public void setVL_PIS_C800(float vL_PIS_C800) {
		VL_PIS_C800 = vL_PIS_C800;
	}

	public float getVL_COFINS_C800() {
		return VL_COFINS_C800;
	}

	public void setVL_COFINS_C800(float vL_COFINS_C800) {
		VL_COFINS_C800 = vL_COFINS_C800;
	}

	public String getCNPJ_CPF_C800() {
		return CNPJ_CPF_C800;
	}

	public void setCNPJ_CPF_C800(String cNPJ_CPF_C800) {
		CNPJ_CPF_C800 = cNPJ_CPF_C800;
	}

	public int getNR_SAT_C800() {
		return NR_SAT_C800;
	}

	public void setNR_SAT_C800(int nR_SAT_C800) {
		NR_SAT_C800 = nR_SAT_C800;
	}

	public String getCHV_CFE_C800() {
		return CHV_CFE_C800;
	}

	public void setCHV_CFE_C800(String cHV_CFE_C800) {
		CHV_CFE_C800 = cHV_CFE_C800;
	}

	public float getVL_DESC_C800() {
		return VL_DESC_C800;
	}

	public void setVL_DESC_C800(float vL_DESC_C800) {
		VL_DESC_C800 = vL_DESC_C800;
	}

	public float getVL_MERC_C800() {
		return VL_MERC_C800;
	}

	public void setVL_MERC_C800(float vL_MERC_C800) {
		VL_MERC_C800 = vL_MERC_C800;
	}

	public float getVL_OUT_DA_C800() {
		return VL_OUT_DA_C800;
	}

	public void setVL_OUT_DA_C800(float vL_OUT_DA_C800) {
		VL_OUT_DA_C800 = vL_OUT_DA_C800;
	}

	public float getVL_ICMS_C800() {
		return VL_ICMS_C800;
	}

	public void setVL_ICMS_C800(float vL_ICMS_C800) {
		VL_ICMS_C800 = vL_ICMS_C800;
	}

	public float getVL_PIS_ST_C800() {
		return VL_PIS_ST_C800;
	}

	public void setVL_PIS_ST_C800(float vL_PIS_ST_C800) {
		VL_PIS_ST_C800 = vL_PIS_ST_C800;
	}

	public float getVL_COFINS_ST_C800() {
		return VL_COFINS_ST_C800;
	}

	public void setVL_COFINS_ST_C800(float vL_COFINS_ST_C800) {
		VL_COFINS_ST_C800 = vL_COFINS_ST_C800;
	}

	public ArrayList<C850> getListC850() {
		return listC850;
	}

	public void setListC850(ArrayList<C850> listC850) {
		this.listC850 = listC850;
	}

	public C800() {
	}

	public C800(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C800(strs1.get(0));
		this.setCOD_MOD_C800(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCOD_SIT_C800(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNUM_CFE_C800(Integer.parseInt(strs1.get(3)));
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
		this.setDT_DOC_C800(calendar);
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_CFE_C800(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_PIS_C800(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_COFINS_C800(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setCNPJ_CPF_C800(strs1.get(8));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setNR_SAT_C800(Integer.parseInt(strs1.get(9)));
		this.setCHV_CFE_C800(strs1.get(10));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_DESC_C800(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_MERC_C800(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_OUT_DA_C800(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_ICMS_C800(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_PIS_ST_C800(Float.parseFloat(strs1.get(15).replace(",", ".")));
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_COFINS_ST_C800(Float.parseFloat(strs1.get(16).replace(",", ".")));
	}

}
