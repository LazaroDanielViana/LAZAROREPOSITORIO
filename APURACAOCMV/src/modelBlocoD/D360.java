package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D360 {
	String REG_D360;
	float VL_PIS_D360, VL_COFINS_D360;
	
	D355 d355;

	public String getREG_D360() {
		return REG_D360;
	}

	public void setREG_D360(String rEG_D360) {
		REG_D360 = rEG_D360;
	}

	public float getVL_PIS_D360() {
		return VL_PIS_D360;
	}

	public void setVL_PIS_D360(float vL_PIS_D360) {
		VL_PIS_D360 = vL_PIS_D360;
	}

	public float getVL_COFINS_D360() {
		return VL_COFINS_D360;
	}

	public void setVL_COFINS_D360(float vL_COFINS_D360) {
		VL_COFINS_D360 = vL_COFINS_D360;
	}
	
	

	public D355 getD355() {
		return d355;
	}

	public void setD355(D355 d355) {
		this.d355 = d355;
	}

	public D360(){}
	public D360(ArrayList<String> strs1) {
	this.setREG_D360(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setVL_PIS_D360(Float.parseFloat(strs1.get(1).replace(",",".")));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_COFINS_D360(Float.parseFloat(strs1.get(2).replace(",",".")));
	}


}
