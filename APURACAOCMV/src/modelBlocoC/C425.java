package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C425 {

	String REG_C425, COD_ITEM_C425;
	float QTD_C425;
	int UNID_C425;
	float VL_ITEM_C425, VL_PIS_C425, VL_COFINS_C425;
	C420 c420;

	public String getREG_C425() {
		return REG_C425;
	}

	public void setREG_C425(String rEG_C425) {
		REG_C425 = rEG_C425;
	}

	public String getCOD_ITEM_C425() {
		return COD_ITEM_C425;
	}

	public void setCOD_ITEM_C425(String cOD_ITEM_C425) {
		COD_ITEM_C425 = cOD_ITEM_C425;
	}

	public float getQTD_C425() {
		return QTD_C425;
	}

	public void setQTD_C425(float qTD_C425) {
		QTD_C425 = qTD_C425;
	}

	public int getUNID_C425() {
		return UNID_C425;
	}

	public void setUNID_C425(int uNID_C425) {
		UNID_C425 = uNID_C425;
	}

	public float getVL_ITEM_C425() {
		return VL_ITEM_C425;
	}

	public void setVL_ITEM_C425(float vL_ITEM_C425) {
		VL_ITEM_C425 = vL_ITEM_C425;
	}

	public float getVL_PIS_C425() {
		return VL_PIS_C425;
	}

	public void setVL_PIS_C425(float vL_PIS_C425) {
		VL_PIS_C425 = vL_PIS_C425;
	}

	public float getVL_COFINS_C425() {
		return VL_COFINS_C425;
	}

	public void setVL_COFINS_C425(float vL_COFINS_C425) {
		VL_COFINS_C425 = vL_COFINS_C425;
	}	

	public C420 getC420() {
		return c420;
	}

	public void setC420(C420 c420) {
		this.c420 = c420;
	}

	public C425() {
	}

	public C425(List<String> strs1) {
		this.setREG_C425(strs1.get(0));
		this.setCOD_ITEM_C425(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setQTD_C425(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setUNID_C425(Integer.parseInt(strs1.get(3)));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_ITEM_C425(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_PIS_C425(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_COFINS_C425(Float.parseFloat(strs1.get(6).replace(",", ".")));
	}

}
