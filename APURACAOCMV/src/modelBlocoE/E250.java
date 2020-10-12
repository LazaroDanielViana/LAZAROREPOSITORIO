package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E250 {
	String REG_E250, COD_OR_E250;
	float VL_OR_E250;
	Calendar DT_VCTO_E250 = new GregorianCalendar();
	String COD_REC_E250, NUM_PROC_E250, IND_PROC_E250, PROC_E250, TXT_COMPL_E250;
	Calendar MES_REF_E250 = new GregorianCalendar();
	
	E210 e210;

	public String getREG_E250() {
		return REG_E250;
	}

	public void setREG_E250(String rEG_E250) {
		REG_E250 = rEG_E250;
	}

	public String getCOD_OR_E250() {
		return COD_OR_E250;
	}

	public void setCOD_OR_E250(String cOD_OR_E250) {
		COD_OR_E250 = cOD_OR_E250;
	}

	public float getVL_OR_E250() {
		return VL_OR_E250;
	}

	public void setVL_OR_E250(float vL_OR_E250) {
		VL_OR_E250 = vL_OR_E250;
	}

	public Calendar getDT_VCTO_E250() {
		return DT_VCTO_E250;
	}

	public void setDT_VCTO_E250(Calendar dT_VCTO_E250) {
		DT_VCTO_E250 = dT_VCTO_E250;
	}

	public String getCOD_REC_E250() {
		return COD_REC_E250;
	}

	public void setCOD_REC_E250(String cOD_REC_E250) {
		COD_REC_E250 = cOD_REC_E250;
	}

	public String getNUM_PROC_E250() {
		return NUM_PROC_E250;
	}

	public void setNUM_PROC_E250(String nUM_PROC_E250) {
		NUM_PROC_E250 = nUM_PROC_E250;
	}

	public String getIND_PROC_E250() {
		return IND_PROC_E250;
	}

	public void setIND_PROC_E250(String iND_PROC_E250) {
		IND_PROC_E250 = iND_PROC_E250;
	}

	public String getPROC_E250() {
		return PROC_E250;
	}

	public void setPROC_E250(String pROC_E250) {
		PROC_E250 = pROC_E250;
	}

	public String getTXT_COMPL_E250() {
		return TXT_COMPL_E250;
	}

	public void setTXT_COMPL_E250(String tXT_COMPL_E250) {
		TXT_COMPL_E250 = tXT_COMPL_E250;
	}

	public Calendar getMES_REF_E250() {
		return MES_REF_E250;
	}

	public void setMES_REF_E250(Calendar mES_REF_E250) {
		MES_REF_E250 = mES_REF_E250;
	}
	
	

	public E210 getE210() {
		return e210;
	}

	public void setE210(E210 e210) {
		this.e210 = e210;
	}

	public E250() {
	}

	public E250(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E250(strs1.get(0));
		this.setCOD_OR_E250(strs1.get(1));
		this.setVL_OR_E250(Float.parseFloat(strs1.get(2).replace(",", ".")));
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
		this.setDT_VCTO_E250(calendar);
		this.setCOD_REC_E250(strs1.get(4));
		this.setNUM_PROC_E250(strs1.get(5));
		this.setIND_PROC_E250(strs1.get(6));
		this.setPROC_E250(strs1.get(7));
		this.setTXT_COMPL_E250(strs1.get(8));
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
		this.setMES_REF_E250(calendar);
	}

}
