package modelBlocoH;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class H020 {
	String REG_H020;
	int CST_ICMS_H020;
	float BC_ICMS_H020, VL_ICMS_H020;
	
	H010 h010;

	public String getREG_H020() {
		return REG_H020;
	}

	public void setREG_H020(String rEG_H020) {
		REG_H020 = rEG_H020;
	}

	public int getCST_ICMS_H020() {
		return CST_ICMS_H020;
	}

	public void setCST_ICMS_H020(int cST_ICMS_H020) {
		CST_ICMS_H020 = cST_ICMS_H020;
	}

	public float getBC_ICMS_H020() {
		return BC_ICMS_H020;
	}

	public void setBC_ICMS_H020(float bC_ICMS_H020) {
		BC_ICMS_H020 = bC_ICMS_H020;
	}

	public float getVL_ICMS_H020() {
		return VL_ICMS_H020;
	}

	public void setVL_ICMS_H020(float vL_ICMS_H020) {
		VL_ICMS_H020 = vL_ICMS_H020;
	}
	
	
	

	public H010 getH010() {
		return h010;
	}

	public void setH010(H010 h010) {
		this.h010 = h010;
	}

	public H020(){}
	public H020(List<String> strs1) {
	this.setREG_H020(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCST_ICMS_H020(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setBC_ICMS_H020(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_ICMS_H020(Float.parseFloat(strs1.get(3).replace(",",".")));
	}

}
