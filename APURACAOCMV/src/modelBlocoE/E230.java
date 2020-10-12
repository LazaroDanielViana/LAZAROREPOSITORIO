package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E230 {
	String REG_E230,
	NUM_DA_E230,
	NUM_PROC_E230;
	byte IND_PROC_E230;
	String PROC_E230,
	TXT_COM_E230;
	
	E220 e220;
	
	public String getREG_E230() {
		return REG_E230;
	}
	public void setREG_E230(String rEG_E230) {
		REG_E230 = rEG_E230;
	}
	public String getNUM_DA_E230() {
		return NUM_DA_E230;
	}
	public void setNUM_DA_E230(String nUM_DA_E230) {
		NUM_DA_E230 = nUM_DA_E230;
	}
	public String getNUM_PROC_E230() {
		return NUM_PROC_E230;
	}
	public void setNUM_PROC_E230(String nUM_PROC_E230) {
		NUM_PROC_E230 = nUM_PROC_E230;
	}
	public byte getIND_PROC_E230() {
		return IND_PROC_E230;
	}
	public void setIND_PROC_E230(byte iND_PROC_E230) {
		IND_PROC_E230 = iND_PROC_E230;
	}
	public String getPROC_E230() {
		return PROC_E230;
	}
	public void setPROC_E230(String pROC_E230) {
		PROC_E230 = pROC_E230;
	}
	public String getTXT_COM_E230() {
		return TXT_COM_E230;
	}
	public void setTXT_COM_E230(String tXT_COM_E230) {
		TXT_COM_E230 = tXT_COM_E230;
	}	
	
	public E220 getE220() {
		return e220;
	}
	public void setE220(E220 e220) {
		this.e220 = e220;
	}
	public E230() {
	}

	public E230(List<String> strs1) {
		this.setREG_E230(strs1.get(0));
		this.setNUM_DA_E230(strs1.get(1));
		this.setNUM_PROC_E230(strs1.get(2));
		this.setIND_PROC_E230(Byte.parseByte(strs1.get(3)));
		this.setPROC_E230(strs1.get(4));
		this.setTXT_COM_E230(strs1.get(5));
	}
	

}
