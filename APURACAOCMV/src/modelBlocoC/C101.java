package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

//@Embeddable
public class C101 {

	String REGC101;
	float VL_FCP_UF_DESTC101, VL_ICMS_UF_DESTC101, VL_ICMS_UF_REMC101;
	C100 c100;

	public String getREGC101() {
		return REGC101;
	}

	public void setREGC101(String rEG) {
		REGC101 = rEG;
	}

	public float getVL_FCP_UF_DESTC101() {
		return VL_FCP_UF_DESTC101;
	}

	public void setVL_FCP_UF_DESTC101(float vL_FCP_UF_DEST) {
		VL_FCP_UF_DESTC101 = vL_FCP_UF_DEST;
	}

	public float getVL_ICMS_UF_DESTC101() {
		return VL_ICMS_UF_DESTC101;
	}

	public void setVL_ICMS_UF_DESTC101(float vL_ICMS_UF_DEST) {
		VL_ICMS_UF_DESTC101 = vL_ICMS_UF_DEST;
	}

	public float getVL_ICMS_UF_REMC101() {
		return VL_ICMS_UF_REMC101;
	}

	public void setVL_ICMS_UF_REMC101(float vL_ICMS_UF_REM) {
		VL_ICMS_UF_REMC101 = vL_ICMS_UF_REM;
	}
	
	

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	public C101() {
	}

	public C101(List<String> strs1) {
		if(strs1.size() >= 4) {
		this.setREGC101(strs1.get(0));
		if (strs1.get(1).length() >= 1 )
			this.setVL_FCP_UF_DESTC101(Float.parseFloat(strs1.get(1).replace(",", ".")));
		if (strs1.get(2).length() >= 1 )
			this.setVL_ICMS_UF_DESTC101(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 )
			this.setVL_ICMS_UF_REMC101(Float.parseFloat(strs1.get(3).replace(",", ".")));
		
		}
	}
}