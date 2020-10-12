package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D150 {

	String REG_D150;
	int COD_MUN_ORIG_D150, COD_MUN_DEST_D150;
	String VEIC_ID_D150;
	int VIAGEM_D150;
	String IND_TFA_D150;
	float VL_PESO_TX_D150, VL_TX_TERR_D150, VL_TX_RED_D150, VL_OUT_D150, VL_TX_ADV_D150;
	
	D100 d100;

	public String getREG_D150() {
		return REG_D150;
	}

	public void setREG_D150(String rEG_D150) {
		REG_D150 = rEG_D150;
	}

	public int getCOD_MUN_ORIG_D150() {
		return COD_MUN_ORIG_D150;
	}

	public void setCOD_MUN_ORIG_D150(int cOD_MUN_ORIG_D150) {
		COD_MUN_ORIG_D150 = cOD_MUN_ORIG_D150;
	}

	public int getCOD_MUN_DEST_D150() {
		return COD_MUN_DEST_D150;
	}

	public void setCOD_MUN_DEST_D150(int cOD_MUN_DEST_D150) {
		COD_MUN_DEST_D150 = cOD_MUN_DEST_D150;
	}

	public String getVEIC_ID_D150() {
		return VEIC_ID_D150;
	}

	public void setVEIC_ID_D150(String vEIC_ID_D150) {
		VEIC_ID_D150 = vEIC_ID_D150;
	}

	public int getVIAGEM_D150() {
		return VIAGEM_D150;
	}

	public void setVIAGEM_D150(int vIAGEM_D150) {
		VIAGEM_D150 = vIAGEM_D150;
	}

	public String getIND_TFA_D150() {
		return IND_TFA_D150;
	}

	public void setIND_TFA_D150(String iND_TFA_D150) {
		IND_TFA_D150 = iND_TFA_D150;
	}

	public float getVL_PESO_TX_D150() {
		return VL_PESO_TX_D150;
	}

	public void setVL_PESO_TX_D150(float vL_PESO_TX_D150) {
		VL_PESO_TX_D150 = vL_PESO_TX_D150;
	}

	public float getVL_TX_TERR_D150() {
		return VL_TX_TERR_D150;
	}

	public void setVL_TX_TERR_D150(float vL_TX_TERR_D150) {
		VL_TX_TERR_D150 = vL_TX_TERR_D150;
	}

	public float getVL_TX_RED_D150() {
		return VL_TX_RED_D150;
	}

	public void setVL_TX_RED_D150(float vL_TX_RED_D150) {
		VL_TX_RED_D150 = vL_TX_RED_D150;
	}

	public float getVL_OUT_D150() {
		return VL_OUT_D150;
	}

	public void setVL_OUT_D150(float vL_OUT_D150) {
		VL_OUT_D150 = vL_OUT_D150;
	}

	public float getVL_TX_ADV_D150() {
		return VL_TX_ADV_D150;
	}

	public void setVL_TX_ADV_D150(float vL_TX_ADV_D150) {
		VL_TX_ADV_D150 = vL_TX_ADV_D150;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D150() {
	}

	public D150(List<String> strs1) {
		this.setREG_D150(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCOD_MUN_ORIG_D150(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCOD_MUN_DEST_D150(Integer.parseInt(strs1.get(2)));
		this.setVEIC_ID_D150(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVIAGEM_D150(Integer.parseInt(strs1.get(4)));
		this.setIND_TFA_D150(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_PESO_TX_D150(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_TX_TERR_D150(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setVL_TX_RED_D150(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_OUT_D150(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_TX_ADV_D150(Float.parseFloat(strs1.get(10).replace(",", ".")));
	}

}
