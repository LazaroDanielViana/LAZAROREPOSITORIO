package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D110 {
	String REG_D110;
	int NUM_ITEM_D110;
	String COD_ITEM_D110;
	float VL_SERV_D110, VL_OUT_D110;
	
	D100 d100;
	ArrayList<D120> listD120 = new ArrayList<>();

	public String getREG_D110() {
		return REG_D110;
	}

	public void setREG_D110(String rEG_D110) {
		REG_D110 = rEG_D110;
	}

	public int getNUM_ITEM_D110() {
		return NUM_ITEM_D110;
	}

	public void setNUM_ITEM_D110(int nUM_ITEM_D110) {
		NUM_ITEM_D110 = nUM_ITEM_D110;
	}

	public String getCOD_ITEM_D110() {
		return COD_ITEM_D110;
	}

	public void setCOD_ITEM_D110(String cOD_ITEM_D110) {
		COD_ITEM_D110 = cOD_ITEM_D110;
	}

	public float getVL_SERV_D110() {
		return VL_SERV_D110;
	}

	public void setVL_SERV_D110(float vL_SERV_D110) {
		VL_SERV_D110 = vL_SERV_D110;
	}

	public float getVL_OUT_D110() {
		return VL_OUT_D110;
	}

	public void setVL_OUT_D110(float vL_OUT_D110) {
		VL_OUT_D110 = vL_OUT_D110;
	}
	
	
		

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public ArrayList<D120> getListD120() {
		return listD120;
	}

	public void setListD120(ArrayList<D120> listD120) {
		this.listD120 = listD120;
	}

	public ArrayList<D120> getListD110() {
		return listD120;
	}

	public void setListD110(ArrayList<D120> listD120) {
		this.listD120 = listD120;
	}

	public D110(){}
	public D110(List<String> strs1) {
	this.setREG_D110(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setNUM_ITEM_D110(Integer.parseInt(strs1.get(1)));
	this.setCOD_ITEM_D110(strs1.get(2));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_SERV_D110(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_OUT_D110(Float.parseFloat(strs1.get(4).replace(",",".")));
	}
	

}
