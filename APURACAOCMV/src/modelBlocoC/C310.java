package modelBlocoC;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C310 {

	String REG_C310;
	int NUM_DOC_CANC_C310;
	C300 c300;

	public String getREG_C310() {
		return REG_C310;
	}

	public void setREG_C310(String rEG_C310) {
		REG_C310 = rEG_C310;
	}

	public int getNUM_DOC_CANC_C310() {
		return NUM_DOC_CANC_C310;
	}

	public void setNUM_DOC_CANC_C310(int nUM_DOC_CANC_C310) {
		NUM_DOC_CANC_C310 = nUM_DOC_CANC_C310;
	}
	

	public C300 getC300() {
		return c300;
	}

	public void setC300(C300 c300) {
		this.c300 = c300;
	}

	public C310() {
	}

	public C310(List<String> strs1) {
		this.setREG_C310(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setNUM_DOC_CANC_C310(Integer.parseInt(strs1.get(1)));
	}

}
