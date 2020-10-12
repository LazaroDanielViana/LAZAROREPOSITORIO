package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D510 {
	String REG_D510;
	int NUM_ITEM_D510;
	String COD_ITEM_D510;
	int COD_CLASS_D510;
	float QTD_D510;
	String UNID_D510;
	float VL_ITEM_D510, VL_DESC_D510;
	int CST_ICMS_D510, CFOP_D510;
	float VL_BC_ICMS_D510, ALIQ_ICMS_D510, VL_ICMS_D510, VL_BC_ICMS_UF_D510, VL_ICMS_UF_D510;
	String IND_REC_D510, COD_PART_D510;
	float VL_PIS_D510, VL_COFINS_D510;
	String COD_CTA_D510;
	
	D500 d500;

	public String getREG_D510() {
		return REG_D510;
	}

	public void setREG_D510(String rEG_D510) {
		REG_D510 = rEG_D510;
	}

	public int getNUM_ITEM_D510() {
		return NUM_ITEM_D510;
	}

	public void setNUM_ITEM_D510(int nUM_ITEM_D510) {
		NUM_ITEM_D510 = nUM_ITEM_D510;
	}

	public String getCOD_ITEM_D510() {
		return COD_ITEM_D510;
	}

	public void setCOD_ITEM_D510(String cOD_ITEM_D510) {
		COD_ITEM_D510 = cOD_ITEM_D510;
	}

	public int getCOD_CLASS_D510() {
		return COD_CLASS_D510;
	}

	public void setCOD_CLASS_D510(int cOD_CLASS_D510) {
		COD_CLASS_D510 = cOD_CLASS_D510;
	}

	public float getQTD_D510() {
		return QTD_D510;
	}

	public void setQTD_D510(float qTD_D510) {
		QTD_D510 = qTD_D510;
	}

	public String getUNID_D510() {
		return UNID_D510;
	}

	public void setUNID_D510(String uNID_D510) {
		UNID_D510 = uNID_D510;
	}

	public float getVL_ITEM_D510() {
		return VL_ITEM_D510;
	}

	public void setVL_ITEM_D510(float vL_ITEM_D510) {
		VL_ITEM_D510 = vL_ITEM_D510;
	}

	public float getVL_DESC_D510() {
		return VL_DESC_D510;
	}

	public void setVL_DESC_D510(float vL_DESC_D510) {
		VL_DESC_D510 = vL_DESC_D510;
	}

	public int getCST_ICMS_D510() {
		return CST_ICMS_D510;
	}

	public void setCST_ICMS_D510(int cST_ICMS_D510) {
		CST_ICMS_D510 = cST_ICMS_D510;
	}

	public int getCFOP_D510() {
		return CFOP_D510;
	}

	public void setCFOP_D510(int cFOP_D510) {
		CFOP_D510 = cFOP_D510;
	}

	public float getVL_BC_ICMS_D510() {
		return VL_BC_ICMS_D510;
	}

	public void setVL_BC_ICMS_D510(float vL_BC_ICMS_D510) {
		VL_BC_ICMS_D510 = vL_BC_ICMS_D510;
	}

	public float getALIQ_ICMS_D510() {
		return ALIQ_ICMS_D510;
	}

	public void setALIQ_ICMS_D510(float aLIQ_ICMS_D510) {
		ALIQ_ICMS_D510 = aLIQ_ICMS_D510;
	}

	public float getVL_ICMS_D510() {
		return VL_ICMS_D510;
	}

	public void setVL_ICMS_D510(float vL_ICMS_D510) {
		VL_ICMS_D510 = vL_ICMS_D510;
	}

	public float getVL_BC_ICMS_UF_D510() {
		return VL_BC_ICMS_UF_D510;
	}

	public void setVL_BC_ICMS_UF_D510(float vL_BC_ICMS_UF_D510) {
		VL_BC_ICMS_UF_D510 = vL_BC_ICMS_UF_D510;
	}

	public float getVL_ICMS_UF_D510() {
		return VL_ICMS_UF_D510;
	}

	public void setVL_ICMS_UF_D510(float vL_ICMS_UF_D510) {
		VL_ICMS_UF_D510 = vL_ICMS_UF_D510;
	}

	public String getIND_REC_D510() {
		return IND_REC_D510;
	}

	public void setIND_REC_D510(String iND_REC_D510) {
		IND_REC_D510 = iND_REC_D510;
	}

	public String getCOD_PART_D510() {
		return COD_PART_D510;
	}

	public void setCOD_PART_D510(String cOD_PART_D510) {
		COD_PART_D510 = cOD_PART_D510;
	}

	public float getVL_PIS_D510() {
		return VL_PIS_D510;
	}

	public void setVL_PIS_D510(float vL_PIS_D510) {
		VL_PIS_D510 = vL_PIS_D510;
	}

	public float getVL_COFINS_D510() {
		return VL_COFINS_D510;
	}

	public void setVL_COFINS_D510(float vL_COFINS_D510) {
		VL_COFINS_D510 = vL_COFINS_D510;
	}

	public String getCOD_CTA_D510() {
		return COD_CTA_D510;
	}

	public void setCOD_CTA_D510(String cOD_CTA_D510) {
		COD_CTA_D510 = cOD_CTA_D510;
	}
	
	

	public D500 getD500() {
		return d500;
	}

	public void setD500(D500 d500) {
		this.d500 = d500;
	}

	public D510() {
	}

	public D510(ArrayList<String> strs1) {
		this.setREG_D510(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setNUM_ITEM_D510(Integer.parseInt(strs1.get(1)));
		this.setCOD_ITEM_D510(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCOD_CLASS_D510(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setQTD_D510(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setUNID_D510(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ITEM_D510(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_DESC_D510(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setCST_ICMS_D510(Integer.parseInt(strs1.get(8)));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setCFOP_D510(Integer.parseInt(strs1.get(9)));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_BC_ICMS_D510(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setALIQ_ICMS_D510(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_ICMS_D510(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_BC_ICMS_UF_D510(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_ICMS_UF_D510(Float.parseFloat(strs1.get(14).replace(",", ".")));
		this.setIND_REC_D510(strs1.get(15));
		this.setCOD_PART_D510(strs1.get(16));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_PIS_D510(Float.parseFloat(strs1.get(17).replace(",", ".")));
		if (strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)))
			this.setVL_COFINS_D510(Float.parseFloat(strs1.get(18).replace(",", ".")));
		this.setCOD_CTA_D510(strs1.get(19));
	}

}
