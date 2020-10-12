package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E116 {
	String REG_E116, COD_OR_E116;
	float VL_OR_E116;
	Calendar DT_VCTO_E116 = new GregorianCalendar();
	String COD_REC_E116, NUM_PROC_E116, IND_PROC_E116, PROC_E116, TXT_COMPL_E116;

	Calendar MES_REF_E116 = new GregorianCalendar();
	
	E110 e110;

	public String getREG_E116() {
		return REG_E116;
	}

	public void setREG_E116(String rEG_E116) {
		REG_E116 = rEG_E116;
	}

	public String getCOD_OR_E116() {
		return COD_OR_E116;
	}

	public void setCOD_OR_E116(String cOD_OR_E116) {
		COD_OR_E116 = cOD_OR_E116;
	}

	public float getVL_OR_E116() {
		return VL_OR_E116;
	}

	public void setVL_OR_E116(float vL_OR_E116) {
		VL_OR_E116 = vL_OR_E116;
	}

	public Calendar getDT_VCTO_E116() {
		return DT_VCTO_E116;
	}

	public void setDT_VCTO_E116(Calendar dT_VCTO_E116) {
		DT_VCTO_E116 = dT_VCTO_E116;
	}

	public String getCOD_REC_E116() {
		return COD_REC_E116;
	}

	public void setCOD_REC_E116(String cOD_REC_E116) {
		COD_REC_E116 = cOD_REC_E116;
	}

	public String getNUM_PROC_E116() {
		return NUM_PROC_E116;
	}

	public void setNUM_PROC_E116(String nUM_PROC_E116) {
		NUM_PROC_E116 = nUM_PROC_E116;
	}

	public String getIND_PROC_E116() {
		return IND_PROC_E116;
	}

	public void setIND_PROC_E116(String iND_PROC_E116) {
		IND_PROC_E116 = iND_PROC_E116;
	}

	public String getPROC_E116() {
		return PROC_E116;
	}

	public void setPROC_E116(String pROC_E116) {
		PROC_E116 = pROC_E116;
	}

	public String getTXT_COMPL_E116() {
		return TXT_COMPL_E116;
	}

	public void setTXT_COMPL_E116(String tXT_COMPL_E116) {
		TXT_COMPL_E116 = tXT_COMPL_E116;
	}

	public Calendar getMES_REF_E116() {
		return MES_REF_E116;
	}

	public void setMES_REF_E116(Calendar mES_REF_E116) {
		MES_REF_E116 = mES_REF_E116;
	}
	
	

	public E110 getE110() {
		return e110;
	}

	public void setE110(E110 e110) {
		this.e110 = e110;
	}

	public E116() {
	}

	public E116(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E116(strs1.get(0));
		this.setCOD_OR_E116(strs1.get(1));
		this.setVL_OR_E116(Float.parseFloat(strs1.get(2).replace(",", ".")));
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
		this.setDT_VCTO_E116(calendar);
		this.setCOD_REC_E116(strs1.get(4));
		this.setNUM_PROC_E116(strs1.get(5));
		this.setIND_PROC_E116(strs1.get(6));
		this.setPROC_E116(strs1.get(7));
		this.setTXT_COMPL_E116(strs1.get(8));
		if (strs1.get(9).length() == 8) {
			ano = Integer.parseInt(strs1.get(9).substring(4, 8));
			mes = Integer.parseInt(strs1.get(9).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(9).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setMES_REF_E116(calendar);
	}

}
