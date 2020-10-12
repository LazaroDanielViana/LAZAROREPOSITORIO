package modelBlocoD;

import java.util.ArrayList;

import efdUtil.RegexL;

public class D350 {
	String REG_D350;
	byte COD_MOD_D350;
	String ECF_MOD_D350, ECF_FAB_D350;
	int ECF_CX_D350;

	ArrayList<D355> listD355 = new ArrayList<>();

	public String getREG_D350() {
		return REG_D350;
	}

	public void setREG_D350(String rEG_D350) {
		REG_D350 = rEG_D350;
	}

	public byte getCOD_MOD_D350() {
		return COD_MOD_D350;
	}

	public void setCOD_MOD_D350(byte cOD_MOD_D350) {
		COD_MOD_D350 = cOD_MOD_D350;
	}

	public String getECF_MOD_D350() {
		return ECF_MOD_D350;
	}

	public void setECF_MOD_D350(String eCF_MOD_D350) {
		ECF_MOD_D350 = eCF_MOD_D350;
	}

	public String getECF_FAB_D350() {
		return ECF_FAB_D350;
	}

	public void setECF_FAB_D350(String eCF_FAB_D350) {
		ECF_FAB_D350 = eCF_FAB_D350;
	}

	public int getECF_CX_D350() {
		return ECF_CX_D350;
	}

	public void setECF_CX_D350(int eCF_CX_D350) {
		ECF_CX_D350 = eCF_CX_D350;
	}
	
	

	public ArrayList<D355> getListD355() {
		return listD355;
	}

	public void setListD355(ArrayList<D355> listD355) {
		this.listD355 = listD355;
	}

	public D350() {
	}

	public D350(ArrayList<String> strs1) {
		this.setREG_D350(strs1.get(0));
		if (strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)))
			this.setCOD_MOD_D350(Byte.parseByte(strs1.get(1)));
		this.setECF_MOD_D350(strs1.get(2));
		this.setECF_FAB_D350(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setECF_CX_D350(Integer.parseInt(strs1.get(4)));
	}

}
