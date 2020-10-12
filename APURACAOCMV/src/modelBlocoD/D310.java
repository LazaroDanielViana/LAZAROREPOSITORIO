package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D310 {
	String REG_D310;
	int COD_MUN_ORIG_D310;
	float VL_SERV_D310, VL_BC_ICMS_D310, VL_ICMS_D310;
	
	D300 d300;

	public String getREG_D310() {
		return REG_D310;
	}

	public void setREG_D310(String rEG_D310) {
		REG_D310 = rEG_D310;
	}

	public int getCOD_MUN_ORIG_D310() {
		return COD_MUN_ORIG_D310;
	}

	public void setCOD_MUN_ORIG_D310(int cOD_MUN_ORIG_D310) {
		COD_MUN_ORIG_D310 = cOD_MUN_ORIG_D310;
	}

	public float getVL_SERV_D310() {
		return VL_SERV_D310;
	}

	public void setVL_SERV_D310(float vL_SERV_D310) {
		VL_SERV_D310 = vL_SERV_D310;
	}

	public float getVL_BC_ICMS_D310() {
		return VL_BC_ICMS_D310;
	}

	public void setVL_BC_ICMS_D310(float vL_BC_ICMS_D310) {
		VL_BC_ICMS_D310 = vL_BC_ICMS_D310;
	}

	public float getVL_ICMS_D310() {
		return VL_ICMS_D310;
	}

	public void setVL_ICMS_D310(float vL_ICMS_D310) {
		VL_ICMS_D310 = vL_ICMS_D310;
	}
	
	

	public D300 getD300() {
		return d300;
	}

	public void setD300(D300 d300) {
		this.d300 = d300;
	}

	public D310(){}
	public D310(ArrayList<String> strs1) {
	this.setREG_D310(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCOD_MUN_ORIG_D310(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_SERV_D310(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_BC_ICMS_D310(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_ICMS_D310(Float.parseFloat(strs1.get(4).replace(",",".")));
	}


}
