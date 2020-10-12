package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C400 {

	String REG_C400, COD_MOD_C400, ECF_MOD_C400, ECF_FAB_C400;
	int ECF_CX_C400;

	ArrayList<C405> listC405 = new ArrayList<>();

	public String getREG_C400() {
		return REG_C400;
	}

	public void setREG_C400(String rEG_C400) {
		REG_C400 = rEG_C400;
	}

	public String getCOD_MOD_C400() {
		return COD_MOD_C400;
	}

	public void setCOD_MOD_C400(String cOD_MOD_C400) {
		COD_MOD_C400 = cOD_MOD_C400;
	}

	public String getECF_MOD_C400() {
		return ECF_MOD_C400;
	}

	public void setECF_MOD_C400(String eCF_MOD_C400) {
		ECF_MOD_C400 = eCF_MOD_C400;
	}

	public String getECF_FAB_C400() {
		return ECF_FAB_C400;
	}

	public void setECF_FAB_C400(String eCF_FAB_C400) {
		ECF_FAB_C400 = eCF_FAB_C400;
	}

	public int getECF_CX_C400() {
		return ECF_CX_C400;
	}

	public void setECF_CX_C400(int eCF_CX_C400) {
		ECF_CX_C400 = eCF_CX_C400;
	}

	public ArrayList<C405> getListC405() {
		return listC405;
	}

	public void setListC405(ArrayList<C405> listC405) {
		this.listC405 = listC405;
	}

	public C400() {
	}

	public C400(List<String> strs1) {
		this.setREG_C400(strs1.get(0));
		this.setCOD_MOD_C400(strs1.get(1));
		this.setECF_MOD_C400(strs1.get(2));
		this.setECF_FAB_C400(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setECF_CX_C400(Integer.parseInt(strs1.get(4)));
	}

}
