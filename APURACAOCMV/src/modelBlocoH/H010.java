package modelBlocoH;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class H010 {

	String REG_H010, COD_ITEM_H010, UNID_H010;
	float QTD_H010, VL_UNIT_H010, VL_ITEM_H010;
	String IND_PROP_H010, COD_PART_H010, TXT_COMPL_H010, COD_CTA_H010;
	float VL_ITEM_IR_H010;
	
	H005 h005;
	
	ArrayList<H020> listH020 = new ArrayList<>();

	public String getREG_H010() {
		return REG_H010;
	}

	public void setREG_H010(String rEG_H010) {
		REG_H010 = rEG_H010;
	}

	public String getCOD_ITEM_H010() {
		return COD_ITEM_H010;
	}

	public void setCOD_ITEM_H010(String cOD_ITEM_H010) {
		COD_ITEM_H010 = cOD_ITEM_H010;
	}

	public String getUNID_H010() {
		return UNID_H010;
	}

	public void setUNID_H010(String uNID_H010) {
		UNID_H010 = uNID_H010;
	}

	public float getQTD_H010() {
		return QTD_H010;
	}

	public void setQTD_H010(float qTD_H010) {
		QTD_H010 = qTD_H010;
	}

	public float getVL_UNIT_H010() {
		return VL_UNIT_H010;
	}

	public void setVL_UNIT_H010(float vL_UNIT_H010) {
		VL_UNIT_H010 = vL_UNIT_H010;
	}

	public float getVL_ITEM_H010() {
		return VL_ITEM_H010;
	}

	public void setVL_ITEM_H010(float vL_ITEM_H010) {
		VL_ITEM_H010 = vL_ITEM_H010;
	}

	public String getIND_PROP_H010() {
		return IND_PROP_H010;
	}

	public void setIND_PROP_H010(String iND_PROP_H010) {
		IND_PROP_H010 = iND_PROP_H010;
	}

	public String getCOD_PART_H010() {
		return COD_PART_H010;
	}

	public void setCOD_PART_H010(String cOD_PART_H010) {
		COD_PART_H010 = cOD_PART_H010;
	}

	public String getTXT_COMPL_H010() {
		return TXT_COMPL_H010;
	}

	public void setTXT_COMPL_H010(String tXT_COMPL_H010) {
		TXT_COMPL_H010 = tXT_COMPL_H010;
	}

	public String getCOD_CTA_H010() {
		return COD_CTA_H010;
	}

	public void setCOD_CTA_H010(String cOD_CTA_H010) {
		COD_CTA_H010 = cOD_CTA_H010;
	}

	public float getVL_ITEM_IR_H010() {
		return VL_ITEM_IR_H010;
	}

	public void setVL_ITEM_IR_H010(float vL_ITEM_IR_H010) {
		VL_ITEM_IR_H010 = vL_ITEM_IR_H010;
	}

	
	public ArrayList<H020> getListH020() {
		return listH020;
	}

	public void setListH020(ArrayList<H020> listH020) {
		this.listH020 = listH020;
	}
	

	public H005 getH005() {
		return h005;
	}

	public void setH005(H005 h005) {
		this.h005 = h005;
	}

	public H010(){}
	public H010(List<String> strs1) {
	this.setREG_H010(strs1.get(0));
	this.setCOD_ITEM_H010(strs1.get(1));
	this.setUNID_H010(strs1.get(2));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setQTD_H010(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_UNIT_H010(Float.parseFloat(strs1.get(4).replace(",",".")));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_ITEM_H010(Float.parseFloat(strs1.get(5).replace(",",".")));
	this.setIND_PROP_H010(strs1.get(6));
	this.setCOD_PART_H010(strs1.get(7));
	this.setTXT_COMPL_H010(strs1.get(8));
	this.setCOD_CTA_H010(strs1.get(9));
	if ( strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)) )
		this.setVL_ITEM_IR_H010(Float.parseFloat(strs1.get(10).replace(",",".")));
	}

}
