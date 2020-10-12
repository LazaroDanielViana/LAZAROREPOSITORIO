package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D170 {
	String REG_D170, COD_PART_CONSG_D170, COD_PART_RED_D170;
	int COD_MUN_ORIG_D170, COD_MUN_DEST_D170;
	String OTM_D170, IND_NAT_FRT_D170;
	float VL_LIQ_FRT_D170, VL_GRIS_D170, VL_PDG_D170, VL_OUT_D170, VL_FRT_D170;
	String VEIC_ID_D170, UF_ID_D170;
	
	D100 d100;

	public String getREG_D170() {
		return REG_D170;
	}

	public void setREG_D170(String rEG_D170) {
		REG_D170 = rEG_D170;
	}

	public String getCOD_PART_CONSG_D170() {
		return COD_PART_CONSG_D170;
	}

	public void setCOD_PART_CONSG_D170(String cOD_PART_CONSG_D170) {
		COD_PART_CONSG_D170 = cOD_PART_CONSG_D170;
	}

	public String getCOD_PART_RED_D170() {
		return COD_PART_RED_D170;
	}

	public void setCOD_PART_RED_D170(String cOD_PART_RED_D170) {
		COD_PART_RED_D170 = cOD_PART_RED_D170;
	}

	public int getCOD_MUN_ORIG_D170() {
		return COD_MUN_ORIG_D170;
	}

	public void setCOD_MUN_ORIG_D170(int cOD_MUN_ORIG_D170) {
		COD_MUN_ORIG_D170 = cOD_MUN_ORIG_D170;
	}

	public int getCOD_MUN_DEST_D170() {
		return COD_MUN_DEST_D170;
	}

	public void setCOD_MUN_DEST_D170(int cOD_MUN_DEST_D170) {
		COD_MUN_DEST_D170 = cOD_MUN_DEST_D170;
	}

	public String getOTM_D170() {
		return OTM_D170;
	}

	public void setOTM_D170(String oTM_D170) {
		OTM_D170 = oTM_D170;
	}

	public String getIND_NAT_FRT_D170() {
		return IND_NAT_FRT_D170;
	}

	public void setIND_NAT_FRT_D170(String iND_NAT_FRT_D170) {
		IND_NAT_FRT_D170 = iND_NAT_FRT_D170;
	}

	public float getVL_LIQ_FRT_D170() {
		return VL_LIQ_FRT_D170;
	}

	public void setVL_LIQ_FRT_D170(float vL_LIQ_FRT_D170) {
		VL_LIQ_FRT_D170 = vL_LIQ_FRT_D170;
	}

	public float getVL_GRIS_D170() {
		return VL_GRIS_D170;
	}

	public void setVL_GRIS_D170(float vL_GRIS_D170) {
		VL_GRIS_D170 = vL_GRIS_D170;
	}

	public float getVL_PDG_D170() {
		return VL_PDG_D170;
	}

	public void setVL_PDG_D170(float vL_PDG_D170) {
		VL_PDG_D170 = vL_PDG_D170;
	}

	public float getVL_OUT_D170() {
		return VL_OUT_D170;
	}

	public void setVL_OUT_D170(float vL_OUT_D170) {
		VL_OUT_D170 = vL_OUT_D170;
	}

	public float getVL_FRT_D170() {
		return VL_FRT_D170;
	}

	public void setVL_FRT_D170(float vL_FRT_D170) {
		VL_FRT_D170 = vL_FRT_D170;
	}

	public String getVEIC_ID_D170() {
		return VEIC_ID_D170;
	}

	public void setVEIC_ID_D170(String vEIC_ID_D170) {
		VEIC_ID_D170 = vEIC_ID_D170;
	}

	public String getUF_ID_D170() {
		return UF_ID_D170;
	}

	public void setUF_ID_D170(String uF_ID_D170) {
		UF_ID_D170 = uF_ID_D170;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D170() {
	}

	public D170(ArrayList<String> strs1) {
		this.setREG_D170(strs1.get(0));
		this.setCOD_PART_CONSG_D170(strs1.get(1));
		this.setCOD_PART_RED_D170(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setCOD_MUN_ORIG_D170(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setCOD_MUN_DEST_D170(Integer.parseInt(strs1.get(4)));
		this.setOTM_D170(strs1.get(5));
		this.setIND_NAT_FRT_D170(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_LIQ_FRT_D170(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_GRIS_D170(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_PDG_D170(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_OUT_D170(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_FRT_D170(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVEIC_ID_D170(strs1.get(12));
		this.setUF_ID_D170(strs1.get(13));
	}

}
