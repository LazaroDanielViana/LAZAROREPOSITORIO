package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C490 {

	String REG_C490;
	int CST_ICMS_C490, CFOP_C490;
	float ALIQ_ICMS_C490, VL_OPR_C490, VL_BC_ICMS_C490, VL_ICMS_C490;

	String COD_OBS_C490;
	
	C405 c405;

	public String getREG_C490() {
		return REG_C490;
	}

	public void setREG_C490(String rEG_C490) {
		REG_C490 = rEG_C490;
	}

	public int getCST_ICMS_C490() {
		return CST_ICMS_C490;
	}

	public void setCST_ICMS_C490(int cST_ICMS_C490) {
		CST_ICMS_C490 = cST_ICMS_C490;
	}

	public int getCFOP_C490() {
		return CFOP_C490;
	}

	public void setCFOP_C490(int cFOP_C490) {
		CFOP_C490 = cFOP_C490;
	}

	public float getALIQ_ICMS_C490() {
		return ALIQ_ICMS_C490;
	}

	public void setALIQ_ICMS_C490(float aLIQ_ICMS_C490) {
		ALIQ_ICMS_C490 = aLIQ_ICMS_C490;
	}

	public float getVL_OPR_C490() {
		return VL_OPR_C490;
	}

	public void setVL_OPR_C490(float vL_OPR_C490) {
		VL_OPR_C490 = vL_OPR_C490;
	}

	public float getVL_BC_ICMS_C490() {
		return VL_BC_ICMS_C490;
	}

	public void setVL_BC_ICMS_C490(float vL_BC_ICMS_C490) {
		VL_BC_ICMS_C490 = vL_BC_ICMS_C490;
	}

	public float getVL_ICMS_C490() {
		return VL_ICMS_C490;
	}

	public void setVL_ICMS_C490(float vL_ICMS_C490) {
		VL_ICMS_C490 = vL_ICMS_C490;
	}

	public String getCOD_OBS_C490() {
		return COD_OBS_C490;
	}

	public void setCOD_OBS_C490(String cOD_OBS_C490) {
		COD_OBS_C490 = cOD_OBS_C490;
	}
	
	

	public C405 getC405() {
		return c405;
	}

	public void setC405(C405 c405) {
		this.c405 = c405;
	}

	public C490() {
	}

	public C490(List<String> strs1) {
		this.setREG_C490(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_C490(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_C490(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_C490(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_C490(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_C490(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_C490(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setCOD_OBS_C490(strs1.get(7));
	}

}
