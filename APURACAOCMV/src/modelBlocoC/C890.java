package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C890 {
	String REG_C890;
	int CST_ICMS_C890, CFOP_C890;
	float ALIQ_ICMS_C890, VL_OPR_C890, VL_BC_ICMS_C890, VL_ICMS_C890;
	String COD_OBS_C890;
	
	C860 c860;

	public String getREG_C890() {
		return REG_C890;
	}

	public void setREG_C890(String rEG_C890) {
		REG_C890 = rEG_C890;
	}

	public int getCST_ICMS_C890() {
		return CST_ICMS_C890;
	}

	public void setCST_ICMS_C890(int cST_ICMS_C890) {
		CST_ICMS_C890 = cST_ICMS_C890;
	}

	public int getCFOP_C890() {
		return CFOP_C890;
	}

	public void setCFOP_C890(int cFOP_C890) {
		CFOP_C890 = cFOP_C890;
	}

	public float getALIQ_ICMS_C890() {
		return ALIQ_ICMS_C890;
	}

	public void setALIQ_ICMS_C890(float aLIQ_ICMS_C890) {
		ALIQ_ICMS_C890 = aLIQ_ICMS_C890;
	}

	public float getVL_OPR_C890() {
		return VL_OPR_C890;
	}

	public void setVL_OPR_C890(float vL_OPR_C890) {
		VL_OPR_C890 = vL_OPR_C890;
	}

	public float getVL_BC_ICMS_C890() {
		return VL_BC_ICMS_C890;
	}

	public void setVL_BC_ICMS_C890(float vL_BC_ICMS_C890) {
		VL_BC_ICMS_C890 = vL_BC_ICMS_C890;
	}

	public float getVL_ICMS_C890() {
		return VL_ICMS_C890;
	}

	public void setVL_ICMS_C890(float vL_ICMS_C890) {
		VL_ICMS_C890 = vL_ICMS_C890;
	}

	public String getCOD_OBS_C890() {
		return COD_OBS_C890;
	}

	public void setCOD_OBS_C890(String cOD_OBS_C890) {
		COD_OBS_C890 = cOD_OBS_C890;
	}
	
	

	public C860 getC860() {
		return c860;
	}

	public void setC860(C860 c860) {
		this.c860 = c860;
	}

	public C890() {
	}

	public C890(List<String> strs1) {
		this.setREG_C890(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_C890(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_C890(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_C890(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_C890(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_C890(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_C890(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setCOD_OBS_C890(strs1.get(7));
	}

}
