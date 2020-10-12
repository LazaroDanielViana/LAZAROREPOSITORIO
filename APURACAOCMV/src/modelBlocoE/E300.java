package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import modelBlocoD.D110;

public class E300 {
	String REG_E300, UF_E300;
	Calendar DT_INI_E300;
	Calendar DT_FIN_E300;

	E310 e310;
	
	public String getREG_E300() {
		return REG_E300;
	}

	public void setREG_E300(String rEG_E300) {
		REG_E300 = rEG_E300;
	}

	public String getUF_E300() {
		return UF_E300;
	}

	public void setUF_E300(String uF_E300) {
		UF_E300 = uF_E300;
	}

	public Calendar getDT_INI_E300() {
		return DT_INI_E300;
	}

	public void setDT_INI_E300(Calendar dT_INI_E300) {
		DT_INI_E300 = dT_INI_E300;
	}

	public Calendar getDT_FIN_E300() {
		return DT_FIN_E300;
	}

	public void setDT_FIN_E300(Calendar dT_FIN_E300) {
		DT_FIN_E300 = dT_FIN_E300;
	}
	
	

	public E310 getE310() {
		return e310;
	}

	public void setE310(E310 e310) {
		this.e310 = e310;
	}

	public E300() {
	}

	public E300(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E300(strs1.get(0));
		this.setUF_E300(strs1.get(1));
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
		this.setDT_INI_E300(calendar);
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
		this.setDT_FIN_E300(calendar);

	}
	
	public String toString() {
		return this.REG_E300 +"|"+ this.DT_FIN_E300.toString();
		
		
	}
}
