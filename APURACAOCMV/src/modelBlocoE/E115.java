package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E115 {

	String REG_E115, COD_INF_ADIC_E115;
	float VL_INF_ADIC_E115;
	String DESCR_COMPL_AJ_E115;
	E110 e110;

	public String getREG_E115() {
		return REG_E115;
	}

	public void setREG_E115(String rEG_E115) {
		REG_E115 = rEG_E115;
	}

	public String getCOD_INF_ADIC_E115() {
		return COD_INF_ADIC_E115;
	}

	public void setCOD_INF_ADIC_E115(String cOD_INF_ADIC_E115) {
		COD_INF_ADIC_E115 = cOD_INF_ADIC_E115;
	}

	public float getVL_INF_ADIC_E115() {
		return VL_INF_ADIC_E115;
	}

	public void setVL_INF_ADIC_E115(float vL_INF_ADIC_E115) {
		VL_INF_ADIC_E115 = vL_INF_ADIC_E115;
	}

	public String getDESCR_COMPL_AJ_E115() {
		return DESCR_COMPL_AJ_E115;
	}

	public void setDESCR_COMPL_AJ_E115(String dESCR_COMPL_AJ_E115) {
		DESCR_COMPL_AJ_E115 = dESCR_COMPL_AJ_E115;
	}
	
	

	public E110 getE110() {
		return e110;
	}

	public void setE110(E110 e110) {
		this.e110 = e110;
	}

	public E115() {
	}

	public E115(List<String> strs1) {
		this.setREG_E115(strs1.get(0));
		this.setCOD_INF_ADIC_E115(strs1.get(1));
		this.setVL_INF_ADIC_E115(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setDESCR_COMPL_AJ_E115(strs1.get(3));
	}

}
