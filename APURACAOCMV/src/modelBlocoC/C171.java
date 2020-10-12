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

//@Entity
public class C171 {

	@Id
	@GeneratedValue
	private Long id;

	String REGC171, NUM_TANQUE;
	float QTDE;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c170_id")
	C170 c170;

	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C171))
			return false;
		return id != null && id.equals(((C171) o).id);

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

	public String getREGC171() {
		return REGC171;
	}

	public void setREGC171(String rEG) {
		REGC171 = rEG;
	}

	public String getNUM_TANQUE() {
		return NUM_TANQUE;
	}

	public void setNUM_TANQUE(String nUM_TANQUE) {
		NUM_TANQUE = nUM_TANQUE;
	}

	public float getQTDE() {
		return QTDE;
	}

	public void setQTDE(float qTDE) {
		QTDE = qTDE;
	}

	public C171() {
	}

	public C171(List<String> strs1) {
		if (strs1.size() >= 3) {
			this.setREGC171(strs1.get(0));
			this.setNUM_TANQUE(strs1.get(1));
			if (strs1.get(2).length() >= 1 )
				this.setQTDE(Float.parseFloat(strs1.get(2).replace(",", ".")));
		}
	}
}
