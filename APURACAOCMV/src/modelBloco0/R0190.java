package modelBloco0;

import java.util.ArrayList;
import java.util.List;

public class R0190 {
	String REG_R0190,
	UNID_R0190,
	DESCR_R0190;
	R0001 r0001;

	public String getREG_R0190() {
		return REG_R0190;
	}

	public void setREG_R0190(String rEG_R0190) {
		REG_R0190 = rEG_R0190;
	}

	public String getUNID_R0190() {
		return UNID_R0190;
	}

	public void setUNID_R0190(String uNID_R0190) {
		UNID_R0190 = uNID_R0190;
	}

	public String getDESCR_R0190() {
		return DESCR_R0190;
	}

	public void setDESCR_R0190(String dESCR_R0190) {
		DESCR_R0190 = dESCR_R0190;
	}
	
	
	
	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0190() {
	}

	public R0190(List<String> strs1) {
		this.setREG_R0190(strs1.get(0));
		this.setUNID_R0190(strs1.get(1));
		this.setDESCR_R0190(strs1.get(2));
	}

}
