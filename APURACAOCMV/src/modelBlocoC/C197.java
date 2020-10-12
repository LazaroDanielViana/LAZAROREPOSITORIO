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
public class C197 {
	@Id
	@GeneratedValue
	private Long id;

	String REGC197, COD_AJ, DESCR_COMPL_AJ, COD_ITEM;

	float VL_BC_ICMS, ALIQ_ICMS, VL_ICMS, VL_OUTROS;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c195_id")
	C195 c195;

	public C195 getC195() {
		return c195;
	}

	public void setC195(C195 c195) {
		this.c195 = c195;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C197))
			return false;
		return id != null && id.equals(((C197) o).id);

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

	public String getREGC197() {
		return REGC197;
	}

	public void setREGC197(String rEG) {
		REGC197 = rEG;
	}

	public String getCOD_AJ() {
		return COD_AJ;
	}

	public void setCOD_AJ(String cOD_AJ) {
		COD_AJ = cOD_AJ;
	}

	public String getDESCR_COMPL_AJ() {
		return DESCR_COMPL_AJ;
	}

	public void setDESCR_COMPL_AJ(String dESCR_COMPL_AJ) {
		DESCR_COMPL_AJ = dESCR_COMPL_AJ;
	}

	public String getCOD_ITEM() {
		return COD_ITEM;
	}

	public void setCOD_ITEM(String cOD_ITEM) {
		COD_ITEM = cOD_ITEM;
	}

	public float getVL_BC_ICMS() {
		return VL_BC_ICMS;
	}

	public void setVL_BC_ICMS(float vL_BC_ICMS) {
		VL_BC_ICMS = vL_BC_ICMS;
	}

	public float getALIQ_ICMS() {
		return ALIQ_ICMS;
	}

	public void setALIQ_ICMS(float aLIQ_ICMS) {
		ALIQ_ICMS = aLIQ_ICMS;
	}

	public float getVL_ICMS() {
		return VL_ICMS;
	}

	public void setVL_ICMS(float vL_ICMS) {
		VL_ICMS = vL_ICMS;
	}

	public float getVL_OUTROS() {
		return VL_OUTROS;
	}

	public void setVL_OUTROS(float vL_OUTROS) {
		VL_OUTROS = vL_OUTROS;
	}

	public C197() {
	}

	public C197(List<String> strs1) {
		this.setREGC197(strs1.get(0));
		this.setCOD_AJ(strs1.get(1));
		this.setDESCR_COMPL_AJ(strs1.get(2));
		this.setCOD_ITEM(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_BC_ICMS(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setALIQ_ICMS(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_ICMS(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_OUTROS(Float.parseFloat(strs1.get(7).replace(",", ".")));
	}

}
