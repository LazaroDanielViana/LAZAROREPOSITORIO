package modelBlocoG;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;
import modelBlocoE.E111;

public class G110 {
	String REG_G110;
	Calendar DT_INI_G110;
	Calendar DT_FIN_G110;
	float SALDO_IN_ICMS_G110, SOM_PARC_G110, VL_TRIB_EXP_G110, VL_TOTAL_G110, IND_PER_SAI_G110, ICMS_APROP_G110,
			SOM_ICMS_OC_G110;

	List<G125> listG125;

	public String getREG_G110() {
		return REG_G110;
	}

	public void setREG_G110(String rEG_G110) {
		REG_G110 = rEG_G110;
	}

	public Calendar getDT_INI_G110() {
		return DT_INI_G110;
	}

	public void setDT_INI_G110(Calendar dT_INI_G110) {
		DT_INI_G110 = dT_INI_G110;
	}

	public Calendar getDT_FIN_G110() {
		return DT_FIN_G110;
	}

	public void setDT_FIN_G110(Calendar dT_FIN_G110) {
		DT_FIN_G110 = dT_FIN_G110;
	}

	public float getSALDO_IN_ICMS_G110() {
		return SALDO_IN_ICMS_G110;
	}

	public void setSALDO_IN_ICMS_G110(float sALDO_IN_ICMS_G110) {
		SALDO_IN_ICMS_G110 = sALDO_IN_ICMS_G110;
	}

	public float getSOM_PARC_G110() {
		return SOM_PARC_G110;
	}

	public void setSOM_PARC_G110(float sOM_PARC_G110) {
		SOM_PARC_G110 = sOM_PARC_G110;
	}

	public float getVL_TRIB_EXP_G110() {
		return VL_TRIB_EXP_G110;
	}

	public void setVL_TRIB_EXP_G110(float vL_TRIB_EXP_G110) {
		VL_TRIB_EXP_G110 = vL_TRIB_EXP_G110;
	}

	public float getVL_TOTAL_G110() {
		return VL_TOTAL_G110;
	}

	public void setVL_TOTAL_G110(float vL_TOTAL_G110) {
		VL_TOTAL_G110 = vL_TOTAL_G110;
	}

	public float getIND_PER_SAI_G110() {
		return IND_PER_SAI_G110;
	}

	public void setIND_PER_SAI_G110(float iND_PER_SAI_G110) {
		IND_PER_SAI_G110 = iND_PER_SAI_G110;
	}

	public float getICMS_APROP_G110() {
		return ICMS_APROP_G110;
	}

	public void setICMS_APROP_G110(float iCMS_APROP_G110) {
		ICMS_APROP_G110 = iCMS_APROP_G110;
	}

	public float getSOM_ICMS_OC_G110() {
		return SOM_ICMS_OC_G110;
	}

	public void setSOM_ICMS_OC_G110(float sOM_ICMS_OC_G110) {
		SOM_ICMS_OC_G110 = sOM_ICMS_OC_G110;
	}

	public List<G125> getListG125() {
		return listG125;
	}

	public void setListG125(List<G125> listG125) {
		this.listG125 = listG125;
	}

	public G110() {
	}

	public G110(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_G110(strs1.get(0));
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
		this.setDT_INI_G110(calendar);
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
		this.setDT_FIN_G110(calendar);
		if (strs1.get(3).length() >= 1 && RegexL.isNumber(strs1.get(3)))
			this.setSALDO_IN_ICMS_G110(Float.parseFloat(strs1.get(3).replace(",", ".")));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setSOM_PARC_G110(Float.parseFloat(strs1.get(4).replace(",", ".")));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setVL_TRIB_EXP_G110(Float.parseFloat(strs1.get(5).replace(",", ".")));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setVL_TOTAL_G110(Float.parseFloat(strs1.get(6).replace(",", ".")));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setIND_PER_SAI_G110(Float.parseFloat(strs1.get(7).replace(",", ".")));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setICMS_APROP_G110(Float.parseFloat(strs1.get(8).replace(",", ".")));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setSOM_ICMS_OC_G110(Float.parseFloat(strs1.get(9).replace(",", ".")));
	}

	@Override
	public String toString() {
		return "G110 [REG_G110=" + REG_G110 + ", DT_INI_G110=" + DT_INI_G110 + ", DT_FIN_G110=" + DT_FIN_G110
				+ ", SALDO_IN_ICMS_G110=" + SALDO_IN_ICMS_G110 + ", SOM_PARC_G110=" + SOM_PARC_G110 + "]";
	}
	
}
