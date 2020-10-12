package modelBlocoD;

import java.util.ArrayList;

public class D610 {
	String REG_D610;
	int COD_CLASS_D610;
	String COD_ITEM_D610;
	float QTD_D610;
	String UNID_D610;
	float VL_ITEM_D610, VL_DESC_D610;
	int CST_ICMS_D610, CFOP_D610;

	float ALIQ_ICMS_D610, VL_BC_ICMS_D610, VL_ICMS_D610, VL_BC_ICMS_UF_D610, VL_ICMS_UF_D610, VL_RED_BC_D610,
			VL_PIS_D610, VL_COFINS_D610;
	String COD_CTA_D610;

	D600 d600;

	public String getREG_D610() {
		return REG_D610;
	}

	public void setREG_D610(String rEG_D610) {
		REG_D610 = rEG_D610;
	}

	public int getCOD_CLASS_D610() {
		return COD_CLASS_D610;
	}

	public void setCOD_CLASS_D610(int cOD_CLASS_D610) {
		COD_CLASS_D610 = cOD_CLASS_D610;
	}

	public String getCOD_ITEM_D610() {
		return COD_ITEM_D610;
	}

	public void setCOD_ITEM_D610(String cOD_ITEM_D610) {
		COD_ITEM_D610 = cOD_ITEM_D610;
	}

	public float getQTD_D610() {
		return QTD_D610;
	}

	public void setQTD_D610(float qTD_D610) {
		QTD_D610 = qTD_D610;
	}

	public String getUNID_D610() {
		return UNID_D610;
	}

	public void setUNID_D610(String uNID_D610) {
		UNID_D610 = uNID_D610;
	}

	public float getVL_ITEM_D610() {
		return VL_ITEM_D610;
	}

	public void setVL_ITEM_D610(float vL_ITEM_D610) {
		VL_ITEM_D610 = vL_ITEM_D610;
	}

	public float getVL_DESC_D610() {
		return VL_DESC_D610;
	}

	public void setVL_DESC_D610(float vL_DESC_D610) {
		VL_DESC_D610 = vL_DESC_D610;
	}

	public int getCST_ICMS_D610() {
		return CST_ICMS_D610;
	}

	public void setCST_ICMS_D610(int cST_ICMS_D610) {
		CST_ICMS_D610 = cST_ICMS_D610;
	}

	public int getCFOP_D610() {
		return CFOP_D610;
	}

	public void setCFOP_D610(int cFOP_D610) {
		CFOP_D610 = cFOP_D610;
	}

	public float getALIQ_ICMS_D610() {
		return ALIQ_ICMS_D610;
	}

	public void setALIQ_ICMS_D610(float aLIQ_ICMS_D610) {
		ALIQ_ICMS_D610 = aLIQ_ICMS_D610;
	}

	public float getVL_BC_ICMS_D610() {
		return VL_BC_ICMS_D610;
	}

	public void setVL_BC_ICMS_D610(float vL_BC_ICMS_D610) {
		VL_BC_ICMS_D610 = vL_BC_ICMS_D610;
	}

	public float getVL_ICMS_D610() {
		return VL_ICMS_D610;
	}

	public void setVL_ICMS_D610(float vL_ICMS_D610) {
		VL_ICMS_D610 = vL_ICMS_D610;
	}

	public float getVL_BC_ICMS_UF_D610() {
		return VL_BC_ICMS_UF_D610;
	}

	public void setVL_BC_ICMS_UF_D610(float vL_BC_ICMS_UF_D610) {
		VL_BC_ICMS_UF_D610 = vL_BC_ICMS_UF_D610;
	}

	public float getVL_ICMS_UF_D610() {
		return VL_ICMS_UF_D610;
	}

	public void setVL_ICMS_UF_D610(float vL_ICMS_UF_D610) {
		VL_ICMS_UF_D610 = vL_ICMS_UF_D610;
	}

	public float getVL_RED_BC_D610() {
		return VL_RED_BC_D610;
	}

	public void setVL_RED_BC_D610(float vL_RED_BC_D610) {
		VL_RED_BC_D610 = vL_RED_BC_D610;
	}

	public float getVL_PIS_D610() {
		return VL_PIS_D610;
	}

	public void setVL_PIS_D610(float vL_PIS_D610) {
		VL_PIS_D610 = vL_PIS_D610;
	}

	public float getVL_COFINS_D610() {
		return VL_COFINS_D610;
	}

	public void setVL_COFINS_D610(float vL_COFINS_D610) {
		VL_COFINS_D610 = vL_COFINS_D610;
	}

	public String getCOD_CTA_D610() {
		return COD_CTA_D610;
	}

	public void setCOD_CTA_D610(String cOD_CTA_D610) {
		COD_CTA_D610 = cOD_CTA_D610;
	}

	public D600 getD600() {
		return d600;
	}

	public void setD600(D600 d600) {
		this.d600 = d600;
	}

	public D610() {
	}

	public D610(ArrayList<String> strs1) {
		this.setREG_D610(strs1.get(0));
		this.setCOD_CLASS_D610(Integer.parseInt(strs1.get(1)));
		this.setCOD_ITEM_D610(strs1.get(2));
		this.setQTD_D610(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setUNID_D610(strs1.get(4));
		this.setVL_ITEM_D610(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_DESC_D610(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setCST_ICMS_D610(Integer.parseInt(strs1.get(7)));
		this.setCFOP_D610(Integer.parseInt(strs1.get(8)));
		this.setALIQ_ICMS_D610(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setVL_BC_ICMS_D610(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setVL_ICMS_D610(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVL_BC_ICMS_UF_D610(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setVL_ICMS_UF_D610(Float.parseFloat(strs1.get(13).replace(",", ".")));
		this.setVL_RED_BC_D610(Float.parseFloat(strs1.get(14).replace(",", ".")));
		this.setVL_PIS_D610(Float.parseFloat(strs1.get(15).replace(",", ".")));
		this.setVL_COFINS_D610(Float.parseFloat(strs1.get(16).replace(",", ".")));
		this.setCOD_CTA_D610(strs1.get(17));
	}

}
