package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author lazaro
 *
 */
public class E100 {
	String REG_E100;
	Calendar DT_INI_E100;
	Calendar DT_FIN_E100;

	E110 e110;
	
	public String getREG_E100() {
		return REG_E100;
	}

	public void setREG_E100(String rEG_E100) {
		REG_E100 = rEG_E100;
	}

	public Calendar getDT_INI_E100() {
		return DT_INI_E100;
	}

	public void setDT_INI_E100(Calendar dT_INI_E100) {
		DT_INI_E100 = dT_INI_E100;
	}

	public Calendar getDT_FIN_E100() {
		return DT_FIN_E100;
	}

	public void setDT_FIN_E100(Calendar dT_FIN_E100) {
		DT_FIN_E100 = dT_FIN_E100;
	}
	
	

	public E110 getE110() {
		return e110;
	}

	public void setE110(E110 e110) {
		this.e110 = e110;
	}

	public E100() {
	}

	public E100(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E100(strs1.get(0));
		if (strs1.get(1).length() == 8) {
			ano = Integer.parseInt(strs1.get(1).substring(4, 8));
			mes = Integer.parseInt(strs1.get(1).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(1).substring(0, 2));
			System.out.println("strs1.get(1) vale: " + strs1.get(1));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_INI_E100(calendar);
		if (strs1.get(2).length() == 8) {
			ano = Integer.parseInt(strs1.get(2).substring(4, 8));
			mes = Integer.parseInt(strs1.get(2).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(2).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_FIN_E100(calendar);
	}
	
	public String toString() {
		return this.REG_E100 + "|" + this.getDT_INI_E100().YEAR +"|" + this.getDT_FIN_E100().MONTH;
	}
	

}
