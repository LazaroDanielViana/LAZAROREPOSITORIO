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
public class C116 {

	@Id
	@GeneratedValue
	private Long idC116;

	String REG116, COD_MODC116;

	long NR_SATC116;

	String CHV_CFEC116;

	int NUM_CFEC116;

	Calendar DT_DOCC116 = new GregorianCalendar();

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
		if (!(o instanceof C116))
			return false;
		return idC116 != null && idC116.equals(((C116) o).idC116);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC116() {
		return idC116;
	}

	public void setIdC116(Long id) {
		this.idC116 = id;
	}

	public String getREG116() {
		return REG116;
	}

	public void setREG116(String rEG) {
		REG116 = rEG;
	}

	public String getCOD_MODC116() {
		return COD_MODC116;
	}

	public void setCOD_MODC116(String cOD_MOD) {
		COD_MODC116 = cOD_MOD;
	}

	public long getNR_SATC116() {
		return NR_SATC116;
	}

	public void setNR_SATC116(long nR_SAT) {
		NR_SATC116 = nR_SAT;
	}

	public String getCHV_CFEC116() {
		return CHV_CFEC116;
	}

	public void setCHV_CFEC116(String cHV_CFE) {
		CHV_CFEC116 = cHV_CFE;
	}

	public int getNUM_CFEC116() {
		return NUM_CFEC116;
	}

	public void setNUM_CFEC116(int nUM_CFE) {
		NUM_CFEC116 = nUM_CFE;
	}

	public Calendar getDT_DOCC116() {
		return DT_DOCC116;
	}

	public void setDT_DOCC116(Calendar dT_DOC) {
		DT_DOCC116 = dT_DOC;
	}

	public C116() {
	}

	public C116(List<String> strs1) {
		if (strs1.size() >= 6) {
			int ano, mes, dia;
			this.setREG116(strs1.get(0));
			this.setCOD_MODC116(strs1.get(1));
			if (strs1.get(2).length() >= 1)
				this.setNR_SATC116(Long.parseLong(strs1.get(2)));
			this.setCHV_CFEC116(strs1.get(3));
			if (strs1.get(4).length() >= 1)
				this.setNUM_CFEC116(Integer.parseInt(strs1.get(4)));
			if (strs1.get(5).length() == 8) {
				ano = Integer.parseInt(strs1.get(5).substring(4, 8));
				mes = Integer.parseInt(strs1.get(5).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(5).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_DOCC116(calendar);
		}
	}
}
