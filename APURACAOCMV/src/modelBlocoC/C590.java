package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C590 {

	String REG_C590;
	int CST_ICMS_C590, CFOP_C590;
	float ALIQ_ICMS_C590, VL_OPR_C590, VL_BC_ICMS_C590, VL_ICMS_C590, VL_BC_ICMS_ST_C590, VL_ICMS_ST_C590,
			VL_RED_BC_C590;
	String COD_OBS_C590;
	
	C500 c500;

	public String getREG_C590() {
		return REG_C590;
	}

	public void setREG_C590(String rEG_C590) {
		REG_C590 = rEG_C590;
	}

	public int getCST_ICMS_C590() {
		return CST_ICMS_C590;
	}

	public void setCST_ICMS_C590(int cST_ICMS_C590) {
		CST_ICMS_C590 = cST_ICMS_C590;
	}

	public int getCFOP_C590() {
		return CFOP_C590;
	}

	public void setCFOP_C590(int cFOP_C590) {
		CFOP_C590 = cFOP_C590;
	}

	public float getALIQ_ICMS_C590() {
		return ALIQ_ICMS_C590;
	}

	public void setALIQ_ICMS_C590(float aLIQ_ICMS_C590) {
		ALIQ_ICMS_C590 = aLIQ_ICMS_C590;
	}

	public float getVL_OPR_C590() {
		return VL_OPR_C590;
	}

	public void setVL_OPR_C590(float vL_OPR_C590) {
		VL_OPR_C590 = vL_OPR_C590;
	}

	public float getVL_BC_ICMS_C590() {
		return VL_BC_ICMS_C590;
	}

	public void setVL_BC_ICMS_C590(float vL_BC_ICMS_C590) {
		VL_BC_ICMS_C590 = vL_BC_ICMS_C590;
	}

	public float getVL_ICMS_C590() {
		return VL_ICMS_C590;
	}

	public void setVL_ICMS_C590(float vL_ICMS_C590) {
		VL_ICMS_C590 = vL_ICMS_C590;
	}

	public float getVL_BC_ICMS_ST_C590() {
		return VL_BC_ICMS_ST_C590;
	}

	public void setVL_BC_ICMS_ST_C590(float vL_BC_ICMS_ST_C590) {
		VL_BC_ICMS_ST_C590 = vL_BC_ICMS_ST_C590;
	}

	public float getVL_ICMS_ST_C590() {
		return VL_ICMS_ST_C590;
	}

	public void setVL_ICMS_ST_C590(float vL_ICMS_ST_C590) {
		VL_ICMS_ST_C590 = vL_ICMS_ST_C590;
	}

	public float getVL_RED_BC_C590() {
		return VL_RED_BC_C590;
	}

	public void setVL_RED_BC_C590(float vL_RED_BC_C590) {
		VL_RED_BC_C590 = vL_RED_BC_C590;
	}

	public String getCOD_OBS_C590() {
		return COD_OBS_C590;
	}

	public void setCOD_OBS_C590(String cOD_OBS_C590) {
		COD_OBS_C590 = cOD_OBS_C590;
	}
	
	

	public C500 getC500() {
		return c500;
	}

	public void setC500(C500 c500) {
		this.c500 = c500;
	}

	public C590(){}
	public C590(List<String> strs1) {
	this.setREG_C590(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCST_ICMS_C590(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setCFOP_C590(Integer.parseInt(strs1.get(2)));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setALIQ_ICMS_C590(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_OPR_C590(Float.parseFloat(strs1.get(4).replace(",",".")));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_BC_ICMS_C590(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_ICMS_C590(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setVL_BC_ICMS_ST_C590(Float.parseFloat(strs1.get(7).replace(",",".")));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setVL_ICMS_ST_C590(Float.parseFloat(strs1.get(8).replace(",",".")));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setVL_RED_BC_C590(Float.parseFloat(strs1.get(9).replace(",",".")));
	this.setCOD_OBS_C590(strs1.get(10));
	}

}
