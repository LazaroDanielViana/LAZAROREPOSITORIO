package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0210 {

	String REG_R0210, COD_ITEM_COMP_R0210;
	float QTD_COMP_R0210, PERDA_R0210;

	R0200 r0200;

	public String getREG_R0210() {
		return REG_R0210;
	}

	public void setREG_R0210(String rEG_R0210) {
		REG_R0210 = rEG_R0210;
	}

	public String getCOD_ITEM_COMP_R0210() {
		return COD_ITEM_COMP_R0210;
	}

	public void setCOD_ITEM_COMP_R0210(String cOD_ITEM_COMP_R0210) {
		COD_ITEM_COMP_R0210 = cOD_ITEM_COMP_R0210;
	}

	public float getQTD_COMP_R0210() {
		return QTD_COMP_R0210;
	}

	public void setQTD_COMP_R0210(float qTD_COMP_R0210) {
		QTD_COMP_R0210 = qTD_COMP_R0210;
	}

	public float getPERDA_R0210() {
		return PERDA_R0210;
	}

	public void setPERDA_R0210(float pERDA_R0210) {
		PERDA_R0210 = pERDA_R0210;
	}

	public R0200 getR0200() {
		return r0200;
	}

	public void setR0200(R0200 r0200) {
		this.r0200 = r0200;
	}

	public R0210() {
	}

	public R0210(List<String> strs1) {
		this.setREG_R0210(strs1.get(0));
		this.setCOD_ITEM_COMP_R0210(strs1.get(1));
		if (strs1.get(2).length() >= 1)
			this.setQTD_COMP_R0210(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 )
			this.setPERDA_R0210(Float.parseFloat(strs1.get(3).replace(",", ".")));
	}

}
