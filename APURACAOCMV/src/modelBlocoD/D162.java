package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D162 {

	String REG_D162, COD_MOD_D162, SER_D162;

	int NUM_DOC_D162;
	Calendar DT_DOC_D162 = new GregorianCalendar();
	float VL_DOC_D162, VL_MERC_D162;
	float QTD_VOL_D162, PESO_BRT_D162, PESO_LIQ_D162;
	
	D160 d160;

	public String getREG_D162() {
		return REG_D162;
	}

	public void setREG_D162(String rEG_D162) {
		REG_D162 = rEG_D162;
	}

	public String getCOD_MOD_D162() {
		return COD_MOD_D162;
	}

	public void setCOD_MOD_D162(String cOD_MOD_D162) {
		COD_MOD_D162 = cOD_MOD_D162;
	}

	public String getSER_D162() {
		return SER_D162;
	}

	public void setSER_D162(String sER_D162) {
		SER_D162 = sER_D162;
	}

	public int getNUM_DOC_D162() {
		return NUM_DOC_D162;
	}

	public void setNUM_DOC_D162(int nUM_DOC_D162) {
		NUM_DOC_D162 = nUM_DOC_D162;
	}

	public Calendar getDT_DOC_D162() {
		return DT_DOC_D162;
	}

	public void setDT_DOC_D162(Calendar dT_DOC_D162) {
		DT_DOC_D162 = dT_DOC_D162;
	}

	public float getVL_DOC_D162() {
		return VL_DOC_D162;
	}

	public void setVL_DOC_D162(float vL_DOC_D162) {
		VL_DOC_D162 = vL_DOC_D162;
	}

	public float getVL_MERC_D162() {
		return VL_MERC_D162;
	}

	public void setVL_MERC_D162(float vL_MERC_D162) {
		VL_MERC_D162 = vL_MERC_D162;
	}

	public float getQTD_VOL_D162() {
		return QTD_VOL_D162;
	}

	public void setQTD_VOL_D162(float qTD_VOL_D162) {
		QTD_VOL_D162 = qTD_VOL_D162;
	}

	public float getPESO_BRT_D162() {
		return PESO_BRT_D162;
	}

	public void setPESO_BRT_D162(float pESO_BRT_D162) {
		PESO_BRT_D162 = pESO_BRT_D162;
	}

	public float getPESO_LIQ_D162() {
		return PESO_LIQ_D162;
	}

	public void setPESO_LIQ_D162(float pESO_LIQ_D162) {
		PESO_LIQ_D162 = pESO_LIQ_D162;
	}
	
	

	public D160 getD160() {
		return d160;
	}

	public void setD160(D160 d160) {
		this.d160 = d160;
	}

	public D162() {
	}

	public D162(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D162(strs1.get(0));
		this.setCOD_MOD_D162(strs1.get(1));
		this.setSER_D162(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNUM_DOC_D162(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() == 8) {
			ano = Integer.parseInt(strs1.get(4).substring(4, 8));
			mes = Integer.parseInt(strs1.get(4).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(4).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D162(calendar);
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_DOC_D162(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_MERC_D162(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setQTD_VOL_D162(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setPESO_BRT_D162(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setPESO_LIQ_D162(Float.parseFloat(strs1.get(9).replace(",", ".")));
	}

}
