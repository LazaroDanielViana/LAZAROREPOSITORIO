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
public class C175 {
	@Id
	@GeneratedValue
	private Long id;

	String REGC175, IND_VEIC_OPER, CNPJ, UF, CHASSI_VEIC;

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
		if (!(o instanceof C175))
			return false;
		return id != null && id.equals(((C175) o).id);

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

	public String getREGC175() {
		return REGC175;
	}

	public void setREGC175(String rEG) {
		REGC175 = rEG;
	}

	public String getIND_VEIC_OPER() {
		return IND_VEIC_OPER;
	}

	public void setIND_VEIC_OPER(String iND_VEIC_OPER) {
		IND_VEIC_OPER = iND_VEIC_OPER;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCHASSI_VEIC() {
		return CHASSI_VEIC;
	}

	public void setCHASSI_VEIC(String cHASSI_VEIC) {
		CHASSI_VEIC = cHASSI_VEIC;
	}

	public C175() {
	}

	public C175(List<String> strs1) {
		if (strs1.size() >= 5) {
			this.setREGC175(strs1.get(0));
			this.setIND_VEIC_OPER(strs1.get(1));
			this.setCNPJ(strs1.get(2));
			this.setUF(strs1.get(3));
			this.setCHASSI_VEIC(strs1.get(4));
		}
	}

}
