package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D420 {
	String REG_D420;
	int COD_MUN_ORIG_D420;
	float VL_SERV_D420, VL_BC_ICMS_D420, VL_ICMS_D420;
	
	D400 d400;

	public String getREG_D420() {
		return REG_D420;
	}

	public void setREG_D420(String rEG_D420) {
		REG_D420 = rEG_D420;
	}

	public int getCOD_MUN_ORIG_D420() {
		return COD_MUN_ORIG_D420;
	}

	public void setCOD_MUN_ORIG_D420(int cOD_MUN_ORIG_D420) {
		COD_MUN_ORIG_D420 = cOD_MUN_ORIG_D420;
	}

	public float getVL_SERV_D420() {
		return VL_SERV_D420;
	}

	public void setVL_SERV_D420(float vL_SERV_D420) {
		VL_SERV_D420 = vL_SERV_D420;
	}

	public float getVL_BC_ICMS_D420() {
		return VL_BC_ICMS_D420;
	}

	public void setVL_BC_ICMS_D420(float vL_BC_ICMS_D420) {
		VL_BC_ICMS_D420 = vL_BC_ICMS_D420;
	}

	public float getVL_ICMS_D420() {
		return VL_ICMS_D420;
	}

	public void setVL_ICMS_D420(float vL_ICMS_D420) {
		VL_ICMS_D420 = vL_ICMS_D420;
	}	
	

	public D400 getD400() {
		return d400;
	}

	public void setD400(D400 d400) {
		this.d400 = d400;
	}

	public D420() {
	}

	public D420(ArrayList<String> strs1) {
		this.setREG_D420(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCOD_MUN_ORIG_D420(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setVL_SERV_D420(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setVL_BC_ICMS_D420(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_ICMS_D420(Float.parseFloat(strs1.get(4).replace(",", ".")));
	}

}
