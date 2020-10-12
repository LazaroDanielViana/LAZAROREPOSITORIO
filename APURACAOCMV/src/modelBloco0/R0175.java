package modelBloco0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class R0175 {

	String REG_R0175;
	Calendar DT_ALT_R0175 = new GregorianCalendar();
	String NR_CAMPO_R0175, CONT_ANT_R0175;
	
	R0150 r0150;

	public String getREG_R0175() {
		return REG_R0175;
	}

	public void setREG_R0175(String rEG_R0175) {
		REG_R0175 = rEG_R0175;
	}

	public Calendar getDT_ALT_R0175() {
		return DT_ALT_R0175;
	}

	public void setDT_ALT_R0175(Calendar dT_ALT_R0175) {
		DT_ALT_R0175 = dT_ALT_R0175;
	}

	public String getNR_CAMPO_R0175() {
		return NR_CAMPO_R0175;
	}

	public void setNR_CAMPO_R0175(String nR_CAMPO_R0175) {
		NR_CAMPO_R0175 = nR_CAMPO_R0175;
	}

	public String getCONT_ANT_R0175() {
		return CONT_ANT_R0175;
	}

	public void setCONT_ANT_R0175(String cONT_ANT_R0175) {
		CONT_ANT_R0175 = cONT_ANT_R0175;
	}
	
	

	public R0150 getR0150() {
		return r0150;
	}

	public void setR0150(R0150 r0150) {
		this.r0150 = r0150;
	}

	public R0175() {
	}

	public R0175(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_R0175(strs1.get(0));
		if (strs1.get(1).length() == 8) {
			ano = Integer.parseInt(strs1.get(1).substring(4, 8));
			mes = Integer.parseInt(strs1.get(1).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(1).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_ALT_R0175(calendar);
		this.setNR_CAMPO_R0175(strs1.get(2));
		this.setCONT_ANT_R0175(strs1.get(3));
	}

}
