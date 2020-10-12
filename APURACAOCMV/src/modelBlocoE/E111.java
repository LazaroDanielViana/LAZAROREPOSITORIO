package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E111 {
	String REG_E111, COD_AJ_APUR_E111, DESCR_COMPL_AJ_E111;
	float VL_AJ_APUR_E111;
	
	E110 e110;
	
	ArrayList<E112> listE112 = new ArrayList<>();
	ArrayList<E113> listE113 = new ArrayList<>();
	

	public String getREG_E111() {
		return REG_E111;
	}

	public void setREG_E111(String rEG_E111) {
		REG_E111 = rEG_E111;
	}

	public String getCOD_AJ_APUR_E111() {
		return COD_AJ_APUR_E111;
	}

	public void setCOD_AJ_APUR_E111(String cOD_AJ_APUR_E111) {
		COD_AJ_APUR_E111 = cOD_AJ_APUR_E111;
	}

	public String getDESCR_COMPL_AJ_E111() {
		return DESCR_COMPL_AJ_E111;
	}

	public void setDESCR_COMPL_AJ_E111(String dESCR_COMPL_AJ_E111) {
		DESCR_COMPL_AJ_E111 = dESCR_COMPL_AJ_E111;
	}

	public float getVL_AJ_APUR_E111() {
		return VL_AJ_APUR_E111;
	}

	public void setVL_AJ_APUR_E111(float vL_AJ_APUR_E111) {
		this.VL_AJ_APUR_E111 = vL_AJ_APUR_E111;
	}

	
	public E110 getE110() {
		return e110;
	}

	public void setE110(E110 e110) {
		this.e110 = e110;
	}

	public ArrayList<E112> getListE112() {
		return listE112;
	}

	public void setListE112(ArrayList<E112> listE112) {
		this.listE112 = listE112;
	}

	public ArrayList<E113> getListE113() {
		return listE113;
	}

	public void setListE113(ArrayList<E113> listE113) {
		this.listE113 = listE113;
	}

	
	public E111() {
	}

	public E111(List<String> strs1) {
		this.setREG_E111(strs1.get(0));
		this.setCOD_AJ_APUR_E111(strs1.get(1));
		this.setDESCR_COMPL_AJ_E111(strs1.get(2));
		if (strs1.get(3).length() >= 1)
			this.setVL_AJ_APUR_E111(Float.parseFloat(strs1.get(3).replace(",", ".")));
	}

}
