package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C495 {

	String REG_C495;
	float ALIQ_ICMS_C495;
	String COD_ITEM_C495;
	float QTD_C495, QTD_CANC_C495;
	String UNID_C495;
	float VL_ITEM_C495, VL_DESC_C495, VL_CANC_C495, VL_ACMO_C495, VL_BC_ICMS_C495, VL_ICMS_C495, VL_ISEN_C495,
			VL_NT_C495, VL_ICMS_ST_C495;

	public String getREG_C495() {
		return REG_C495;
	}

	public void setREG_C495(String rEG_C495) {
		REG_C495 = rEG_C495;
	}

	public float getALIQ_ICMS_C495() {
		return ALIQ_ICMS_C495;
	}

	public void setALIQ_ICMS_C495(float aLIQ_ICMS_C495) {
		ALIQ_ICMS_C495 = aLIQ_ICMS_C495;
	}

	public String getCOD_ITEM_C495() {
		return COD_ITEM_C495;
	}

	public void setCOD_ITEM_C495(String cOD_ITEM_C495) {
		COD_ITEM_C495 = cOD_ITEM_C495;
	}

	public float getQTD_C495() {
		return QTD_C495;
	}

	public void setQTD_C495(float qTD_C495) {
		QTD_C495 = qTD_C495;
	}

	public float getQTD_CANC_C495() {
		return QTD_CANC_C495;
	}

	public void setQTD_CANC_C495(float qTD_CANC_C495) {
		QTD_CANC_C495 = qTD_CANC_C495;
	}

	public String getUNID_C495() {
		return UNID_C495;
	}

	public void setUNID_C495(String uNID_C495) {
		UNID_C495 = uNID_C495;
	}

	public float getVL_ITEM_C495() {
		return VL_ITEM_C495;
	}

	public void setVL_ITEM_C495(float vL_ITEM_C495) {
		VL_ITEM_C495 = vL_ITEM_C495;
	}

	public float getVL_DESC_C495() {
		return VL_DESC_C495;
	}

	public void setVL_DESC_C495(float vL_DESC_C495) {
		VL_DESC_C495 = vL_DESC_C495;
	}

	public float getVL_CANC_C495() {
		return VL_CANC_C495;
	}

	public void setVL_CANC_C495(float vL_CANC_C495) {
		VL_CANC_C495 = vL_CANC_C495;
	}

	public float getVL_ACMO_C495() {
		return VL_ACMO_C495;
	}

	public void setVL_ACMO_C495(float vL_ACMO_C495) {
		VL_ACMO_C495 = vL_ACMO_C495;
	}

	public float getVL_BC_ICMS_C495() {
		return VL_BC_ICMS_C495;
	}

	public void setVL_BC_ICMS_C495(float vL_BC_ICMS_C495) {
		VL_BC_ICMS_C495 = vL_BC_ICMS_C495;
	}

	public float getVL_ICMS_C495() {
		return VL_ICMS_C495;
	}

	public void setVL_ICMS_C495(float vL_ICMS_C495) {
		VL_ICMS_C495 = vL_ICMS_C495;
	}

	public float getVL_ISEN_C495() {
		return VL_ISEN_C495;
	}

	public void setVL_ISEN_C495(float vL_ISEN_C495) {
		VL_ISEN_C495 = vL_ISEN_C495;
	}

	public float getVL_NT_C495() {
		return VL_NT_C495;
	}

	public void setVL_NT_C495(float vL_NT_C495) {
		VL_NT_C495 = vL_NT_C495;
	}

	public float getVL_ICMS_ST_C495() {
		return VL_ICMS_ST_C495;
	}

	public void setVL_ICMS_ST_C495(float vL_ICMS_ST_C495) {
		VL_ICMS_ST_C495 = vL_ICMS_ST_C495;
	}

	public C495() {
	}

	public C495(List<String> strs1) {
		this.setREG_C495(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setALIQ_ICMS_C495(Float.parseFloat(strs1.get(1).replace(",", ".")));
		this.setCOD_ITEM_C495(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setQTD_C495(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setQTD_CANC_C495(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setUNID_C495(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ITEM_C495(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_DESC_C495(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_CANC_C495(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_ACMO_C495(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_BC_ICMS_C495(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_ICMS_C495(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_ISEN_C495(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_NT_C495(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_ICMS_ST_C495(Float.parseFloat(strs1.get(14).replace(",", ".")));
	}

}
