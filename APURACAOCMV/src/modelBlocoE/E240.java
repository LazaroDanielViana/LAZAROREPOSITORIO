package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E240 {
	String REG_E240, COD_PART_E240, COD_MOD_E240, SER_E240;
	int SUB_E240, NUM_DOC_E240;
	Calendar DT_DOC_E240 = new GregorianCalendar();
	String COD_ITEM_E240;
	float VL_AJ_ITEM_E240;
	String CHV_DOCe_E240;
	
	E220 e220;

	public String getREG_E240() {
		return REG_E240;
	}

	public void setREG_E240(String rEG_E240) {
		REG_E240 = rEG_E240;
	}

	public String getCOD_PART_E240() {
		return COD_PART_E240;
	}

	public void setCOD_PART_E240(String cOD_PART_E240) {
		COD_PART_E240 = cOD_PART_E240;
	}

	public String getCOD_MOD_E240() {
		return COD_MOD_E240;
	}

	public void setCOD_MOD_E240(String cOD_MOD_E240) {
		COD_MOD_E240 = cOD_MOD_E240;
	}

	public String getSER_E240() {
		return SER_E240;
	}

	public void setSER_E240(String sER_E240) {
		SER_E240 = sER_E240;
	}

	public int getSUB_E240() {
		return SUB_E240;
	}

	public void setSUB_E240(int sUB_E240) {
		SUB_E240 = sUB_E240;
	}

	public int getNUM_DOC_E240() {
		return NUM_DOC_E240;
	}

	public void setNUM_DOC_E240(int nUM_DOC_E240) {
		NUM_DOC_E240 = nUM_DOC_E240;
	}

	public Calendar getDT_DOC_E240() {
		return DT_DOC_E240;
	}

	public void setDT_DOC_E240(Calendar dT_DOC_E240) {
		DT_DOC_E240 = dT_DOC_E240;
	}

	public String getCOD_ITEM_E240() {
		return COD_ITEM_E240;
	}

	public void setCOD_ITEM_E240(String cOD_ITEM_E240) {
		COD_ITEM_E240 = cOD_ITEM_E240;
	}

	public float getVL_AJ_ITEM_E240() {
		return VL_AJ_ITEM_E240;
	}

	public void setVL_AJ_ITEM_E240(float vL_AJ_ITEM_E240) {
		VL_AJ_ITEM_E240 = vL_AJ_ITEM_E240;
	}

	public String getCHV_DOCe_E240() {
		return CHV_DOCe_E240;
	}

	public void setCHV_DOCe_E240(String cHV_DOCe_E240) {
		CHV_DOCe_E240 = cHV_DOCe_E240;
	}
	
	

	public E220 getE220() {
		return e220;
	}

	public void setE220(E220 e220) {
		this.e220 = e220;
	}

	public E240() {
	}

	public E240(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E240(strs1.get(0));
		this.setCOD_PART_E240(strs1.get(1));
		this.setCOD_MOD_E240(strs1.get(2));
		this.setSER_E240(strs1.get(3));
		this.setSUB_E240(Integer.parseInt(strs1.get(4)));
		this.setNUM_DOC_E240(Integer.parseInt(strs1.get(5)));
		if (strs1.get(6).length() == 8) {
			ano = Integer.parseInt(strs1.get(6).substring(4, 8));
			mes = Integer.parseInt(strs1.get(6).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(6).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_E240(calendar);
		this.setCOD_ITEM_E240(strs1.get(7));
		this.setVL_AJ_ITEM_E240(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setCHV_DOCe_E240(strs1.get(9));
	}

}
