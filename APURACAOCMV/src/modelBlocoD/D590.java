package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D590 {
	String REG_D590;
	int CST_ICMS_D590, CFOP_D590;
	float ALIQ_ICMS_D590, VL_OPR_D590, VL_BC_ICMS_D590, VL_ICMS_D590, VL_BC_ICMS_UF_D590, VL_ICMS_UF_D590,
			VL_RED_BC_D590;
	String COD_OBS_D590;
	
	D500 d500;

	public String getREG_D590() {
		return REG_D590;
	}

	public void setREG_D590(String rEG_D590) {
		REG_D590 = rEG_D590;
	}

	public int getCST_ICMS_D590() {
		return CST_ICMS_D590;
	}

	public void setCST_ICMS_D590(int cST_ICMS_D590) {
		CST_ICMS_D590 = cST_ICMS_D590;
	}

	public int getCFOP_D590() {
		return CFOP_D590;
	}

	public void setCFOP_D590(int cFOP_D590) {
		CFOP_D590 = cFOP_D590;
	}

	public float getALIQ_ICMS_D590() {
		return ALIQ_ICMS_D590;
	}

	public void setALIQ_ICMS_D590(float aLIQ_ICMS_D590) {
		ALIQ_ICMS_D590 = aLIQ_ICMS_D590;
	}

	public float getVL_OPR_D590() {
		return VL_OPR_D590;
	}

	public void setVL_OPR_D590(float vL_OPR_D590) {
		VL_OPR_D590 = vL_OPR_D590;
	}

	public float getVL_BC_ICMS_D590() {
		return VL_BC_ICMS_D590;
	}

	public void setVL_BC_ICMS_D590(float vL_BC_ICMS_D590) {
		VL_BC_ICMS_D590 = vL_BC_ICMS_D590;
	}

	public float getVL_ICMS_D590() {
		return VL_ICMS_D590;
	}

	public void setVL_ICMS_D590(float vL_ICMS_D590) {
		VL_ICMS_D590 = vL_ICMS_D590;
	}

	public float getVL_BC_ICMS_UF_D590() {
		return VL_BC_ICMS_UF_D590;
	}

	public void setVL_BC_ICMS_UF_D590(float vL_BC_ICMS_UF_D590) {
		VL_BC_ICMS_UF_D590 = vL_BC_ICMS_UF_D590;
	}

	public float getVL_ICMS_UF_D590() {
		return VL_ICMS_UF_D590;
	}

	public void setVL_ICMS_UF_D590(float vL_ICMS_UF_D590) {
		VL_ICMS_UF_D590 = vL_ICMS_UF_D590;
	}

	public float getVL_RED_BC_D590() {
		return VL_RED_BC_D590;
	}

	public void setVL_RED_BC_D590(float vL_RED_BC_D590) {
		VL_RED_BC_D590 = vL_RED_BC_D590;
	}

	public String getCOD_OBS_D590() {
		return COD_OBS_D590;
	}

	public void setCOD_OBS_D590(String cOD_OBS_D590) {
		COD_OBS_D590 = cOD_OBS_D590;
	}

	
	public D500 getD500() {
		return d500;
	}

	public void setD500(D500 d500) {
		this.d500 = d500;
	}

	public D590() {
	}

	public D590(ArrayList<String> strs1) {
		this.setREG_D590(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_D590(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_D590(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_D590(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_D590(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_D590(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_D590(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_BC_ICMS_UF_D590(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_ICMS_UF_D590(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_RED_BC_D590(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setCOD_OBS_D590(strs1.get(10));
	}
}
