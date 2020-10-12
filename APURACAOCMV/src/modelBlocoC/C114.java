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
public class C114 {

	@Id
	@GeneratedValue
	private Long idC114;

	String REGC114, COD_MODC114, ECF_FABC114;

	int ECF_CXC114, NUM_DOCC114;

	Calendar DT_DOCC114 = new GregorianCalendar();

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
		if (!(o instanceof C114))
			return false;
		return idC114 != null && idC114.equals(((C114) o).idC114);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC114() {
		return idC114;
	}

	public void setIdC114(Long id) {
		this.idC114 = id;
	}

	public String getREGC114() {
		return REGC114;
	}

	public void setREGC114(String rEG) {
		REGC114 = rEG;
	}

	public String getCOD_MODC114() {
		return COD_MODC114;
	}

	public void setCOD_MODC114(String cOD_MOD) {
		COD_MODC114 = cOD_MOD;
	}

	public String getECF_FABC114() {
		return ECF_FABC114;
	}

	public void setECF_FABC114(String eCF_FAB) {
		ECF_FABC114 = eCF_FAB;
	}

	public int getECF_CXC114() {
		return ECF_CXC114;
	}

	public void setECF_CXC114(int eCF_CX) {
		ECF_CXC114 = eCF_CX;
	}

	public int getNUM_DOCC114() {
		return NUM_DOCC114;
	}

	public void setNUM_DOCC114(int nUM_DOC) {
		NUM_DOCC114 = nUM_DOC;
	}

	public Calendar getDT_DOCC114() {
		return DT_DOCC114;
	}

	public void setDT_DOCC114(Calendar dT_DOC) {
		DT_DOCC114 = dT_DOC;
	}

	public C114() {
	}

	public C114(List<String> strs1) {
		if (strs1.size() >= 6) {
			int ano, mes, dia;
			this.setREGC114(strs1.get(0));
			this.setCOD_MODC114(strs1.get(1));
			this.setECF_FABC114(strs1.get(2));
			if (strs1.get(3).length() >= 1)
				this.setECF_CXC114(Integer.parseInt(strs1.get(3)));
			if (strs1.get(4).length() >= 1)
				this.setNUM_DOCC114(Integer.parseInt(strs1.get(4)));
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
			this.setDT_DOCC114(calendar);
		}
	}
}
