package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class D120 {
	String REG_D120;
	int COD_MUN_ORIG_D120, COD_MUN_DEST_D120;
	String VEIC_ID_D120, UF_ID_D120;
	
	D110 d110;

	public String getREG_D120() {
		return REG_D120;
	}

	public void setREG_D120(String rEG_D120) {
		REG_D120 = rEG_D120;
	}

	public int getCOD_MUN_ORIG_D120() {
		return COD_MUN_ORIG_D120;
	}

	public void setCOD_MUN_ORIG_D120(int cOD_MUN_ORIG_D120) {
		COD_MUN_ORIG_D120 = cOD_MUN_ORIG_D120;
	}

	public int getCOD_MUN_DEST_D120() {
		return COD_MUN_DEST_D120;
	}

	public void setCOD_MUN_DEST_D120(int cOD_MUN_DEST_D120) {
		COD_MUN_DEST_D120 = cOD_MUN_DEST_D120;
	}

	public String getVEIC_ID_D120() {
		return VEIC_ID_D120;
	}

	public void setVEIC_ID_D120(String vEIC_ID_D120) {
		VEIC_ID_D120 = vEIC_ID_D120;
	}

	public String getUF_ID_D120() {
		return UF_ID_D120;
	}

	public void setUF_ID_D120(String uF_ID_D120) {
		UF_ID_D120 = uF_ID_D120;
	}
	
	

	public D110 getD110() {
		return d110;
	}

	public void setD110(D110 d110) {
		this.d110 = d110;
	}

	public D120(){}
	public D120(List<String> strs1) {
	this.setREG_D120(strs1.get(0));
	if ( strs1.get(1).length() >= 1 && RegexL.isNumber(strs1.get(1)) )
		this.setCOD_MUN_ORIG_D120(Integer.parseInt(strs1.get(1)));
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setCOD_MUN_DEST_D120(Integer.parseInt(strs1.get(2)));
	this.setVEIC_ID_D120(strs1.get(3));
	this.setUF_ID_D120(strs1.get(4));
	}
	

}
