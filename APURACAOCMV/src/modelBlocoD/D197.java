package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D197 {
	String REG_D197, COD_AJ_D197, DESCR_COMPL_AJ_D197, COD_ITEM_D197;
	float VL_BC_ICMS_D197, ALIQ_ICMS_D197, VL_ICMS_D197, VL_OUTROS_D197;
	
	D195 d195;

	public String getREG_D197() {
		return REG_D197;
	}

	public void setREG_D197(String rEG_D197) {
		REG_D197 = rEG_D197;
	}

	public String getCOD_AJ_D197() {
		return COD_AJ_D197;
	}

	public void setCOD_AJ_D197(String cOD_AJ_D197) {
		COD_AJ_D197 = cOD_AJ_D197;
	}

	public String getDESCR_COMPL_AJ_D197() {
		return DESCR_COMPL_AJ_D197;
	}

	public void setDESCR_COMPL_AJ_D197(String dESCR_COMPL_AJ_D197) {
		DESCR_COMPL_AJ_D197 = dESCR_COMPL_AJ_D197;
	}

	public String getCOD_ITEM_D197() {
		return COD_ITEM_D197;
	}

	public void setCOD_ITEM_D197(String cOD_ITEM_D197) {
		COD_ITEM_D197 = cOD_ITEM_D197;
	}

	public float getVL_BC_ICMS_D197() {
		return VL_BC_ICMS_D197;
	}

	public void setVL_BC_ICMS_D197(float vL_BC_ICMS_D197) {
		VL_BC_ICMS_D197 = vL_BC_ICMS_D197;
	}

	public float getALIQ_ICMS_D197() {
		return ALIQ_ICMS_D197;
	}

	public void setALIQ_ICMS_D197(float aLIQ_ICMS_D197) {
		ALIQ_ICMS_D197 = aLIQ_ICMS_D197;
	}

	public float getVL_ICMS_D197() {
		return VL_ICMS_D197;
	}

	public void setVL_ICMS_D197(float vL_ICMS_D197) {
		VL_ICMS_D197 = vL_ICMS_D197;
	}

	public float getVL_OUTROS_D197() {
		return VL_OUTROS_D197;
	}

	public void setVL_OUTROS_D197(float vL_OUTROS_D197) {
		VL_OUTROS_D197 = vL_OUTROS_D197;
	}
	
	

	public D195 getD195() {
		return d195;
	}

	public void setD195(D195 d195) {
		this.d195 = d195;
	}

	public D197() {
	}

	public D197(ArrayList<String> strs1) {
		this.setREG_D197(strs1.get(0));
		this.setCOD_AJ_D197(strs1.get(1));
		this.setDESCR_COMPL_AJ_D197(strs1.get(2));
		this.setCOD_ITEM_D197(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_BC_ICMS_D197(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setALIQ_ICMS_D197(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS_D197(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_OUTROS_D197(Float.parseFloat(strs1.get(7).replace(",", ".")));
	}

}
