package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D130 {

	String REG_D130, COD_PART_CONSG_D130, COD_PART_RED_D130, IND_FRT_RED_D130;
	int COD_MUN_ORIG_D130, COD_MUN_DEST_D130;
	String VEIC_ID_D130;
	float VL_LIQ_FRT_D130, VL_SEC_CAT_D130, VL_DESP_D130, VL_PEDG_D130, VL_OUT_D130, VL_FRT_D130;
	String UF_ID_D130;
	D100 d100;

	public String getREG_D130() {
		return REG_D130;
	}

	public void setREG_D130(String rEG_D130) {
		REG_D130 = rEG_D130;
	}

	public String getCOD_PART_CONSG_D130() {
		return COD_PART_CONSG_D130;
	}

	public void setCOD_PART_CONSG_D130(String cOD_PART_CONSG_D130) {
		COD_PART_CONSG_D130 = cOD_PART_CONSG_D130;
	}

	public String getCOD_PART_RED_D130() {
		return COD_PART_RED_D130;
	}

	public void setCOD_PART_RED_D130(String cOD_PART_RED_D130) {
		COD_PART_RED_D130 = cOD_PART_RED_D130;
	}

	public String getIND_FRT_RED_D130() {
		return IND_FRT_RED_D130;
	}

	public void setIND_FRT_RED_D130(String iND_FRT_RED_D130) {
		IND_FRT_RED_D130 = iND_FRT_RED_D130;
	}

	public int getCOD_MUN_ORIG_D130() {
		return COD_MUN_ORIG_D130;
	}

	public void setCOD_MUN_ORIG_D130(int cOD_MUN_ORIG_D130) {
		COD_MUN_ORIG_D130 = cOD_MUN_ORIG_D130;
	}

	public int getCOD_MUN_DEST_D130() {
		return COD_MUN_DEST_D130;
	}

	public void setCOD_MUN_DEST_D130(int cOD_MUN_DEST_D130) {
		COD_MUN_DEST_D130 = cOD_MUN_DEST_D130;
	}

	public String getVEIC_ID_D130() {
		return VEIC_ID_D130;
	}

	public void setVEIC_ID_D130(String vEIC_ID_D130) {
		VEIC_ID_D130 = vEIC_ID_D130;
	}

	public float getVL_LIQ_FRT_D130() {
		return VL_LIQ_FRT_D130;
	}

	public void setVL_LIQ_FRT_D130(float vL_LIQ_FRT_D130) {
		VL_LIQ_FRT_D130 = vL_LIQ_FRT_D130;
	}

	public float getVL_SEC_CAT_D130() {
		return VL_SEC_CAT_D130;
	}

	public void setVL_SEC_CAT_D130(float vL_SEC_CAT_D130) {
		VL_SEC_CAT_D130 = vL_SEC_CAT_D130;
	}

	public float getVL_DESP_D130() {
		return VL_DESP_D130;
	}

	public void setVL_DESP_D130(float vL_DESP_D130) {
		VL_DESP_D130 = vL_DESP_D130;
	}

	public float getVL_PEDG_D130() {
		return VL_PEDG_D130;
	}

	public void setVL_PEDG_D130(float vL_PEDG_D130) {
		VL_PEDG_D130 = vL_PEDG_D130;
	}

	public float getVL_OUT_D130() {
		return VL_OUT_D130;
	}

	public void setVL_OUT_D130(float vL_OUT_D130) {
		VL_OUT_D130 = vL_OUT_D130;
	}

	public float getVL_FRT_D130() {
		return VL_FRT_D130;
	}

	public void setVL_FRT_D130(float vL_FRT_D130) {
		VL_FRT_D130 = vL_FRT_D130;
	}

	public String getUF_ID_D130() {
		return UF_ID_D130;
	}

	public void setUF_ID_D130(String uF_ID_D130) {
		UF_ID_D130 = uF_ID_D130;
	}

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D130() {
	}

	public D130(List<String> strs1) {
		this.setREG_D130(strs1.get(0));
		this.setCOD_PART_CONSG_D130(strs1.get(1));
		this.setCOD_PART_RED_D130(strs1.get(2));
		this.setIND_FRT_RED_D130(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setCOD_MUN_ORIG_D130(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setCOD_MUN_DEST_D130(Integer.parseInt(strs1.get(5)));
		this.setVEIC_ID_D130(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_LIQ_FRT_D130(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_SEC_CAT_D130(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_DESP_D130(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_PEDG_D130(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_OUT_D130(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_FRT_D130(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setUF_ID_D130(strs1.get(13));
	}

}
