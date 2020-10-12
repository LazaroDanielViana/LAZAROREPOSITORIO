package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C321 {

	String REG_C321, COD_ITEM_C321;
	float QTD_C321;
	String UNID_C321;

	float VL_ITEM_C321, VL_DESC_C321, VL_BC_ICMS_C321, VL_ICMS_C321, VL_PIS_C321, VL_COFINS_C321;

	C320 c320;
	public String getREG_C321() {
		return REG_C321;
	}

	public void setREG_C321(String rEG_C321) {
		REG_C321 = rEG_C321;
	}

	public String getCOD_ITEM_C321() {
		return COD_ITEM_C321;
	}

	public void setCOD_ITEM_C321(String cOD_ITEM_C321) {
		COD_ITEM_C321 = cOD_ITEM_C321;
	}

	public float getQTD_C321() {
		return QTD_C321;
	}

	public void setQTD_C321(float qTD_C321) {
		QTD_C321 = qTD_C321;
	}

	public String getUNID_C321() {
		return UNID_C321;
	}

	public void setUNID_C321(String uNID_C321) {
		UNID_C321 = uNID_C321;
	}

	public float getVL_ITEM_C321() {
		return VL_ITEM_C321;
	}

	public void setVL_ITEM_C321(float vL_ITEM_C321) {
		VL_ITEM_C321 = vL_ITEM_C321;
	}

	public float getVL_DESC_C321() {
		return VL_DESC_C321;
	}

	public void setVL_DESC_C321(float vL_DESC_C321) {
		VL_DESC_C321 = vL_DESC_C321;
	}

	public float getVL_BC_ICMS_C321() {
		return VL_BC_ICMS_C321;
	}

	public void setVL_BC_ICMS_C321(float vL_BC_ICMS_C321) {
		VL_BC_ICMS_C321 = vL_BC_ICMS_C321;
	}

	public float getVL_ICMS_C321() {
		return VL_ICMS_C321;
	}

	public void setVL_ICMS_C321(float vL_ICMS_C321) {
		VL_ICMS_C321 = vL_ICMS_C321;
	}

	public float getVL_PIS_C321() {
		return VL_PIS_C321;
	}

	public void setVL_PIS_C321(float vL_PIS_C321) {
		VL_PIS_C321 = vL_PIS_C321;
	}

	public float getVL_COFINS_C321() {
		return VL_COFINS_C321;
	}

	public void setVL_COFINS_C321(float vL_COFINS_C321) {
		VL_COFINS_C321 = vL_COFINS_C321;
	}
	
	

	public C320 getC320() {
		return c320;
	}

	public void setC320(C320 c320) {
		this.c320 = c320;
	}

	public C321() {
	}

	public C321(List<String> strs1) {
		this.setREG_C321(strs1.get(0));
		this.setCOD_ITEM_C321(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setQTD_C321(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setUNID_C321(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_ITEM_C321(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_DESC_C321(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_BC_ICMS_C321(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_ICMS_C321(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_PIS_C321(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_COFINS_C321(Float.parseFloat(strs1.get(9).replace(",", ".")));
	}

}
