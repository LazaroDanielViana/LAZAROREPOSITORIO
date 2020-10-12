package modelBloco0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class R0205 {
	String REG_R0205,
	DESCR_ANT_ITEM_R0205;
	Calendar DT_INI_R0205 = new GregorianCalendar();
	Calendar DT_FIM_R0205 = new GregorianCalendar();
	String COD_ANT_ITEM_R0205;	
	R0200 r0200;
	
	public String getREG_R0205() {
		return REG_R0205;
	}
	public void setREG_R0205(String rEG_R0205) {
		REG_R0205 = rEG_R0205;
	}
	public String getDESCR_ANT_ITEM_R0205() {
		return DESCR_ANT_ITEM_R0205;
	}
	public void setDESCR_ANT_ITEM_R0205(String dESCR_ANT_ITEM_R0205) {
		DESCR_ANT_ITEM_R0205 = dESCR_ANT_ITEM_R0205;
	}
	public Calendar getDT_INI_R0205() {
		return DT_INI_R0205;
	}
	public void setDT_INI_R0205(Calendar dT_INI_R0205) {
		DT_INI_R0205 = dT_INI_R0205;
	}
	public Calendar getDT_FIM_R0205() {
		return DT_FIM_R0205;
	}
	public void setDT_FIM_R0205(Calendar dT_FIM_R0205) {
		DT_FIM_R0205 = dT_FIM_R0205;
	}
	public String getCOD_ANT_ITEM_R0205() {
		return COD_ANT_ITEM_R0205;
	}
	public void setCOD_ANT_ITEM_R0205(String cOD_ANT_ITEM_R0205) {
		COD_ANT_ITEM_R0205 = cOD_ANT_ITEM_R0205;
	}
	
	
	public R0200 getR0200() {
		return r0200;
	}
	public void setR0200(R0200 r0200) {
		this.r0200 = r0200;
	}
	public R0205() {
	}

	public R0205(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_R0205(strs1.get(0));
		this.setDESCR_ANT_ITEM_R0205(strs1.get(1));
		if (strs1.get(2).length() == 8) {
			ano = Integer.parseInt(strs1.get(2).substring(4, 8));
			mes = Integer.parseInt(strs1.get(2).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(2).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_INI_R0205(calendar);
		if (strs1.get(3).length() == 8) {
			ano = Integer.parseInt(strs1.get(3).substring(4, 8));
			mes = Integer.parseInt(strs1.get(3).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(3).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_FIM_R0205(calendar);
		this.setCOD_ANT_ITEM_R0205(strs1.get(4));
	}
	
	

}
