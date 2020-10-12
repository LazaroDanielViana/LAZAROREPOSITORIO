package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D101 {

	String REG_D101;
	float VL_FCP_UF__D101, VL_ICMS_UF_DEST_D101, VL_ICMS_UF_REM_D101;
	D100 d100;
	public String getREG_D101() {
		return REG_D101;
	}

	public void setREG_D101(String rEG_D101) {
		REG_D101 = rEG_D101;
	}

	public float getVL_FCP_UF__D101() {
		return VL_FCP_UF__D101;
	}

	public void setVL_FCP_UF__D101(float vL_FCP_UF__D101) {
		VL_FCP_UF__D101 = vL_FCP_UF__D101;
	}

	public float getVL_ICMS_UF_DEST_D101() {
		return VL_ICMS_UF_DEST_D101;
	}

	public void setVL_ICMS_UF_DEST_D101(float vL_ICMS_UF_DEST_D101) {
		VL_ICMS_UF_DEST_D101 = vL_ICMS_UF_DEST_D101;
	}

	public float getVL_ICMS_UF_REM_D101() {
		return VL_ICMS_UF_REM_D101;
	}

	public void setVL_ICMS_UF_REM_D101(float vL_ICMS_UF_REM_D101) {
		VL_ICMS_UF_REM_D101 = vL_ICMS_UF_REM_D101;
	}

	
	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D101(){}
	public D101(List<String> strs1) {
	this.setREG_D101(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setVL_FCP_UF__D101(Float.parseFloat(strs1.get(1).replace(",",".")));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_ICMS_UF_DEST_D101(Float.parseFloat(strs1.get(2).replace(",",".")));
	if ( strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)) )
		this.setVL_ICMS_UF_REM_D101(Float.parseFloat(strs1.get(3).replace(",",".")));
	}


}
