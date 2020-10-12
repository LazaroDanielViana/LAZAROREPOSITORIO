package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E313 {
	String REG_E313, COD_PART_E313, COD_MOD_E313, SER_E313;
	int SUB_E313, NUM_DOC_E313;
	String CHV_DOCe_E313;
	Calendar DT_DOC_E313 = new GregorianCalendar();
	String COD_ITEM_E313;
	float VL_AJ_ITEM_E313;

	E311 e311;
	public String getREG_E313() {
		return REG_E313;
	}

	public void setREG_E313(String rEG_E313) {
		REG_E313 = rEG_E313;
	}

	public String getCOD_PART_E313() {
		return COD_PART_E313;
	}

	public void setCOD_PART_E313(String cOD_PART_E313) {
		COD_PART_E313 = cOD_PART_E313;
	}

	public String getCOD_MOD_E313() {
		return COD_MOD_E313;
	}

	public void setCOD_MOD_E313(String cOD_MOD_E313) {
		COD_MOD_E313 = cOD_MOD_E313;
	}

	public String getSER_E313() {
		return SER_E313;
	}

	public void setSER_E313(String sER_E313) {
		SER_E313 = sER_E313;
	}

	public int getSUB_E313() {
		return SUB_E313;
	}

	public void setSUB_E313(int sUB_E313) {
		SUB_E313 = sUB_E313;
	}

	public int getNUM_DOC_E313() {
		return NUM_DOC_E313;
	}

	public void setNUM_DOC_E313(int nUM_DOC_E313) {
		NUM_DOC_E313 = nUM_DOC_E313;
	}

	public String getCHV_DOCe_E313() {
		return CHV_DOCe_E313;
	}

	public void setCHV_DOCe_E313(String cHV_DOCe_E313) {
		CHV_DOCe_E313 = cHV_DOCe_E313;
	}

	public Calendar getDT_DOC_E313() {
		return DT_DOC_E313;
	}

	public void setDT_DOC_E313(Calendar dT_DOC_E313) {
		DT_DOC_E313 = dT_DOC_E313;
	}

	public String getCOD_ITEM_E313() {
		return COD_ITEM_E313;
	}

	public void setCOD_ITEM_E313(String cOD_ITEM_E313) {
		COD_ITEM_E313 = cOD_ITEM_E313;
	}

	public float getVL_AJ_ITEM_E313() {
		return VL_AJ_ITEM_E313;
	}

	public void setVL_AJ_ITEM_E313(float vL_AJ_ITEM_E313) {
		VL_AJ_ITEM_E313 = vL_AJ_ITEM_E313;
	}
	
	

	public E311 getE311() {
		return e311;
	}

	public void setE311(E311 e311) {
		this.e311 = e311;
	}

	public E313() {
	}

	public E313(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E313(strs1.get(0));
		this.setCOD_PART_E313(strs1.get(1));
		this.setCOD_MOD_E313(strs1.get(2));
		this.setSER_E313(strs1.get(3));
		this.setSUB_E313(Integer.parseInt(strs1.get(4)));
		this.setNUM_DOC_E313(Integer.parseInt(strs1.get(5)));
		this.setCHV_DOCe_E313(strs1.get(6));
		if (strs1.get(7).length() == 8) {
			ano = Integer.parseInt(strs1.get(7).substring(4, 8));
			mes = Integer.parseInt(strs1.get(7).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(7).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_E313(calendar);
		this.setCOD_ITEM_E313(strs1.get(8));
		this.setVL_AJ_ITEM_E313(Float.parseFloat(strs1.get(9).replace(",", ".")));
	}

}
