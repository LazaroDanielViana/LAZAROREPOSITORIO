package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C410 {

	String REG_C410;
	float VL_PIS_C410, VL_COFINS_C410;
	
	C405 c405;

	public String getREG_C410() {
		return REG_C410;
	}

	public void setREG_C410(String rEG_C410) {
		REG_C410 = rEG_C410;
	}

	public float getVL_PIS_C410() {
		return VL_PIS_C410;
	}

	public void setVL_PIS_C410(float vL_PIS_C410) {
		VL_PIS_C410 = vL_PIS_C410;
	}

	public float getVL_COFINS_C410() {
		return VL_COFINS_C410;
	}

	public void setVL_COFINS_C410(float vL_COFINS_C410) {
		VL_COFINS_C410 = vL_COFINS_C410;
	}
	
	

	public C405 getC405() {
		return c405;
	}

	public void setC405(C405 c405) {
		this.c405 = c405;
	}

	public C410() {
	}

	public C410(List<String> strs1) {
		this.setREG_C410(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setVL_PIS_C410(Float.parseFloat(strs1.get(1).replace(",", ".")));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setVL_COFINS_C410(Float.parseFloat(strs1.get(2).replace(",", ".")));
	}

}
