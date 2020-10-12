package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C177 implements Serializable{
	private static final long serialVersionUID = 1L;
	String REGC177, COD_SELO_IPI;

	long QT_SELO_IPI;
	
	C170 c170;

	public String getREGC177() {
		return REGC177;
	}

	public void setREGC177(String rEG) {
		REGC177 = rEG;
	}

	public String getCOD_SELO_IPI() {
		return COD_SELO_IPI;
	}

	public void setCOD_SELO_IPI(String cOD_SELO_IPI) {
		COD_SELO_IPI = cOD_SELO_IPI;
	}

	public long getQT_SELO_IPI() {
		return QT_SELO_IPI;
	}

	public void setQT_SELO_IPI(long qT_SELO_IPI) {
		QT_SELO_IPI = qT_SELO_IPI;
	}
	
	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	public C177() {
	}

	public C177(List<String> strs1) {
		if(strs1.size() >= 3) {
		this.setREGC177(strs1.get(0));
		this.setCOD_SELO_IPI(strs1.get(1));
		if (strs1.get(2).length() >= 1 )
			this.setQT_SELO_IPI(Long.parseLong(strs1.get(2)));
	}
	}

}
