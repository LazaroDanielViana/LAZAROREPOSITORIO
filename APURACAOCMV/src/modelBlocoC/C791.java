package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C791 {

	String REG_C791, UF_C791;
	float VL_BC_ICMS_ST_C791, VL_ICMS_ST_C791;
	
	C790 c790;

	public String getREG_C791() {
		return REG_C791;
	}

	public void setREG_C791(String rEG_C791) {
		REG_C791 = rEG_C791;
	}

	public String getUF_C791() {
		return UF_C791;
	}

	public void setUF_C791(String uF_C791) {
		UF_C791 = uF_C791;
	}

	public float getVL_BC_ICMS_ST_C791() {
		return VL_BC_ICMS_ST_C791;
	}

	public void setVL_BC_ICMS_ST_C791(float vL_BC_ICMS_ST_C791) {
		VL_BC_ICMS_ST_C791 = vL_BC_ICMS_ST_C791;
	}

	public float getVL_ICMS_ST_C791() {
		return VL_ICMS_ST_C791;
	}

	public void setVL_ICMS_ST_C791(float vL_ICMS_ST_C791) {
		VL_ICMS_ST_C791 = vL_ICMS_ST_C791;
	}
	
	

	public C790 getC790() {
		return c790;
	}

	public void setC790(C790 c790) {
		this.c790 = c790;
	}

	public C791(){}
	public C791(List<String> strs1) {
	this.setREG_C791(strs1.get(0));
	this.setUF_C791(strs1.get(1));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_BC_ICMS_ST_C791(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_ICMS_ST_C791(Float.parseFloat(strs1.get(3).replace(",",".")));
	}

}
