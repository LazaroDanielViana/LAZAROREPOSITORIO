package modelBlocoG;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class G126 {
	String REG_G126;
	Calendar DT_INI_G126 = new GregorianCalendar();
	Calendar DT_FIM_G126 = new GregorianCalendar();
	int NUM_PARC_G126;
	float VL_PARC_PASS_G126, VL_TRIB_OC_G126, VL_TOTAL_G126, IND_PER_SAI_G126, VL_PARC_APROP_G126;

	G125 g125;
	public String getREG_G126() {
		return REG_G126;
	}

	public void setREG_G126(String rEG_G126) {
		REG_G126 = rEG_G126;
	}

	public Calendar getDT_INI_G126() {
		return DT_INI_G126;
	}

	public void setDT_INI_G126(Calendar dT_INI_G126) {
		DT_INI_G126 = dT_INI_G126;
	}

	public Calendar getDT_FIM_G126() {
		return DT_FIM_G126;
	}

	public void setDT_FIM_G126(Calendar dT_FIM_G126) {
		DT_FIM_G126 = dT_FIM_G126;
	}

	public int getNUM_PARC_G126() {
		return NUM_PARC_G126;
	}

	public void setNUM_PARC_G126(int nUM_PARC_G126) {
		NUM_PARC_G126 = nUM_PARC_G126;
	}

	public float getVL_PARC_PASS_G126() {
		return VL_PARC_PASS_G126;
	}

	public void setVL_PARC_PASS_G126(float vL_PARC_PASS_G126) {
		VL_PARC_PASS_G126 = vL_PARC_PASS_G126;
	}

	public float getVL_TRIB_OC_G126() {
		return VL_TRIB_OC_G126;
	}

	public void setVL_TRIB_OC_G126(float vL_TRIB_OC_G126) {
		VL_TRIB_OC_G126 = vL_TRIB_OC_G126;
	}

	public float getVL_TOTAL_G126() {
		return VL_TOTAL_G126;
	}

	public void setVL_TOTAL_G126(float vL_TOTAL_G126) {
		VL_TOTAL_G126 = vL_TOTAL_G126;
	}

	public float getIND_PER_SAI_G126() {
		return IND_PER_SAI_G126;
	}

	public void setIND_PER_SAI_G126(float iND_PER_SAI_G126) {
		IND_PER_SAI_G126 = iND_PER_SAI_G126;
	}

	public float getVL_PARC_APROP_G126() {
		return VL_PARC_APROP_G126;
	}

	public void setVL_PARC_APROP_G126(float vL_PARC_APROP_G126) {
		VL_PARC_APROP_G126 = vL_PARC_APROP_G126;
	}
	
	

	public G125 getG125() {
		return g125;
	}

	public void setG125(G125 g125) {
		this.g125 = g125;
	}

	public G126() {
	}

	public G126(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_G126(strs1.get(0));
		if (strs1.get(1).length() == 8) {
			ano = Integer.parseInt(strs1.get(1).substring(4, 8));
			mes = Integer.parseInt(strs1.get(1).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(1).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_INI_G126(calendar);
		if (strs1.get(2).length() == 8) {
			ano = Integer.parseInt(strs1.get(2).substring(4, 8));
			mes = Integer.parseInt(strs1.get(2).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(2).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_FIM_G126(calendar);
		this.setNUM_PARC_G126(Integer.parseInt(strs1.get(3)));
		this.setVL_PARC_PASS_G126(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_TRIB_OC_G126(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_TOTAL_G126(Float.parseFloat(strs1.get(6).replace(",", ".")));
		this.setIND_PER_SAI_G126(Float.parseFloat(strs1.get(7).replace(",", ".")));
		this.setVL_PARC_APROP_G126(Float.parseFloat(strs1.get(8).replace(",", ".")));
	}

}
