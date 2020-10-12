package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C610 {

	String REG_C610;
	int COD_CLASS_C610;
	String COD_ITEM_C610;
	float QTD_C610;
	String UNID_C610;
	float VL_ITEM_C610, VL_DESC_C610;
	int CST_ICMS_C610, CFOP_C610;
	float ALIQ_ICMS_C610, VL_BC_ICMS_C610, VL_ICMS_C610, VL_BC_ICMS_ST_C610, VL_ICMS_ST_C610, VL_PIS_C610,
			VL_COFINS_C610;
	String COD_CTA_C610;
	
	C600 c600;

	public String getREG_C610() {
		return REG_C610;
	}

	public void setREG_C610(String rEG_C610) {
		REG_C610 = rEG_C610;
	}

	public int getCOD_CLASS_C610() {
		return COD_CLASS_C610;
	}

	public void setCOD_CLASS_C610(int cOD_CLASS_C610) {
		COD_CLASS_C610 = cOD_CLASS_C610;
	}

	public String getCOD_ITEM_C610() {
		return COD_ITEM_C610;
	}

	public void setCOD_ITEM_C610(String cOD_ITEM_C610) {
		COD_ITEM_C610 = cOD_ITEM_C610;
	}

	public float getQTD_C610() {
		return QTD_C610;
	}

	public void setQTD_C610(float qTD_C610) {
		QTD_C610 = qTD_C610;
	}

	public String getUNID_C610() {
		return UNID_C610;
	}

	public void setUNID_C610(String uNID_C610) {
		UNID_C610 = uNID_C610;
	}

	public float getVL_ITEM_C610() {
		return VL_ITEM_C610;
	}

	public void setVL_ITEM_C610(float vL_ITEM_C610) {
		VL_ITEM_C610 = vL_ITEM_C610;
	}

	public float getVL_DESC_C610() {
		return VL_DESC_C610;
	}

	public void setVL_DESC_C610(float vL_DESC_C610) {
		VL_DESC_C610 = vL_DESC_C610;
	}

	public int getCST_ICMS_C610() {
		return CST_ICMS_C610;
	}

	public void setCST_ICMS_C610(int cST_ICMS_C610) {
		CST_ICMS_C610 = cST_ICMS_C610;
	}

	public int getCFOP_C610() {
		return CFOP_C610;
	}

	public void setCFOP_C610(int cFOP_C610) {
		CFOP_C610 = cFOP_C610;
	}

	public float getALIQ_ICMS_C610() {
		return ALIQ_ICMS_C610;
	}

	public void setALIQ_ICMS_C610(float aLIQ_ICMS_C610) {
		ALIQ_ICMS_C610 = aLIQ_ICMS_C610;
	}

	public float getVL_BC_ICMS_C610() {
		return VL_BC_ICMS_C610;
	}

	public void setVL_BC_ICMS_C610(float vL_BC_ICMS_C610) {
		VL_BC_ICMS_C610 = vL_BC_ICMS_C610;
	}

	public float getVL_ICMS_C610() {
		return VL_ICMS_C610;
	}

	public void setVL_ICMS_C610(float vL_ICMS_C610) {
		VL_ICMS_C610 = vL_ICMS_C610;
	}

	public float getVL_BC_ICMS_ST_C610() {
		return VL_BC_ICMS_ST_C610;
	}

	public void setVL_BC_ICMS_ST_C610(float vL_BC_ICMS_ST_C610) {
		VL_BC_ICMS_ST_C610 = vL_BC_ICMS_ST_C610;
	}

	public float getVL_ICMS_ST_C610() {
		return VL_ICMS_ST_C610;
	}

	public void setVL_ICMS_ST_C610(float vL_ICMS_ST_C610) {
		VL_ICMS_ST_C610 = vL_ICMS_ST_C610;
	}

	public float getVL_PIS_C610() {
		return VL_PIS_C610;
	}

	public void setVL_PIS_C610(float vL_PIS_C610) {
		VL_PIS_C610 = vL_PIS_C610;
	}

	public float getVL_COFINS_C610() {
		return VL_COFINS_C610;
	}

	public void setVL_COFINS_C610(float vL_COFINS_C610) {
		VL_COFINS_C610 = vL_COFINS_C610;
	}

	public String getCOD_CTA_C610() {
		return COD_CTA_C610;
	}

	public void setCOD_CTA_C610(String cOD_CTA_C610) {
		COD_CTA_C610 = cOD_CTA_C610;
	}
	
	

	public C600 getC600() {
		return c600;
	}

	public void setC600(C600 c600) {
		this.c600 = c600;
	}

	public C610(){}
	public C610(List<String> strs1) {
	this.setREG_C610(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCOD_CLASS_C610(Integer.parseInt(strs1.get(1)));
	this.setCOD_ITEM_C610(strs1.get(2));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setQTD_C610(Float.parseFloat(strs1.get(3).replace(",",".")));
	this.setUNID_C610(strs1.get(4));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_ITEM_C610(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_DESC_C610(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setCST_ICMS_C610(Integer.parseInt(strs1.get(7)));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setCFOP_C610(Integer.parseInt(strs1.get(8)));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setALIQ_ICMS_C610(Float.parseFloat(strs1.get(9).replace(",",".")));
	if ( strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)) )
		this.setVL_BC_ICMS_C610(Float.parseFloat(strs1.get(10).replace(",",".")));
	if ( strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)) )
		this.setVL_ICMS_C610(Float.parseFloat(strs1.get(11).replace(",",".")));
	if ( strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)) )
		this.setVL_BC_ICMS_ST_C610(Float.parseFloat(strs1.get(12).replace(",",".")));
	if ( strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)) )
		this.setVL_ICMS_ST_C610(Float.parseFloat(strs1.get(13).replace(",",".")));
	if ( strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)) )
		this.setVL_PIS_C610(Float.parseFloat(strs1.get(14).replace(",",".")));
	if ( strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)) )
		this.setVL_COFINS_C610(Float.parseFloat(strs1.get(15).replace(",",".")));
	this.setCOD_CTA_C610(strs1.get(16));
	}


}
