package modelBloco0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class R0600 {
	String REG_R0600;
	Calendar DT_ALT_R0600 = new GregorianCalendar();
	String COD_CCUS_R0600,
	CCUS_R0600;
	
	public String getREG_R0600() {
		return REG_R0600;
	}
	public void setREG_R0600(String rEG_R0600) {
		REG_R0600 = rEG_R0600;
	}
	public Calendar getDT_ALT_R0600() {
		return DT_ALT_R0600;
	}
	public void setDT_ALT_R0600(Calendar dT_ALT_R0600) {
		DT_ALT_R0600 = dT_ALT_R0600;
	}
	public String getCOD_CCUS_R0600() {
		return COD_CCUS_R0600;
	}
	public void setCOD_CCUS_R0600(String cOD_CCUS_R0600) {
		COD_CCUS_R0600 = cOD_CCUS_R0600;
	}
	public String getCCUS_R0600() {
		return CCUS_R0600;
	}
	public void setCCUS_R0600(String cCUS_R0600) {
		CCUS_R0600 = cCUS_R0600;
	}
	
	
	public R0600() {
	}

	public R0600(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_R0600(strs1.get(0));
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
		this.setDT_ALT_R0600(calendar);
		this.setCOD_CCUS_R0600(strs1.get(2));
		this.setCCUS_R0600(strs1.get(3));
	}

}
