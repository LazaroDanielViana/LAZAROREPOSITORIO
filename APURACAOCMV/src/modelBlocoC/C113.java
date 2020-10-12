package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import efdUtil.RegexL;

@Entity
public class C113 {

	@Id
	@GeneratedValue
	private Long idC113;

	String REGC113, IND_OPERC113, IND_EMITC113, COD_PARTC113, COD_MODC113, SERC113;

	int SUBC113, NUM_DOCC113;

	Calendar DT_DOCC113 = new GregorianCalendar();

	String CHV_DOCeC113;

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
		if (!(o instanceof C113))
			return false;
		return idC113 != null && idC113.equals(((C113) o).idC113);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getIdC113() {
		return idC113;
	}

	public void setIdC113(Long id) {
		this.idC113 = id;
	}

	public String getREGC113() {
		return REGC113;
	}

	public void setREGC113(String rEG) {
		REGC113 = rEG;
	}

	public String getIND_OPERC113() {
		return IND_OPERC113;
	}

	public void setIND_OPERC113(String iND_OPER) {
		IND_OPERC113 = iND_OPER;
	}

	public String getIND_EMITC113() {
		return IND_EMITC113;
	}

	public void setIND_EMITC113(String iND_EMIT) {
		IND_EMITC113 = iND_EMIT;
	}

	public String getCOD_PARTC113() {
		return COD_PARTC113;
	}

	public void setCOD_PARTC113(String cOD_PART) {
		COD_PARTC113 = cOD_PART;
	}

	public String getCOD_MODC113() {
		return COD_MODC113;
	}

	public void setCOD_MODC113(String cOD_MOD) {
		COD_MODC113 = cOD_MOD;
	}

	public String getSERC113() {
		return SERC113;
	}

	public void setSERC113(String sER) {
		SERC113 = sER;
	}

	public int getSUBC113() {
		return SUBC113;
	}

	public void setSUBC113(int sUB) {
		SUBC113 = sUB;
	}

	public int getNUM_DOCC113() {
		return NUM_DOCC113;
	}

	public void setNUM_DOCC113(int nUM_DOC) {
		NUM_DOCC113 = nUM_DOC;
	}

	public Calendar getDT_DOCC113() {
		return DT_DOCC113;
	}

	public void setDT_DOCC113(Calendar dT_DOC) {
		DT_DOCC113 = dT_DOC;
	}

	public String getCHV_DOCeC113() {
		return CHV_DOCeC113;
	}

	public void setCHV_DOCeC113(String cHV_DOCe) {
		CHV_DOCeC113 = cHV_DOCe;
	}

	public C113() {
	}

	public C113(List<String> strs1) {
		if(strs1.size() >= 10) {
		int ano, mes, dia;
		this.setREGC113(strs1.get(0));
		this.setIND_OPERC113(strs1.get(1));
		this.setIND_EMITC113(strs1.get(2));
		this.setCOD_PARTC113(strs1.get(3));
		this.setCOD_MODC113(strs1.get(4));
		this.setSERC113(strs1.get(5));
		if (strs1.get(6).length() >= 1 )
			this.setSUBC113(Integer.parseInt(strs1.get(6)));
		if (strs1.get(7).length() >= 1 )
			this.setNUM_DOCC113(Integer.parseInt(strs1.get(7)));
		if (strs1.get(8).length() == 8) {
			ano = Integer.parseInt(strs1.get(8).substring(4, 8));
			mes = Integer.parseInt(strs1.get(8).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(8).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOCC113(calendar);
		this.setCHV_DOCeC113(strs1.get(9));
	}
	}

}
