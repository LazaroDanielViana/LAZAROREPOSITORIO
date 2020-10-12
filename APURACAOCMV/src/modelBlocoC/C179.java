package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C179 implements Serializable{
	private static final long serialVersionUID = 1L;
	String REGC179;

	float BC_ST_ORIG_DEST, ICMS_ST_REP, ICMS_ST_COMPL, BC_RET, ICMS_RET;

	C170 c170;

	public String getREGC179() {
		return REGC179;
	}

	public void setREGC179(String rEG) {
		REGC179 = rEG;
	}

	public float getBC_ST_ORIG_DEST() {
		return BC_ST_ORIG_DEST;
	}

	public void setBC_ST_ORIG_DEST(float bC_ST_ORIG_DEST) {
		BC_ST_ORIG_DEST = bC_ST_ORIG_DEST;
	}

	public float getICMS_ST_REP() {
		return ICMS_ST_REP;
	}

	public void setICMS_ST_REP(float iCMS_ST_REP) {
		ICMS_ST_REP = iCMS_ST_REP;
	}

	public float getICMS_ST_COMPL() {
		return ICMS_ST_COMPL;
	}

	public void setICMS_ST_COMPL(float iCMS_ST_COMPL) {
		ICMS_ST_COMPL = iCMS_ST_COMPL;
	}

	public float getBC_RET() {
		return BC_RET;
	}

	public void setBC_RET(float bC_RET) {
		BC_RET = bC_RET;
	}

	public float getICMS_RET() {
		return ICMS_RET;
	}

	public void setICMS_RET(float iCMS_RET) {
		ICMS_RET = iCMS_RET;
	}

	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	public C179() {
	}

	public C179(List<String> strs1) {
		if (strs1.size() >= 6) {
			this.setREGC179(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setBC_ST_ORIG_DEST(Float.parseFloat(strs1.get(1).replace(",", ".")));
			if (strs1.get(2).length() >= 1)
				this.setICMS_ST_REP(Float.parseFloat(strs1.get(2).replace(",", ".")));
			if (strs1.get(3).length() >= 1)
				this.setICMS_ST_COMPL(Float.parseFloat(strs1.get(3).replace(",", ".")));
			if (strs1.get(4).length() >= 1)
				this.setBC_RET(Float.parseFloat(strs1.get(4).replace(",", ".")));
			if (strs1.get(5).length() >= 1)
				this.setICMS_RET(Float.parseFloat(strs1.get(5).replace(",", ".")));
		}
	}

}
