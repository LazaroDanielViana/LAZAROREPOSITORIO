package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D530 {
	String REG_D530, IND_SERV_D530;
	Calendar DT_INI_SERV_D530 = new GregorianCalendar();
	Calendar DT_FIN_SERV_D530 = new GregorianCalendar();
	int PER_FISCAL_D530;
	String COD_AREA_D530;
	int TERMINAL_D530;
	
	D500 d500;

	public String getREG_D530() {
		return REG_D530;
	}

	public void setREG_D530(String rEG_D530) {
		REG_D530 = rEG_D530;
	}

	public String getIND_SERV_D530() {
		return IND_SERV_D530;
	}

	public void setIND_SERV_D530(String iND_SERV_D530) {
		IND_SERV_D530 = iND_SERV_D530;
	}

	public Calendar getDT_INI_SERV_D530() {
		return DT_INI_SERV_D530;
	}

	public void setDT_INI_SERV_D530(Calendar dT_INI_SERV_D530) {
		DT_INI_SERV_D530 = dT_INI_SERV_D530;
	}

	public Calendar getDT_FIN_SERV_D530() {
		return DT_FIN_SERV_D530;
	}

	public void setDT_FIN_SERV_D530(Calendar dT_FIN_SERV_D530) {
		DT_FIN_SERV_D530 = dT_FIN_SERV_D530;
	}

	public int getPER_FISCAL_D530() {
		return PER_FISCAL_D530;
	}

	public void setPER_FISCAL_D530(int pER_FISCAL_D530) {
		PER_FISCAL_D530 = pER_FISCAL_D530;
	}

	public String getCOD_AREA_D530() {
		return COD_AREA_D530;
	}

	public void setCOD_AREA_D530(String cOD_AREA_D530) {
		COD_AREA_D530 = cOD_AREA_D530;
	}

	public int getTERMINAL_D530() {
		return TERMINAL_D530;
	}

	public void setTERMINAL_D530(int tERMINAL_D530) {
		TERMINAL_D530 = tERMINAL_D530;
	}
	
	

	public D500 getD500() {
		return d500;
	}

	public void setD500(D500 d500) {
		this.d500 = d500;
	}

	public D530() {
	}

	public D530(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D530(strs1.get(0));
		this.setIND_SERV_D530(strs1.get(1));
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
		this.setDT_INI_SERV_D530(calendar);
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
		this.setDT_FIN_SERV_D530(calendar);
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setPER_FISCAL_D530(Integer.parseInt(strs1.get(4)));
		this.setCOD_AREA_D530(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setTERMINAL_D530(Integer.parseInt(strs1.get(6)));
	}

}
