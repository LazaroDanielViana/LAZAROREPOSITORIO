package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class D100 {
	
	String REG_D100, IND_OPER_D100, IND_EMIT_D100, COD_PART_D100, COD_MOD_D100;
	byte COD_SIT_D100;
	String SER_D100, SUB_D100;
	int NUM_DOC_D100;
	String CHV_CTE_D100;
	Calendar DT_DOC_D100;
	Calendar DT_A_P_D100;
	byte TP_CT_D100;
	String CHV_CTE_REF_D100;
	float VL_DOC_D100, VL_DESC_D100;
	String IND_FRT_D100;
	float VL_SERV_D100, VL_BC_ICMS_D100, VL_ICMS_D100, VL_NT_D100;
	String COD_INF_D100, COD_CTA_D100;

	D101 d101;
	List<D110> listD110;
	List<D130> listD130;
	D140 d140;
	D150 d150;
	List<D160> listD160;
	D170 d170;
	List<D180> listD180;
	List<D190> listD190;
	List<D195> listD195;

	public String getREG_D100() {
		return REG_D100;
	}

	public void setREG_D100(String rEG_D100) {
		REG_D100 = rEG_D100;
	}

	public String getIND_OPER_D100() {
		return IND_OPER_D100;
	}

	public void setIND_OPER_D100(String iND_OPER_D100) {
		IND_OPER_D100 = iND_OPER_D100;
	}

	public String getIND_EMIT_D100() {
		return IND_EMIT_D100;
	}

	public void setIND_EMIT_D100(String iND_EMIT_D100) {
		IND_EMIT_D100 = iND_EMIT_D100;
	}

	public String getCOD_PART_D100() {
		return COD_PART_D100;
	}

	public void setCOD_PART_D100(String cOD_PART_D100) {
		COD_PART_D100 = cOD_PART_D100;
	}

	public String getCOD_MOD_D100() {
		return COD_MOD_D100;
	}

	public void setCOD_MOD_D100(String cOD_MOD_D100) {
		COD_MOD_D100 = cOD_MOD_D100;
	}

	public byte getCOD_SIT_D100() {
		return COD_SIT_D100;
	}

	public void setCOD_SIT_D100(byte cOD_SIT_D100) {
		COD_SIT_D100 = cOD_SIT_D100;
	}

	public String getSER_D100() {
		return SER_D100;
	}

	public void setSER_D100(String sER_D100) {
		SER_D100 = sER_D100;
	}

	public String getSUB_D100() {
		return SUB_D100;
	}

	public void setSUB_D100(String sUB_D100) {
		SUB_D100 = sUB_D100;
	}

	public int getNUM_DOC_D100() {
		return NUM_DOC_D100;
	}

	public void setNUM_DOC_D100(int nUM_DOC_D100) {
		NUM_DOC_D100 = nUM_DOC_D100;
	}

	public String getCHV_CTE_D100() {
		return CHV_CTE_D100;
	}

	public void setCHV_CTE_D100(String cHV_CTE_D100) {
		CHV_CTE_D100 = cHV_CTE_D100;
	}

	public Calendar getDT_DOC_D100() {
		return DT_DOC_D100;
	}

	public void setDT_DOC_D100(Calendar dT_DOC_D100) {
		DT_DOC_D100 = dT_DOC_D100;
	}

	public Calendar getDT_A_P_D100() {
		return DT_A_P_D100;
	}

	public void setDT_A_P_D100(Calendar dT_A_P_D100) {
		DT_A_P_D100 = dT_A_P_D100;
	}

	public byte getTP_CT_D100() {
		return TP_CT_D100;
	}

	public void setTP_CT_D100(byte tP_CT_D100) {
		TP_CT_D100 = tP_CT_D100;
	}

	public String getCHV_CTE_REF_D100() {
		return CHV_CTE_REF_D100;
	}

	public void setCHV_CTE_REF_D100(String cHV_CTE_REF_D100) {
		CHV_CTE_REF_D100 = cHV_CTE_REF_D100;
	}

	public float getVL_DOC_D100() {
		return VL_DOC_D100;
	}

	public void setVL_DOC_D100(float vL_DOC_D100) {
		VL_DOC_D100 = vL_DOC_D100;
	}

	public float getVL_DESC_D100() {
		return VL_DESC_D100;
	}

	public void setVL_DESC_D100(float vL_DESC_D100) {
		VL_DESC_D100 = vL_DESC_D100;
	}

	public String getIND_FRT_D100() {
		return IND_FRT_D100;
	}

	public void setIND_FRT_D100(String iND_FRT_D100) {
		IND_FRT_D100 = iND_FRT_D100;
	}

	public float getVL_SERV_D100() {
		return VL_SERV_D100;
	}

	public void setVL_SERV_D100(float vL_SERV_D100) {
		VL_SERV_D100 = vL_SERV_D100;
	}

	public float getVL_BC_ICMS_D100() {
		return VL_BC_ICMS_D100;
	}

	public void setVL_BC_ICMS_D100(float vL_BC_ICMS_D100) {
		VL_BC_ICMS_D100 = vL_BC_ICMS_D100;
	}

	public float getVL_ICMS_D100() {
		return VL_ICMS_D100;
	}

	public void setVL_ICMS_D100(float vL_ICMS_D100) {
		VL_ICMS_D100 = vL_ICMS_D100;
	}

	public float getVL_NT_D100() {
		return VL_NT_D100;
	}

	public void setVL_NT_D100(float vL_NT_D100) {
		VL_NT_D100 = vL_NT_D100;
	}

	public String getCOD_INF_D100() {
		return COD_INF_D100;
	}

	public void setCOD_INF_D100(String cOD_INF_D100) {
		COD_INF_D100 = cOD_INF_D100;
	}

	public String getCOD_CTA_D100() {
		return COD_CTA_D100;
	}

	public void setCOD_CTA_D100(String cOD_CTA_D100) {
		COD_CTA_D100 = cOD_CTA_D100;
	}

	public D101 getD101() {
		return d101;
	}

	public void setD101(D101 d101) {
		this.d101 = d101;
	}

	public List<D110> getListD110() {
		return listD110;
	}

	public void setListD110(List<D110> listD110) {
		this.listD110 = listD110;
	}

	public List<D130> getListD130() {
		return listD130;
	}

	public void setListD130(List<D130> listD130) {
		this.listD130 = listD130;
	}

	public D140 getD140() {
		return d140;
	}

	public void setD140(D140 d140) {
		this.d140 = d140;
	}

	public D150 getD150() {
		return d150;
	}

	public void setD150(D150 c150) {
		this.d150 = c150;
	}

	public List<D160> getListD160() {
		return listD160;
	}

	public void setListD160(List<D160> listD160) {
		this.listD160 = listD160;
	}

	public D170 getD170() {
		return d170;
	}

	public void setD170(D170 d170) {
		this.d170 = d170;
	}

	public List<D180> getListD180() {
		return listD180;
	}

	public void setListD180(List<D180> listD180) {
		this.listD180 = listD180;
	}

	public List<D190> getListD190() {
		return listD190;
	}

	public void setListD190(List<D190> listD190) {
		this.listD190 = listD190;
	}

	public List<D195> getListD195() {
		return listD195;
	}

	public void setListD195(List<D195> listD195) {
		this.listD195 = listD195;
	}

	public D100() {
	}

	public D100(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_D100(strs1.get(0));
		this.setIND_OPER_D100(strs1.get(1));
		this.setIND_EMIT_D100(strs1.get(2));
		this.setCOD_PART_D100(strs1.get(3));
		this.setCOD_MOD_D100(strs1.get(4));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setCOD_SIT_D100(Byte.parseByte(strs1.get(5)));
		this.setSER_D100(strs1.get(6));
		this.setSUB_D100(strs1.get(7));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setNUM_DOC_D100(Integer.parseInt(strs1.get(8)));
		this.setCHV_CTE_D100(strs1.get(9));
		if (strs1.get(10).length() == 8) {
			ano = Integer.parseInt(strs1.get(10).substring(4, 8));
			mes = Integer.parseInt(strs1.get(10).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(10).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D100(calendar);
		if (strs1.get(11).length() == 8) {
			ano = Integer.parseInt(strs1.get(11).substring(4, 8));
			mes = Integer.parseInt(strs1.get(11).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(11).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_A_P_D100(calendar);
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setTP_CT_D100(Byte.parseByte(strs1.get(12)));
		this.setCHV_CTE_REF_D100(strs1.get(13));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_DOC_D100(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_DESC_D100(Float.parseFloat(strs1.get(15).replace(",", ".")));
		this.setIND_FRT_D100(strs1.get(16));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_SERV_D100(Float.parseFloat(strs1.get(17).replace(",", ".")));
		if (strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)))
			this.setVL_BC_ICMS_D100(Float.parseFloat(strs1.get(18).replace(",", ".")));
		if (strs1.get(19).length() >= 1 && RegexL.isNumber(strs1.get(19)))
			this.setVL_ICMS_D100(Float.parseFloat(strs1.get(19).replace(",", ".")));
		if (strs1.get(20).length() >= 1 && RegexL.isNumber(strs1.get(20)))
			this.setVL_NT_D100(Float.parseFloat(strs1.get(20).replace(",", ".")));
		this.setCOD_INF_D100(strs1.get(21));
		this.setCOD_CTA_D100(strs1.get(22));
	}

	@Override
	public String toString() {
		return "D100 [REG_D100=" + REG_D100 + ", IND_OPER_D100=" + IND_OPER_D100 + ", IND_EMIT_D100=" + IND_EMIT_D100
				+ ", COD_PART_D100=" + COD_PART_D100 + ", COD_MOD_D100=" + COD_MOD_D100 + ", COD_SIT_D100="
				+ COD_SIT_D100 + ", SER_D100=" + SER_D100 + ", SUB_D100=" + SUB_D100 + ", NUM_DOC_D100=" + NUM_DOC_D100
				+ ", CHV_CTE_D100=" + CHV_CTE_D100 + ", DT_DOC_D100=" + DT_DOC_D100 + ", DT_A_P_D100=" + DT_A_P_D100
				+ ", TP_CT_D100=" + TP_CT_D100 + ", CHV_CTE_REF_D100=" + CHV_CTE_REF_D100 + ", VL_DOC_D100="
				+ VL_DOC_D100 + ", VL_DESC_D100=" + VL_DESC_D100 + ", IND_FRT_D100=" + IND_FRT_D100 + ", VL_SERV_D100="
				+ VL_SERV_D100 + ", VL_BC_ICMS_D100=" + VL_BC_ICMS_D100 + ", VL_ICMS_D100=" + VL_ICMS_D100
				+ ", VL_NT_D100=" + VL_NT_D100 + ", COD_INF_D100=" + COD_INF_D100 + ", COD_CTA_D100=" + COD_CTA_D100
				+ "]";
	}
	
	
	

}
