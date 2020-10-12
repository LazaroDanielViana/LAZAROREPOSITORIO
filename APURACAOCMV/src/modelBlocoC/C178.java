package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C178 implements Serializable{
	private static final long serialVersionUID = 1L;
	String REGC178, CL_ENQ;

	float VL_UNID, QUANT_PAD;

	C170 c170;

	public String getREGC178() {
		return REGC178;
	}

	public void setREGC178(String rEG) {
		REGC178 = rEG;
	}

	public String getCL_ENQ() {
		return CL_ENQ;
	}

	public void setCL_ENQ(String cL_ENQ) {
		CL_ENQ = cL_ENQ;
	}

	public float getVL_UNID() {
		return VL_UNID;
	}

	public void setVL_UNID(float vL_UNID) {
		VL_UNID = vL_UNID;
	}

	public float getQUANT_PAD() {
		return QUANT_PAD;
	}

	public void setQUANT_PAD(float qUANT_PAD) {
		QUANT_PAD = qUANT_PAD;
	}

	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	public C178() {
	}

	public C178(List<String> strs1) {
		if (strs1.size() >= 4) {
			this.setREGC178(strs1.get(0));
			this.setCL_ENQ(strs1.get(1));
			if (strs1.get(2).length() >= 1 )
				this.setVL_UNID(Float.parseFloat(strs1.get(2).replace(",", ".")));
			if (strs1.get(3).length() >= 1 )
				this.setQUANT_PAD(Float.parseFloat(strs1.get(3).replace(",", ".")));
		}
	}
}
