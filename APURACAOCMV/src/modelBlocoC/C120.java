package modelBlocoC;

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
public class C120 {
	@Id
	@GeneratedValue
	private Long idC120;

	String REG120, COD_DOC_IMPC120, NUM_DOC_IMPC120;

	float PIS_IMPC120, COFINS_IMPC120;

	String NUM_ACDRAWC120;

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
		if (!(o instanceof C120))
			return false;
		return idC120 != null && idC120.equals(((C120) o).idC120);

	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC120() {
		return idC120;
	}

	public void setIdC120(Long id) {
		this.idC120 = id;
	}

	public String getREG120() {
		return REG120;
	}

	public void setREG120(String rEG) {
		REG120 = rEG;
	}

	public String getCOD_DOC_IMPC120() {
		return COD_DOC_IMPC120;
	}

	public void setCOD_DOC_IMPC120(String cOD_DOC_IMP) {
		COD_DOC_IMPC120 = cOD_DOC_IMP;
	}

	public String getNUM_DOC_IMPC120() {
		return NUM_DOC_IMPC120;
	}

	public void setNUM_DOC_IMPC120(String nUM_DOC_IMP) {
		NUM_DOC_IMPC120 = nUM_DOC_IMP;
	}

	public float getPIS_IMPC120() {
		return PIS_IMPC120;
	}

	public void setPIS_IMPC120(float pIS_IMP) {
		PIS_IMPC120 = pIS_IMP;
	}

	public float getCOFINS_IMPC120() {
		return COFINS_IMPC120;
	}

	public void setCOFINS_IMPC120(float cOFINS_IMP) {
		COFINS_IMPC120 = cOFINS_IMP;
	}

	public String getNUM_ACDRAWC120() {
		return NUM_ACDRAWC120;
	}

	public void setNUM_ACDRAWC120(String nUM_ACDRAW) {
		NUM_ACDRAWC120 = nUM_ACDRAW;
	}

	/*
	 * public int getLinhaC120() { return linhaC120; }
	 * 
	 * public void setLinhaC120(int linha) { this.linhaC120 = linha; }
	 */
	public C120() {
	}

	public C120(List<String> strs1) {
		if (strs1.size() >= 6) {
			this.setREG120(strs1.get(0));
			this.setCOD_DOC_IMPC120(strs1.get(1));
			this.setNUM_DOC_IMPC120(strs1.get(2));
			if (strs1.get(3).length() >= 1)
				this.setPIS_IMPC120(Float.parseFloat(strs1.get(3).replace(",", ".")));
			if (strs1.get(4).length() >= 1)
				this.setCOFINS_IMPC120(Float.parseFloat(strs1.get(4).replace(",", ".")));
			this.setNUM_ACDRAWC120(strs1.get(5));
		}

	}

}
