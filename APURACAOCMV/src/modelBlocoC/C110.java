package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class C110 {
	@Id
	@GeneratedValue
	private Long idC110;

	String REG110, COD_INFC110, TXT_COMPLC110;

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
		if (!(o instanceof C110))
			return false;
		return idC110 != null && idC110.equals(((C110) o).idC110);

	}

	@Override
	public int hashCode() {
		return 31;
	}

	@OneToMany(mappedBy = "c110")
	List<C111> listC111 = new ArrayList<C111>();

	public void addC111(C111 c111) {
		listC111.add(c111);
		c111.setC110(this);
	}

	public void removeC111(C111 c111) {
		listC111.remove(c111);
		c111.setC110(null);
	}

	@OneToMany(mappedBy = "c110")
	List<C112> listC112 = new ArrayList<C112>();

	public void addC112(C112 c112) {
		listC112.add(c112);
		c112.setC110(this);
	}

	public void removeC112(C112 c112) {
		listC112.remove(c112);
		c112.setC110(null);
	}

	@OneToMany(mappedBy = "c110")
	List<C113> listC113 = new ArrayList<C113>();

	public void addC113(C113 c113) {
		listC113.add(c113);
		c113.setC110(this);
	}

	public void removeC113(C113 c113) {
		listC113.remove(c113);
		c113.setC110(null);
	}

	@OneToMany(mappedBy = "c110")
	List<C114> listC114 = new ArrayList<C114>();

	public void addC114(C114 c114) {
		listC114.add(c114);
		c114.setC110(this);
	}

	public void removeC114(C114 c114) {
		listC114.remove(c114);
		c114.setC110(null);
	}

	@OneToMany(mappedBy = "c110")
	List<C115> listC115 = new ArrayList<C115>();

	public void addC115(C115 c115) {
		listC115.add(c115);
		c115.setC110(this);
	}

	public void removeC115(C115 c115) {
		listC115.remove(c115);
		c115.setC110(null);
	}

	@OneToMany(mappedBy = "c110")
	List<C116> listC116 = new ArrayList<C116>();

	public void addC116(C116 c116) {
		listC116.add(c116);
		c116.setC110(this);
	}

	public void removeC116(C116 c116) {
		listC116.remove(c116);
		c116.setC110(null);
	}

	public Long getIdC110() {
		return idC110;
	}

	public void setIdC110(Long id) {
		this.idC110 = id;
	}

	public String getREG110() {
		return REG110;
	}

	public void setREG110(String rEG) {
		REG110 = rEG;
	}

	public String getCOD_INFC110() {
		return COD_INFC110;
	}

	public void setCOD_INFC110(String cOD_INF) {
		COD_INFC110 = cOD_INF;
	}

	public String getTXT_COMPLC110() {
		return TXT_COMPLC110;
	}

	public void setTXT_COMPLC110(String tXT_COMPL) {
		TXT_COMPLC110 = tXT_COMPL;
	}
	/*
	 * public int getLinhaC110() { return linhaC110; } public void setLinhaC110(int
	 * nLinha) { this.linhaC110 = nLinha; }
	 */

	public List<C111> getListC111() {
		return listC111;
	}

	public void setListC111(List<C111> listC111) {
		this.listC111 = listC111;
	}

	public List<C112> getListC112() {
		return listC112;
	}

	public void setListC112(List<C112> listC112) {
		this.listC112 = listC112;
	}

	public List<C113> getListC113() {
		return listC113;
	}

	public void setListC113(List<C113> listC113) {
		this.listC113 = listC113;
	}

	public List<C114> getListC114() {
		return listC114;
	}

	public void setListC114(List<C114> listC114) {
		this.listC114 = listC114;
	}

	public List<C115> getListC115() {
		return listC115;
	}

	public void setListC115(List<C115> listC115) {
		this.listC115 = listC115;
	}

	public List<C116> getListC116() {
		return listC116;
	}

	public void setListC116(List<C116> listC116) {
		this.listC116 = listC116;
	}

	public C110() {
	}

	public C110(List<String> strs1) {
		if (strs1.size() >= 3) {
			this.setREG110(strs1.get(0));
			this.setCOD_INFC110(strs1.get(1));
			this.setTXT_COMPLC110(strs1.get(2));
		}
	}

}
