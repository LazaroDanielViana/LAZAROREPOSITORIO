package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C172 implements Serializable{
	private static final long serialVersionUID = 1L;
	String REGC172;

	float VL_BC_ISSQN, ALIQ_ISSQN, VL_ISSQN;

	C170 c170;

	public String getREGC172() {
		return REGC172;
	}

	public void setREGC172(String rEG) {
		REGC172 = rEG;
	}

	public float getVL_BC_ISSQN() {
		return VL_BC_ISSQN;
	}

	public void setVL_BC_ISSQN(float vL_BC_ISSQN) {
		VL_BC_ISSQN = vL_BC_ISSQN;
	}

	public float getALIQ_ISSQN() {
		return ALIQ_ISSQN;
	}

	public void setALIQ_ISSQN(float aLIQ_ISSQN) {
		ALIQ_ISSQN = aLIQ_ISSQN;
	}

	public float getVL_ISSQN() {
		return VL_ISSQN;
	}

	public void setVL_ISSQN(float vL_ISSQN) {
		VL_ISSQN = vL_ISSQN;
	}

	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	public C172() {
	}

	public C172(List<String> strs1) {
		if (strs1.size() >= 4) {
			this.setREGC172(strs1.get(0));
			if (strs1.get(1).length() >= 1 )
				this.setVL_BC_ISSQN(Float.parseFloat(strs1.get(1).replace(",", ".")));
			if (strs1.get(2).length() >= 1 )
				this.setALIQ_ISSQN(Float.parseFloat(strs1.get(2).replace(",", ".")));
			if (strs1.get(3).length() >= 1 )
				this.setVL_ISSQN(Float.parseFloat(strs1.get(3).replace(",", ".")));
		}
	}
}
