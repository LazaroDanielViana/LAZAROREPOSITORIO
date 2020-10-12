package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D370 {
	String REG_D370;
	int COD_MUN_ORIG_D370;
	float VL_SERV_D370;
	int QTD_BILH_D370;
	float VL_BC_ICMS_D370, VL_ICMS_D370;
	D365 d365;

	public String getREG_D370() {
		return REG_D370;
	}

	public void setREG_D370(String rEG_D370) {
		REG_D370 = rEG_D370;
	}

	public int getCOD_MUN_ORIG_D370() {
		return COD_MUN_ORIG_D370;
	}

	public void setCOD_MUN_ORIG_D370(int cOD_MUN_ORIG_D370) {
		COD_MUN_ORIG_D370 = cOD_MUN_ORIG_D370;
	}

	public float getVL_SERV_D370() {
		return VL_SERV_D370;
	}

	public void setVL_SERV_D370(float vL_SERV_D370) {
		VL_SERV_D370 = vL_SERV_D370;
	}

	public int getQTD_BILH_D370() {
		return QTD_BILH_D370;
	}

	public void setQTD_BILH_D370(int qTD_BILH_D370) {
		QTD_BILH_D370 = qTD_BILH_D370;
	}

	public float getVL_BC_ICMS_D370() {
		return VL_BC_ICMS_D370;
	}

	public void setVL_BC_ICMS_D370(float vL_BC_ICMS_D370) {
		VL_BC_ICMS_D370 = vL_BC_ICMS_D370;
	}

	public float getVL_ICMS_D370() {
		return VL_ICMS_D370;
	}

	public void setVL_ICMS_D370(float vL_ICMS_D370) {
		VL_ICMS_D370 = vL_ICMS_D370;
	}
	
	

	public D365 getD365() {
		return d365;
	}

	public void setD365(D365 d365) {
		this.d365 = d365;
	}

	public D370() {
	}

	public D370(ArrayList<String> strs1) {
		this.setREG_D370(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCOD_MUN_ORIG_D370(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setVL_SERV_D370(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setQTD_BILH_D370(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_BC_ICMS_D370(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_ICMS_D370(Float.parseFloat(strs1.get(5).replace(",", ".")));
	}

}
