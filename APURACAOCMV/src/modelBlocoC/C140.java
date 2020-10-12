package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import efdUtil.RegexL;

@Entity
public class C140 implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;

	String REGC140, IND_EMITC140, IND_TITC140, DESC_TITC140, NUM_TITC140;

	int QTD_PARCC140;

	float VL_TITC140;
	@Transient
	C100 c100;
	@OneToMany(mappedBy = "c140")
	List<C141> listC141 = new ArrayList<>();

	public void addC141(C141 c141) {
		listC141.add(c141);
		c141.setC140(this);
	}

	public void removeC141(C141 c141) {
		listC141.remove(c141);
		c141.setC140(null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getREGC140() {
		return REGC140;
	}

	public void setREGC140(String rEG) {
		REGC140 = rEG;
	}

	public String getIND_EMITC140() {
		return IND_EMITC140;
	}

	public void setIND_EMITC140(String iND_EMIT) {
		IND_EMITC140 = iND_EMIT;
	}

	public String getIND_TITC140() {
		return IND_TITC140;
	}

	public void setIND_TITC140(String iND_TIT) {
		IND_TITC140 = iND_TIT;
	}

	public String getDESC_TITC140() {
		return DESC_TITC140;
	}

	public void setDESC_TITC140(String dESC_TIT) {
		DESC_TITC140 = dESC_TIT;
	}

	public String getNUM_TITC140() {
		return NUM_TITC140;
	}

	public void setNUM_TITC140(String nUM_TIT) {
		NUM_TITC140 = nUM_TIT;
	}

	public int getQTD_PARCC140() {
		return QTD_PARCC140;
	}

	public void setQTD_PARCC140(int qTD_PARC) {
		QTD_PARCC140 = qTD_PARC;
	}

	public float getVL_TITC140() {
		return VL_TITC140;
	}

	public void setVL_TITC140(float vL_TIT) {
		VL_TITC140 = vL_TIT;
	}

	public List<C141> getListC141() {
		return listC141;
	}

	public void setListC141(List<C141> listC141) {
		this.listC141 = listC141;
	}

	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	public C140() {
	}

	public C140(List<String> strs1) {
		if (strs1.size() >= 7) {
			if (strs1.size() >= 7) {
				this.setREGC140(strs1.get(0));
				this.setIND_EMITC140(strs1.get(1));
				this.setIND_TITC140(strs1.get(2));
				this.setDESC_TITC140(strs1.get(3));
				this.setNUM_TITC140(strs1.get(4));
				if (strs1.get(5).length() >= 1)
					this.setQTD_PARCC140(Integer.parseInt(strs1.get(5)));
				if (strs1.get(6).length() >= 1)
					this.setVL_TITC140(Float.parseFloat(strs1.get(6).replace(",", ".")));

			}
		}
	}
}
