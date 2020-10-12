package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E310 {
	// PADRÃO ATÉ 31/12/2016 APÓS MUDAR
	String REG_E310, IND_MOV_DIFAL_E310;
	float VL_SLD_CRED_ANT_DIFAL_E310, VL_TOT_DEBITOS_DIFAL_E310, VL_OUT_DEB_DIFAL_E310, VL_TOT_DEB_FCP_E310,
			VL_TOT_CREDITOS_DIFAL_E310, VL_TOT_CRED_FCP_E310, VL_OUT_CRED_DIFAL_E310, VL_SLD_DEV_ANT_DIFAL_E310,
			VL_DEDUCOES_DIFAL_E310, VL_RECOL_E310, VL_SLD_CRED_TRANSPORTAR_E310, DEB_ESP_DIFAL_E310;
	
	E300 e300;
	
	ArrayList<E311> listE311 = new ArrayList<>();
	ArrayList<E316> listE316 = new ArrayList<>();

	public String getREG_E310() {
		return REG_E310;
	}

	public void setREG_E310(String rEG_E310) {
		REG_E310 = rEG_E310;
	}

	public String getIND_MOV_DIFAL_E310() {
		return IND_MOV_DIFAL_E310;
	}

	public void setIND_MOV_DIFAL_E310(String iND_MOV_DIFAL_E310) {
		IND_MOV_DIFAL_E310 = iND_MOV_DIFAL_E310;
	}

	public float getVL_SLD_CRED_ANT_DIFAL_E310() {
		return VL_SLD_CRED_ANT_DIFAL_E310;
	}

	public void setVL_SLD_CRED_ANT_DIFAL_E310(float vL_SLD_CRED_ANT_DIFAL_E310) {
		VL_SLD_CRED_ANT_DIFAL_E310 = vL_SLD_CRED_ANT_DIFAL_E310;
	}

	public float getVL_TOT_DEBITOS_DIFAL_E310() {
		return VL_TOT_DEBITOS_DIFAL_E310;
	}

	public void setVL_TOT_DEBITOS_DIFAL_E310(float vL_TOT_DEBITOS_DIFAL_E310) {
		VL_TOT_DEBITOS_DIFAL_E310 = vL_TOT_DEBITOS_DIFAL_E310;
	}

	public float getVL_OUT_DEB_DIFAL_E310() {
		return VL_OUT_DEB_DIFAL_E310;
	}

	public void setVL_OUT_DEB_DIFAL_E310(float vL_OUT_DEB_DIFAL_E310) {
		VL_OUT_DEB_DIFAL_E310 = vL_OUT_DEB_DIFAL_E310;
	}

	public float getVL_TOT_DEB_FCP_E310() {
		return VL_TOT_DEB_FCP_E310;
	}

	public void setVL_TOT_DEB_FCP_E310(float vL_TOT_DEB_FCP_E310) {
		VL_TOT_DEB_FCP_E310 = vL_TOT_DEB_FCP_E310;
	}

	public float getVL_TOT_CREDITOS_DIFAL_E310() {
		return VL_TOT_CREDITOS_DIFAL_E310;
	}

	public void setVL_TOT_CREDITOS_DIFAL_E310(float vL_TOT_CREDITOS_DIFAL_E310) {
		VL_TOT_CREDITOS_DIFAL_E310 = vL_TOT_CREDITOS_DIFAL_E310;
	}

	public float getVL_TOT_CRED_FCP_E310() {
		return VL_TOT_CRED_FCP_E310;
	}

	public void setVL_TOT_CRED_FCP_E310(float vL_TOT_CRED_FCP_E310) {
		VL_TOT_CRED_FCP_E310 = vL_TOT_CRED_FCP_E310;
	}

	public float getVL_OUT_CRED_DIFAL_E310() {
		return VL_OUT_CRED_DIFAL_E310;
	}

	public void setVL_OUT_CRED_DIFAL_E310(float vL_OUT_CRED_DIFAL_E310) {
		VL_OUT_CRED_DIFAL_E310 = vL_OUT_CRED_DIFAL_E310;
	}

	public float getVL_SLD_DEV_ANT_DIFAL_E310() {
		return VL_SLD_DEV_ANT_DIFAL_E310;
	}

	public void setVL_SLD_DEV_ANT_DIFAL_E310(float vL_SLD_DEV_ANT_DIFAL_E310) {
		VL_SLD_DEV_ANT_DIFAL_E310 = vL_SLD_DEV_ANT_DIFAL_E310;
	}

	public float getVL_DEDUCOES_DIFAL_E310() {
		return VL_DEDUCOES_DIFAL_E310;
	}

	public void setVL_DEDUCOES_DIFAL_E310(float vL_DEDUCOES_DIFAL_E310) {
		VL_DEDUCOES_DIFAL_E310 = vL_DEDUCOES_DIFAL_E310;
	}

	public float getVL_RECOL_E310() {
		return VL_RECOL_E310;
	}

	public void setVL_RECOL_E310(float vL_RECOL_E310) {
		VL_RECOL_E310 = vL_RECOL_E310;
	}

	public float getVL_SLD_CRED_TRANSPORTAR_E310() {
		return VL_SLD_CRED_TRANSPORTAR_E310;
	}

	public void setVL_SLD_CRED_TRANSPORTAR_E310(float vL_SLD_CRED_TRANSPORTAR_E310) {
		VL_SLD_CRED_TRANSPORTAR_E310 = vL_SLD_CRED_TRANSPORTAR_E310;
	}

	public float getDEB_ESP_DIFAL_E310() {
		return DEB_ESP_DIFAL_E310;
	}

	public void setDEB_ESP_DIFAL_E310(float dEB_ESP_DIFAL_E310) {
		DEB_ESP_DIFAL_E310 = dEB_ESP_DIFAL_E310;
	}
	
	

	
	public E300 getE300() {
		return e300;
	}

	public void setE300(E300 e300) {
		this.e300 = e300;
	}

	public ArrayList<E311> getListE311() {
		return listE311;
	}

	public void setListE311(ArrayList<E311> listE311) {
		this.listE311 = listE311;
	}

	public ArrayList<E316> getListE316() {
		return listE316;
	}

	public void setListE316(ArrayList<E316> listE316) {
		this.listE316 = listE316;
	}

	public E310() {
	}

	public E310(List<String> strs1) {
		this.setREG_E310(strs1.get(0));
		this.setIND_MOV_DIFAL_E310(strs1.get(1));
		this.setVL_SLD_CRED_ANT_DIFAL_E310(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setVL_TOT_DEBITOS_DIFAL_E310(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_OUT_DEB_DIFAL_E310(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_TOT_DEB_FCP_E310(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_TOT_CREDITOS_DIFAL_E310(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setVL_TOT_CRED_FCP_E310(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_OUT_CRED_DIFAL_E310(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_SLD_DEV_ANT_DIFAL_E310(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setVL_DEDUCOES_DIFAL_E310(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setVL_RECOL_E310(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVL_SLD_CRED_TRANSPORTAR_E310(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setDEB_ESP_DIFAL_E310(Float.parseFloat(strs1.get(13).replace(",", ".")));
	}

}
