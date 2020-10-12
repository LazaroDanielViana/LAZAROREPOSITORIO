package modelBlocoD;

import java.util.ArrayList;

public class D696 {

	String REG_D696;
	int CST_ICMS_D696, CFOP_D696;
	float ALIQ_ICMS_D696, VL_OPR_D696, VL_BC_ICMS_D696, VL_ICMS_D696, VL_BC_ICMS_UF_D696, VL_ICMS_UF_D696,
			VL_RED_BC_D696;
	String COD_OBS_D696;
	
	D695 d695;
	
	ArrayList<D697> listD697 = new ArrayList<>();

	public String getREG_D696() {
		return REG_D696;
	}

	public void setREG_D696(String rEG_D696) {
		REG_D696 = rEG_D696;
	}

	public int getCST_ICMS_D696() {
		return CST_ICMS_D696;
	}

	public void setCST_ICMS_D696(int cST_ICMS_D696) {
		CST_ICMS_D696 = cST_ICMS_D696;
	}

	public int getCFOP_D696() {
		return CFOP_D696;
	}

	public void setCFOP_D696(int cFOP_D696) {
		CFOP_D696 = cFOP_D696;
	}

	public float getALIQ_ICMS_D696() {
		return ALIQ_ICMS_D696;
	}

	public void setALIQ_ICMS_D696(float aLIQ_ICMS_D696) {
		ALIQ_ICMS_D696 = aLIQ_ICMS_D696;
	}

	public float getVL_OPR_D696() {
		return VL_OPR_D696;
	}

	public void setVL_OPR_D696(float vL_OPR_D696) {
		VL_OPR_D696 = vL_OPR_D696;
	}

	public float getVL_BC_ICMS_D696() {
		return VL_BC_ICMS_D696;
	}

	public void setVL_BC_ICMS_D696(float vL_BC_ICMS_D696) {
		VL_BC_ICMS_D696 = vL_BC_ICMS_D696;
	}

	public float getVL_ICMS_D696() {
		return VL_ICMS_D696;
	}

	public void setVL_ICMS_D696(float vL_ICMS_D696) {
		VL_ICMS_D696 = vL_ICMS_D696;
	}

	public float getVL_BC_ICMS_UF_D696() {
		return VL_BC_ICMS_UF_D696;
	}

	public void setVL_BC_ICMS_UF_D696(float vL_BC_ICMS_UF_D696) {
		VL_BC_ICMS_UF_D696 = vL_BC_ICMS_UF_D696;
	}

	public float getVL_ICMS_UF_D696() {
		return VL_ICMS_UF_D696;
	}

	public void setVL_ICMS_UF_D696(float vL_ICMS_UF_D696) {
		VL_ICMS_UF_D696 = vL_ICMS_UF_D696;
	}

	public float getVL_RED_BC_D696() {
		return VL_RED_BC_D696;
	}

	public void setVL_RED_BC_D696(float vL_RED_BC_D696) {
		VL_RED_BC_D696 = vL_RED_BC_D696;
	}

	public String getCOD_OBS_D696() {
		return COD_OBS_D696;
	}

	public void setCOD_OBS_D696(String cOD_OBS_D696) {
		COD_OBS_D696 = cOD_OBS_D696;
	}
	
	

	public ArrayList<D697> getListD697() {
		return listD697;
	}

	public void setListD697(ArrayList<D697> listD697) {
		this.listD697 = listD697;
	}
	
	

	public D695 getD695() {
		return d695;
	}

	public void setD695(D695 d695) {
		this.d695 = d695;
	}

	public D696() {
	}

	public D696(ArrayList<String> strs1) {
		this.setREG_D696(strs1.get(0));
		this.setCST_ICMS_D696(Integer.parseInt(strs1.get(1)));
		this.setCFOP_D696(Integer.parseInt(strs1.get(2)));
		this.setALIQ_ICMS_D696(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_OPR_D696(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_BC_ICMS_D696(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_ICMS_D696(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setVL_BC_ICMS_UF_D696(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_ICMS_UF_D696(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_RED_BC_D696(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setCOD_OBS_D696(strs1.get(10));
	}

}
