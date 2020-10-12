package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import efdUtil.RegexL;

@Embeddable
public class C160 implements Serializable{
	private static final long serialVersionUID = 1L;
	String REGC160;
	// @Column(name = "COD_PARTC160")
	String COD_PARTC160;

	String VEIC_IDC160;

	int QTD_VOLC160;

	float PESO_BRTC160, PESO_LIQC160;
	String UF_IDC160;
	
	C100 c100;

	public String getREGC160() {
		return REGC160;
	}

	public void setREGC160(String rEG) {
		REGC160 = rEG;
	}

	public String getCOD_PARTC160() {
		return COD_PARTC160;
	}

	public void setCOD_PARTC160(String cOD_PART) {
		COD_PARTC160 = cOD_PART;
	}

	public String getVEIC_IDC160() {
		return VEIC_IDC160;
	}

	public void setVEIC_IDC160(String vEIC_ID) {
		VEIC_IDC160 = vEIC_ID;
	}

	public int getQTD_VOLC160() {
		return QTD_VOLC160;
	}

	public void setQTD_VOLC160(int qTD_VOL) {
		QTD_VOLC160 = qTD_VOL;
	}

	public float getPESO_BRTC160() {
		return PESO_BRTC160;
	}

	public void setPESO_BRTC160(float pESO_BRT) {
		PESO_BRTC160 = pESO_BRT;
	}

	public float getPESO_LIQC160() {
		return PESO_LIQC160;
	}

	public void setPESO_LIQC160(float pESO_LIQ) {
		PESO_LIQC160 = pESO_LIQ;
	}

	public String getUF_IDC160() {
		return UF_IDC160;
	}

	public void setUF_IDC160(String uF_ID) {
		UF_IDC160 = uF_ID;
	}
	
	

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	public C160() {
	}

	public C160(List<String> strs1) {
		if(strs1.size() >= 7) {
		this.setREGC160(strs1.get(0));
		this.setCOD_PARTC160(strs1.get(1));
		this.setVEIC_IDC160(strs1.get(2));
		if (strs1.get(3).length() >= 1 )
			this.setQTD_VOLC160(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 )
			this.setPESO_BRTC160(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 )
			this.setPESO_LIQC160(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setUF_IDC160(strs1.get(6));
	}
	}
}
