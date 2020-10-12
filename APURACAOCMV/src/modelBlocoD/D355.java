package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D355 {
	String REG_D355;
	Calendar DT_DOC_D355 = new GregorianCalendar();
	int CRO_D355, CRZ_D355, NUM_COO_FIN_D355;
	float GT_FIN_D355, VL_BRT_D355;
	D350 d350;

	D360 d360;
	ArrayList<D365> listD365 = new ArrayList<>();
	ArrayList<D390> listD390 = new ArrayList<>();

	public String getREG_D355() {
		return REG_D355;
	}

	public void setREG_D355(String rEG_D355) {
		REG_D355 = rEG_D355;
	}

	public Calendar getDT_DOC_D355() {
		return DT_DOC_D355;
	}

	public void setDT_DOC_D355(Calendar dT_DOC_D355) {
		DT_DOC_D355 = dT_DOC_D355;
	}

	public int getCRO_D355() {
		return CRO_D355;
	}

	public void setCRO_D355(int cRO_D355) {
		CRO_D355 = cRO_D355;
	}

	public int getCRZ_D355() {
		return CRZ_D355;
	}

	public void setCRZ_D355(int cRZ_D355) {
		CRZ_D355 = cRZ_D355;
	}

	public int getNUM_COO_FIN_D355() {
		return NUM_COO_FIN_D355;
	}

	public void setNUM_COO_FIN_D355(int nUM_COO_FIN_D355) {
		NUM_COO_FIN_D355 = nUM_COO_FIN_D355;
	}

	public float getGT_FIN_D355() {
		return GT_FIN_D355;
	}

	public void setGT_FIN_D355(float gT_FIN_D355) {
		GT_FIN_D355 = gT_FIN_D355;
	}

	public float getVL_BRT_D355() {
		return VL_BRT_D355;
	}

	public void setVL_BRT_D355(float vL_BRT_D355) {
		VL_BRT_D355 = vL_BRT_D355;
	}
	
	

	public D350 getD350() {
		return d350;
	}

	public void setD350(D350 d350) {
		this.d350 = d350;
	}

	public D360 getD360() {
		return d360;
	}

	public void setD360(D360 d360) {
		this.d360 = d360;
	}

	public ArrayList<D365> getListD365() {
		return listD365;
	}

	public void setListD365(ArrayList<D365> listD365) {
		this.listD365 = listD365;
	}

	public ArrayList<D390> getListD390() {
		return listD390;
	}

	public void setListD390(ArrayList<D390> listD390) {
		this.listD390 = listD390;
	}

	public D355() {
	}

	public D355(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D355(strs1.get(0));
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
		this.setDT_DOC_D355(calendar);
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCRO_D355(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCRZ_D355(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNUM_COO_FIN_D355(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setGT_FIN_D355(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_BRT_D355(Float.parseFloat(strs1.get(6).replace(",", ".")));
	}

}
