package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E312 {
	
	String REG_E312,
	NUM_DA_E312,
	NUM_PROC_E312;
	byte IND_PROC_E312;
	String PROC_E312,
	TXT_COMPL_E312;
	
	E311 e311;
	public String getREG_E312() {
		return REG_E312;
	}
	public void setREG_E312(String rEG_E312) {
		REG_E312 = rEG_E312;
	}
	public String getNUM_DA_E312() {
		return NUM_DA_E312;
	}
	public void setNUM_DA_E312(String nUM_DA_E312) {
		NUM_DA_E312 = nUM_DA_E312;
	}
	public String getNUM_PROC_E312() {
		return NUM_PROC_E312;
	}
	public void setNUM_PROC_E312(String nUM_PROC_E312) {
		NUM_PROC_E312 = nUM_PROC_E312;
	}
	public byte getIND_PROC_E312() {
		return IND_PROC_E312;
	}
	public void setIND_PROC_E312(byte iND_PROC_E312) {
		IND_PROC_E312 = iND_PROC_E312;
	}
	public String getPROC_E312() {
		return PROC_E312;
	}
	public void setPROC_E312(String pROC_E312) {
		PROC_E312 = pROC_E312;
	}
	public String getTXT_COMPL_E312() {
		return TXT_COMPL_E312;
	}
	public void setTXT_COMPL_E312(String tXT_COMPL_E312) {
		TXT_COMPL_E312 = tXT_COMPL_E312;
	}
	
	
	public E311 getE311() {
		return e311;
	}
	public void setE311(E311 e311) {
		this.e311 = e311;
	}
	public E312(){}

	public E312(List<String> strs1) {
	this.setREG_E312(strs1.get(0));
	this.setNUM_DA_E312(strs1.get(1));
	this.setNUM_PROC_E312(strs1.get(2));
	this.setIND_PROC_E312(Byte.parseByte(strs1.get(3)));
	this.setPROC_E312(strs1.get(4));
	this.setTXT_COMPL_E312(strs1.get(5));
	}
	
	


}
