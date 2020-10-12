package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C390 {

	String REG_C390;
	int CST_ICMS_C390, CFOP_C390;

	float ALIQ_ICMS_C390, VL_OPR_C390, VL_BC_ICMS_C390, VL_ICMS_C390, VL_RED_BC_C390;

	String COD_OBS_C390;
	
	C350 c350;

	public String getREG_C390() {
		return REG_C390;
	}

	public void setREG_C390(String rEG_C390) {
		REG_C390 = rEG_C390;
	}

	public int getCST_ICMS_C390() {
		return CST_ICMS_C390;
	}

	public void setCST_ICMS_C390(int cST_ICMS_C390) {
		CST_ICMS_C390 = cST_ICMS_C390;
	}

	public int getCFOP_C390() {
		return CFOP_C390;
	}

	public void setCFOP_C390(int cFOP_C390) {
		CFOP_C390 = cFOP_C390;
	}

	public float getALIQ_ICMS_C390() {
		return ALIQ_ICMS_C390;
	}

	public void setALIQ_ICMS_C390(float aLIQ_ICMS_C390) {
		ALIQ_ICMS_C390 = aLIQ_ICMS_C390;
	}

	public float getVL_OPR_C390() {
		return VL_OPR_C390;
	}

	public void setVL_OPR_C390(float vL_OPR_C390) {
		VL_OPR_C390 = vL_OPR_C390;
	}

	public float getVL_BC_ICMS_C390() {
		return VL_BC_ICMS_C390;
	}

	public void setVL_BC_ICMS_C390(float vL_BC_ICMS_C390) {
		VL_BC_ICMS_C390 = vL_BC_ICMS_C390;
	}

	public float getVL_ICMS_C390() {
		return VL_ICMS_C390;
	}

	public void setVL_ICMS_C390(float vL_ICMS_C390) {
		VL_ICMS_C390 = vL_ICMS_C390;
	}

	public float getVL_RED_BC_C390() {
		return VL_RED_BC_C390;
	}

	public void setVL_RED_BC_C390(float vL_RED_BC_C390) {
		VL_RED_BC_C390 = vL_RED_BC_C390;
	}

	public String getCOD_OBS_C390() {
		return COD_OBS_C390;
	}

	public void setCOD_OBS_C390(String cOD_OBS_C390) {
		COD_OBS_C390 = cOD_OBS_C390;
	}
	
	

	public C350 getC350() {
		return c350;
	}

	public void setC350(C350 c350) {
		this.c350 = c350;
	}

	public C390() {
	}

	public C390(List<String> strs1) {
		this.setREG_C390(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_C390(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_C390(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_C390(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_C390(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_C390(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_C390(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_RED_BC_C390(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setCOD_OBS_C390(strs1.get(8));
	}

}
