package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

//@Embeddable
public class C105 {

	String REGC105;

	byte OPERC105;

	String UFC105;
	C100 c100;

	public String getREGC105() {
		return REGC105;
	}

	public void setREGC105(String rEG) {
		REGC105 = rEG;
	}

	public byte getOPERC105() {
		return OPERC105;
	}

	public void setOPERC105(byte oPER) {
		OPERC105 = oPER;
	}

	public String getUFC105() {
		return UFC105;
	}

	public void setUFC105(String uF) {
		UFC105 = uF;
	}

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	public C105() {
	}

	public C105(List<String> strs1) {
		if (strs1.size() >= 3) {
			this.setREGC105(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setOPERC105(Byte.parseByte(strs1.get(1)));
			this.setUFC105(strs1.get(2));
		}
	}

}
