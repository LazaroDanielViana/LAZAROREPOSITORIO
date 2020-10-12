package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class C195 {
	@Id
	@GeneratedValue
	private Long id;

	String REGC195, COD_OBS, TXT_COMPL;

	@OneToMany(mappedBy = "c195")
	List<C197> listC197 = new ArrayList<C197>();

	public void addC197(C197 c197) {
		listC197.add(c197);
		c197.setC195(this);
	}

	public void removeC197(C197 c197) {
		listC197.remove(c197);
		c197.setC195(null);
	}

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
		if (!(o instanceof C195))
			return false;
		return id != null && id.equals(((C195) o).id);

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

	public String getREGC195() {
		return REGC195;
	}

	public void setREGC195(String rEG) {
		REGC195 = rEG;
	}

	public String getCOD_OBS() {
		return COD_OBS;
	}

	public void setCOD_OBS(String cOD_OBS) {
		COD_OBS = cOD_OBS;
	}

	public String getTXT_COMPL() {
		return TXT_COMPL;
	}

	public void setTXT_COMPL(String tXT_COMPL) {
		TXT_COMPL = tXT_COMPL;
	}
	/*
	 * public int getLinhaC195() { return linhaC195; } public void setLinhaC195(int
	 * linha) { this.linhaC195 = linha; }
	 */

	public List<C197> getListC197() {
		return listC197;
	}

	public void setListC197(List<C197> listC197) {
		this.listC197 = listC197;
	}

	public C195() {
	}

	public C195(List<String> strs1) {
		this.setREGC195(strs1.get(0));
		this.setCOD_OBS(strs1.get(1));
		this.setTXT_COMPL(strs1.get(2));
	}

}
