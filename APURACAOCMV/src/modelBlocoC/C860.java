package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C860 {

	String REG_C860, COD_MOD_C860;
	int NR_SAT_C860;
	Calendar DT_DOC_C860 = new GregorianCalendar();
	int DOC_INI_C860, DOC_FIM_C860;

	ArrayList<C890> listC890 = new ArrayList<>();

	public String getREG_C860() {
		return REG_C860;
	}

	public void setREG_C860(String rEG_C860) {
		REG_C860 = rEG_C860;
	}

	public String getCOD_MOD_C860() {
		return COD_MOD_C860;
	}

	public void setCOD_MOD_C860(String cOD_MOD_C860) {
		COD_MOD_C860 = cOD_MOD_C860;
	}

	public int getNR_SAT_C860() {
		return NR_SAT_C860;
	}

	public void setNR_SAT_C860(int nR_SAT_C860) {
		NR_SAT_C860 = nR_SAT_C860;
	}

	public Calendar getDT_DOC_C860() {
		return DT_DOC_C860;
	}

	public void setDT_DOC_C860(Calendar dT_DOC_C860) {
		DT_DOC_C860 = dT_DOC_C860;
	}

	public int getDOC_INI_C860() {
		return DOC_INI_C860;
	}

	public void setDOC_INI_C860(int dOC_INI_C860) {
		DOC_INI_C860 = dOC_INI_C860;
	}

	public int getDOC_FIM_C860() {
		return DOC_FIM_C860;
	}

	public void setDOC_FIM_C860(int dOC_FIM_C860) {
		DOC_FIM_C860 = dOC_FIM_C860;
	}
	
	

	public ArrayList<C890> getListC890() {
		return listC890;
	}

	public void setListC890(ArrayList<C890> listC890) {
		this.listC890 = listC890;
	}

	public C860() {
	}

	public C860(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C860(strs1.get(0));
		this.setCOD_MOD_C860(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setNR_SAT_C860(Integer.parseInt(strs1.get(2)));
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
		this.setDT_DOC_C860(calendar);
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setDOC_INI_C860(Integer.parseInt(strs1.get(4)));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setDOC_FIM_C860(Integer.parseInt(strs1.get(5)));
	}

}
