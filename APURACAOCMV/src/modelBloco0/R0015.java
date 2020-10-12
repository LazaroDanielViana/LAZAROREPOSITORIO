package modelBloco0;

import java.util.ArrayList;
import java.util.List;

public class R0015 {
	String REG_R0015,
	UF_ST_R0015,
	IE_ST_R0015;
	R0001 r0001;

	public String getREG_R0015() {
		return REG_R0015;
	}

	public void setREG_R0015(String rEG_R0015) {
		REG_R0015 = rEG_R0015;
	}

	public String getUF_ST_R0015() {
		return UF_ST_R0015;
	}

	public void setUF_ST_R0015(String uF_ST_R0015) {
		UF_ST_R0015 = uF_ST_R0015;
	}

	public String getIE_ST_R0015() {
		return IE_ST_R0015;
	}

	public void setIE_ST_R0015(String iE_ST_R0015) {
		IE_ST_R0015 = iE_ST_R0015;
	}
	
	
	
	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0015(){}

	public R0015(List<String> strs1) {
		this.setREG_R0015(strs1.get(0));
		this.setUF_ST_R0015(strs1.get(1));
		this.setIE_ST_R0015(strs1.get(2));
	}

}
