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

//@Entity
public class C173 {

	@Id
	@GeneratedValue
	private Long id;

	String REGC173, LOTE_MED;

	float QTD_ITEM;

	Calendar DT_FAB = new GregorianCalendar();
	Calendar DT_VAL = new GregorianCalendar();

	String IND_MED, TP_PROD;

	float VL_TAB_MAX;

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
		if (!(o instanceof C173))
			return false;
		return id != null && id.equals(((C173) o).id);

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

	public String getREGC173() {
		return REGC173;
	}

	public void setREGC173(String rEG) {
		REGC173 = rEG;
	}

	public String getLOTE_MED() {
		return LOTE_MED;
	}

	public void setLOTE_MED(String lOTE_MED) {
		LOTE_MED = lOTE_MED;
	}

	public float getQTD_ITEM() {
		return QTD_ITEM;
	}

	public void setQTD_ITEM(float qTD_ITEM) {
		QTD_ITEM = qTD_ITEM;
	}

	public Calendar getDT_FAB() {
		return DT_FAB;
	}

	public void setDT_FAB(Calendar dT_FAB) {
		DT_FAB = dT_FAB;
	}

	public Calendar getDT_VAL() {
		return DT_VAL;
	}

	public void setDT_VAL(Calendar dT_VAL) {
		DT_VAL = dT_VAL;
	}

	public String getIND_MED() {
		return IND_MED;
	}

	public void setIND_MED(String iND_MED) {
		IND_MED = iND_MED;
	}

	public String getTP_PROD() {
		return TP_PROD;
	}

	public void setTP_PROD(String tP_PROD) {
		TP_PROD = tP_PROD;
	}

	public float getVL_TAB_MAX() {
		return VL_TAB_MAX;
	}

	public void setVL_TAB_MAX(float vL_TAB_MAX) {
		VL_TAB_MAX = vL_TAB_MAX;
	}

	public C173() {
	}

	public C173(List<String> strs1) {
		if (strs1.size() >= 8) {
			int ano, mes, dia;
			this.setREGC173(strs1.get(0));
			this.setLOTE_MED(strs1.get(1));
			if (strs1.get(2).length() >= 1)
				this.setQTD_ITEM(Float.parseFloat(strs1.get(2).replace(",", ".")));
			if (strs1.get(3).length() == 8) {
				ano = Integer.parseInt(strs1.get(3).substring(4, 8));
				mes = Integer.parseInt(strs1.get(3).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(3).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_FAB(calendar);
			if (strs1.get(4).length() == 8) {
				ano = Integer.parseInt(strs1.get(4).substring(4, 8));
				mes = Integer.parseInt(strs1.get(4).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(4).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_VAL(calendar);
			this.setIND_MED(strs1.get(5));
			this.setTP_PROD(strs1.get(6));
			if (strs1.get(7).length() >= 1)
				this.setVL_TAB_MAX(Float.parseFloat(strs1.get(7).replace(",", ".")));
		}
	}

}
