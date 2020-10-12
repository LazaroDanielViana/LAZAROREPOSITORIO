package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E112 {
	String REG_E112, NUM_DA_E112, NUM_PROC_E112, IND_PROC_E112, PROC_E112, TXT_COMPL_E112;

	E111 e111;
	public String getREG_E112() {
		return REG_E112;
	}

	public void setREG_E112(String rEG_E112) {
		REG_E112 = rEG_E112;
	}

	public String getNUM_DA_E112() {
		return NUM_DA_E112;
	}

	public void setNUM_DA_E112(String nUM_DA_E112) {
		NUM_DA_E112 = nUM_DA_E112;
	}

	public String getNUM_PROC_E112() {
		return NUM_PROC_E112;
	}

	public void setNUM_PROC_E112(String nUM_PROC_E112) {
		NUM_PROC_E112 = nUM_PROC_E112;
	}

	public String getIND_PROC_E112() {
		return IND_PROC_E112;
	}

	public void setIND_PROC_E112(String iND_PROC_E112) {
		IND_PROC_E112 = iND_PROC_E112;
	}

	public String getPROC_E112() {
		return PROC_E112;
	}

	public void setPROC_E112(String pROC_E112) {
		PROC_E112 = pROC_E112;
	}

	public String getTXT_COMPL_E112() {
		return TXT_COMPL_E112;
	}

	public void setTXT_COMPL_E112(String tXT_COMPL_E112) {
		TXT_COMPL_E112 = tXT_COMPL_E112;
	}

	
	public E111 getE111() {
		return e111;
	}

	public void setE111(E111 e111) {
		this.e111 = e111;
	}

	public E112() {
	}

	public E112(List<String> strs1) {
		this.setREG_E112(strs1.get(0));
		this.setNUM_DA_E112(strs1.get(1));
		this.setNUM_PROC_E112(strs1.get(2));
		this.setIND_PROC_E112(strs1.get(3));
		this.setPROC_E112(strs1.get(4));
		this.setTXT_COMPL_E112(strs1.get(5));
	}

}
