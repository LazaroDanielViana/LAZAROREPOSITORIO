package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D190 {
	String REG_D190;
	int CST_ICMS_D190, CFOP_D190;
	float ALIQ_ICMS_D190, VL_OPR_D190, VL_BC_ICMS_D190, VL_ICMS_D190, VL_RED_BC_D190;
	String COD_OBS_D190;
	
	D100 d100;

	public String getREG_D190() {
		return REG_D190;
	}

	public void setREG_D190(String rEG_D190) {
		REG_D190 = rEG_D190;
	}

	public int getCST_ICMS_D190() {
		return CST_ICMS_D190;
	}

	public void setCST_ICMS_D190(int cST_ICMS_D190) {
		CST_ICMS_D190 = cST_ICMS_D190;
	}

	public int getCFOP_D190() {
		return CFOP_D190;
	}

	public void setCFOP_D190(int cFOP_D190) {
		CFOP_D190 = cFOP_D190;
	}

	public float getALIQ_ICMS_D190() {
		return ALIQ_ICMS_D190;
	}

	public void setALIQ_ICMS_D190(float aLIQ_ICMS_D190) {
		ALIQ_ICMS_D190 = aLIQ_ICMS_D190;
	}

	public float getVL_OPR_D190() {
		return VL_OPR_D190;
	}

	public void setVL_OPR_D190(float vL_OPR_D190) {
		VL_OPR_D190 = vL_OPR_D190;
	}

	public float getVL_BC_ICMS_D190() {
		return VL_BC_ICMS_D190;
	}

	public void setVL_BC_ICMS_D190(float vL_BC_ICMS_D190) {
		VL_BC_ICMS_D190 = vL_BC_ICMS_D190;
	}

	public float getVL_ICMS_D190() {
		return VL_ICMS_D190;
	}

	public void setVL_ICMS_D190(float vL_ICMS_D190) {
		VL_ICMS_D190 = vL_ICMS_D190;
	}

	public float getVL_RED_BC_D190() {
		return VL_RED_BC_D190;
	}

	public void setVL_RED_BC_D190(float vL_RED_BC_D190) {
		VL_RED_BC_D190 = vL_RED_BC_D190;
	}

	public String getCOD_OBS_D190() {
		return COD_OBS_D190;
	}

	public void setCOD_OBS_D190(String cOD_OBS_D190) {
		COD_OBS_D190 = cOD_OBS_D190;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D190() {
	}

	public D190(ArrayList<String> strs1) {
		this.setREG_D190(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_D190(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_D190(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_D190(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_D190(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_D190(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_D190(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_RED_BC_D190(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setCOD_OBS_D190(strs1.get(8));
	}

}
