package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C850 {
	String REG_C850;
	int CST_ICMS_C850, CFOP_C850;
	float ALIQ_ICMS_C850, VL_OPR_C850, VL_BC_ICMS_C850, VL_ICMS_C850;
	String COD_OBS_C850;
	
	C800 c800;

	public String getREG_C850() {
		return REG_C850;
	}

	public void setREG_C850(String rEG_C850) {
		REG_C850 = rEG_C850;
	}

	public int getCST_ICMS_C850() {
		return CST_ICMS_C850;
	}

	public void setCST_ICMS_C850(int cST_ICMS_C850) {
		CST_ICMS_C850 = cST_ICMS_C850;
	}

	public int getCFOP_C850() {
		return CFOP_C850;
	}

	public void setCFOP_C850(int cFOP_C850) {
		CFOP_C850 = cFOP_C850;
	}

	public float getALIQ_ICMS_C850() {
		return ALIQ_ICMS_C850;
	}

	public void setALIQ_ICMS_C850(float aLIQ_ICMS_C850) {
		ALIQ_ICMS_C850 = aLIQ_ICMS_C850;
	}

	public float getVL_OPR_C850() {
		return VL_OPR_C850;
	}

	public void setVL_OPR_C850(float vL_OPR_C850) {
		VL_OPR_C850 = vL_OPR_C850;
	}

	public float getVL_BC_ICMS_C850() {
		return VL_BC_ICMS_C850;
	}

	public void setVL_BC_ICMS_C850(float vL_BC_ICMS_C850) {
		VL_BC_ICMS_C850 = vL_BC_ICMS_C850;
	}

	public float getVL_ICMS_C850() {
		return VL_ICMS_C850;
	}

	public void setVL_ICMS_C850(float vL_ICMS_C850) {
		VL_ICMS_C850 = vL_ICMS_C850;
	}

	public String getCOD_OBS_C850() {
		return COD_OBS_C850;
	}

	public void setCOD_OBS_C850(String cOD_OBS_C850) {
		COD_OBS_C850 = cOD_OBS_C850;
	}
	
	

	public C800 getC800() {
		return c800;
	}

	public void setC800(C800 c800) {
		this.c800 = c800;
	}

	public C850() {
	}

	public C850(List<String> strs1) {
		this.setREG_C850(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_C850(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_C850(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_C850(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_C850(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_C850(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_C850(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setCOD_OBS_C850(strs1.get(7));
	}

}
