package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C700 {
	String REG_C700, COD_MOD_C700, SER_C700;
	int NRO_ORD_INI_C700, NRO_ORD_FIN_C700;

	Calendar DT_DOC_INI_C700 = new GregorianCalendar();
	Calendar DT_DOC_FIN_C700 = new GregorianCalendar();
	String NOM_MEST_C700, CHV_COD_DIG_C700;

	ArrayList<C790> listC790 = new ArrayList<>();

	public String getREG_C700() {
		return REG_C700;
	}

	public void setREG_C700(String rEG_C700) {
		REG_C700 = rEG_C700;
	}

	public String getCOD_MOD_C700() {
		return COD_MOD_C700;
	}

	public void setCOD_MOD_C700(String cOD_MOD_C700) {
		COD_MOD_C700 = cOD_MOD_C700;
	}

	public String getSER_C700() {
		return SER_C700;
	}

	public void setSER_C700(String sER_C700) {
		SER_C700 = sER_C700;
	}

	public int getNRO_ORD_INI_C700() {
		return NRO_ORD_INI_C700;
	}

	public void setNRO_ORD_INI_C700(int nRO_ORD_INI_C700) {
		NRO_ORD_INI_C700 = nRO_ORD_INI_C700;
	}

	public int getNRO_ORD_FIN_C700() {
		return NRO_ORD_FIN_C700;
	}

	public void setNRO_ORD_FIN_C700(int nRO_ORD_FIN_C700) {
		NRO_ORD_FIN_C700 = nRO_ORD_FIN_C700;
	}

	public Calendar getDT_DOC_INI_C700() {
		return DT_DOC_INI_C700;
	}

	public void setDT_DOC_INI_C700(Calendar dT_DOC_INI_C700) {
		DT_DOC_INI_C700 = dT_DOC_INI_C700;
	}

	public Calendar getDT_DOC_FIN_C700() {
		return DT_DOC_FIN_C700;
	}

	public void setDT_DOC_FIN_C700(Calendar dT_DOC_FIN_C700) {
		DT_DOC_FIN_C700 = dT_DOC_FIN_C700;
	}

	public String getNOM_MEST_C700() {
		return NOM_MEST_C700;
	}

	public void setNOM_MEST_C700(String nOM_MEST_C700) {
		NOM_MEST_C700 = nOM_MEST_C700;
	}

	public String getCHV_COD_DIG_C700() {
		return CHV_COD_DIG_C700;
	}

	public void setCHV_COD_DIG_C700(String cHV_COD_DIG_C700) {
		CHV_COD_DIG_C700 = cHV_COD_DIG_C700;
	}

	public ArrayList<C790> getListC790() {
		return listC790;
	}

	public void setListC790(ArrayList<C790> listC790) {
		this.listC790 = listC790;
	}

	public C700() {
	}

	public C700(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C700(strs1.get(0));
		this.setCOD_MOD_C700(strs1.get(1));
		this.setSER_C700(strs1.get(2));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNRO_ORD_INI_C700(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setNRO_ORD_FIN_C700(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() == 8) {
			ano = Integer.parseInt(strs1.get(5).substring(4, 8));
			mes = Integer.parseInt(strs1.get(5).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(5).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_INI_C700(calendar);
		if (strs1.get(6).length() == 8) {
			ano = Integer.parseInt(strs1.get(6).substring(4, 8));
			mes = Integer.parseInt(strs1.get(6).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(6).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_FIN_C700(calendar);
		this.setNOM_MEST_C700(strs1.get(7));
		this.setCHV_COD_DIG_C700(strs1.get(8));
	}

}
