package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0220 {
	String REG_R0220,
	UNID_CONV_R0220;
	float FAT_CONV_R0220;
	
	R0200 r0200;
	public String getREG_R0220() {
		return REG_R0220;
	}
	public void setREG_R0220(String rEG_R0220) {
		REG_R0220 = rEG_R0220;
	}
	public String getUNID_CONV_R0220() {
		return UNID_CONV_R0220;
	}
	public void setUNID_CONV_R0220(String uNID_CONV_R0220) {
		UNID_CONV_R0220 = uNID_CONV_R0220;
	}
	public float getFAT_CONV_R0220() {
		return FAT_CONV_R0220;
	}
	public void setFAT_CONV_R0220(float fAT_CONV_R0220) {
		FAT_CONV_R0220 = fAT_CONV_R0220;
	}
	
	
	
	public R0200 getR0200() {
		return r0200;
	}
	public void setR0200(R0200 r0200) {
		this.r0200 = r0200;
	}
	public R0220(){}
	public R0220(List<String> strs1) {
	this.setREG_R0220(strs1.get(0));
	this.setUNID_CONV_R0220(strs1.get(1));
		if (strs1.get(2).length() >= 1 )
		this.setFAT_CONV_R0220(Float.parseFloat(strs1.get(2).replace(",",".")));
	}


}
