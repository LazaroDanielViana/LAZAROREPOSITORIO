package modelBlocoD;

import java.util.ArrayList;

public class D195 {
	String REG_D195, COD_OBS_D195, TXT_COMPL_D195;
	
	D100 d100;
	
	ArrayList<D197> listD197 = new ArrayList<>();

	public String getREG_D195() {
		return REG_D195;
	}

	public void setREG_D195(String rEG_D195) {
		REG_D195 = rEG_D195;
	}

	public String getCOD_OBS_D195() {
		return COD_OBS_D195;
	}

	public void setCOD_OBS_D195(String cOD_OBS_D195) {
		COD_OBS_D195 = cOD_OBS_D195;
	}

	public String getTXT_COMPL_D195() {
		return TXT_COMPL_D195;
	}

	public void setTXT_COMPL_D195(String tXT_COMPL_D195) {
		TXT_COMPL_D195 = tXT_COMPL_D195;
	}


	public ArrayList<D197> getListD197() {
		return listD197;
	}

	public void setListD197(ArrayList<D197> listD197) {
		this.listD197 = listD197;
	}
	
	

	public D100 getD100() {
		return d100;
	}

	public void setD100(D100 d100) {
		this.d100 = d100;
	}

	public D195() {
	}

	public D195(ArrayList<String> strs1) {
		this.setREG_D195(strs1.get(0));
		this.setCOD_OBS_D195(strs1.get(1));
		this.setTXT_COMPL_D195(strs1.get(2));
	}

}
