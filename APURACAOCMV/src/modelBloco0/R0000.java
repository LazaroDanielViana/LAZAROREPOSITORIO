package modelBloco0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class R0000 {

	String REG_R0000;
	int COD_VER_R0000;
	byte COD_FIN_R0000;
	Calendar DT_INI_R0000;
	Calendar DT_FIN_R0000;
	String NOME_R0000;
	static String CNPJ_R0000;
	long CPF_R0000;
	String UF_R0000;
	static String IE_R0000;
	int COD_MUN_R0000;
	String IM_R0000, SUFRAMA_R0000, IND_PERFIL_R0000;
	byte IND_ATIV_R0000;

	public String getREG_R0000() {
		return REG_R0000;
	}

	public void setREG_R0000(String rEG_R0000) {
		REG_R0000 = rEG_R0000;
	}

	public int getCOD_VER_R0000() {
		return COD_VER_R0000;
	}

	public void setCOD_VER_R0000(int cOD_VER_R0000) {
		COD_VER_R0000 = cOD_VER_R0000;
	}

	public byte getCOD_FIN_R0000() {
		return COD_FIN_R0000;
	}

	public void setCOD_FIN_R0000(byte cOD_FIN_R0000) {
		COD_FIN_R0000 = cOD_FIN_R0000;
	}

	public Calendar getDT_INI_R0000() {
		return DT_INI_R0000;
	}

	public void setDT_INI_R0000(Calendar dT_INI_R0000) {
		DT_INI_R0000 = dT_INI_R0000;
	}

	public Calendar getDT_FIN_R0000() {
		return DT_FIN_R0000;
	}

	public void setDT_FIN_R0000(Calendar dT_FIN_R0000) {
		DT_FIN_R0000 = dT_FIN_R0000;
	}

	public String getNOME_R0000() {
		return NOME_R0000;
	}

	public void setNOME_R0000(String nOME_R0000) {
		NOME_R0000 = nOME_R0000;
	}

	public static String getCNPJ_R0000() {
		return CNPJ_R0000;
	}

	public void setCNPJ_R0000(String cNPJ_R0000) {
		CNPJ_R0000 = cNPJ_R0000;
	}

	public long getCPF_R0000() {
		return CPF_R0000;
	}

	public void setCPF_R0000(long cPF_R0000) {
		CPF_R0000 = cPF_R0000;
	}

	public String getUF_R0000() {
		return UF_R0000;
	}

	public void setUF_R0000(String uF_R0000) {
		UF_R0000 = uF_R0000;
	}

	public static String getIE_R0000() {
		return IE_R0000;
	}

	public void setIE_R0000(String iE_R0000) {
		IE_R0000 = iE_R0000;
	}

	public int getCOD_MUN_R0000() {
		return COD_MUN_R0000;
	}

	public void setCOD_MUN_R0000(int cOD_MUN_R0000) {
		COD_MUN_R0000 = cOD_MUN_R0000;
	}

	public String getIM_R0000() {
		return IM_R0000;
	}

	public void setIM_R0000(String iM_R0000) {
		IM_R0000 = iM_R0000;
	}

	public String getSUFRAMA_R0000() {
		return SUFRAMA_R0000;
	}

	public void setSUFRAMA_R0000(String sUFRAMA_R0000) {
		SUFRAMA_R0000 = sUFRAMA_R0000;
	}

	public String getIND_PERFIL_R0000() {
		return IND_PERFIL_R0000;
	}

	public void setIND_PERFIL_R0000(String iND_PERFIL_R0000) {
		IND_PERFIL_R0000 = iND_PERFIL_R0000;
	}

	public byte getIND_ATIV_R0000() {
		return IND_ATIV_R0000;
	}

	public void setIND_ATIV_R0000(byte iND_ATIV_R0000) {
		IND_ATIV_R0000 = iND_ATIV_R0000;
	}

	public R0000() {
	}

	public R0000(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_R0000(strs1.get(0));
		if (strs1.get(1).length() >= 1)
			this.setCOD_VER_R0000(Integer.parseInt(strs1.get(1)));
		if (strs1.get(2).length() >= 1)
			this.setCOD_FIN_R0000(Byte.parseByte(strs1.get(2)));
		if (strs1.get(3).length() == 8) {
			ano = Integer.parseInt(strs1.get(3).substring(4, 8));
			mes = Integer.parseInt(strs1.get(3).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(3).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_INI_R0000(calendar);
		if (strs1.get(4).length() == 8) {
			ano = Integer.parseInt(strs1.get(4).substring(4, 8));
			mes = Integer.parseInt(strs1.get(4).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(4).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_FIN_R0000(calendar);
		this.setNOME_R0000(strs1.get(5));
		this.setCNPJ_R0000(strs1.get(6));
		if (strs1.get(7).length() >= 1)
			this.setCPF_R0000(Long.parseLong(strs1.get(7)));
		this.setUF_R0000(strs1.get(8));
		this.setIE_R0000(strs1.get(9));
		if (strs1.get(10).length() >= 1)
			this.setCOD_MUN_R0000(Integer.parseInt(strs1.get(10)));
		this.setIM_R0000(strs1.get(11));
		this.setSUFRAMA_R0000(strs1.get(12));
		this.setIND_PERFIL_R0000(strs1.get(13));
		if (strs1.get(14).length() >= 1)
			this.setIND_ATIV_R0000(Byte.parseByte(strs1.get(14)));
	}

}
