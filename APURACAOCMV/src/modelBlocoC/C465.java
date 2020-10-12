package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C465 {

	String REG_C465, CHV_CFE_C465;
	int NUM_CCF_C465;
	
	C460 c460;

	public String getREG_C465() {
		return REG_C465;
	}

	public void setREG_C465(String rEG_C465) {
		REG_C465 = rEG_C465;
	}

	public String getCHV_CFE_C465() {
		return CHV_CFE_C465;
	}

	public void setCHV_CFE_C465(String cHV_CFE_C465) {
		CHV_CFE_C465 = cHV_CFE_C465;
	}

	public int getNUM_CCF_C465() {
		return NUM_CCF_C465;
	}

	public void setNUM_CCF_C465(int nUM_CCF_C465) {
		NUM_CCF_C465 = nUM_CCF_C465;
	}
	
	

	public C460 getC460() {
		return c460;
	}

	public void setC460(C460 c460) {
		this.c460 = c460;
	}

	public C465() {
	}

	public C465(List<String> strs1) {
		this.setREG_C465(strs1.get(0));
		this.setCHV_CFE_C465(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setNUM_CCF_C465(Integer.parseInt(strs1.get(2)));
	}

}
