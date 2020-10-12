package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C370 {

	String REG_C370;
	int NUM_ITEM_C370;
	String COD_ITEM_C370;
	float QTD_C370;
	String UNID_C370;
	float VL_ITEM_C370, VL_DESC_C370;

	C350 c350;
	public String getREG_C370() {
		return REG_C370;
	}

	public void setREG_C370(String rEG_C370) {
		REG_C370 = rEG_C370;
	}

	public int getNUM_ITEM_C370() {
		return NUM_ITEM_C370;
	}

	public void setNUM_ITEM_C370(int nUM_ITEM_C370) {
		NUM_ITEM_C370 = nUM_ITEM_C370;
	}

	public String getCOD_ITEM_C370() {
		return COD_ITEM_C370;
	}

	public void setCOD_ITEM_C370(String cOD_ITEM_C370) {
		COD_ITEM_C370 = cOD_ITEM_C370;
	}

	public float getQTD_C370() {
		return QTD_C370;
	}

	public void setQTD_C370(float qTD_C370) {
		QTD_C370 = qTD_C370;
	}

	public String getUNID_C370() {
		return UNID_C370;
	}

	public void setUNID_C370(String uNID_C370) {
		UNID_C370 = uNID_C370;
	}

	public float getVL_ITEM_C370() {
		return VL_ITEM_C370;
	}

	public void setVL_ITEM_C370(float vL_ITEM_C370) {
		VL_ITEM_C370 = vL_ITEM_C370;
	}

	public float getVL_DESC_C370() {
		return VL_DESC_C370;
	}

	public void setVL_DESC_C370(float vL_DESC_C370) {
		VL_DESC_C370 = vL_DESC_C370;
	}
	
	

	public C350 getC350() {
		return c350;
	}

	public void setC350(C350 c350) {
		this.c350 = c350;
	}

	public C370(){}
	public C370(List<String> strs1) {
	this.setREG_C370(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setNUM_ITEM_C370(Integer.parseInt(strs1.get(1)));
	this.setCOD_ITEM_C370(strs1.get(2));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setQTD_C370(Float.parseFloat(strs1.get(3).replace(",",".")));
	this.setUNID_C370(strs1.get(4));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_ITEM_C370(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_DESC_C370(Float.parseFloat(strs1.get(6).replace(",",".")));
	}


}
