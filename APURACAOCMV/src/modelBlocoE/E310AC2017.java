package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class E310AC2017 extends E310{
	String REG_E310AC2017,
	IND_MOV_FCP_DIFAL_E310AC2017;
	float VL_SLD_CRED_ANT_DIFAL_E310AC2017,
	VL_TOT_DEBITOS_DIFAL_E310AC2017,
	VL_OUT_DEB_DIFAL_E310AC2017,
	VL_TOT_CREDITOS_DIFAL_E310AC2017,
	VL_OUT_CRED_DIFAL_E310AC2017,
	VL_SLD_DEV_ANT_DIFAL_E310AC2017,
	VL_DEDUCOES_DIFAL_E310AC2017,
	VL_RECOL_DIFAL_E310AC2017,
	VL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017,
	DEB_ESP_DIFAL_E310AC2017,
	VL_SLD_CRED_ANT_FCP_E310AC2017,
	VL_TOT_DEB_FCP_E310AC2017,
	VL_OUT_DEB_FCP_E310AC2017,
	VL_TOT_CRED_FCP_E310AC2017,
	VL_OUT_CRED_FCP_E310AC2017,
	VL_SLD_DEV_ANT_FCP_E310AC2017,
	VL_DEDU_E310AC2017,
	VL_RECOL_FCP_E310AC2017,
	VL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017,
	DEB_ESP_FCP_E310AC2017;
	
	E300 e300;
	
	ArrayList<E311> listE311 = new ArrayList<>();
	ArrayList<E316> listE316 = new ArrayList<>();

	
	
	
	public String getREG_E310AC2017() {
		return REG_E310AC2017;
	}
	public void setREG_E310AC2017(String rEG_E310AC2017) {
		REG_E310AC2017 = rEG_E310AC2017;
	}
	public String getIND_MOV_FCP_DIFAL_E310AC2017() {
		return IND_MOV_FCP_DIFAL_E310AC2017;
	}
	public void setIND_MOV_FCP_DIFAL_E310AC2017(String iND_MOV_FCP_DIFAL_E310AC2017) {
		IND_MOV_FCP_DIFAL_E310AC2017 = iND_MOV_FCP_DIFAL_E310AC2017;
	}
	public float getVL_SLD_CRED_ANT_DIFAL_E310AC2017() {
		return VL_SLD_CRED_ANT_DIFAL_E310AC2017;
	}
	public void setVL_SLD_CRED_ANT_DIFAL_E310AC2017(float vL_SLD_CRED_ANT_DIFAL_E310AC2017) {
		VL_SLD_CRED_ANT_DIFAL_E310AC2017 = vL_SLD_CRED_ANT_DIFAL_E310AC2017;
	}
	public float getVL_TOT_DEBITOS_DIFAL_E310AC2017() {
		return VL_TOT_DEBITOS_DIFAL_E310AC2017;
	}
	public void setVL_TOT_DEBITOS_DIFAL_E310AC2017(float vL_TOT_DEBITOS_DIFAL_E310AC2017) {
		VL_TOT_DEBITOS_DIFAL_E310AC2017 = vL_TOT_DEBITOS_DIFAL_E310AC2017;
	}
	public float getVL_OUT_DEB_DIFAL_E310AC2017() {
		return VL_OUT_DEB_DIFAL_E310AC2017;
	}
	public void setVL_OUT_DEB_DIFAL_E310AC2017(float vL_OUT_DEB_DIFAL_E310AC2017) {
		VL_OUT_DEB_DIFAL_E310AC2017 = vL_OUT_DEB_DIFAL_E310AC2017;
	}
	public float getVL_TOT_CREDITOS_DIFAL_E310AC2017() {
		return VL_TOT_CREDITOS_DIFAL_E310AC2017;
	}
	public void setVL_TOT_CREDITOS_DIFAL_E310AC2017(float vL_TOT_CREDITOS_DIFAL_E310AC2017) {
		VL_TOT_CREDITOS_DIFAL_E310AC2017 = vL_TOT_CREDITOS_DIFAL_E310AC2017;
	}
	public float getVL_OUT_CRED_DIFAL_E310AC2017() {
		return VL_OUT_CRED_DIFAL_E310AC2017;
	}
	public void setVL_OUT_CRED_DIFAL_E310AC2017(float vL_OUT_CRED_DIFAL_E310AC2017) {
		VL_OUT_CRED_DIFAL_E310AC2017 = vL_OUT_CRED_DIFAL_E310AC2017;
	}
	public float getVL_SLD_DEV_ANT_DIFAL_E310AC2017() {
		return VL_SLD_DEV_ANT_DIFAL_E310AC2017;
	}
	public void setVL_SLD_DEV_ANT_DIFAL_E310AC2017(float vL_SLD_DEV_ANT_DIFAL_E310AC2017) {
		VL_SLD_DEV_ANT_DIFAL_E310AC2017 = vL_SLD_DEV_ANT_DIFAL_E310AC2017;
	}
	public float getVL_DEDUCOES_DIFAL_E310AC2017() {
		return VL_DEDUCOES_DIFAL_E310AC2017;
	}
	public void setVL_DEDUCOES_DIFAL_E310AC2017(float vL_DEDUCOES_DIFAL_E310AC2017) {
		VL_DEDUCOES_DIFAL_E310AC2017 = vL_DEDUCOES_DIFAL_E310AC2017;
	}
	public float getVL_RECOL_DIFAL_E310AC2017() {
		return VL_RECOL_DIFAL_E310AC2017;
	}
	public void setVL_RECOL_DIFAL_E310AC2017(float vL_RECOL_DIFAL_E310AC2017) {
		VL_RECOL_DIFAL_E310AC2017 = vL_RECOL_DIFAL_E310AC2017;
	}
	public float getVL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017() {
		return VL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017;
	}
	public void setVL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017(float vL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017) {
		VL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017 = vL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017;
	}
	public float getDEB_ESP_DIFAL_E310AC2017() {
		return DEB_ESP_DIFAL_E310AC2017;
	}
	public void setDEB_ESP_DIFAL_E310AC2017(float dEB_ESP_DIFAL_E310AC2017) {
		DEB_ESP_DIFAL_E310AC2017 = dEB_ESP_DIFAL_E310AC2017;
	}
	public float getVL_SLD_CRED_ANT_FCP_E310AC2017() {
		return VL_SLD_CRED_ANT_FCP_E310AC2017;
	}
	public void setVL_SLD_CRED_ANT_FCP_E310AC2017(float vL_SLD_CRED_ANT_FCP_E310AC2017) {
		VL_SLD_CRED_ANT_FCP_E310AC2017 = vL_SLD_CRED_ANT_FCP_E310AC2017;
	}
	public float getVL_TOT_DEB_FCP_E310AC2017() {
		return VL_TOT_DEB_FCP_E310AC2017;
	}
	public void setVL_TOT_DEB_FCP_E310AC2017(float vL_TOT_DEB_FCP_E310AC2017) {
		VL_TOT_DEB_FCP_E310AC2017 = vL_TOT_DEB_FCP_E310AC2017;
	}
	public float getVL_OUT_DEB_FCP_E310AC2017() {
		return VL_OUT_DEB_FCP_E310AC2017;
	}
	public void setVL_OUT_DEB_FCP_E310AC2017(float vL_OUT_DEB_FCP_E310AC2017) {
		VL_OUT_DEB_FCP_E310AC2017 = vL_OUT_DEB_FCP_E310AC2017;
	}
	public float getVL_TOT_CRED_FCP_E310AC2017() {
		return VL_TOT_CRED_FCP_E310AC2017;
	}
	public void setVL_TOT_CRED_FCP_E310AC2017(float vL_TOT_CRED_FCP_E310AC2017) {
		VL_TOT_CRED_FCP_E310AC2017 = vL_TOT_CRED_FCP_E310AC2017;
	}
	public float getVL_OUT_CRED_FCP_E310AC2017() {
		return VL_OUT_CRED_FCP_E310AC2017;
	}
	public void setVL_OUT_CRED_FCP_E310AC2017(float vL_OUT_CRED_FCP_E310AC2017) {
		VL_OUT_CRED_FCP_E310AC2017 = vL_OUT_CRED_FCP_E310AC2017;
	}
	public float getVL_SLD_DEV_ANT_FCP_E310AC2017() {
		return VL_SLD_DEV_ANT_FCP_E310AC2017;
	}
	public void setVL_SLD_DEV_ANT_FCP_E310AC2017(float vL_SLD_DEV_ANT_FCP_E310AC2017) {
		VL_SLD_DEV_ANT_FCP_E310AC2017 = vL_SLD_DEV_ANT_FCP_E310AC2017;
	}
	public float getVL_DEDU_E310AC2017() {
		return VL_DEDU_E310AC2017;
	}
	public void setVL_DEDU_E310AC2017(float vL_DEDU_E310AC2017) {
		VL_DEDU_E310AC2017 = vL_DEDU_E310AC2017;
	}
	public float getVL_RECOL_FCP_E310AC2017() {
		return VL_RECOL_FCP_E310AC2017;
	}
	public void setVL_RECOL_FCP_E310AC2017(float vL_RECOL_FCP_E310AC2017) {
		VL_RECOL_FCP_E310AC2017 = vL_RECOL_FCP_E310AC2017;
	}
	public float getVL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017() {
		return VL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017;
	}
	public void setVL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017(float vL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017) {
		VL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017 = vL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017;
	}
	public float getDEB_ESP_FCP_E310AC2017() {
		return DEB_ESP_FCP_E310AC2017;
	}
	public void setDEB_ESP_FCP_E310AC2017(float dEB_ESP_FCP_E310AC2017) {
		DEB_ESP_FCP_E310AC2017 = dEB_ESP_FCP_E310AC2017;
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
	public E310AC2017(){}
	public E310AC2017(List<String> strs1) {
	this.setREG_E310AC2017(strs1.get(0));
	this.setIND_MOV_FCP_DIFAL_E310AC2017(strs1.get(1));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_SLD_CRED_ANT_DIFAL_E310AC2017(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_TOT_DEBITOS_DIFAL_E310AC2017(Float.parseFloat(strs1.get(3).replace(",",".")));
	if ( strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)) )
		this.setVL_OUT_DEB_DIFAL_E310AC2017(Float.parseFloat(strs1.get(4).replace(",",".")));
	if ( strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)) )
		this.setVL_TOT_CREDITOS_DIFAL_E310AC2017(Float.parseFloat(strs1.get(5).replace(",",".")));
	if ( strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)) )
		this.setVL_OUT_CRED_DIFAL_E310AC2017(Float.parseFloat(strs1.get(6).replace(",",".")));
	if ( strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)) )
		this.setVL_SLD_DEV_ANT_DIFAL_E310AC2017(Float.parseFloat(strs1.get(7).replace(",",".")));
	if ( strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)) )
		this.setVL_DEDUCOES_DIFAL_E310AC2017(Float.parseFloat(strs1.get(8).replace(",",".")));
	if ( strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)) )
		this.setVL_RECOL_DIFAL_E310AC2017(Float.parseFloat(strs1.get(9).replace(",",".")));
	if ( strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)) )
		this.setVL_SLD_CRED_TRANSPORTAR_DIFAL_E310AC2017(Float.parseFloat(strs1.get(10).replace(",",".")));
	if ( strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)) )
		this.setDEB_ESP_DIFAL_E310AC2017(Float.parseFloat(strs1.get(11).replace(",",".")));
	if ( strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)) )
		this.setVL_SLD_CRED_ANT_FCP_E310AC2017(Float.parseFloat(strs1.get(12).replace(",",".")));
	if ( strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)) )
		this.setVL_TOT_DEB_FCP_E310AC2017(Float.parseFloat(strs1.get(13).replace(",",".")));
	if ( strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)) )
		this.setVL_OUT_DEB_FCP_E310AC2017(Float.parseFloat(strs1.get(14).replace(",",".")));
	if ( strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)) )
		this.setVL_TOT_CRED_FCP_E310AC2017(Float.parseFloat(strs1.get(15).replace(",",".")));
	if ( strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)) )
		this.setVL_OUT_CRED_FCP_E310AC2017(Float.parseFloat(strs1.get(16).replace(",",".")));
	if ( strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)) )
		this.setVL_SLD_DEV_ANT_FCP_E310AC2017(Float.parseFloat(strs1.get(17).replace(",",".")));
	if ( strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)) )
		this.setVL_DEDU_E310AC2017(Float.parseFloat(strs1.get(18).replace(",",".")));
	if ( strs1.get(19).length() >= 1 && RegexL.isNumber(strs1.get(19)) )
		this.setVL_RECOL_FCP_E310AC2017(Float.parseFloat(strs1.get(19).replace(",",".")));
	if ( strs1.get(20).length() >= 1 && RegexL.isNumber(strs1.get(20)) )
		this.setVL_SLD_CRED_TRANSPORTAR_FCP_E310AC2017(Float.parseFloat(strs1.get(20).replace(",",".")));
	if ( strs1.get(21).length() >= 1 && RegexL.isNumber(strs1.get(21)) )
		this.setDEB_ESP_FCP_E310AC2017(Float.parseFloat(strs1.get(21).replace(",",".")));
	}


}
