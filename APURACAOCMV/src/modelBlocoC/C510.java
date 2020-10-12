package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C510 {

	String REG_C510;
	int NUM_ITEM_C510;
	String COD_ITEM_C510;
	int COD_CLASS_C510;
	float QTD_C510;
	String UNID_C510;
	float VL_ITEM_C510, VL_DESC_C510;
	int CST_ICMS_C510, CFOP_C510;
	float VL_BC_ICMS_C510, ALIQ_ICMS_C510, VL_ICMS_C510, VL_BC_ICMS_ST_C510, ALIQ_ST_C510, VL_ICMS_ST_C510;
	String IND_REC_C510, COD_PART_C510;
	float VL_PIS_C510, VL_COFINS_C510;
	String COD_CTA_C510;
	
	C500 c500;

	public String getREG_C510() {
		return REG_C510;
	}

	public void setREG_C510(String rEG_C510) {
		REG_C510 = rEG_C510;
	}

	public int getNUM_ITEM_C510() {
		return NUM_ITEM_C510;
	}

	public void setNUM_ITEM_C510(int nUM_ITEM_C510) {
		NUM_ITEM_C510 = nUM_ITEM_C510;
	}

	public String getCOD_ITEM_C510() {
		return COD_ITEM_C510;
	}

	public void setCOD_ITEM_C510(String cOD_ITEM_C510) {
		COD_ITEM_C510 = cOD_ITEM_C510;
	}

	public int getCOD_CLASS_C510() {
		return COD_CLASS_C510;
	}

	public void setCOD_CLASS_C510(int cOD_CLASS_C510) {
		COD_CLASS_C510 = cOD_CLASS_C510;
	}

	public float getQTD_C510() {
		return QTD_C510;
	}

	public void setQTD_C510(float qTD_C510) {
		QTD_C510 = qTD_C510;
	}

	public String getUNID_C510() {
		return UNID_C510;
	}

	public void setUNID_C510(String uNID_C510) {
		UNID_C510 = uNID_C510;
	}

	public float getVL_ITEM_C510() {
		return VL_ITEM_C510;
	}

	public void setVL_ITEM_C510(float vL_ITEM_C510) {
		VL_ITEM_C510 = vL_ITEM_C510;
	}

	public float getVL_DESC_C510() {
		return VL_DESC_C510;
	}

	public void setVL_DESC_C510(float vL_DESC_C510) {
		VL_DESC_C510 = vL_DESC_C510;
	}

	public int getCST_ICMS_C510() {
		return CST_ICMS_C510;
	}

	public void setCST_ICMS_C510(int cST_ICMS_C510) {
		CST_ICMS_C510 = cST_ICMS_C510;
	}

	public int getCFOP_C510() {
		return CFOP_C510;
	}

	public void setCFOP_C510(int cFOP_C510) {
		CFOP_C510 = cFOP_C510;
	}

	public float getVL_BC_ICMS_C510() {
		return VL_BC_ICMS_C510;
	}

	public void setVL_BC_ICMS_C510(float vL_BC_ICMS_C510) {
		VL_BC_ICMS_C510 = vL_BC_ICMS_C510;
	}

	public float getALIQ_ICMS_C510() {
		return ALIQ_ICMS_C510;
	}

	public void setALIQ_ICMS_C510(float aLIQ_ICMS_C510) {
		ALIQ_ICMS_C510 = aLIQ_ICMS_C510;
	}

	public float getVL_ICMS_C510() {
		return VL_ICMS_C510;
	}

	public void setVL_ICMS_C510(float vL_ICMS_C510) {
		VL_ICMS_C510 = vL_ICMS_C510;
	}

	public float getVL_BC_ICMS_ST_C510() {
		return VL_BC_ICMS_ST_C510;
	}

	public void setVL_BC_ICMS_ST_C510(float vL_BC_ICMS_ST_C510) {
		VL_BC_ICMS_ST_C510 = vL_BC_ICMS_ST_C510;
	}

	public float getALIQ_ST_C510() {
		return ALIQ_ST_C510;
	}

	public void setALIQ_ST_C510(float aLIQ_ST_C510) {
		ALIQ_ST_C510 = aLIQ_ST_C510;
	}

	public float getVL_ICMS_ST_C510() {
		return VL_ICMS_ST_C510;
	}

	public void setVL_ICMS_ST_C510(float vL_ICMS_ST_C510) {
		VL_ICMS_ST_C510 = vL_ICMS_ST_C510;
	}

	public String getIND_REC_C510() {
		return IND_REC_C510;
	}

	public void setIND_REC_C510(String iND_REC_C510) {
		IND_REC_C510 = iND_REC_C510;
	}

	public String getCOD_PART_C510() {
		return COD_PART_C510;
	}

	public void setCOD_PART_C510(String cOD_PART_C510) {
		COD_PART_C510 = cOD_PART_C510;
	}

	public float getVL_PIS_C510() {
		return VL_PIS_C510;
	}

	public void setVL_PIS_C510(float vL_PIS_C510) {
		VL_PIS_C510 = vL_PIS_C510;
	}

	public float getVL_COFINS_C510() {
		return VL_COFINS_C510;
	}

	public void setVL_COFINS_C510(float vL_COFINS_C510) {
		VL_COFINS_C510 = vL_COFINS_C510;
	}

	public String getCOD_CTA_C510() {
		return COD_CTA_C510;
	}

	public void setCOD_CTA_C510(String cOD_CTA_C510) {
		COD_CTA_C510 = cOD_CTA_C510;
	}
	

	public C500 getC500() {
		return c500;
	}

	public void setC500(C500 c500) {
		this.c500 = c500;
	}

	public C510(){}
	public C510(List<String> strs1) {
	this.setREG_C510(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setNUM_ITEM_C510(Integer.parseInt(strs1.get(1)));
	this.setCOD_ITEM_C510(strs1.get(2));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setCOD_CLASS_C510(Integer.parseInt(strs1.get(3)));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setQTD_C510(Float.parseFloat(strs1.get(4).replace(",",".")));
	this.setUNID_C510(strs1.get(5));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_ITEM_C510(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setVL_DESC_C510(Float.parseFloat(strs1.get(7).replace(",",".")));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setCST_ICMS_C510(Integer.parseInt(strs1.get(8)));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setCFOP_C510(Integer.parseInt(strs1.get(9)));
	if ( strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)) )
		this.setVL_BC_ICMS_C510(Float.parseFloat(strs1.get(10).replace(",",".")));
	if ( strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)) )
		this.setALIQ_ICMS_C510(Float.parseFloat(strs1.get(11).replace(",",".")));
	if ( strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)) )
		this.setVL_ICMS_C510(Float.parseFloat(strs1.get(12).replace(",",".")));
	if ( strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)) )
		this.setVL_BC_ICMS_ST_C510(Float.parseFloat(strs1.get(13).replace(",",".")));
	if ( strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)) )
		this.setALIQ_ST_C510(Float.parseFloat(strs1.get(14).replace(",",".")));
	if ( strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)) )
		this.setVL_ICMS_ST_C510(Float.parseFloat(strs1.get(15).replace(",",".")));
	this.setIND_REC_C510(strs1.get(16));
	this.setCOD_PART_C510(strs1.get(17));
	if ( strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)) )
		this.setVL_PIS_C510(Float.parseFloat(strs1.get(18).replace(",",".")));
	if ( strs1.get(19).length() >= 1 && RegexL.isNumber(strs1.get(19)) )
		this.setVL_COFINS_C510(Float.parseFloat(strs1.get(19).replace(",",".")));
	this.setCOD_CTA_C510(strs1.get(20));
	}


}
