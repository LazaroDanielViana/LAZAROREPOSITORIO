package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D390 {

	String REG_D390;
	int CST_ICMS_D390, CFOP_D390;
	float ALIQ_ICMS_D390, VL_OPR_D390, VL_BC_ISSQN_D390, ALIQ_ISSQN_D390, VL_ISSQN_D390, VL_BC_ICMS_D390, VL_ICMS_D390;
	String COD_OBS_D390;
	
	D355 d355;

	public String getREG_D390() {
		return REG_D390;
	}

	public void setREG_D390(String rEG_D390) {
		REG_D390 = rEG_D390;
	}

	public int getCST_ICMS_D390() {
		return CST_ICMS_D390;
	}

	public void setCST_ICMS_D390(int cST_ICMS_D390) {
		CST_ICMS_D390 = cST_ICMS_D390;
	}

	public int getCFOP_D390() {
		return CFOP_D390;
	}

	public void setCFOP_D390(int cFOP_D390) {
		CFOP_D390 = cFOP_D390;
	}

	public float getALIQ_ICMS_D390() {
		return ALIQ_ICMS_D390;
	}

	public void setALIQ_ICMS_D390(float aLIQ_ICMS_D390) {
		ALIQ_ICMS_D390 = aLIQ_ICMS_D390;
	}

	public float getVL_OPR_D390() {
		return VL_OPR_D390;
	}

	public void setVL_OPR_D390(float vL_OPR_D390) {
		VL_OPR_D390 = vL_OPR_D390;
	}

	public float getVL_BC_ISSQN_D390() {
		return VL_BC_ISSQN_D390;
	}

	public void setVL_BC_ISSQN_D390(float vL_BC_ISSQN_D390) {
		VL_BC_ISSQN_D390 = vL_BC_ISSQN_D390;
	}

	public float getALIQ_ISSQN_D390() {
		return ALIQ_ISSQN_D390;
	}

	public void setALIQ_ISSQN_D390(float aLIQ_ISSQN_D390) {
		ALIQ_ISSQN_D390 = aLIQ_ISSQN_D390;
	}

	public float getVL_ISSQN_D390() {
		return VL_ISSQN_D390;
	}

	public void setVL_ISSQN_D390(float vL_ISSQN_D390) {
		VL_ISSQN_D390 = vL_ISSQN_D390;
	}

	public float getVL_BC_ICMS_D390() {
		return VL_BC_ICMS_D390;
	}

	public void setVL_BC_ICMS_D390(float vL_BC_ICMS_D390) {
		VL_BC_ICMS_D390 = vL_BC_ICMS_D390;
	}

	public float getVL_ICMS_D390() {
		return VL_ICMS_D390;
	}

	public void setVL_ICMS_D390(float vL_ICMS_D390) {
		VL_ICMS_D390 = vL_ICMS_D390;
	}

	public String getCOD_OBS_D390() {
		return COD_OBS_D390;
	}

	public void setCOD_OBS_D390(String cOD_OBS_D390) {
		COD_OBS_D390 = cOD_OBS_D390;
	}
	
	

	public D355 getD355() {
		return d355;
	}

	public void setD355(D355 d355) {
		this.d355 = d355;
	}

	public D390() {
	}

	public D390(ArrayList<String> strs1) {
		this.setREG_D390(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_D390(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_D390(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_D390(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_D390(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ISSQN_D390(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setALIQ_ISSQN_D390(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_ISSQN_D390(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_BC_ICMS_D390(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_ICMS_D390(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setCOD_OBS_D390(strs1.get(10));
	}

}
