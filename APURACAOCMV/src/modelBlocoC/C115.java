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
public class C115 {
	@Id
	@GeneratedValue
	private Long idC115;

	String REGC115;

	byte IND_CARGAC115;

	String CNPJ_COL, IE_COL;

	long CPF_COLC115;

	int COD_MUN_COLC115;

	String CNPJ_ENTGC115, IE_ENTGC115;

	long CPF_ENTGC115;

	int COD_MUN_ENTGC115;

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
		if (!(o instanceof C115))
			return false;
		return idC115 != null && idC115.equals(((C115) o).idC115);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC115() {
		return idC115;
	}

	public void setIdC115(Long id) {
		this.idC115 = id;
	}

	public String getREGC115() {
		return REGC115;
	}

	public void setREGC115(String rEG) {
		REGC115 = rEG;
	}

	public byte getIND_CARGAC115() {
		return IND_CARGAC115;
	}

	public void setIND_CARGAC115(byte iND_CARGA) {
		IND_CARGAC115 = iND_CARGA;
	}

	public String getCNPJ_COL() {
		return CNPJ_COL;
	}

	public void setCNPJ_COL(String cNPJ_COL) {
		CNPJ_COL = cNPJ_COL;
	}

	public String getIE_COL() {
		return IE_COL;
	}

	public void setIE_COL(String iE_COL) {
		IE_COL = iE_COL;
	}

	public long getCPF_COLC115() {
		return CPF_COLC115;
	}

	public void setCPF_COLC115(long cPF_COL) {
		CPF_COLC115 = cPF_COL;
	}

	public int getCOD_MUN_COLC115() {
		return COD_MUN_COLC115;
	}

	public void setCOD_MUN_COLC115(int cOD_MUN_COL) {
		COD_MUN_COLC115 = cOD_MUN_COL;
	}

	public String getCNPJ_ENTGC115() {
		return CNPJ_ENTGC115;
	}

	public void setCNPJ_ENTGC115(String cNPJ_ENTG) {
		CNPJ_ENTGC115 = cNPJ_ENTG;
	}

	public String getIE_ENTGC115() {
		return IE_ENTGC115;
	}

	public void setIE_ENTGC115(String iE_ENTG) {
		IE_ENTGC115 = iE_ENTG;
	}

	public long getCPF_ENTGC115() {
		return CPF_ENTGC115;
	}

	public void setCPF_ENTGC115(long cPF_ENTG) {
		CPF_ENTGC115 = cPF_ENTG;
	}

	public int getCOD_MUN_ENTGC115() {
		return COD_MUN_ENTGC115;
	}

	public void setCOD_MUN_ENTGC115(int cOD_MUN_ENTG) {
		COD_MUN_ENTGC115 = cOD_MUN_ENTG;
	}

	public C115() {
	}

	public C115(List<String> strs1) {
		if (strs1.size() >= 10) {
			this.setREGC115(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setIND_CARGAC115(Byte.parseByte(strs1.get(1)));
			this.setCNPJ_COL(strs1.get(2));
			this.setIE_COL(strs1.get(3));
			if (strs1.get(4).length() >= 1)
				this.setCPF_COLC115(Long.parseLong(strs1.get(4)));
			if (strs1.get(5).length() >= 1)
				this.setCOD_MUN_COLC115(Integer.parseInt(strs1.get(5)));
			this.setCNPJ_ENTGC115(strs1.get(6));
			this.setIE_ENTGC115(strs1.get(7));
			if (strs1.get(8).length() >= 1)
				this.setCPF_ENTGC115(Long.parseLong(strs1.get(8)));
			if (strs1.get(9).length() >= 1)
				this.setCOD_MUN_ENTGC115(Integer.parseInt(strs1.get(9)));
		}
	}

}
