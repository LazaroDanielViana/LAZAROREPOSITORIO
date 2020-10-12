package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class D695 {
	String REG_D695, COD_MOD_D695, SER_D695;
	int NRO_ORD_INI_D695, NRO_ORD_FIN_D695;
	Calendar DT_DOC_INI_D695 = new GregorianCalendar();
	Calendar DT_DOC_FIN_D695 = new GregorianCalendar();
	String NOM_MEST_D695, CHV_COD_DIG_D695;
	
	ArrayList<D696> listD696 = new ArrayList<>();

	public String getREG_D695() {
		return REG_D695;
	}

	public void setREG_D695(String rEG_D695) {
		REG_D695 = rEG_D695;
	}

	public String getCOD_MOD_D695() {
		return COD_MOD_D695;
	}

	public void setCOD_MOD_D695(String cOD_MOD_D695) {
		COD_MOD_D695 = cOD_MOD_D695;
	}

	public String getSER_D695() {
		return SER_D695;
	}

	public void setSER_D695(String sER_D695) {
		SER_D695 = sER_D695;
	}

	public int getNRO_ORD_INI_D695() {
		return NRO_ORD_INI_D695;
	}

	public void setNRO_ORD_INI_D695(int nRO_ORD_INI_D695) {
		NRO_ORD_INI_D695 = nRO_ORD_INI_D695;
	}

	public int getNRO_ORD_FIN_D695() {
		return NRO_ORD_FIN_D695;
	}

	public void setNRO_ORD_FIN_D695(int nRO_ORD_FIN_D695) {
		NRO_ORD_FIN_D695 = nRO_ORD_FIN_D695;
	}

	public Calendar getDT_DOC_INI_D695() {
		return DT_DOC_INI_D695;
	}

	public void setDT_DOC_INI_D695(Calendar dT_DOC_INI_D695) {
		DT_DOC_INI_D695 = dT_DOC_INI_D695;
	}

	public Calendar getDT_DOC_FIN_D695() {
		return DT_DOC_FIN_D695;
	}

	public void setDT_DOC_FIN_D695(Calendar dT_DOC_FIN_D695) {
		DT_DOC_FIN_D695 = dT_DOC_FIN_D695;
	}

	public String getNOM_MEST_D695() {
		return NOM_MEST_D695;
	}

	public void setNOM_MEST_D695(String nOM_MEST_D695) {
		NOM_MEST_D695 = nOM_MEST_D695;
	}

	public String getCHV_COD_DIG_D695() {
		return CHV_COD_DIG_D695;
	}

	public void setCHV_COD_DIG_D695(String cHV_COD_DIG_D695) {
		CHV_COD_DIG_D695 = cHV_COD_DIG_D695;
	}
	
	

	public ArrayList<D696> getListD696() {
		return listD696;
	}

	public void setListD696(ArrayList<D696> listD696) {
		this.listD696 = listD696;
	}

	public D695() {
	}

	public D695(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D695(strs1.get(0));
		this.setCOD_MOD_D695(strs1.get(1));
		this.setSER_D695(strs1.get(2));
		this.setNRO_ORD_INI_D695(Integer.parseInt(strs1.get(3)));
		this.setNRO_ORD_FIN_D695(Integer.parseInt(strs1.get(4)));
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
		this.setDT_DOC_INI_D695(calendar);
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
		this.setDT_DOC_FIN_D695(calendar);
		this.setNOM_MEST_D695(strs1.get(7));
		this.setCHV_COD_DIG_D695(strs1.get(8));
	}

}
