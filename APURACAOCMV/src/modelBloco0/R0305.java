package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0305 {

	String REG_R0305, COD_CCUS_R0305, FUNC_R0305;
	int VIDA_UTIL_R0305;
	
	R0300 r0300;

	public String getREG_R0305() {
		return REG_R0305;
	}

	public void setREG_R0305(String rEG_R0305) {
		REG_R0305 = rEG_R0305;
	}

	public String getCOD_CCUS_R0305() {
		return COD_CCUS_R0305;
	}

	public void setCOD_CCUS_R0305(String cOD_CCUS_R0305) {
		COD_CCUS_R0305 = cOD_CCUS_R0305;
	}

	public String getFUNC_R0305() {
		return FUNC_R0305;
	}

	public void setFUNC_R0305(String fUNC_R0305) {
		FUNC_R0305 = fUNC_R0305;
	}

	public int getVIDA_UTIL_R0305() {
		return VIDA_UTIL_R0305;
	}

	public void setVIDA_UTIL_R0305(int vIDA_UTIL_R0305) {
		VIDA_UTIL_R0305 = vIDA_UTIL_R0305;
	}
	
	

	public R0300 getR0300() {
		return r0300;
	}

	public void setR0300(R0300 r0300) {
		this.r0300 = r0300;
	}

	public R0305() {
	}

	public R0305(List<String> strs1) {
		this.setREG_R0305(strs1.get(0));
		this.setCOD_CCUS_R0305(strs1.get(1));
		this.setFUNC_R0305(strs1.get(2));
		if (strs1.get(3).length() >= 1 )
			this.setVIDA_UTIL_R0305(Integer.parseInt(strs1.get(3)));
	}

}
