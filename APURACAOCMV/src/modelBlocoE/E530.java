package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E530 {
	String REG_E530, IND_AJ_E530;
	float VL_AJ_E530;
	String COD_AJ_E530, IND_DOC_E530, NUM_DOC_E530, DESCR_AJ_E530;
	E520 e520;
	public String getREG_E530() {
		return REG_E530;
	}

	public void setREG_E530(String rEG_E530) {
		REG_E530 = rEG_E530;
	}

	public String getIND_AJ_E530() {
		return IND_AJ_E530;
	}

	public void setIND_AJ_E530(String iND_AJ_E530) {
		IND_AJ_E530 = iND_AJ_E530;
	}

	public float getVL_AJ_E530() {
		return VL_AJ_E530;
	}

	public void setVL_AJ_E530(float vL_AJ_E530) {
		VL_AJ_E530 = vL_AJ_E530;
	}

	public String getCOD_AJ_E530() {
		return COD_AJ_E530;
	}

	public void setCOD_AJ_E530(String cOD_AJ_E530) {
		COD_AJ_E530 = cOD_AJ_E530;
	}

	public String getIND_DOC_E530() {
		return IND_DOC_E530;
	}

	public void setIND_DOC_E530(String iND_DOC_E530) {
		IND_DOC_E530 = iND_DOC_E530;
	}

	public String getNUM_DOC_E530() {
		return NUM_DOC_E530;
	}

	public void setNUM_DOC_E530(String nUM_DOC_E530) {
		NUM_DOC_E530 = nUM_DOC_E530;
	}

	public String getDESCR_AJ_E530() {
		return DESCR_AJ_E530;
	}

	public void setDESCR_AJ_E530(String dESCR_AJ_E530) {
		DESCR_AJ_E530 = dESCR_AJ_E530;
	}
	
	

	public E520 getE520() {
		return e520;
	}

	public void setE520(E520 e520) {
		this.e520 = e520;
	}

	public E530() {
	}

	public E530(List<String> strs1) {
		this.setREG_E530(strs1.get(0));
		this.setIND_AJ_E530(strs1.get(1));
		this.setVL_AJ_E530(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setCOD_AJ_E530(strs1.get(3));
		this.setIND_DOC_E530(strs1.get(4));
		this.setNUM_DOC_E530(strs1.get(5));
		this.setDESCR_AJ_E530(strs1.get(6));
	}

}
