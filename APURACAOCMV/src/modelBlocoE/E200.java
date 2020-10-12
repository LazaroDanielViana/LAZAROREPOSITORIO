package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E200 {

	String REG_E200, UF_E200;
	Calendar DT_INI_E200 = new GregorianCalendar();
	Calendar DT_FIN_E200 = new GregorianCalendar();
	
	E210 e210;

	public String getREG_E200() {
		return REG_E200;
	}

	public void setREG_E200(String rEG_E200) {
		REG_E200 = rEG_E200;
	}

	public String getUF_E200() {
		return UF_E200;
	}

	public void setUF_E200(String uF_E200) {
		UF_E200 = uF_E200;
	}

	public Calendar getDT_INI_E200() {
		return DT_INI_E200;
	}

	public void setDT_INI_E200(Calendar dT_INI_E200) {
		DT_INI_E200 = dT_INI_E200;
	}

	public Calendar getDT_FIN_E200() {
		return DT_FIN_E200;
	}

	public void setDT_FIN_E200(Calendar dT_FIN_E200) {
		DT_FIN_E200 = dT_FIN_E200;
	}
	

	public E210 getE210() {
		return e210;
	}

	public void setE210(E210 e210) {
		this.e210 = e210;
	}

	public E200() {
	}

	public E200(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E200(strs1.get(0));
		this.setUF_E200(strs1.get(1));
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
		this.setDT_INI_E200(calendar);
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
		this.setDT_FIN_E200(calendar);
	}
	
	public String toString() {
		return this.REG_E200 +"|"+ this.UF_E200 + "|"+ this.DT_INI_E200;
	}

}
