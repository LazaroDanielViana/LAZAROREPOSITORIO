package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C790 {

	String REG_C790;
	int CST_ICMS_C790, CFOP_C790;
	float ALIQ_ICMS_C790, VL_OPR_C790, VL_BC_ICMS_C790, VL_ICMS_C790, VL_BC_ICMS_ST_C790, VL_ICMS_ST_C790,
			VL_RED_BC_C790;
	String COD_OBS_C790;
	C700 c700;

	ArrayList<C791> listC791 = new ArrayList<>();

	public String getREG_C790() {
		return REG_C790;
	}

	public void setREG_C790(String rEG_C790) {
		REG_C790 = rEG_C790;
	}

	public int getCST_ICMS_C790() {
		return CST_ICMS_C790;
	}

	public void setCST_ICMS_C790(int cST_ICMS_C790) {
		CST_ICMS_C790 = cST_ICMS_C790;
	}

	public int getCFOP_C790() {
		return CFOP_C790;
	}

	public void setCFOP_C790(int cFOP_C790) {
		CFOP_C790 = cFOP_C790;
	}

	public float getALIQ_ICMS_C790() {
		return ALIQ_ICMS_C790;
	}

	public void setALIQ_ICMS_C790(float aLIQ_ICMS_C790) {
		ALIQ_ICMS_C790 = aLIQ_ICMS_C790;
	}

	public float getVL_OPR_C790() {
		return VL_OPR_C790;
	}

	public void setVL_OPR_C790(float vL_OPR_C790) {
		VL_OPR_C790 = vL_OPR_C790;
	}

	public float getVL_BC_ICMS_C790() {
		return VL_BC_ICMS_C790;
	}

	public void setVL_BC_ICMS_C790(float vL_BC_ICMS_C790) {
		VL_BC_ICMS_C790 = vL_BC_ICMS_C790;
	}

	public float getVL_ICMS_C790() {
		return VL_ICMS_C790;
	}

	public void setVL_ICMS_C790(float vL_ICMS_C790) {
		VL_ICMS_C790 = vL_ICMS_C790;
	}

	public float getVL_BC_ICMS_ST_C790() {
		return VL_BC_ICMS_ST_C790;
	}

	public void setVL_BC_ICMS_ST_C790(float vL_BC_ICMS_ST_C790) {
		VL_BC_ICMS_ST_C790 = vL_BC_ICMS_ST_C790;
	}

	public float getVL_ICMS_ST_C790() {
		return VL_ICMS_ST_C790;
	}

	public void setVL_ICMS_ST_C790(float vL_ICMS_ST_C790) {
		VL_ICMS_ST_C790 = vL_ICMS_ST_C790;
	}

	public float getVL_RED_BC_C790() {
		return VL_RED_BC_C790;
	}

	public void setVL_RED_BC_C790(float vL_RED_BC_C790) {
		VL_RED_BC_C790 = vL_RED_BC_C790;
	}

	public String getCOD_OBS_C790() {
		return COD_OBS_C790;
	}

	public void setCOD_OBS_C790(String cOD_OBS_C790) {
		COD_OBS_C790 = cOD_OBS_C790;
	}
	

	public C700 getC700() {
		return c700;
	}

	public void setC700(C700 c700) {
		this.c700 = c700;
	}

	public ArrayList<C791> getListC791() {
		return listC791;
	}

	public void setListC791(ArrayList<C791> listC791) {
		this.listC791 = listC791;
	}
	
	

	public C790(){}
	public C790(List<String> strs1) {
	this.setREG_C790(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCST_ICMS_C790(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setCFOP_C790(Integer.parseInt(strs1.get(2)));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setALIQ_ICMS_C790(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_OPR_C790(Float.parseFloat(strs1.get(4).replace(",",".")));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_BC_ICMS_C790(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_ICMS_C790(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setVL_BC_ICMS_ST_C790(Float.parseFloat(strs1.get(7).replace(",",".")));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setVL_ICMS_ST_C790(Float.parseFloat(strs1.get(8).replace(",",".")));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setVL_RED_BC_C790(Float.parseFloat(strs1.get(9).replace(",",".")));
	this.setCOD_OBS_C790(strs1.get(10));
	}


}
