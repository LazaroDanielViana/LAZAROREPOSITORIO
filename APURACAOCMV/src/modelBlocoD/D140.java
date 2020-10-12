package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D140 {

	String REG_D140, COD_PART_CONSG_D140;
	int COD_MUN_ORIG_D140, COD_MUN_DEST_D140;
	String IND_VEIC_D140, VEIC_ID_D140, IND_NAV_D140;
	int VIAGEM_D140;
	float VL_FRT_LIQ_D140, VL_DESP_PORT_D140, VL_DESP_CAR_DESC_D140, VL_OUT_D140, VL_FRT_BRT_D140, VL_FRT_MM_D140;
	D100 d100;

	public String getREG_D140() {
		return REG_D140;
	}

	public void setREG_D140(String rEG_D140) {
		REG_D140 = rEG_D140;
	}

	public String getCOD_PART_CONSG_D140() {
		return COD_PART_CONSG_D140;
	}

	public void setCOD_PART_CONSG_D140(String cOD_PART_CONSG_D140) {
		COD_PART_CONSG_D140 = cOD_PART_CONSG_D140;
	}

	public int getCOD_MUN_ORIG_D140() {
		return COD_MUN_ORIG_D140;
	}

	public void setCOD_MUN_ORIG_D140(int cOD_MUN_ORIG_D140) {
		COD_MUN_ORIG_D140 = cOD_MUN_ORIG_D140;
	}

	public int getCOD_MUN_DEST_D140() {
		return COD_MUN_DEST_D140;
	}

	public void setCOD_MUN_DEST_D140(int cOD_MUN_DEST_D140) {
		COD_MUN_DEST_D140 = cOD_MUN_DEST_D140;
	}

	public String getIND_VEIC_D140() {
		return IND_VEIC_D140;
	}

	public void setIND_VEIC_D140(String iND_VEIC_D140) {
		IND_VEIC_D140 = iND_VEIC_D140;
	}

	public String getVEIC_ID_D140() {
		return VEIC_ID_D140;
	}

	public void setVEIC_ID_D140(String vEIC_ID_D140) {
		VEIC_ID_D140 = vEIC_ID_D140;
	}

	public String getIND_NAV_D140() {
		return IND_NAV_D140;
	}

	public void setIND_NAV_D140(String iND_NAV_D140) {
		IND_NAV_D140 = iND_NAV_D140;
	}

	public int getVIAGEM_D140() {
		return VIAGEM_D140;
	}

	public void setVIAGEM_D140(int vIAGEM_D140) {
		VIAGEM_D140 = vIAGEM_D140;
	}

	public float getVL_FRT_LIQ_D140() {
		return VL_FRT_LIQ_D140;
	}

	public void setVL_FRT_LIQ_D140(float vL_FRT_LIQ_D140) {
		VL_FRT_LIQ_D140 = vL_FRT_LIQ_D140;
	}

	public float getVL_DESP_PORT_D140() {
		return VL_DESP_PORT_D140;
	}

	public void setVL_DESP_PORT_D140(float vL_DESP_PORT_D140) {
		VL_DESP_PORT_D140 = vL_DESP_PORT_D140;
	}

	public float getVL_DESP_CAR_DESC_D140() {
		return VL_DESP_CAR_DESC_D140;
	}

	public void setVL_DESP_CAR_DESC_D140(float vL_DESP_CAR_DESC_D140) {
		VL_DESP_CAR_DESC_D140 = vL_DESP_CAR_DESC_D140;
	}

	public float getVL_OUT_D140() {
		return VL_OUT_D140;
	}

	public void setVL_OUT_D140(float vL_OUT_D140) {
		VL_OUT_D140 = vL_OUT_D140;
	}

	public float getVL_FRT_BRT_D140() {
		return VL_FRT_BRT_D140;
	}

	public void setVL_FRT_BRT_D140(float vL_FRT_BRT_D140) {
		VL_FRT_BRT_D140 = vL_FRT_BRT_D140;
	}

	public float getVL_FRT_MM_D140() {
		return VL_FRT_MM_D140;
	}

	public void setVL_FRT_MM_D140(float vL_FRT_MM_D140) {
		VL_FRT_MM_D140 = vL_FRT_MM_D140;
	}

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D140() {
	}

	public D140(List<String> strs1) {
		this.setREG_D140(strs1.get(0));
		this.setCOD_PART_CONSG_D140(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCOD_MUN_ORIG_D140(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCOD_MUN_DEST_D140(Integer.parseInt(strs1.get(3)));
		this.setIND_VEIC_D140(strs1.get(4));
		this.setVEIC_ID_D140(strs1.get(5));
		this.setIND_NAV_D140(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVIAGEM_D140(Integer.parseInt(strs1.get(7)));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_FRT_LIQ_D140(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_DESP_PORT_D140(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_DESP_CAR_DESC_D140(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_OUT_D140(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_FRT_BRT_D140(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_FRT_MM_D140(Float.parseFloat(strs1.get(13).replace(",", ".")));
	}

}
