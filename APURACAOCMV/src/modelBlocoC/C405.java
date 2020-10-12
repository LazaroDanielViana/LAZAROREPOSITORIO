package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C405 {

	String REG_C405;
	Calendar DT_DOC_C405 = new GregorianCalendar();
	int CRO_C405, CRZ_C405, NUM_COO_FIN_C405;
	float GT_FIN_C405, VL_BRT_C405;
	C400 c400;

	C410 c410 = new C410();

	ArrayList<C420> listC420 = new ArrayList<>();
	ArrayList<C460> listC460 = new ArrayList<>();
	ArrayList<C490> listC490 = new ArrayList<>();

	public String getREG_C405() {
		return REG_C405;
	}

	public void setREG_C405(String rEG_C405) {
		REG_C405 = rEG_C405;
	}

	public Calendar getDT_DOC_C405() {
		return DT_DOC_C405;
	}

	public void setDT_DOC_C405(Calendar dT_DOC_C405) {
		DT_DOC_C405 = dT_DOC_C405;
	}

	public int getCRO_C405() {
		return CRO_C405;
	}

	public void setCRO_C405(int cRO_C405) {
		CRO_C405 = cRO_C405;
	}

	public int getCRZ_C405() {
		return CRZ_C405;
	}

	public void setCRZ_C405(int cRZ_C405) {
		CRZ_C405 = cRZ_C405;
	}

	public int getNUM_COO_FIN_C405() {
		return NUM_COO_FIN_C405;
	}

	public void setNUM_COO_FIN_C405(int nUM_COO_FIN_C405) {
		NUM_COO_FIN_C405 = nUM_COO_FIN_C405;
	}

	public float getGT_FIN_C405() {
		return GT_FIN_C405;
	}

	public void setGT_FIN_C405(float gT_FIN_C405) {
		GT_FIN_C405 = gT_FIN_C405;
	}

	public float getVL_BRT_C405() {
		return VL_BRT_C405;
	}

	public void setVL_BRT_C405(float vL_BRT_C405) {
		VL_BRT_C405 = vL_BRT_C405;
	}

	
	public C400 getC400() {
		return c400;
	}

	public void setC400(C400 c400) {
		this.c400 = c400;
	}

	public C410 getC410() {
		return c410;
	}

	public void setC410(C410 c410) {
		this.c410 = c410;
	}

	public ArrayList<C420> getListC420() {
		return listC420;
	}

	public void setListC420(ArrayList<C420> listC420) {
		this.listC420 = listC420;
	}

	public ArrayList<C460> getListC460() {
		return listC460;
	}

	public void setListC460(ArrayList<C460> listC460) {
		this.listC460 = listC460;
	}

	public ArrayList<C490> getListC490() {
		return listC490;
	}

	public void setListC490(ArrayList<C490> listC490) {
		this.listC490 = listC490;
	}

	public C405() {
	}

	public C405(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C405(strs1.get(0));
		if (strs1.get(1).length() == 8) {
			ano = Integer.parseInt(strs1.get(1).substring(4, 8));
			mes = Integer.parseInt(strs1.get(1).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(1).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_C405(calendar);
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCRO_C405(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCRZ_C405(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNUM_COO_FIN_C405(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setGT_FIN_C405(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_BRT_C405(Float.parseFloat(strs1.get(6).replace(",", ".")));
	}

}
