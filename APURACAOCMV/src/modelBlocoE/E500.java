package modelBlocoE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class E500 {
	String REG_E500, IND_APUR_E500;
	Calendar DT_INI_E500 = new GregorianCalendar();
	Calendar DT_FIN_E500 = new GregorianCalendar();
	
	ArrayList<E510> listE510 = new ArrayList<>();
	E520 e520 = new E520();
	
	public String getREG_E500() {
		return REG_E500;
	}

	public void setREG_E500(String rEG_E500) {
		REG_E500 = rEG_E500;
	}

	public String getIND_APUR_E500() {
		return IND_APUR_E500;
	}

	public void setIND_APUR_E500(String iND_APUR_E500) {
		IND_APUR_E500 = iND_APUR_E500;
	}

	public Calendar getDT_INI_E500() {
		return DT_INI_E500;
	}

	public void setDT_INI_E500(Calendar dT_INI_E500) {
		DT_INI_E500 = dT_INI_E500;
	}

	public Calendar getDT_FIN_E500() {
		return DT_FIN_E500;
	}

	public void setDT_FIN_E500(Calendar dT_FIN_E500) {
		DT_FIN_E500 = dT_FIN_E500;
	}
	
	

	public ArrayList<E510> getListE510() {
		return listE510;
	}

	public void setListE510(ArrayList<E510> listE510) {
		this.listE510 = listE510;
	}

	public E520 getE520() {
		return e520;
	}

	public void setE520(E520 e520) {
		this.e520 = e520;
	}

	public E500() {
	}

	public E500(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_E500(strs1.get(0));
		this.setIND_APUR_E500(strs1.get(1));
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
		this.setDT_INI_E500(calendar);
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
		this.setDT_FIN_E500(calendar);
	}

}
