package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class C111 {

	@Id
	@GeneratedValue
	private Long idC111;

	String REG111, NUM_PROCC111, IND_PROCC111;

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
		if (!(o instanceof C111))
			return false;
		return idC111 != null && idC111.equals(((C111) o).idC111);

	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC111() {
		return idC111;
	}

	public void setIdC111(Long id) {
		this.idC111 = id;
	}

	public String getREG111() {
		return REG111;
	}

	public void setREG111(String rEG) {
		REG111 = rEG;
	}

	public String getNUM_PROCC111() {
		return NUM_PROCC111;
	}

	public void setNUM_PROCC111(String nUM_PROC) {
		NUM_PROCC111 = nUM_PROC;
	}

	public String getIND_PROCC111() {
		return IND_PROCC111;
	}

	public void setIND_PROCC111(String iND_PROC) {
		IND_PROCC111 = iND_PROC;
	}

	public C111() {
	}

	public C111(List<String> strs1) {
		if (strs1.size() >= 3) {
			this.setREG111(strs1.get(0));
			this.setNUM_PROCC111(strs1.get(1));
			this.setIND_PROCC111(strs1.get(2));
		}
	}

}
