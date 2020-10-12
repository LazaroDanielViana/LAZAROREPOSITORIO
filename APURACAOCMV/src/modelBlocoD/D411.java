package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D411 {
	String REG_D411;
	int NUM_DOC_CANC_D411;
	
	D410 d410;

	public String getREG_D411() {
		return REG_D411;
	}

	public void setREG_D411(String rEG_D411) {
		REG_D411 = rEG_D411;
	}

	public int getNUM_DOC_CANC_D411() {
		return NUM_DOC_CANC_D411;
	}

	public void setNUM_DOC_CANC_D411(int nUM_DOC_CANC_D411) {
		NUM_DOC_CANC_D411 = nUM_DOC_CANC_D411;
	}
	
	

	public D410 getD410() {
		return d410;
	}

	public void setD410(D410 d410) {
		this.d410 = d410;
	}

	public D411() {
	}

	public D411(ArrayList<String> strs1) {
		this.setREG_D411(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setNUM_DOC_CANC_D411(Integer.parseInt(strs1.get(1)));
	}

}
