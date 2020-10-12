package modelBlocoG;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class G130 {

	String REG_G130, IND_EMIT_G130, COD_PART_G130, COD_MOD_G130, SERIE_G130;
	int NUM_DOC_G130;
	String CHV_NFE_CTE_G130;
	Calendar DT_DOC_G130 = new GregorianCalendar();
	
	G125 g125;
	
	List<G140> listG140;

	public String getREG_G130() {
		return REG_G130;
	}

	public void setREG_G130(String rEG_G130) {
		REG_G130 = rEG_G130;
	}

	public String getIND_EMIT_G130() {
		return IND_EMIT_G130;
	}

	public void setIND_EMIT_G130(String iND_EMIT_G130) {
		IND_EMIT_G130 = iND_EMIT_G130;
	}

	public String getCOD_PART_G130() {
		return COD_PART_G130;
	}

	public void setCOD_PART_G130(String cOD_PART_G130) {
		COD_PART_G130 = cOD_PART_G130;
	}

	public String getCOD_MOD_G130() {
		return COD_MOD_G130;
	}

	public void setCOD_MOD_G130(String cOD_MOD_G130) {
		COD_MOD_G130 = cOD_MOD_G130;
	}

	public String getSERIE_G130() {
		return SERIE_G130;
	}

	public void setSERIE_G130(String sERIE_G130) {
		SERIE_G130 = sERIE_G130;
	}

	public int getNUM_DOC_G130() {
		return NUM_DOC_G130;
	}

	public void setNUM_DOC_G130(int nUM_DOC_G130) {
		NUM_DOC_G130 = nUM_DOC_G130;
	}

	public String getCHV_NFE_CTE_G130() {
		return CHV_NFE_CTE_G130;
	}

	public void setCHV_NFE_CTE_G130(String cHV_NFE_CTE_G130) {
		CHV_NFE_CTE_G130 = cHV_NFE_CTE_G130;
	}

	public Calendar getDT_DOC_G130() {
		return DT_DOC_G130;
	}

	public void setDT_DOC_G130(Calendar dT_DOC_G130) {
		DT_DOC_G130 = dT_DOC_G130;
	}

	
	public G125 getG125() {
		return g125;
	}

	public void setG125(G125 g125) {
		this.g125 = g125;
	}

	public List<G140> getListG140() {
		return listG140;
	}

	public void setListG140(List<G140> listG140) {
		this.listG140 = listG140;
	}

	public G130() {
	}

	public G130(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_G130(strs1.get(0));
		this.setIND_EMIT_G130(strs1.get(1));
		this.setCOD_PART_G130(strs1.get(2));
		this.setCOD_MOD_G130(strs1.get(3));
		this.setSERIE_G130(strs1.get(4));
		this.setNUM_DOC_G130(Integer.parseInt(strs1.get(5)));
		this.setCHV_NFE_CTE_G130(strs1.get(6));
		if (strs1.get(7).length() == 8) {
			ano = Integer.parseInt(strs1.get(7).substring(4, 8));
			mes = Integer.parseInt(strs1.get(7).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(7).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_G130(calendar);
	}

}
