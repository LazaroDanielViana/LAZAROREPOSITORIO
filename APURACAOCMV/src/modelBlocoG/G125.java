package modelBlocoG;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class G125 {

	String REG_G125, COD_IND_BEM_G125;
	Calendar DT_MOV_G125 = new GregorianCalendar();
	String TIPO_MOV_G125;
	float VL_IMOB_ICMS_OP_G125, VL_IMOB_ICMS_ST_G125, VL_IMOB_ICMS_FRT_G125, VL_IMOB_ICMS_DIF_G125, NUM_PARC_G125,
			VL_PARC_PASS_G125;

	G110 g110;

	List<G126> listG126;
	List<G130> listG130;

	public String getREG_G125() {
		return REG_G125;
	}

	public void setREG_G125(String rEG_G125) {
		REG_G125 = rEG_G125;
	}

	public String getCOD_IND_BEM_G125() {
		return COD_IND_BEM_G125;
	}

	public void setCOD_IND_BEM_G125(String cOD_IND_BEM_G125) {
		COD_IND_BEM_G125 = cOD_IND_BEM_G125;
	}

	public Calendar getDT_MOV_G125() {
		return DT_MOV_G125;
	}

	public void setDT_MOV_G125(Calendar dT_MOV_G125) {
		DT_MOV_G125 = dT_MOV_G125;
	}

	public String getTIPO_MOV_G125() {
		return TIPO_MOV_G125;
	}

	public void setTIPO_MOV_G125(String tIPO_MOV_G125) {
		TIPO_MOV_G125 = tIPO_MOV_G125;
	}

	public float getVL_IMOB_ICMS_OP_G125() {
		return VL_IMOB_ICMS_OP_G125;
	}

	public void setVL_IMOB_ICMS_OP_G125(float vL_IMOB_ICMS_OP_G125) {
		VL_IMOB_ICMS_OP_G125 = vL_IMOB_ICMS_OP_G125;
	}

	public float getVL_IMOB_ICMS_ST_G125() {
		return VL_IMOB_ICMS_ST_G125;
	}

	public void setVL_IMOB_ICMS_ST_G125(float vL_IMOB_ICMS_ST_G125) {
		VL_IMOB_ICMS_ST_G125 = vL_IMOB_ICMS_ST_G125;
	}

	public float getVL_IMOB_ICMS_FRT_G125() {
		return VL_IMOB_ICMS_FRT_G125;
	}

	public void setVL_IMOB_ICMS_FRT_G125(float vL_IMOB_ICMS_FRT_G125) {
		VL_IMOB_ICMS_FRT_G125 = vL_IMOB_ICMS_FRT_G125;
	}

	public float getVL_IMOB_ICMS_DIF_G125() {
		return VL_IMOB_ICMS_DIF_G125;
	}

	public void setVL_IMOB_ICMS_DIF_G125(float vL_IMOB_ICMS_DIF_G125) {
		VL_IMOB_ICMS_DIF_G125 = vL_IMOB_ICMS_DIF_G125;
	}

	public float getNUM_PARC_G125() {
		return NUM_PARC_G125;
	}

	public void setNUM_PARC_G125(float nUM_PARC_G125) {
		NUM_PARC_G125 = nUM_PARC_G125;
	}

	public float getVL_PARC_PASS_G125() {
		return VL_PARC_PASS_G125;
	}

	public void setVL_PARC_PASS_G125(float vL_PARC_PASS_G125) {
		VL_PARC_PASS_G125 = vL_PARC_PASS_G125;
	}

	public G110 getG110() {
		return g110;
	}

	public void setG110(G110 g110) {
		this.g110 = g110;
	}

	public List<G126> getListG126() {
		return listG126;
	}

	public void setListG126(ArrayList<G126> listG126) {
		this.listG126 = listG126;
	}

	public List<G130> getListG130() {
		return listG130;
	}

	public void setListG130(List<G130> listG130) {
		this.listG130 = listG130;
	}

	public G125() {
	}

	public G125(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_G125(strs1.get(0));
		this.setCOD_IND_BEM_G125(strs1.get(1));
		if (strs1.get(2).length() == 8) {
			ano = Integer.parseInt(strs1.get(2).substring(4, 8));
			mes = Integer.parseInt(strs1.get(2).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(2).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_MOV_G125(calendar);
		this.setTIPO_MOV_G125(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setVL_IMOB_ICMS_OP_G125(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_IMOB_ICMS_ST_G125(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_IMOB_ICMS_FRT_G125(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setVL_IMOB_ICMS_DIF_G125(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setNUM_PARC_G125(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_PARC_PASS_G125(Float.parseFloat(strs1.get(9).replace(",", ".")));
	}

}
