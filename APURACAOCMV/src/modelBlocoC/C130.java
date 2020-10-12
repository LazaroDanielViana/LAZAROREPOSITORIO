package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C130 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String REG130;

	float VL_SERV_NTC130, VL_BC_ISSQNC130, VL_ISSQNC130, VL_BC_IRRFC130, VL_IRRFC130, VL_BC_PREVC130, VL_PREVC130;
	C100 c100;

	public String getREG130() {
		return REG130;
	}

	public void setREG130(String rEG) {
		REG130 = rEG;
	}

	public float getVL_SERV_NTC130() {
		return VL_SERV_NTC130;
	}

	public void setVL_SERV_NTC130(float vL_SERV_NT) {
		VL_SERV_NTC130 = vL_SERV_NT;
	}

	public float getVL_BC_ISSQNC130() {
		return VL_BC_ISSQNC130;
	}

	public void setVL_BC_ISSQNC130(float vL_BC_ISSQN) {
		VL_BC_ISSQNC130 = vL_BC_ISSQN;
	}

	public float getVL_ISSQNC130() {
		return VL_ISSQNC130;
	}

	public void setVL_ISSQNC130(float vL_ISSQN) {
		VL_ISSQNC130 = vL_ISSQN;
	}

	public float getVL_BC_IRRFC130() {
		return VL_BC_IRRFC130;
	}

	public void setVL_BC_IRRFC130(float vL_BC_IRRF) {
		VL_BC_IRRFC130 = vL_BC_IRRF;
	}

	public float getVL_IRRFC130() {
		return VL_IRRFC130;
	}

	public void setVL_IRRFC130(float vL_IRRF) {
		VL_IRRFC130 = vL_IRRF;
	}

	public float getVL_BC_PREVC130() {
		return VL_BC_PREVC130;
	}

	public void setVL_BC_PREVC130(float vL_BC_PREV) {
		VL_BC_PREVC130 = vL_BC_PREV;
	}

	public float getVL_PREVC130() {
		return VL_PREVC130;
	}

	public void setVL_PREVC130(float vL_PREV) {
		VL_PREVC130 = vL_PREV;
	}

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	public C130() {
	}

	public C130(List<String> strs1) {
		if (strs1.size() >= 8) {
			this.setREG130(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setVL_SERV_NTC130(Float.parseFloat(strs1.get(1).replace(",", ".")));
			if (strs1.get(2).length() >= 1)
				this.setVL_BC_ISSQNC130(Float.parseFloat(strs1.get(2).replace(",", ".")));
			if (strs1.get(3).length() >= 1)
				this.setVL_ISSQNC130(Float.parseFloat(strs1.get(3).replace(",", ".")));
			if (strs1.get(4).length() >= 1)
				this.setVL_BC_IRRFC130(Float.parseFloat(strs1.get(4).replace(",", ".")));
			if (strs1.get(5).length() >= 1)
				this.setVL_IRRFC130(Float.parseFloat(strs1.get(5).replace(",", ".")));
			if (strs1.get(6).length() >= 1)
				this.setVL_BC_PREVC130(Float.parseFloat(strs1.get(6).replace(",", ".")));
			if (strs1.get(7).length() >= 1)
				this.setVL_PREVC130(Float.parseFloat(strs1.get(7).replace(",", ".")));
		}
	}

}
