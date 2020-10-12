package modelBlocoD;

import java.util.ArrayList;

public class D690 {
	String REG_D690;
	int CST_ICMS_D690, CFOP_D690;
	float ALIQ_ICMS_D690, VL_OPR_D690, VL_BC_ICMS_D690, VL_ICMS_D690, VL_BC_ICMS_UF_D690, VL_ICMS_UF_D690,
			VL_RED_BC_D690;
	String COD_OBS_D690;
	
	D600 d600;

	public String getREG_D690() {
		return REG_D690;
	}

	public void setREG_D690(String rEG_D690) {
		REG_D690 = rEG_D690;
	}

	public int getCST_ICMS_D690() {
		return CST_ICMS_D690;
	}

	public void setCST_ICMS_D690(int cST_ICMS_D690) {
		CST_ICMS_D690 = cST_ICMS_D690;
	}

	public int getCFOP_D690() {
		return CFOP_D690;
	}

	public void setCFOP_D690(int cFOP_D690) {
		CFOP_D690 = cFOP_D690;
	}

	public float getALIQ_ICMS_D690() {
		return ALIQ_ICMS_D690;
	}

	public void setALIQ_ICMS_D690(float aLIQ_ICMS_D690) {
		ALIQ_ICMS_D690 = aLIQ_ICMS_D690;
	}

	public float getVL_OPR_D690() {
		return VL_OPR_D690;
	}

	public void setVL_OPR_D690(float vL_OPR_D690) {
		VL_OPR_D690 = vL_OPR_D690;
	}

	public float getVL_BC_ICMS_D690() {
		return VL_BC_ICMS_D690;
	}

	public void setVL_BC_ICMS_D690(float vL_BC_ICMS_D690) {
		VL_BC_ICMS_D690 = vL_BC_ICMS_D690;
	}

	public float getVL_ICMS_D690() {
		return VL_ICMS_D690;
	}

	public void setVL_ICMS_D690(float vL_ICMS_D690) {
		VL_ICMS_D690 = vL_ICMS_D690;
	}

	public float getVL_BC_ICMS_UF_D690() {
		return VL_BC_ICMS_UF_D690;
	}

	public void setVL_BC_ICMS_UF_D690(float vL_BC_ICMS_UF_D690) {
		VL_BC_ICMS_UF_D690 = vL_BC_ICMS_UF_D690;
	}

	public float getVL_ICMS_UF_D690() {
		return VL_ICMS_UF_D690;
	}

	public void setVL_ICMS_UF_D690(float vL_ICMS_UF_D690) {
		VL_ICMS_UF_D690 = vL_ICMS_UF_D690;
	}

	public float getVL_RED_BC_D690() {
		return VL_RED_BC_D690;
	}

	public void setVL_RED_BC_D690(float vL_RED_BC_D690) {
		VL_RED_BC_D690 = vL_RED_BC_D690;
	}

	public String getCOD_OBS_D690() {
		return COD_OBS_D690;
	}

	public void setCOD_OBS_D690(String cOD_OBS_D690) {
		COD_OBS_D690 = cOD_OBS_D690;
	}
	
	

	public D600 getD600() {
		return d600;
	}

	public void setD600(D600 d600) {
		this.d600 = d600;
	}

	public D690() {
	}

	public D690(ArrayList<String> strs1) {
		this.setREG_D690(strs1.get(0));
		this.setCST_ICMS_D690(Integer.parseInt(strs1.get(1)));
		this.setCFOP_D690(Integer.parseInt(strs1.get(2)));
		this.setALIQ_ICMS_D690(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_OPR_D690(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_BC_ICMS_D690(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_ICMS_D690(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setVL_BC_ICMS_UF_D690(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_ICMS_UF_D690(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_RED_BC_D690(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setCOD_OBS_D690(strs1.get(10));
	}
	

}
