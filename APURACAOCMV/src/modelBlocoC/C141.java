package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import efdUtil.RegexL;

@Entity
public class C141 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long idC141;

	String REGC141;

	int NUM_PARCC141;

	Calendar DT_VCTOC141 = new GregorianCalendar();

	float VL_PARCC141;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "c140_id")
	C140 c140;

	public C140 getC140() {
		return c140;
	}

	public void setC140(C140 c140) {
		this.c140 = c140;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C141))
			return false;
		return idC141 != null && idC141.equals(((C141) o).idC141);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC141() {
		return idC141;
	}

	public void setIdC141(Long id) {
		this.idC141 = id;
	}

	public String getREGC141() {
		return REGC141;
	}

	public void setREGC141(String rEG) {
		REGC141 = rEG;
	}

	public int getNUM_PARCC141() {
		return NUM_PARCC141;
	}

	public void setNUM_PARCC141(int nUM_PARC) {
		NUM_PARCC141 = nUM_PARC;
	}

	public Calendar getDT_VCTOC141() {
		return DT_VCTOC141;
	}

	public void setDT_VCTOC141(Calendar dT_VCTO) {
		DT_VCTOC141 = dT_VCTO;
	}

	public float getVL_PARCC141() {
		return VL_PARCC141;
	}

	public void setVL_PARCC141(float vL_PARC) {
		VL_PARCC141 = vL_PARC;
	}

	public C141() {
	}

	public C141(List<String> strs1) {
		if (strs1.size() >= 4) {
			int ano, mes, dia;
			this.setREGC141(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setNUM_PARCC141(Integer.parseInt(strs1.get(1)));
			if (strs1.get(2).length() == 8) {
				ano = Integer.parseInt(strs1.get(2).substring(4, 8));
				mes = Integer.parseInt(strs1.get(2).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(2).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_VCTOC141(calendar);
			if (strs1.get(3).length() >= 1)
				this.setVL_PARCC141(Float.parseFloat(strs1.get(3).replace(",", ".")));
		}
	}

}
