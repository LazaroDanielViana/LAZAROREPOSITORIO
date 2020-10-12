package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C690 {

	String REG_C690;
	int CST_ICMS_C690, CFOP_C690;
	float ALIQ_ICMS_C690, VL_OPR_C690, VL_BC_ICMS_C690, VL_ICMS_C690, VL_RED_BC_C690, VL_BC_ICMS_ST_C690,
			VL_ICMS_ST_C690;
	String COD_OBS_C690;
	
	C600 c600;

	public String getREG_C690() {
		return REG_C690;
	}

	public void setREG_C690(String rEG_C690) {
		REG_C690 = rEG_C690;
	}

	public int getCST_ICMS_C690() {
		return CST_ICMS_C690;
	}

	public void setCST_ICMS_C690(int cST_ICMS_C690) {
		CST_ICMS_C690 = cST_ICMS_C690;
	}

	public int getCFOP_C690() {
		return CFOP_C690;
	}

	public void setCFOP_C690(int cFOP_C690) {
		CFOP_C690 = cFOP_C690;
	}

	public float getALIQ_ICMS_C690() {
		return ALIQ_ICMS_C690;
	}

	public void setALIQ_ICMS_C690(float aLIQ_ICMS_C690) {
		ALIQ_ICMS_C690 = aLIQ_ICMS_C690;
	}

	public float getVL_OPR_C690() {
		return VL_OPR_C690;
	}

	public void setVL_OPR_C690(float vL_OPR_C690) {
		VL_OPR_C690 = vL_OPR_C690;
	}

	public float getVL_BC_ICMS_C690() {
		return VL_BC_ICMS_C690;
	}

	public void setVL_BC_ICMS_C690(float vL_BC_ICMS_C690) {
		VL_BC_ICMS_C690 = vL_BC_ICMS_C690;
	}

	public float getVL_ICMS_C690() {
		return VL_ICMS_C690;
	}

	public void setVL_ICMS_C690(float vL_ICMS_C690) {
		VL_ICMS_C690 = vL_ICMS_C690;
	}

	public float getVL_RED_BC_C690() {
		return VL_RED_BC_C690;
	}

	public void setVL_RED_BC_C690(float vL_RED_BC_C690) {
		VL_RED_BC_C690 = vL_RED_BC_C690;
	}

	public float getVL_BC_ICMS_ST_C690() {
		return VL_BC_ICMS_ST_C690;
	}

	public void setVL_BC_ICMS_ST_C690(float vL_BC_ICMS_ST_C690) {
		VL_BC_ICMS_ST_C690 = vL_BC_ICMS_ST_C690;
	}

	public float getVL_ICMS_ST_C690() {
		return VL_ICMS_ST_C690;
	}

	public void setVL_ICMS_ST_C690(float vL_ICMS_ST_C690) {
		VL_ICMS_ST_C690 = vL_ICMS_ST_C690;
	}

	public String getCOD_OBS_C690() {
		return COD_OBS_C690;
	}

	public void setCOD_OBS_C690(String cOD_OBS_C690) {
		COD_OBS_C690 = cOD_OBS_C690;
	}
	
	

	public C600 getC600() {
		return c600;
	}

	public void setC600(C600 c600) {
		this.c600 = c600;
	}

	public C690(){}
	public C690(List<String> strs1) {
	this.setREG_C690(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCST_ICMS_C690(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setCFOP_C690(Integer.parseInt(strs1.get(2)));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setALIQ_ICMS_C690(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_OPR_C690(Float.parseFloat(strs1.get(4).replace(",",".")));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_BC_ICMS_C690(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_ICMS_C690(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setVL_RED_BC_C690(Float.parseFloat(strs1.get(7).replace(",",".")));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setVL_BC_ICMS_ST_C690(Float.parseFloat(strs1.get(8).replace(",",".")));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setVL_ICMS_ST_C690(Float.parseFloat(strs1.get(9).replace(",",".")));
	this.setCOD_OBS_C690(strs1.get(10));
	}


}
