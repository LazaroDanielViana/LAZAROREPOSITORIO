package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E210 {
	String REG_E210, IND_MOV_ST_E210;
	float VL_SLD_CRED_ANT_ST_E210, VL_DEVOL_ST_E210, VL_RESSARC_ST_E210, VL_OUT_CRED_ST_E210, VL_AJ_CREDITOS_ST_E210,
			VL_RETEN_E210, VL_OUT_DEB_ST_E210, VL_AJ_DEBITOS_ST_E210, VL_SLD_DEV_ANT_ST_E210, VL_DEDU_E210,
			VL_ICMS_RECOL_ST_E210, VL_SLD_CRED_ST_TRAN_E210, DEB_ESP_ST_E210;
	
	E200 e200;
	
	
	ArrayList<E220> listE220 = new ArrayList<>();
	ArrayList<E250> listE250 = new ArrayList<>();
	

	public String getREG_E210() {
		return REG_E210;
	}

	public void setREG_E210(String rEG_E210) {
		REG_E210 = rEG_E210;
	}

	public String getIND_MOV_ST_E210() {
		return IND_MOV_ST_E210;
	}

	public void setIND_MOV_ST_E210(String iND_MOV_ST_E210) {
		IND_MOV_ST_E210 = iND_MOV_ST_E210;
	}

	public float getVL_SLD_CRED_ANT_ST_E210() {
		return VL_SLD_CRED_ANT_ST_E210;
	}

	public void setVL_SLD_CRED_ANT_ST_E210(float vL_SLD_CRED_ANT_ST_E210) {
		VL_SLD_CRED_ANT_ST_E210 = vL_SLD_CRED_ANT_ST_E210;
	}

	public float getVL_DEVOL_ST_E210() {
		return VL_DEVOL_ST_E210;
	}

	public void setVL_DEVOL_ST_E210(float vL_DEVOL_ST_E210) {
		VL_DEVOL_ST_E210 = vL_DEVOL_ST_E210;
	}

	public float getVL_RESSARC_ST_E210() {
		return VL_RESSARC_ST_E210;
	}

	public void setVL_RESSARC_ST_E210(float vL_RESSARC_ST_E210) {
		VL_RESSARC_ST_E210 = vL_RESSARC_ST_E210;
	}

	public float getVL_OUT_CRED_ST_E210() {
		return VL_OUT_CRED_ST_E210;
	}

	public void setVL_OUT_CRED_ST_E210(float vL_OUT_CRED_ST_E210) {
		VL_OUT_CRED_ST_E210 = vL_OUT_CRED_ST_E210;
	}

	public float getVL_AJ_CREDITOS_ST_E210() {
		return VL_AJ_CREDITOS_ST_E210;
	}

	public void setVL_AJ_CREDITOS_ST_E210(float vL_AJ_CREDITOS_ST_E210) {
		VL_AJ_CREDITOS_ST_E210 = vL_AJ_CREDITOS_ST_E210;
	}

	public float getVL_RETEN_E210() {
		return VL_RETEN_E210;
	}

	public void setVL_RETEN_E210(float vL_RETEN_E210) {
		VL_RETEN_E210 = vL_RETEN_E210;
	}

	public float getVL_OUT_DEB_ST_E210() {
		return VL_OUT_DEB_ST_E210;
	}

	public void setVL_OUT_DEB_ST_E210(float vL_OUT_DEB_ST_E210) {
		VL_OUT_DEB_ST_E210 = vL_OUT_DEB_ST_E210;
	}

	public float getVL_AJ_DEBITOS_ST_E210() {
		return VL_AJ_DEBITOS_ST_E210;
	}

	public void setVL_AJ_DEBITOS_ST_E210(float vL_AJ_DEBITOS_ST_E210) {
		VL_AJ_DEBITOS_ST_E210 = vL_AJ_DEBITOS_ST_E210;
	}

	public float getVL_SLD_DEV_ANT_ST_E210() {
		return VL_SLD_DEV_ANT_ST_E210;
	}

	public void setVL_SLD_DEV_ANT_ST_E210(float vL_SLD_DEV_ANT_ST_E210) {
		VL_SLD_DEV_ANT_ST_E210 = vL_SLD_DEV_ANT_ST_E210;
	}

	public float getVL_DEDU_E210() {
		return VL_DEDU_E210;
	}

	public void setVL_DEDU_E210(float vL_DEDU_E210) {
		VL_DEDU_E210 = vL_DEDU_E210;
	}

	public float getVL_ICMS_RECOL_ST_E210() {
		return VL_ICMS_RECOL_ST_E210;
	}

	public void setVL_ICMS_RECOL_ST_E210(float vL_ICMS_RECOL_ST_E210) {
		VL_ICMS_RECOL_ST_E210 = vL_ICMS_RECOL_ST_E210;
	}

	public float getVL_SLD_CRED_ST_TRAN_E210() {
		return VL_SLD_CRED_ST_TRAN_E210;
	}

	public void setVL_SLD_CRED_ST_TRAN_E210(float vL_SLD_CRED_ST_TRAN_E210) {
		VL_SLD_CRED_ST_TRAN_E210 = vL_SLD_CRED_ST_TRAN_E210;
	}

	public float getDEB_ESP_ST_E210() {
		return DEB_ESP_ST_E210;
	}

	public void setDEB_ESP_ST_E210(float dEB_ESP_ST_E210) {
		DEB_ESP_ST_E210 = dEB_ESP_ST_E210;
	}
	
	
	

	public E200 getE200() {
		return e200;
	}

	public void setE200(E200 e200) {
		this.e200 = e200;
	}

	public ArrayList<E220> getListE220() {
		return listE220;
	}

	public void setListE220(ArrayList<E220> listE220) {
		this.listE220 = listE220;
	}

	public ArrayList<E250> getListE250() {
		return listE250;
	}

	public void setListE250(ArrayList<E250> listE250) {
		this.listE250 = listE250;
	}

	public E210() {
	}

	public E210(List<String> strs1) {
		this.setREG_E210(strs1.get(0));
		this.setIND_MOV_ST_E210(strs1.get(1));
		this.setVL_SLD_CRED_ANT_ST_E210(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setVL_DEVOL_ST_E210(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_RESSARC_ST_E210(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_OUT_CRED_ST_E210(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_AJ_CREDITOS_ST_E210(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setVL_RETEN_E210(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_OUT_DEB_ST_E210(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_AJ_DEBITOS_ST_E210(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setVL_SLD_DEV_ANT_ST_E210(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setVL_DEDU_E210(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVL_ICMS_RECOL_ST_E210(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setVL_SLD_CRED_ST_TRAN_E210(Float.parseFloat(strs1.get(13).replace(",", ".")));
		this.setDEB_ESP_ST_E210(Float.parseFloat(strs1.get(14).replace(",", ".")));
	}

}
