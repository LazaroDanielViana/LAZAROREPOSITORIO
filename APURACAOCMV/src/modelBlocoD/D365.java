package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D365 {

	String REG_D365, COD_TOT_PAR_D365;
	float VLR_ACUM_TOT_D365;
	int NR_TOT_D365;
	String DESCR_NR_TOT_D365;
	D355 d355;

	ArrayList<D370> listD370 = new ArrayList<>();

	public String getREG_D365() {
		return REG_D365;
	}

	public void setREG_D365(String rEG_D365) {
		REG_D365 = rEG_D365;
	}

	public String getCOD_TOT_PAR_D365() {
		return COD_TOT_PAR_D365;
	}

	public void setCOD_TOT_PAR_D365(String cOD_TOT_PAR_D365) {
		COD_TOT_PAR_D365 = cOD_TOT_PAR_D365;
	}

	public float getVLR_ACUM_TOT_D365() {
		return VLR_ACUM_TOT_D365;
	}

	public void setVLR_ACUM_TOT_D365(float vLR_ACUM_TOT_D365) {
		VLR_ACUM_TOT_D365 = vLR_ACUM_TOT_D365;
	}

	public int getNR_TOT_D365() {
		return NR_TOT_D365;
	}

	public void setNR_TOT_D365(int nR_TOT_D365) {
		NR_TOT_D365 = nR_TOT_D365;
	}

	public String getDESCR_NR_TOT_D365() {
		return DESCR_NR_TOT_D365;
	}

	public void setDESCR_NR_TOT_D365(String dESCR_NR_TOT_D365) {
		DESCR_NR_TOT_D365 = dESCR_NR_TOT_D365;
	}

	public ArrayList<D370> getListD370() {
		return listD370;
	}

	public void setListD370(ArrayList<D370> listD370) {
		this.listD370 = listD370;
	}
	
	

	public D355 getD355() {
		return d355;
	}

	public void setD355(D355 d355) {
		this.d355 = d355;
	}

	public D365() {
	}

	public D365(ArrayList<String> strs1) {
		this.setREG_D365(strs1.get(0));
		this.setCOD_TOT_PAR_D365(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setVLR_ACUM_TOT_D365(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNR_TOT_D365(Integer.parseInt(strs1.get(3)));
		this.setDESCR_NR_TOT_D365(strs1.get(4));
	}

}
