package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D301 {
	String REG_D301;
	int NUM_DOC_CANC_D301;
	
	D300 d300;

	public String getREG_D301() {
		return REG_D301;
	}

	public void setREG_D301(String rEG_D301) {
		REG_D301 = rEG_D301;
	}

	public int getNUM_DOC_CANC_D301() {
		return NUM_DOC_CANC_D301;
	}

	public void setNUM_DOC_CANC_D301(int nUM_DOC_CANC_D301) {
		NUM_DOC_CANC_D301 = nUM_DOC_CANC_D301;
	}
	
	

	public D300 getD300() {
		return d300;
	}

	public void setD300(D300 d300) {
		this.d300 = d300;
	}

	public D301() {
	}

	public D301(ArrayList<String> strs1) {
		this.setREG_D301(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setNUM_DOC_CANC_D301(Integer.parseInt(strs1.get(1)));
	}

}
