package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

/**
 * @author lazaro
 *
 */
public class R0300 {

	String REG_R0300, COD_IND_BEM_R0300, IDENT_MERC_R0300, DESCR_ITEM_R0300, COD_PRNC_R0300, COD_CTA_R0300;
	int NR_PARC_R0300;

	R0305 r0305 = new R0305();

	public String getREG_R0300() {
		return REG_R0300;
	}

	public void setREG_R0300(String rEG_R0300) {
		REG_R0300 = rEG_R0300;
	}

	public String getCOD_IND_BEM_R0300() {
		return COD_IND_BEM_R0300;
	}

	public void setCOD_IND_BEM_R0300(String cOD_IND_BEM_R0300) {
		COD_IND_BEM_R0300 = cOD_IND_BEM_R0300;
	}

	public String getIDENT_MERC_R0300() {
		return IDENT_MERC_R0300;
	}

	public void setIDENT_MERC_R0300(String iDENT_MERC_R0300) {
		IDENT_MERC_R0300 = iDENT_MERC_R0300;
	}

	public String getDESCR_ITEM_R0300() {
		return DESCR_ITEM_R0300;
	}

	public void setDESCR_ITEM_R0300(String dESCR_ITEM_R0300) {
		DESCR_ITEM_R0300 = dESCR_ITEM_R0300;
	}

	public String getCOD_PRNC_R0300() {
		return COD_PRNC_R0300;
	}

	public void setCOD_PRNC_R0300(String cOD_PRNC_R0300) {
		COD_PRNC_R0300 = cOD_PRNC_R0300;
	}

	public String getCOD_CTA_R0300() {
		return COD_CTA_R0300;
	}

	public void setCOD_CTA_R0300(String cOD_CTA_R0300) {
		COD_CTA_R0300 = cOD_CTA_R0300;
	}

	public int getNR_PARC_R0300() {
		return NR_PARC_R0300;
	}

	public void setNR_PARC_R0300(int nR_PARC_R0300) {
		NR_PARC_R0300 = nR_PARC_R0300;
	}

	public R0305 getR0305() {
		return r0305;
	}

	public void setR0305(R0305 r0305) {
		this.r0305 = r0305;
	}

	public R0300() {
	}

	public R0300(List<String> strs1) {
		this.setREG_R0300(strs1.get(0));
		this.setCOD_IND_BEM_R0300(strs1.get(1));
		this.setIDENT_MERC_R0300(strs1.get(2));
		this.setDESCR_ITEM_R0300(strs1.get(3));
		this.setCOD_PRNC_R0300(strs1.get(4));
		this.setCOD_CTA_R0300(strs1.get(5));
		if (strs1.get(6).length() >= 1 )
			this.setNR_PARC_R0300(Integer.parseInt(strs1.get(6)));
	}

}
