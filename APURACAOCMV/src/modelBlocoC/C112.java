package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import efdUtil.RegexL;

@Entity
public class C112 {

	@Id
	@GeneratedValue
	private Long idC112;

	String REGC112, COD_DAC112, UFC112, NUM_DAC112, COD_AUTC112;

	float VL_DAC112;

	Calendar DT_VCTOC112 = new GregorianCalendar();
	Calendar DT_PGTOC112 = new GregorianCalendar();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c110_id")
	C110 c110;

	public C110 getC110() {
		return c110;
	}

	public void setC110(C110 c110) {
		this.c110 = c110;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C112))
			return false;
		return idC112 != null && idC112.equals(((C112) o).idC112);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC112() {
		return idC112;
	}

	public void setIdC112(Long id) {
		this.idC112 = id;
	}

	public String getREGC112() {
		return REGC112;
	}

	public void setREGC112(String rEG) {
		REGC112 = rEG;
	}

	public String getCOD_DAC112() {
		return COD_DAC112;
	}

	public void setCOD_DAC112(String cOD_DA) {
		COD_DAC112 = cOD_DA;
	}

	public String getUFC112() {
		return UFC112;
	}

	public void setUFC112(String uF) {
		UFC112 = uF;
	}

	public String getNUM_DAC112() {
		return NUM_DAC112;
	}

	public void setNUM_DAC112(String nUM_DA) {
		NUM_DAC112 = nUM_DA;
	}

	public String getCOD_AUTC112() {
		return COD_AUTC112;
	}

	public void setCOD_AUTC112(String cOD_AUT) {
		COD_AUTC112 = cOD_AUT;
	}

	public float getVL_DAC112() {
		return VL_DAC112;
	}

	public void setVL_DAC112(float vL_DA) {
		VL_DAC112 = vL_DA;
	}

	public Calendar getDT_VCTOC112() {
		return DT_VCTOC112;
	}

	public void setDT_VCTOC112(Calendar dT_VCTO) {
		DT_VCTOC112 = dT_VCTO;
	}

	public Calendar getDT_PGTOC112() {
		return DT_PGTOC112;
	}

	public void setDT_PGTOC112(Calendar dT_PGTO) {
		DT_PGTOC112 = dT_PGTO;
	}

	public C112() {
	}

	public C112(List<String> strs1) {
		if (strs1.size() >= 8) {
			int ano, mes, dia;
			this.setREGC112(strs1.get(0));
			this.setCOD_DAC112(strs1.get(1));
			this.setUFC112(strs1.get(2));
			this.setNUM_DAC112(strs1.get(3));
			this.setCOD_AUTC112(strs1.get(4));
			if (strs1.get(5).length() >= 1)
				this.setVL_DAC112(Float.parseFloat(strs1.get(5).replace(",", ".")));
			if (strs1.get(6).length() == 8) {
				ano = Integer.parseInt(strs1.get(6).substring(4, 8));
				mes = Integer.parseInt(strs1.get(6).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(6).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_VCTOC112(calendar);
			if (strs1.get(7).length() == 8) {
				ano = Integer.parseInt(strs1.get(7).substring(4, 8));
				mes = Integer.parseInt(strs1.get(7).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(7).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_PGTOC112(calendar);
		}
	}

}
