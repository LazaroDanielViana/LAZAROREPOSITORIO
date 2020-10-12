package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

import modelBlocoD.D101;

public class E110 {
	String REG_E110;
	float VL_TOT_DEBITOS_E110, VL_AJ_DEBITOS_E110, VL_TOT_AJ_DEBITOS_E110, VL_ESTORNOS_CRED_E110, VL_TOT_CREDITOS_E110,
			VL_AJ_CREDITOS_E110, VL_TOT_AJ_CREDITOS_E110, VL_ESTORNOS_DEB_E110, VL_SLD_CREDOR_ANT_E110,
			VL_SLD_APURADO_E110, VL_TOT_DED_E110, VL_ICMS_RECOLHER_E110, VL_SLD_CREDOR_TRANSPORTAR_E110, DEB_ESP_E110;
	
	E100 e100;
	
	ArrayList<E111> listE111;
	ArrayList<E115> listE115;
	ArrayList<E116> listE116;

	public String getREG_E110() {
		return REG_E110;
	}

	public void setREG_E110(String rEG_E110) {
		REG_E110 = rEG_E110;
	}

	public float getVL_TOT_DEBITOS_E110() {
		return VL_TOT_DEBITOS_E110;
	}

	public void setVL_TOT_DEBITOS_E110(float vL_TOT_DEBITOS_E110) {
		VL_TOT_DEBITOS_E110 = vL_TOT_DEBITOS_E110;
	}

	public float getVL_AJ_DEBITOS_E110() {
		return VL_AJ_DEBITOS_E110;
	}

	public void setVL_AJ_DEBITOS_E110(float vL_AJ_DEBITOS_E110) {
		VL_AJ_DEBITOS_E110 = vL_AJ_DEBITOS_E110;
	}

	public float getVL_TOT_AJ_DEBITOS_E110() {
		return VL_TOT_AJ_DEBITOS_E110;
	}

	public void setVL_TOT_AJ_DEBITOS_E110(float vL_TOT_AJ_DEBITOS_E110) {
		VL_TOT_AJ_DEBITOS_E110 = vL_TOT_AJ_DEBITOS_E110;
	}

	public float getVL_ESTORNOS_CRED_E110() {
		return VL_ESTORNOS_CRED_E110;
	}

	public void setVL_ESTORNOS_CRED_E110(float vL_ESTORNOS_CRED_E110) {
		VL_ESTORNOS_CRED_E110 = vL_ESTORNOS_CRED_E110;
	}

	public float getVL_TOT_CREDITOS_E110() {
		return VL_TOT_CREDITOS_E110;
	}

	public void setVL_TOT_CREDITOS_E110(float vL_TOT_CREDITOS_E110) {
		VL_TOT_CREDITOS_E110 = vL_TOT_CREDITOS_E110;
	}

	public float getVL_AJ_CREDITOS_E110() {
		return VL_AJ_CREDITOS_E110;
	}

	public void setVL_AJ_CREDITOS_E110(float vL_AJ_CREDITOS_E110) {
		VL_AJ_CREDITOS_E110 = vL_AJ_CREDITOS_E110;
	}

	public float getVL_TOT_AJ_CREDITOS_E110() {
		return VL_TOT_AJ_CREDITOS_E110;
	}

	public void setVL_TOT_AJ_CREDITOS_E110(float vL_TOT_AJ_CREDITOS_E110) {
		VL_TOT_AJ_CREDITOS_E110 = vL_TOT_AJ_CREDITOS_E110;
	}

	public float getVL_ESTORNOS_DEB_E110() {
		return VL_ESTORNOS_DEB_E110;
	}

	public void setVL_ESTORNOS_DEB_E110(float vL_ESTORNOS_DEB_E110) {
		VL_ESTORNOS_DEB_E110 = vL_ESTORNOS_DEB_E110;
	}

	public float getVL_SLD_CREDOR_ANT_E110() {
		return VL_SLD_CREDOR_ANT_E110;
	}

	public void setVL_SLD_CREDOR_ANT_E110(float vL_SLD_CREDOR_ANT_E110) {
		VL_SLD_CREDOR_ANT_E110 = vL_SLD_CREDOR_ANT_E110;
	}

	public float getVL_SLD_APURADO_E110() {
		return VL_SLD_APURADO_E110;
	}

	public void setVL_SLD_APURADO_E110(float vL_SLD_APURADO_E110) {
		VL_SLD_APURADO_E110 = vL_SLD_APURADO_E110;
	}

	public float getVL_TOT_DED_E110() {
		return VL_TOT_DED_E110;
	}

	public void setVL_TOT_DED_E110(float vL_TOT_DED_E110) {
		VL_TOT_DED_E110 = vL_TOT_DED_E110;
	}

	public float getVL_ICMS_RECOLHER_E110() {
		return VL_ICMS_RECOLHER_E110;
	}

	public void setVL_ICMS_RECOLHER_E110(float vL_ICMS_RECOLHER_E110) {
		VL_ICMS_RECOLHER_E110 = vL_ICMS_RECOLHER_E110;
	}

	public float getVL_SLD_CREDOR_TRANSPORTAR_E110() {
		return VL_SLD_CREDOR_TRANSPORTAR_E110;
	}

	public void setVL_SLD_CREDOR_TRANSPORTAR_E110(float vL_SLD_CREDOR_TRANSPORTAR_E110) {
		VL_SLD_CREDOR_TRANSPORTAR_E110 = vL_SLD_CREDOR_TRANSPORTAR_E110;
	}

	public float getDEB_ESP_E110() {
		return DEB_ESP_E110;
	}

	public void setDEB_ESP_E110(float dEB_ESP_E110) {
		DEB_ESP_E110 = dEB_ESP_E110;
	}
	
	public E100 getE100() {
		return e100;
	}

	public void setE100(E100 e100) {
		this.e100 = e100;
	}

	public ArrayList<E111> getListE111() {
		return listE111;
	}

	public void setListE111(ArrayList<E111> listE111) {
		this.listE111 = listE111;
	}

	public ArrayList<E115> getListE115() {
		return listE115;
	}

	public void setListE115(ArrayList<E115> listE115) {
		this.listE115 = listE115;
	}

	public ArrayList<E116> getListE116() {
		return listE116;
	}

	public void setListE116(ArrayList<E116> listE116) {
		this.listE116 = listE116;
	}

	public E110() {
	}

	public E110(List<String> strs1) {
		this.setREG_E110(strs1.get(0));
		this.setVL_TOT_DEBITOS_E110(Float.parseFloat(strs1.get(1).replace(",", ".")));
		this.setVL_AJ_DEBITOS_E110(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setVL_TOT_AJ_DEBITOS_E110(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_ESTORNOS_CRED_E110(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_TOT_CREDITOS_E110(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_AJ_CREDITOS_E110(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setVL_TOT_AJ_CREDITOS_E110(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_ESTORNOS_DEB_E110(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_SLD_CREDOR_ANT_E110(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setVL_SLD_APURADO_E110(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setVL_TOT_DED_E110(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVL_ICMS_RECOLHER_E110(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setVL_SLD_CREDOR_TRANSPORTAR_E110(Float.parseFloat(strs1.get(13).replace(",", ".")));
		this.setDEB_ESP_E110(Float.parseFloat(strs1.get(14).replace(",", ".")));
	}

}
