package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C320 {

	String REG_C320;
	int CST_ICMS_C320, CFOP_C320;

	float ALIQ_ICMS_C320, VL_OPR_C320, VL_BC_ICMS_C320, VL_ICMS_C320, VL_RED_BC_C320;
	String COD_OBS_C320;
	C300 c300;

	public ArrayList<C321> listC321 = new ArrayList<>();

	public String getREG_C320() {
		return REG_C320;
	}

	public void setREG_C320(String rEG_C320) {
		REG_C320 = rEG_C320;
	}

	public int getCST_ICMS_C320() {
		return CST_ICMS_C320;
	}

	public void setCST_ICMS_C320(int cST_ICMS_C320) {
		CST_ICMS_C320 = cST_ICMS_C320;
	}

	public int getCFOP_C320() {
		return CFOP_C320;
	}

	public void setCFOP_C320(int cFOP_C320) {
		CFOP_C320 = cFOP_C320;
	}

	public float getALIQ_ICMS_C320() {
		return ALIQ_ICMS_C320;
	}

	public void setALIQ_ICMS_C320(float aLIQ_ICMS_C320) {
		ALIQ_ICMS_C320 = aLIQ_ICMS_C320;
	}

	public float getVL_OPR_C320() {
		return VL_OPR_C320;
	}

	public void setVL_OPR_C320(float vL_OPR_C320) {
		VL_OPR_C320 = vL_OPR_C320;
	}

	public float getVL_BC_ICMS_C320() {
		return VL_BC_ICMS_C320;
	}

	public void setVL_BC_ICMS_C320(float vL_BC_ICMS_C320) {
		VL_BC_ICMS_C320 = vL_BC_ICMS_C320;
	}

	public float getVL_ICMS_C320() {
		return VL_ICMS_C320;
	}

	public void setVL_ICMS_C320(float vL_ICMS_C320) {
		VL_ICMS_C320 = vL_ICMS_C320;
	}

	public float getVL_RED_BC_C320() {
		return VL_RED_BC_C320;
	}

	public void setVL_RED_BC_C320(float vL_RED_BC_C320) {
		VL_RED_BC_C320 = vL_RED_BC_C320;
	}

	public String getCOD_OBS_C320() {
		return COD_OBS_C320;
	}

	public void setCOD_OBS_C320(String cOD_OBS_C320) {
		COD_OBS_C320 = cOD_OBS_C320;
	}

	public ArrayList<C321> getListC321() {
		return listC321;
	}

	public void setListC321(ArrayList<C321> listC321) {
		this.listC321 = listC321;
	}

	public C300 getC300() {
		return c300;
	}

	public void setC300(C300 c300) {
		this.c300 = c300;
	}

	public C320() {
	}

	public C320(List<String> strs1) {
		this.setREG_C320(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCST_ICMS_C320(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCFOP_C320(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setALIQ_ICMS_C320(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_OPR_C320(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_BC_ICMS_C320(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_C320(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_RED_BC_C320(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setCOD_OBS_C320(strs1.get(8));
	}

}
