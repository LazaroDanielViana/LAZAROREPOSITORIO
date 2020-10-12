package modelBlocoC;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import efdUtil.RegexL;

@Entity
public class C165 {

	@Id
	@GeneratedValue
	private Long id;

	String REGC165, COD_PARTC165, VEIC_IDC165, COD_AUTC165, NR_PASSEC165;

	Time HORAC165 = new Time(0, 0, 0);

	float TEMPERC165;

	float QTD_VOLC165, PESO_BRTC165, PESO_LIQC165;

	String NOM_MOTC165;

	long CPFC165;

	String UF_IDC165;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c100_id")
	C100 c100;

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C165))
			return false;
		return id != null && id.equals(((C165) o).id);

	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getREGC165() {
		return REGC165;
	}

	public void setREGC165(String rEG) {
		REGC165 = rEG;
	}

	public String getCOD_PARTC165() {
		return COD_PARTC165;
	}

	public void setCOD_PARTC165(String cOD_PART) {
		COD_PARTC165 = cOD_PART;
	}

	public String getVEIC_IDC165() {
		return VEIC_IDC165;
	}

	public void setVEIC_IDC165(String vEIC_ID) {
		VEIC_IDC165 = vEIC_ID;
	}

	public String getCOD_AUTC165() {
		return COD_AUTC165;
	}

	public void setCOD_AUTC165(String cOD_AUT) {
		COD_AUTC165 = cOD_AUT;
	}

	public String getNR_PASSEC165() {
		return NR_PASSEC165;
	}

	public void setNR_PASSEC165(String nR_PASSE) {
		NR_PASSEC165 = nR_PASSE;
	}

	public Time getHORAC165() {
		return HORAC165;
	}

	public void setHORAC165(Time hORA) {
		HORAC165 = hORA;
	}

	public float getTEMPERC165() {
		return TEMPERC165;
	}

	public void setTEMPERC165(float tEMPER) {
		TEMPERC165 = tEMPER;
	}

	public float getQTD_VOLC165() {
		return QTD_VOLC165;
	}

	public void setQTD_VOLC165(float qTD_VOL) {
		QTD_VOLC165 = qTD_VOL;
	}

	public float getPESO_BRTC165() {
		return PESO_BRTC165;
	}

	public void setPESO_BRTC165(float pESO_BRT) {
		PESO_BRTC165 = pESO_BRT;
	}

	public float getPESO_LIQC165() {
		return PESO_LIQC165;
	}

	public void setPESO_LIQC165(float pESO_LIQ) {
		PESO_LIQC165 = pESO_LIQ;
	}

	public String getNOM_MOTC165() {
		return NOM_MOTC165;
	}

	public void setNOM_MOTC165(String nOM_MOT) {
		NOM_MOTC165 = nOM_MOT;
	}

	public long getCPFC165() {
		return CPFC165;
	}

	public void setCPFC165(long cPF) {
		CPFC165 = cPF;
	}

	public String getUF_IDC165() {
		return UF_IDC165;
	}

	public void setUF_IDC165(String uF_ID) {
		UF_IDC165 = uF_ID;
	}

	public C165() {
	}

	public C165(List<String> strs1) {
		if (strs1.size() >= 13) {
			int hora, minuto, segundo;
			this.setREGC165(strs1.get(0));
			this.setCOD_PARTC165(strs1.get(1));
			this.setVEIC_IDC165(strs1.get(2));
			this.setCOD_AUTC165(strs1.get(3));
			this.setNR_PASSEC165(strs1.get(4));
			hora = Integer.parseInt(strs1.get(5).substring(0, 2)) - 1;
			minuto = Integer.parseInt(strs1.get(5).substring(2, 4)) - 1;
			segundo = Integer.parseInt(strs1.get(5).substring(4, 6)) - 1;
			Time time = new Time(hora, minuto, segundo);
			this.setHORAC165(time);
			if (strs1.get(6).length() >= 1)
				this.setTEMPERC165(Float.parseFloat(strs1.get(6).replace(",", ".")));
			if (strs1.get(7).length() >= 1)
				this.setQTD_VOLC165(Float.parseFloat(strs1.get(7).replace(",", ".")));
			if (strs1.get(8).length() >= 1)
				this.setPESO_BRTC165(Float.parseFloat(strs1.get(8).replace(",", ".")));
			if (strs1.get(9).length() >= 1)
				this.setPESO_LIQC165(Float.parseFloat(strs1.get(9).replace(",", ".")));
			this.setNOM_MOTC165(strs1.get(10));
			if (strs1.get(11).length() >= 1)
				this.setCPFC165(Long.parseLong(strs1.get(11)));
			this.setUF_IDC165(strs1.get(12));
		}
	}
}
