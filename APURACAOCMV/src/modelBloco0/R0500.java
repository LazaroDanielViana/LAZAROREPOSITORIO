package modelBloco0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class R0500 {
	String REG_R0500;
	Calendar DT_ALT_R0500;
	String COD__NAT_CC_R0500, IND_CTA_R0500;
	int NIVEL_R0500;
	String COD_CTA_R0500, NOME_CTA_R0500;

	public String getREG_R0500() {
		return REG_R0500;
	}

	public void setREG_R0500(String rEG_R0500) {
		REG_R0500 = rEG_R0500;
	}

	public Calendar getDT_ALT_R0500() {
		return DT_ALT_R0500;
	}

	public void setDT_ALT_R0500(Calendar dT_ALT_R0500) {
		DT_ALT_R0500 = dT_ALT_R0500;
	}

	public String getCOD__NAT_CC_R0500() {
		return COD__NAT_CC_R0500;
	}

	public void setCOD__NAT_CC_R0500(String cOD__NAT_CC_R0500) {
		COD__NAT_CC_R0500 = cOD__NAT_CC_R0500;
	}

	public String getIND_CTA_R0500() {
		return IND_CTA_R0500;
	}

	public void setIND_CTA_R0500(String iND_CTA_R0500) {
		IND_CTA_R0500 = iND_CTA_R0500;
	}

	public int getNIVEL_R0500() {
		return NIVEL_R0500;
	}

	public void setNIVEL_R0500(int nIVEL_R0500) {
		NIVEL_R0500 = nIVEL_R0500;
	}

	public String getCOD_CTA_R0500() {
		return COD_CTA_R0500;
	}

	public void setCOD_CTA_R0500(String cOD_CTA_R0500) {
		COD_CTA_R0500 = cOD_CTA_R0500;
	}

	public String getNOME_CTA_R0500() {
		return NOME_CTA_R0500;
	}

	public void setNOME_CTA_R0500(String nOME_CTA_R0500) {
		NOME_CTA_R0500 = nOME_CTA_R0500;
	}

	public R0500() {
	}

	public R0500(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_R0500(strs1.get(0));
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
		this.setDT_ALT_R0500(calendar);
		this.setCOD__NAT_CC_R0500(strs1.get(2));
		this.setIND_CTA_R0500(strs1.get(3));
		if (strs1.get(4).length() >= 1 )
			this.setNIVEL_R0500(Integer.parseInt(strs1.get(4)));
		this.setCOD_CTA_R0500(strs1.get(5));
		this.setNOME_CTA_R0500(strs1.get(6));
	}

}
