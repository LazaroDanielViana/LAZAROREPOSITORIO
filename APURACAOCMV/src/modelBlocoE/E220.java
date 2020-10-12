package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E220 {

	String REG_E220, COD_AJ_APUR_E220, DESCR_COMPL_AJ_E220;
	float VL_AJ_APUR_E220;
	E210 e210;
	
	ArrayList<E230> listE230 = new ArrayList<>();
	ArrayList<E240> listE240 = new ArrayList<>();

	public String getREG_E220() {
		return REG_E220;
	}

	public void setREG_E220(String rEG_E220) {
		REG_E220 = rEG_E220;
	}

	public String getCOD_AJ_APUR_E220() {
		return COD_AJ_APUR_E220;
	}

	public void setCOD_AJ_APUR_E220(String cOD_AJ_APUR_E220) {
		COD_AJ_APUR_E220 = cOD_AJ_APUR_E220;
	}

	public String getDESCR_COMPL_AJ_E220() {
		return DESCR_COMPL_AJ_E220;
	}

	public void setDESCR_COMPL_AJ_E220(String dESCR_COMPL_AJ_E220) {
		DESCR_COMPL_AJ_E220 = dESCR_COMPL_AJ_E220;
	}

	public float getVL_AJ_APUR_E220() {
		return VL_AJ_APUR_E220;
	}

	public void setVL_AJ_APUR_E220(float vL_AJ_APUR_E220) {
		VL_AJ_APUR_E220 = vL_AJ_APUR_E220;
	}
	
	

	public E210 getE210() {
		return e210;
	}

	public void setE210(E210 e210) {
		this.e210 = e210;
	}

	public ArrayList<E230> getListE230() {
		return listE230;
	}

	public void setListE230(ArrayList<E230> listE230) {
		this.listE230 = listE230;
	}

	public ArrayList<E240> getListE240() {
		return listE240;
	}

	public void setListE240(ArrayList<E240> listE240) {
		this.listE240 = listE240;
	}

	public E220() {
	}

	public E220(List<String> strs1) {
		this.setREG_E220(strs1.get(0));
		this.setCOD_AJ_APUR_E220(strs1.get(1));
		this.setDESCR_COMPL_AJ_E220(strs1.get(2));
		this.setVL_AJ_APUR_E220(Float.parseFloat(strs1.get(3).replace(",", ".")));
	}
	
	

}
