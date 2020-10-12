package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C500 {

	String REG_C500, IND_OPER_C500, IND_EMIT_C500, COD_PART_C500, COD_MOD_C500;
	int COD_SIT_C500;
	String SER_C500;
	int SUB_C500;
	String COD_CONS_C500;
	int NUM_DOC_C500;
	Calendar DT_DOC_C500 = new GregorianCalendar();

	Calendar DT_E_S_C500 = new GregorianCalendar();
	float VL_DOC_C500, VL_DESC_C500, VL_FORN_C500, VL_SERV_NT_C500, VL_TERC_C500, VL_DA_C500, VL_BC_ICMS_C500,
			VL_ICMS_C500, VL_BC_ICMS_ST_C500, VL_ICMS_ST_C500;
	String COD_INF_C500;
	float VL_PIS_C500, VL_COFINS_C500;
	int TP_LIGACAO_C500;
	String COD_GRUPO_TENSAO_C500;

	ArrayList<C510> listC510 = new ArrayList<>();
	ArrayList<C590> listC590 = new ArrayList<>();

	public String getREG_C500() {
		return REG_C500;
	}

	public void setREG_C500(String rEG_C500) {
		REG_C500 = rEG_C500;
	}

	public String getIND_OPER_C500() {
		return IND_OPER_C500;
	}

	public void setIND_OPER_C500(String iND_OPER_C500) {
		IND_OPER_C500 = iND_OPER_C500;
	}

	public String getIND_EMIT_C500() {
		return IND_EMIT_C500;
	}

	public void setIND_EMIT_C500(String iND_EMIT_C500) {
		IND_EMIT_C500 = iND_EMIT_C500;
	}

	public String getCOD_PART_C500() {
		return COD_PART_C500;
	}

	public void setCOD_PART_C500(String cOD_PART_C500) {
		COD_PART_C500 = cOD_PART_C500;
	}

	public String getCOD_MOD_C500() {
		return COD_MOD_C500;
	}

	public void setCOD_MOD_C500(String cOD_MOD_C500) {
		COD_MOD_C500 = cOD_MOD_C500;
	}

	public int getCOD_SIT_C500() {
		return COD_SIT_C500;
	}

	public void setCOD_SIT_C500(int cOD_SIT_C500) {
		COD_SIT_C500 = cOD_SIT_C500;
	}

	public String getSER_C500() {
		return SER_C500;
	}

	public void setSER_C500(String sER_C500) {
		SER_C500 = sER_C500;
	}

	public int getSUB_C500() {
		return SUB_C500;
	}

	public void setSUB_C500(int sUB_C500) {
		SUB_C500 = sUB_C500;
	}

	public String getCOD_CONS_C500() {
		return COD_CONS_C500;
	}

	public void setCOD_CONS_C500(String cOD_CONS_C500) {
		COD_CONS_C500 = cOD_CONS_C500;
	}

	public int getNUM_DOC_C500() {
		return NUM_DOC_C500;
	}

	public void setNUM_DOC_C500(int nUM_DOC_C500) {
		NUM_DOC_C500 = nUM_DOC_C500;
	}

	public Calendar getDT_DOC_C500() {
		return DT_DOC_C500;
	}

	public void setDT_DOC_C500(Calendar dT_DOC_C500) {
		DT_DOC_C500 = dT_DOC_C500;
	}

	public Calendar getDT_E_S_C500() {
		return DT_E_S_C500;
	}

	public void setDT_E_S_C500(Calendar dT_E_S_C500) {
		DT_E_S_C500 = dT_E_S_C500;
	}

	public float getVL_DOC_C500() {
		return VL_DOC_C500;
	}

	public void setVL_DOC_C500(float vL_DOC_C500) {
		VL_DOC_C500 = vL_DOC_C500;
	}

	public float getVL_DESC_C500() {
		return VL_DESC_C500;
	}

	public void setVL_DESC_C500(float vL_DESC_C500) {
		VL_DESC_C500 = vL_DESC_C500;
	}

	public float getVL_FORN_C500() {
		return VL_FORN_C500;
	}

	public void setVL_FORN_C500(float vL_FORN_C500) {
		VL_FORN_C500 = vL_FORN_C500;
	}

	public float getVL_SERV_NT_C500() {
		return VL_SERV_NT_C500;
	}

	public void setVL_SERV_NT_C500(float vL_SERV_NT_C500) {
		VL_SERV_NT_C500 = vL_SERV_NT_C500;
	}

	public float getVL_TERC_C500() {
		return VL_TERC_C500;
	}

	public void setVL_TERC_C500(float vL_TERC_C500) {
		VL_TERC_C500 = vL_TERC_C500;
	}

	public float getVL_DA_C500() {
		return VL_DA_C500;
	}

	public void setVL_DA_C500(float vL_DA_C500) {
		VL_DA_C500 = vL_DA_C500;
	}

	public float getVL_BC_ICMS_C500() {
		return VL_BC_ICMS_C500;
	}

	public void setVL_BC_ICMS_C500(float vL_BC_ICMS_C500) {
		VL_BC_ICMS_C500 = vL_BC_ICMS_C500;
	}

	public float getVL_ICMS_C500() {
		return VL_ICMS_C500;
	}

	public void setVL_ICMS_C500(float vL_ICMS_C500) {
		VL_ICMS_C500 = vL_ICMS_C500;
	}

	public float getVL_BC_ICMS_ST_C500() {
		return VL_BC_ICMS_ST_C500;
	}

	public void setVL_BC_ICMS_ST_C500(float vL_BC_ICMS_ST_C500) {
		VL_BC_ICMS_ST_C500 = vL_BC_ICMS_ST_C500;
	}

	public float getVL_ICMS_ST_C500() {
		return VL_ICMS_ST_C500;
	}

	public void setVL_ICMS_ST_C500(float vL_ICMS_ST_C500) {
		VL_ICMS_ST_C500 = vL_ICMS_ST_C500;
	}

	public String getCOD_INF_C500() {
		return COD_INF_C500;
	}

	public void setCOD_INF_C500(String cOD_INF_C500) {
		COD_INF_C500 = cOD_INF_C500;
	}

	public float getVL_PIS_C500() {
		return VL_PIS_C500;
	}

	public void setVL_PIS_C500(float vL_PIS_C500) {
		VL_PIS_C500 = vL_PIS_C500;
	}

	public float getVL_COFINS_C500() {
		return VL_COFINS_C500;
	}

	public void setVL_COFINS_C500(float vL_COFINS_C500) {
		VL_COFINS_C500 = vL_COFINS_C500;
	}

	public int getTP_LIGACAO_C500() {
		return TP_LIGACAO_C500;
	}

	public void setTP_LIGACAO_C500(int tP_LIGACAO_C500) {
		TP_LIGACAO_C500 = tP_LIGACAO_C500;
	}

	public String getCOD_GRUPO_TENSAO_C500() {
		return COD_GRUPO_TENSAO_C500;
	}

	public void setCOD_GRUPO_TENSAO_C500(String cOD_GRUPO_TENSAO_C500) {
		COD_GRUPO_TENSAO_C500 = cOD_GRUPO_TENSAO_C500;
	}

	public ArrayList<C510> getListC510() {
		return listC510;
	}

	public void setListC510(ArrayList<C510> listC510) {
		this.listC510 = listC510;
	}

	public ArrayList<C590> getListC590() {
		return listC590;
	}

	public void setListC590(ArrayList<C590> listC590) {
		this.listC590 = listC590;
	}

	public C500() {
	}

	public C500(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C500(strs1.get(0));
		this.setIND_OPER_C500(strs1.get(1));
		this.setIND_EMIT_C500(strs1.get(2));
		this.setCOD_PART_C500(strs1.get(3));
		this.setCOD_MOD_C500(strs1.get(4));
		if (strs1.get(5).length() >= 1 && RegexL.isNumber(strs1.get(5)))
			this.setCOD_SIT_C500(Integer.parseInt(strs1.get(5)));
		this.setSER_C500(strs1.get(6));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setSUB_C500(Integer.parseInt(strs1.get(7)));
		this.setCOD_CONS_C500(strs1.get(8));
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setNUM_DOC_C500(Integer.parseInt(strs1.get(9)));
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
		this.setDT_DOC_C500(calendar);
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
		this.setDT_E_S_C500(calendar);
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_DOC_C500(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_DESC_C500(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_FORN_C500(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_SERV_NT_C500(Float.parseFloat(strs1.get(15).replace(",", ".")));
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_TERC_C500(Float.parseFloat(strs1.get(16).replace(",", ".")));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_DA_C500(Float.parseFloat(strs1.get(17).replace(",", ".")));
		if (strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)))
			this.setVL_BC_ICMS_C500(Float.parseFloat(strs1.get(18).replace(",", ".")));
		if (strs1.get(19).length() >= 1 && RegexL.isNumber(strs1.get(19)))
			this.setVL_ICMS_C500(Float.parseFloat(strs1.get(19).replace(",", ".")));
		if (strs1.get(20).length() >= 1 && RegexL.isNumber(strs1.get(20)))
			this.setVL_BC_ICMS_ST_C500(Float.parseFloat(strs1.get(20).replace(",", ".")));
		if (strs1.get(21).length() >= 1 && RegexL.isNumber(strs1.get(21)))
			this.setVL_ICMS_ST_C500(Float.parseFloat(strs1.get(21).replace(",", ".")));
		this.setCOD_INF_C500(strs1.get(22));
		if (strs1.get(23).length() >= 1 && RegexL.isNumber(strs1.get(23)))
			this.setVL_PIS_C500(Float.parseFloat(strs1.get(23).replace(",", ".")));
		if (strs1.get(24).length() >= 1 && RegexL.isNumber(strs1.get(24)))
			this.setVL_COFINS_C500(Float.parseFloat(strs1.get(24).replace(",", ".")));
		if (strs1.get(25).length() >= 1 && RegexL.isNumber(strs1.get(25)))
			this.setTP_LIGACAO_C500(Integer.parseInt(strs1.get(25)));
		this.setCOD_GRUPO_TENSAO_C500(strs1.get(26));
	}

}
