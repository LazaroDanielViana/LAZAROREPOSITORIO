package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class C420 {

	String REG_C420, COD_TOT_PAR_C420;
	float VLR_ACUM_TOT_C420;
	int NR_TOT_C420;
	String DESCR_NR_TOT_C420;
	C405 c405;

	ArrayList<C425> listC425 = new ArrayList<>();

	public String getREG_C420() {
		return REG_C420;
	}

	public void setREG_C420(String rEG_C420) {
		REG_C420 = rEG_C420;
	}

	public String getCOD_TOT_PAR_C420() {
		return COD_TOT_PAR_C420;
	}

	public void setCOD_TOT_PAR_C420(String cOD_TOT_PAR_C420) {
		COD_TOT_PAR_C420 = cOD_TOT_PAR_C420;
	}

	public float getVLR_ACUM_TOT_C420() {
		return VLR_ACUM_TOT_C420;
	}

	public void setVLR_ACUM_TOT_C420(float vLR_ACUM_TOT_C420) {
		VLR_ACUM_TOT_C420 = vLR_ACUM_TOT_C420;
	}

	public int getNR_TOT_C420() {
		return NR_TOT_C420;
	}

	public void setNR_TOT_C420(int nR_TOT_C420) {
		NR_TOT_C420 = nR_TOT_C420;
	}

	public String getDESCR_NR_TOT_C420() {
		return DESCR_NR_TOT_C420;
	}

	public void setDESCR_NR_TOT_C420(String dESCR_NR_TOT_C420) {
		DESCR_NR_TOT_C420 = dESCR_NR_TOT_C420;
	}

	public ArrayList<C425> getListC425() {
		return listC425;
	}

	public void setListC425(ArrayList<C425> listC425) {
		this.listC425 = listC425;
	}
	
	

	public C405 getC405() {
		return c405;
	}

	public void setC405(C405 c405) {
		this.c405 = c405;
	}

	public C420() {
	}

	public C420(List<String> strs1) {
		this.setREG_C420(strs1.get(0));
		this.setCOD_TOT_PAR_C420(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setVLR_ACUM_TOT_C420(Float.parseFloat(strs1.get(2).replace(",", ".")));
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setNR_TOT_C420(Integer.parseInt(strs1.get(3)));
		this.setDESCR_NR_TOT_C420(strs1.get(4));
	}

}
