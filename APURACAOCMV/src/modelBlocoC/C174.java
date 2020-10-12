package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class C174 {

	@Id
	@GeneratedValue
	private Long id;

	String REGC174, IND_ARM, NUM_ARM, DESCR_COMPL;

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
		if (!(o instanceof C174))
			return false;
		return id != null && id.equals(((C174) o).id);

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

	public String getREGC174() {
		return REGC174;
	}

	public void setREGC174(String rEG) {
		REGC174 = rEG;
	}

	public String getIND_ARM() {
		return IND_ARM;
	}

	public void setIND_ARM(String iND_ARM) {
		IND_ARM = iND_ARM;
	}

	public String getNUM_ARM() {
		return NUM_ARM;
	}

	public void setNUM_ARM(String nUM_ARM) {
		NUM_ARM = nUM_ARM;
	}

	public String getDESCR_COMPL() {
		return DESCR_COMPL;
	}

	public void setDESCR_COMPL(String dESCR_COMPL) {
		DESCR_COMPL = dESCR_COMPL;
	}

	public C174() {
	}

	public C174(List<String> strs1) {
		if(strs1.size() >= 4) {
		this.setREGC174(strs1.get(0));
		this.setIND_ARM(strs1.get(1));
		this.setNUM_ARM(strs1.get(2));
		this.setDESCR_COMPL(strs1.get(3));
	}
	}

}
