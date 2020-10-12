package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E316 {

	String REG_E316, COD_OR_E316;
	float VL_OR_E316;
	Calendar DT_VCTO_E316 = new GregorianCalendar();
	String COD_REC_E316, NUM_PROC_E316, IND_PROC_E316, PROC_E316, TXT_COMPL_E316;
	Calendar MES_REF_E316 = new GregorianCalendar();
	E310 e310;

	public String getREG_E316() {
		return REG_E316;
	}

	public void setREG_E316(String rEG_E316) {
		REG_E316 = rEG_E316;
	}

	public String getCOD_OR_E316() {
		return COD_OR_E316;
	}

	public void setCOD_OR_E316(String cOD_OR_E316) {
		COD_OR_E316 = cOD_OR_E316;
	}

	public float getVL_OR_E316() {
		return VL_OR_E316;
	}

	public void setVL_OR_E316(float vL_OR_E316) {
		VL_OR_E316 = vL_OR_E316;
	}

	public Calendar getDT_VCTO_E316() {
		return DT_VCTO_E316;
	}

	public void setDT_VCTO_E316(Calendar dT_VCTO_E316) {
		DT_VCTO_E316 = dT_VCTO_E316;
	}

	public String getCOD_REC_E316() {
		return COD_REC_E316;
	}

	public void setCOD_REC_E316(String cOD_REC_E316) {
		COD_REC_E316 = cOD_REC_E316;
	}

	public String getNUM_PROC_E316() {
		return NUM_PROC_E316;
	}

	public void setNUM_PROC_E316(String nUM_PROC_E316) {
		NUM_PROC_E316 = nUM_PROC_E316;
	}

	public String getIND_PROC_E316() {
		return IND_PROC_E316;
	}

	public void setIND_PROC_E316(String iND_PROC_E316) {
		IND_PROC_E316 = iND_PROC_E316;
	}

	public String getPROC_E316() {
		return PROC_E316;
	}

	public void setPROC_E316(String pROC_E316) {
		PROC_E316 = pROC_E316;
	}

	public String getTXT_COMPL_E316() {
		return TXT_COMPL_E316;
	}

	public void setTXT_COMPL_E316(String tXT_COMPL_E316) {
		TXT_COMPL_E316 = tXT_COMPL_E316;
	}

	public Calendar getMES_REF_E316() {
		return MES_REF_E316;
	}

	public void setMES_REF_E316(Calendar mES_REF_E316) {
		MES_REF_E316 = mES_REF_E316;
	}	
	

	

	public E310 getE310() {
		return e310;
	}

	public void setE310(E310 e310) {
		this.e310 = e310;
	}

	public E316() {
	}

	public E316(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E316(strs1.get(0));
		this.setCOD_OR_E316(strs1.get(1));
		this.setVL_OR_E316(Float.parseFloat(strs1.get(2).replace(",", ".")));
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
		this.setDT_VCTO_E316(calendar);
		this.setCOD_REC_E316(strs1.get(4));
		this.setNUM_PROC_E316(strs1.get(5));
		this.setIND_PROC_E316(strs1.get(6));
		this.setPROC_E316(strs1.get(7));
		this.setTXT_COMPL_E316(strs1.get(8));
		if (strs1.get(9).length() == 6) {
			ano = Integer.parseInt(strs1.get(9).substring(2, 6));
			mes = Integer.parseInt(strs1.get(9).substring(0, 2)) - 1;
			dia = 01;
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setMES_REF_E316(calendar);
	}

}
