package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C460 {

	String REG_C460, COD_MOD_C460;
	int COD_SIT_C460, NUM_DOC_C460;

	Calendar DT_DOC_C460 = new GregorianCalendar();

	float VL_DOC_C460, VL_PIS_C460, VL_COFINS_C460;
	String CPF_CNPJ_C460, NOM_ADQ_C460;
	C405 c405;

	C465 c465 = new C465();
	ArrayList<C470> listC470 = new ArrayList<>();

	public String getREG_C460() {
		return REG_C460;
	}

	public void setREG_C460(String rEG_C460) {
		REG_C460 = rEG_C460;
	}

	public String getCOD_MOD_C460() {
		return COD_MOD_C460;
	}

	public void setCOD_MOD_C460(String cOD_MOD_C460) {
		COD_MOD_C460 = cOD_MOD_C460;
	}

	public int getCOD_SIT_C460() {
		return COD_SIT_C460;
	}

	public void setCOD_SIT_C460(int cOD_SIT_C460) {
		COD_SIT_C460 = cOD_SIT_C460;
	}

	public int getNUM_DOC_C460() {
		return NUM_DOC_C460;
	}

	public void setNUM_DOC_C460(int nUM_DOC_C460) {
		NUM_DOC_C460 = nUM_DOC_C460;
	}

	public Calendar getDT_DOC_C460() {
		return DT_DOC_C460;
	}

	public void setDT_DOC_C460(Calendar dT_DOC_C460) {
		DT_DOC_C460 = dT_DOC_C460;
	}

	public float getVL_DOC_C460() {
		return VL_DOC_C460;
	}

	public void setVL_DOC_C460(float vL_DOC_C460) {
		VL_DOC_C460 = vL_DOC_C460;
	}

	public float getVL_PIS_C460() {
		return VL_PIS_C460;
	}

	public void setVL_PIS_C460(float vL_PIS_C460) {
		VL_PIS_C460 = vL_PIS_C460;
	}

	public float getVL_COFINS_C460() {
		return VL_COFINS_C460;
	}

	public void setVL_COFINS_C460(float vL_COFINS_C460) {
		VL_COFINS_C460 = vL_COFINS_C460;
	}

	public String getCPF_CNPJ_C460() {
		return CPF_CNPJ_C460;
	}

	public void setCPF_CNPJ_C460(String cPF_CNPJ_C460) {
		CPF_CNPJ_C460 = cPF_CNPJ_C460;
	}

	public String getNOM_ADQ_C460() {
		return NOM_ADQ_C460;
	}

	public void setNOM_ADQ_C460(String nOM_ADQ_C460) {
		NOM_ADQ_C460 = nOM_ADQ_C460;
	}

	public C465 getC465() {
		return c465;
	}

	public void setC465(C465 c465) {
		this.c465 = c465;
	}

	public ArrayList<C470> getListC470() {
		return listC470;
	}

	public void setListC470(ArrayList<C470> listC470) {
		this.listC470 = listC470;
	}
	
	

	public C405 getC405() {
		return c405;
	}

	public void setC405(C405 c405) {
		this.c405 = c405;
	}

	public C460() {
	}

	public C460(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C460(strs1.get(0));
		this.setCOD_MOD_C460(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCOD_SIT_C460(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNUM_DOC_C460(Integer.parseInt(strs1.get(3)));
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
		this.setDT_DOC_C460(calendar);
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_DOC_C460(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_PIS_C460(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_COFINS_C460(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setCPF_CNPJ_C460(strs1.get(8));
		this.setNOM_ADQ_C460(strs1.get(9));
	}

}
