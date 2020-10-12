package modelBlocoC;
import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C601 {
		
	String REG_C601;
	int NUM_DOC_CANC_C601;
	
	C600 c600;
	
	public String getREG_C601() {
		return REG_C601;
	}
	public void setREG_C601(String rEG_C601) {
		REG_C601 = rEG_C601;
	}
	public int getNUM_DOC_CANC_C601() {
		return NUM_DOC_CANC_C601;
	}
	public void setNUM_DOC_CANC_C601(int nUM_DOC_CANC_C601) {
		NUM_DOC_CANC_C601 = nUM_DOC_CANC_C601;
	}
	
	
	
	public C600 getC600() {
		return c600;
	}
	public void setC600(C600 c600) {
		this.c600 = c600;
	}
	public C601(){}
	public C601(List<String> strs1) {
	this.setREG_C601(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setNUM_DOC_CANC_C601(Integer.parseInt(strs1.get(1)));
	}

}
