package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E113 {
	String REG_E113, COD_PART_E113, COD_MOD_E113, SER_E113;
	int SUB_E113, NUM_DOC_E113;
	Calendar DT_DOC_E113 = new GregorianCalendar();
	String COD_ITEM_E113;
	float VL_AJ_ITEM_E113;
	String CHV_DOCe_E113;

	E111 e111;

	public String getREG_E113() {
		return REG_E113;
	}

	public void setREG_E113(String rEG_E113) {
		REG_E113 = rEG_E113;
	}

	public String getCOD_PART_E113() {
		return COD_PART_E113;
	}

	public void setCOD_PART_E113(String cOD_PART_E113) {
		COD_PART_E113 = cOD_PART_E113;
	}

	public String getCOD_MOD_E113() {
		return COD_MOD_E113;
	}

	public void setCOD_MOD_E113(String cOD_MOD_E113) {
		COD_MOD_E113 = cOD_MOD_E113;
	}

	public String getSER_E113() {
		return SER_E113;
	}

	public void setSER_E113(String sER_E113) {
		SER_E113 = sER_E113;
	}

	public int getSUB_E113() {
		return SUB_E113;
	}

	public void setSUB_E113(int sUB_E113) {
		SUB_E113 = sUB_E113;
	}

	public int getNUM_DOC_E113() {
		return NUM_DOC_E113;
	}

	public void setNUM_DOC_E113(int nUM_DOC_E113) {
		NUM_DOC_E113 = nUM_DOC_E113;
	}

	public Calendar getDT_DOC_E113() {
		return DT_DOC_E113;
	}

	public void setDT_DOC_E113(Calendar dT_DOC_E113) {
		DT_DOC_E113 = dT_DOC_E113;
	}

	public String getCOD_ITEM_E113() {
		return COD_ITEM_E113;
	}

	public void setCOD_ITEM_E113(String cOD_ITEM_E113) {
		COD_ITEM_E113 = cOD_ITEM_E113;
	}

	public float getVL_AJ_ITEM_E113() {
		return VL_AJ_ITEM_E113;
	}

	public void setVL_AJ_ITEM_E113(float vL_AJ_ITEM_E113) {
		VL_AJ_ITEM_E113 = vL_AJ_ITEM_E113;
	}

	public String getCHV_DOCe_E113() {
		return CHV_DOCe_E113;
	}

	public void setCHV_DOCe_E113(String cHV_DOCe_E113) {
		CHV_DOCe_E113 = cHV_DOCe_E113;
	}

	public E111 getE111() {
		return e111;
	}

	public void setE111(E111 e111) {
		this.e111 = e111;
	}

	public E113() {
	}

	public E113(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E113(strs1.get(0));
		this.setCOD_PART_E113(strs1.get(1));
		this.setCOD_MOD_E113(strs1.get(2));
		this.setSER_E113(strs1.get(3));
		this.setSUB_E113(Integer.parseInt(strs1.get(4)));
		this.setNUM_DOC_E113(Integer.parseInt(strs1.get(5)));
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
		this.setDT_DOC_E113(calendar);
		this.setCOD_ITEM_E113(strs1.get(7));
		this.setVL_AJ_ITEM_E113(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setCHV_DOCe_E113(strs1.get(9));
	}

}
