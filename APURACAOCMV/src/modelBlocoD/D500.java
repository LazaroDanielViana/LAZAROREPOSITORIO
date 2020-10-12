package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import efdUtil.RegexL;

public class D500 {
	String REG_D500, IND_OPER_D500, IND_EMIT_D500, COD_PART_D500, COD_MOD_D500;
	byte COD_SIT_D500;
	String SER_D500, SUB_D500;
	int NUM_DOC_D500;
	Calendar DT_DOC_D500 = new GregorianCalendar();
	Calendar DT_A_P_D500 = new GregorianCalendar();
	float VL_DOC_D500, VL_DESC_D500, VL_SERV_D500, VL_SERV_NT_D500, VL_TERC_D500, VL_DA_D500, VL_BC_ICMS_D500,
			VL_ICMS_D500;
	String COD_INF_D500;
	float VL_PIS_D500, VL_COFINS_D500;
	String COD_CTA_D500;
	byte TP_ASSINANTE_D500;

	ArrayList<D510> listD510 = new ArrayList<>();
	ArrayList<D530> listD530 = new ArrayList<>();
	ArrayList<D590> listD590 = new ArrayList<>();

	public String getREG_D500() {
		return REG_D500;
	}

	public void setREG_D500(String rEG_D500) {
		REG_D500 = rEG_D500;
	}

	public String getIND_OPER_D500() {
		return IND_OPER_D500;
	}

	public void setIND_OPER_D500(String iND_OPER_D500) {
		IND_OPER_D500 = iND_OPER_D500;
	}

	public String getIND_EMIT_D500() {
		return IND_EMIT_D500;
	}

	public void setIND_EMIT_D500(String iND_EMIT_D500) {
		IND_EMIT_D500 = iND_EMIT_D500;
	}

	public String getCOD_PART_D500() {
		return COD_PART_D500;
	}

	public void setCOD_PART_D500(String cOD_PART_D500) {
		COD_PART_D500 = cOD_PART_D500;
	}

	public String getCOD_MOD_D500() {
		return COD_MOD_D500;
	}

	public void setCOD_MOD_D500(String cOD_MOD_D500) {
		COD_MOD_D500 = cOD_MOD_D500;
	}

	public byte getCOD_SIT_D500() {
		return COD_SIT_D500;
	}

	public void setCOD_SIT_D500(byte cOD_SIT_D500) {
		COD_SIT_D500 = cOD_SIT_D500;
	}

	public String getSER_D500() {
		return SER_D500;
	}

	public void setSER_D500(String sER_D500) {
		SER_D500 = sER_D500;
	}

	public String getSUB_D500() {
		return SUB_D500;
	}

	public void setSUB_D500(String sUB_D500) {
		SUB_D500 = sUB_D500;
	}

	public int getNUM_DOC_D500() {
		return NUM_DOC_D500;
	}

	public void setNUM_DOC_D500(int nUM_DOC_D500) {
		NUM_DOC_D500 = nUM_DOC_D500;
	}

	public Calendar getDT_DOC_D500() {
		return DT_DOC_D500;
	}

	public void setDT_DOC_D500(Calendar dT_DOC_D500) {
		DT_DOC_D500 = dT_DOC_D500;
	}

	public Calendar getDT_A_P_D500() {
		return DT_A_P_D500;
	}

	public void setDT_A_P_D500(Calendar dT_A_P_D500) {
		DT_A_P_D500 = dT_A_P_D500;
	}

	public float getVL_DOC_D500() {
		return VL_DOC_D500;
	}

	public void setVL_DOC_D500(float vL_DOC_D500) {
		VL_DOC_D500 = vL_DOC_D500;
	}

	public float getVL_DESC_D500() {
		return VL_DESC_D500;
	}

	public void setVL_DESC_D500(float vL_DESC_D500) {
		VL_DESC_D500 = vL_DESC_D500;
	}

	public float getVL_SERV_D500() {
		return VL_SERV_D500;
	}

	public void setVL_SERV_D500(float vL_SERV_D500) {
		VL_SERV_D500 = vL_SERV_D500;
	}

	public float getVL_SERV_NT_D500() {
		return VL_SERV_NT_D500;
	}

	public void setVL_SERV_NT_D500(float vL_SERV_NT_D500) {
		VL_SERV_NT_D500 = vL_SERV_NT_D500;
	}

	public float getVL_TERC_D500() {
		return VL_TERC_D500;
	}

	public void setVL_TERC_D500(float vL_TERC_D500) {
		VL_TERC_D500 = vL_TERC_D500;
	}

	public float getVL_DA_D500() {
		return VL_DA_D500;
	}

	public void setVL_DA_D500(float vL_DA_D500) {
		VL_DA_D500 = vL_DA_D500;
	}

	public float getVL_BC_ICMS_D500() {
		return VL_BC_ICMS_D500;
	}

	public void setVL_BC_ICMS_D500(float vL_BC_ICMS_D500) {
		VL_BC_ICMS_D500 = vL_BC_ICMS_D500;
	}

	public float getVL_ICMS_D500() {
		return VL_ICMS_D500;
	}

	public void setVL_ICMS_D500(float vL_ICMS_D500) {
		VL_ICMS_D500 = vL_ICMS_D500;
	}

	public String getCOD_INF_D500() {
		return COD_INF_D500;
	}

	public void setCOD_INF_D500(String cOD_INF_D500) {
		COD_INF_D500 = cOD_INF_D500;
	}

	public float getVL_PIS_D500() {
		return VL_PIS_D500;
	}

	public void setVL_PIS_D500(float vL_PIS_D500) {
		VL_PIS_D500 = vL_PIS_D500;
	}

	public float getVL_COFINS_D500() {
		return VL_COFINS_D500;
	}

	public void setVL_COFINS_D500(float vL_COFINS_D500) {
		VL_COFINS_D500 = vL_COFINS_D500;
	}

	public String getCOD_CTA_D500() {
		return COD_CTA_D500;
	}

	public void setCOD_CTA_D500(String cOD_CTA_D500) {
		COD_CTA_D500 = cOD_CTA_D500;
	}

	public byte getTP_ASSINANTE_D500() {
		return TP_ASSINANTE_D500;
	}

	public void setTP_ASSINANTE_D500(byte tP_ASSINANTE_D500) {
		TP_ASSINANTE_D500 = tP_ASSINANTE_D500;
	}

	public ArrayList<D510> getListD510() {
		return listD510;
	}

	public void setListD510(ArrayList<D510> listD510) {
		this.listD510 = listD510;
	}

	public ArrayList<D530> getListD530() {
		return listD530;
	}

	public void setListD530(ArrayList<D530> listD530) {
		this.listD530 = listD530;
	}

	public ArrayList<D590> getListD590() {
		return listD590;
	}

	public void setListD590(ArrayList<D590> listD590) {
		this.listD590 = listD590;
	}

	public D500() {
	}

	public D500(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D500(strs1.get(0));
		this.setIND_OPER_D500(strs1.get(1));
		this.setIND_EMIT_D500(strs1.get(2));
		this.setCOD_PART_D500(strs1.get(3));
		this.setCOD_MOD_D500(strs1.get(4));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setCOD_SIT_D500(Byte.parseByte(strs1.get(5)));
		this.setSER_D500(strs1.get(6));
		this.setSUB_D500(strs1.get(7));
		if (strs1.get(8).length() >= 1 && RegexL.isNumber(strs1.get(8)))
			this.setNUM_DOC_D500(Integer.parseInt(strs1.get(8)));
		if (strs1.get(9).length() == 8) {
			ano = Integer.parseInt(strs1.get(9).substring(4, 8));
			mes = Integer.parseInt(strs1.get(9).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(9).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_D500(calendar);
		if (strs1.get(10).length() == 8) {
			ano = Integer.parseInt(strs1.get(10).substring(4, 8));
			mes = Integer.parseInt(strs1.get(10).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(10).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_A_P_D500(calendar);
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setVL_DOC_D500(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_DESC_D500(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_SERV_D500(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_SERV_NT_D500(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_TERC_D500(Float.parseFloat(strs1.get(15).replace(",", ".")));
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_DA_D500(Float.parseFloat(strs1.get(16).replace(",", ".")));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_BC_ICMS_D500(Float.parseFloat(strs1.get(17).replace(",", ".")));
		if (strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)))
			this.setVL_ICMS_D500(Float.parseFloat(strs1.get(18).replace(",", ".")));
		this.setCOD_INF_D500(strs1.get(19));
		if (strs1.get(20).length() >= 1 && RegexL.isNumber(strs1.get(20)))
			this.setVL_PIS_D500(Float.parseFloat(strs1.get(20).replace(",", ".")));
		if (strs1.get(21).length() >= 1 && RegexL.isNumber(strs1.get(21)))
			this.setVL_COFINS_D500(Float.parseFloat(strs1.get(21).replace(",", ".")));
		this.setCOD_CTA_D500(strs1.get(22));
		if (strs1.get(23).length() >= 1 && RegexL.isNumber(strs1.get(23)))
			this.setTP_ASSINANTE_D500(Byte.parseByte(strs1.get(23)));
	}

}
