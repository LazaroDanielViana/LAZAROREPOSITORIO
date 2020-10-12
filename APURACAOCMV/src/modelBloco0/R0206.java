package modelBloco0;

import java.util.ArrayList;
import java.util.List;

public class R0206 {
	String REG_R0206,
	COD_COMB_R0206;
	R0200 r0200;

	public String getREG_R0206() {
		return REG_R0206;
	}

	public void setREG_R0206(String rEG_R0206) {
		REG_R0206 = rEG_R0206;
	}

	public String getCOD_COMB_R0206() {
		return COD_COMB_R0206;
	}

	public void setCOD_COMB_R0206(String cOD_COMB) {
		COD_COMB_R0206 = cOD_COMB;
	}
	
	

	public R0200 getR0200() {
		return r0200;
	}

	public void setR0200(R0200 r0200) {
		this.r0200 = r0200;
	}

	public R0206() {
	}

	public R0206(List<String> strs1) {
		this.setREG_R0206(strs1.get(0));
		this.setCOD_COMB_R0206(strs1.get(1));
	}
	
	

}
