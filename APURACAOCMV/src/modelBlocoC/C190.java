package modelBlocoC;

import java.io.Serializable;
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
public class C190 implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	String REGC190;

	int CST_ICMS, CFOP;

	float ALIQ_ICMS, VL_OPR, VL_BC_ICMS, VL_ICMS, VL_BC_ICMS_ST, VL_ICMS_ST, VL_RED_BC, VL_IPI;

	String COD_OBS;

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
		if (!(o instanceof C190))
			return false;
		return id != null && id.equals(((C190) o).id);

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

	public String getREGC190() {
		return REGC190;
	}

	public void setREGC190(String rEG) {
		REGC190 = rEG;
	}

	public int getCST_ICMS() {
		return CST_ICMS;
	}

	public void setCST_ICMS(int cST_ICMS) {
		CST_ICMS = cST_ICMS;
	}

	public int getCFOP() {
		return CFOP;
	}

	public void setCFOP(int cFOP) {
		CFOP = cFOP;
	}

	public float getALIQ_ICMS() {
		return ALIQ_ICMS;
	}

	public void setALIQ_ICMS(float aLIQ_ICMS) {
		ALIQ_ICMS = aLIQ_ICMS;
	}

	public float getVL_OPR() {
		return VL_OPR;
	}

	public void setVL_OPR(float vL_OPR) {
		VL_OPR = vL_OPR;
	}

	public float getVL_BC_ICMS() {
		return VL_BC_ICMS;
	}

	public void setVL_BC_ICMS(float vL_BC_ICMS) {
		VL_BC_ICMS = vL_BC_ICMS;
	}

	public float getVL_ICMS() {
		return VL_ICMS;
	}

	public void setVL_ICMS(float vL_ICMS) {
		VL_ICMS = vL_ICMS;
	}

	public float getVL_BC_ICMS_ST() {
		return VL_BC_ICMS_ST;
	}

	public void setVL_BC_ICMS_ST(float vL_BC_ICMS_ST) {
		VL_BC_ICMS_ST = vL_BC_ICMS_ST;
	}

	public float getVL_ICMS_ST() {
		return VL_ICMS_ST;
	}

	public void setVL_ICMS_ST(float vL_ICMS_ST) {
		VL_ICMS_ST = vL_ICMS_ST;
	}

	public float getVL_RED_BC() {
		return VL_RED_BC;
	}

	public void setVL_RED_BC(float vL_RED_BC) {
		VL_RED_BC = vL_RED_BC;
	}

	public float getVL_IPI() {
		return VL_IPI;
	}

	public void setVL_IPI(float vL_IPI) {
		VL_IPI = vL_IPI;
	}

	public String getCOD_OBS() {
		return COD_OBS;
	}

	public void setCOD_OBS(String cOD_OBS) {
		COD_OBS = cOD_OBS;
	}

	public C190() {
	}

	public C190(List<String> strs1) {
		this.setREGC190(strs1.get(0));
		if (strs1.get(1).length() >= 1 )
			this.setCST_ICMS(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1 )
			this.setCFOP(Integer.parseInt(strs1.get(2)));
		if (strs1.get(3).length() >= 1 )
			this.setALIQ_ICMS(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1)
			this.setVL_OPR(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 )
			this.setVL_BC_ICMS(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1)
			this.setVL_ICMS(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 )
			this.setVL_BC_ICMS_ST(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 )
			this.setVL_ICMS_ST(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 )
			this.setVL_RED_BC(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1)
			this.setVL_IPI(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setCOD_OBS(strs1.get(11));
	}

}
