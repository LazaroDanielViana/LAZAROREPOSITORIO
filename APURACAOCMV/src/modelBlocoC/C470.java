package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C470 {

	String REG_C470, COD_ITEM_C470;
	float QTD_C470, QTD_CANC_C470;

	String UNID_C470;
	float VL_ITEM_C470;
	int CST_ICMS_C470, CFOP_C470;

	float ALIQ_ICMS_C470, VL_PIS_C470, VL_COFINS_C470;
	
	C460 c460;

	public String getREG_C470() {
		return REG_C470;
	}

	public void setREG_C470(String rEG_C470) {
		REG_C470 = rEG_C470;
	}

	public String getCOD_ITEM_C470() {
		return COD_ITEM_C470;
	}

	public void setCOD_ITEM_C470(String cOD_ITEM_C470) {
		COD_ITEM_C470 = cOD_ITEM_C470;
	}

	public float getQTD_C470() {
		return QTD_C470;
	}

	public void setQTD_C470(float qTD_C470) {
		QTD_C470 = qTD_C470;
	}

	public float getQTD_CANC_C470() {
		return QTD_CANC_C470;
	}

	public void setQTD_CANC_C470(float qTD_CANC_C470) {
		QTD_CANC_C470 = qTD_CANC_C470;
	}

	public String getUNID_C470() {
		return UNID_C470;
	}

	public void setUNID_C470(String uNID_C470) {
		UNID_C470 = uNID_C470;
	}

	public float getVL_ITEM_C470() {
		return VL_ITEM_C470;
	}

	public void setVL_ITEM_C470(float vL_ITEM_C470) {
		VL_ITEM_C470 = vL_ITEM_C470;
	}

	public int getCST_ICMS_C470() {
		return CST_ICMS_C470;
	}

	public void setCST_ICMS_C470(int cST_ICMS_C470) {
		CST_ICMS_C470 = cST_ICMS_C470;
	}

	public int getCFOP_C470() {
		return CFOP_C470;
	}

	public void setCFOP_C470(int cFOP_C470) {
		CFOP_C470 = cFOP_C470;
	}

	public float getALIQ_ICMS_C470() {
		return ALIQ_ICMS_C470;
	}

	public void setALIQ_ICMS_C470(float aLIQ_ICMS_C470) {
		ALIQ_ICMS_C470 = aLIQ_ICMS_C470;
	}

	public float getVL_PIS_C470() {
		return VL_PIS_C470;
	}

	public void setVL_PIS_C470(float vL_PIS_C470) {
		VL_PIS_C470 = vL_PIS_C470;
	}

	public float getVL_COFINS_C470() {
		return VL_COFINS_C470;
	}

	public void setVL_COFINS_C470(float vL_COFINS_C470) {
		VL_COFINS_C470 = vL_COFINS_C470;
	}

	
	public C460 getC460() {
		return c460;
	}

	public void setC460(C460 c460) {
		this.c460 = c460;
	}

	public C470(){}
	public C470(List<String> strs1) {
	this.setREG_C470(strs1.get(0));
	this.setCOD_ITEM_C470(strs1.get(1));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setQTD_C470(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setQTD_CANC_C470(Float.parseFloat(strs1.get(3).replace(",",".")));
	this.setUNID_C470(strs1.get(4));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_ITEM_C470(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setCST_ICMS_C470(Integer.parseInt(strs1.get(6)));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setCFOP_C470(Integer.parseInt(strs1.get(7)));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setALIQ_ICMS_C470(Float.parseFloat(strs1.get(8).replace(",",".")));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setVL_PIS_C470(Float.parseFloat(strs1.get(9).replace(",",".")));
	if ( strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)) )
		this.setVL_COFINS_C470(Float.parseFloat(strs1.get(10).replace(",",".")));
	}

}
