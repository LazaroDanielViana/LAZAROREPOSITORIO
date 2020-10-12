package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E311 {
	String REG_E311, COD_AJ_APUR_E311, DESCR_COMPL_AJ_E311;
	float VL_AJ_APUR_E311;
	
	E310 e310;
	
	ArrayList<E312> listE312 = new ArrayList<>();
	ArrayList<E313> listE313 = new ArrayList<>();

	public String getREG_E311() {
		return REG_E311;
	}

	public void setREG_E311(String rEG_E311) {
		REG_E311 = rEG_E311;
	}

	public String getCOD_AJ_APUR_E311() {
		return COD_AJ_APUR_E311;
	}

	public void setCOD_AJ_APUR_E311(String cOD_AJ_APUR_E311) {
		COD_AJ_APUR_E311 = cOD_AJ_APUR_E311;
	}

	public String getDESCR_COMPL_AJ_E311() {
		return DESCR_COMPL_AJ_E311;
	}

	public void setDESCR_COMPL_AJ_E311(String dESCR_COMPL_AJ_E311) {
		DESCR_COMPL_AJ_E311 = dESCR_COMPL_AJ_E311;
	}

	public float getVL_AJ_APUR_E311() {
		return VL_AJ_APUR_E311;
	}

	public void setVL_AJ_APUR_E311(float vL_AJ_APUR_E311) {
		VL_AJ_APUR_E311 = vL_AJ_APUR_E311;
	}	
	

	public E310 getE310() {
		return e310;
	}

	public void setE310(E310 e310) {
		this.e310 = e310;
	}

	public ArrayList<E312> getListE312() {
		return listE312;
	}

	public void setListE312(ArrayList<E312> listE312) {
		this.listE312 = listE312;
	}

	public ArrayList<E313> getListE313() {
		return listE313;
	}

	public void setListE313(ArrayList<E313> listE313) {
		this.listE313 = listE313;
	}

	public E311() {
	}

	public E311(List<String> strs1) {
		this.setREG_E311(strs1.get(0));
		this.setCOD_AJ_APUR_E311(strs1.get(1));
		this.setDESCR_COMPL_AJ_E311(strs1.get(2));
		this.setVL_AJ_APUR_E311(Float.parseFloat(strs1.get(3).replace(",", ".")));
	}

}
