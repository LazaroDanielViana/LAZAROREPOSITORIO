package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class C600 {

	String REG_C600, COD_MOD_C600;
	int COD_MUN_C600;
	String SER_C600;
	int SUB_C600;
	String COD_CONS_C600;
	int QTD_CONS_C600, QTD_CANC_C600;

	Calendar DT_DOC_C600 = new GregorianCalendar();
	float VL_DOC_C600, VL_DESC_C600, CONS_C600, VL_FORN_C600, VL_SERV_NT_C600, VL_TERC_C600, VL_DA_C600,
			VL_BC_ICMS_C600, VL_ICMS_C600, VL_BC_ICMS_ST_C600, VL_ICMS_ST_C600, VL_PIS_C600, VL_COFINS_C600;

	ArrayList<C601> listC601 = new ArrayList<>();
	ArrayList<C610> listC610 = new ArrayList<>();
	ArrayList<C690> listC690 = new ArrayList<>();

	public String getREG_C600() {
		return REG_C600;
	}

	public void setREG_C600(String rEG_C600) {
		REG_C600 = rEG_C600;
	}

	public String getCOD_MOD_C600() {
		return COD_MOD_C600;
	}

	public void setCOD_MOD_C600(String cOD_MOD_C600) {
		COD_MOD_C600 = cOD_MOD_C600;
	}

	public int getCOD_MUN_C600() {
		return COD_MUN_C600;
	}

	public void setCOD_MUN_C600(int cOD_MUN_C600) {
		COD_MUN_C600 = cOD_MUN_C600;
	}

	public String getSER_C600() {
		return SER_C600;
	}

	public void setSER_C600(String sER_C600) {
		SER_C600 = sER_C600;
	}

	public int getSUB_C600() {
		return SUB_C600;
	}

	public void setSUB_C600(int sUB_C600) {
		SUB_C600 = sUB_C600;
	}

	public String getCOD_CONS_C600() {
		return COD_CONS_C600;
	}

	public void setCOD_CONS_C600(String cOD_CONS_C600) {
		COD_CONS_C600 = cOD_CONS_C600;
	}

	public int getQTD_CONS_C600() {
		return QTD_CONS_C600;
	}

	public void setQTD_CONS_C600(int qTD_CONS_C600) {
		QTD_CONS_C600 = qTD_CONS_C600;
	}

	public int getQTD_CANC_C600() {
		return QTD_CANC_C600;
	}

	public void setQTD_CANC_C600(int qTD_CANC_C600) {
		QTD_CANC_C600 = qTD_CANC_C600;
	}

	public Calendar getDT_DOC_C600() {
		return DT_DOC_C600;
	}

	public void setDT_DOC_C600(Calendar dT_DOC_C600) {
		DT_DOC_C600 = dT_DOC_C600;
	}

	public float getVL_DOC_C600() {
		return VL_DOC_C600;
	}

	public void setVL_DOC_C600(float vL_DOC_C600) {
		VL_DOC_C600 = vL_DOC_C600;
	}

	public float getVL_DESC_C600() {
		return VL_DESC_C600;
	}

	public void setVL_DESC_C600(float vL_DESC_C600) {
		VL_DESC_C600 = vL_DESC_C600;
	}

	public float getCONS_C600() {
		return CONS_C600;
	}

	public void setCONS_C600(float cONS_C600) {
		CONS_C600 = cONS_C600;
	}

	public float getVL_FORN_C600() {
		return VL_FORN_C600;
	}

	public void setVL_FORN_C600(float vL_FORN_C600) {
		VL_FORN_C600 = vL_FORN_C600;
	}

	public float getVL_SERV_NT_C600() {
		return VL_SERV_NT_C600;
	}

	public void setVL_SERV_NT_C600(float vL_SERV_NT_C600) {
		VL_SERV_NT_C600 = vL_SERV_NT_C600;
	}

	public float getVL_TERC_C600() {
		return VL_TERC_C600;
	}

	public void setVL_TERC_C600(float vL_TERC_C600) {
		VL_TERC_C600 = vL_TERC_C600;
	}

	public float getVL_DA_C600() {
		return VL_DA_C600;
	}

	public void setVL_DA_C600(float vL_DA_C600) {
		VL_DA_C600 = vL_DA_C600;
	}

	public float getVL_BC_ICMS_C600() {
		return VL_BC_ICMS_C600;
	}

	public void setVL_BC_ICMS_C600(float vL_BC_ICMS_C600) {
		VL_BC_ICMS_C600 = vL_BC_ICMS_C600;
	}

	public float getVL_ICMS_C600() {
		return VL_ICMS_C600;
	}

	public void setVL_ICMS_C600(float vL_ICMS_C600) {
		VL_ICMS_C600 = vL_ICMS_C600;
	}

	public float getVL_BC_ICMS_ST_C600() {
		return VL_BC_ICMS_ST_C600;
	}

	public void setVL_BC_ICMS_ST_C600(float vL_BC_ICMS_ST_C600) {
		VL_BC_ICMS_ST_C600 = vL_BC_ICMS_ST_C600;
	}

	public float getVL_ICMS_ST_C600() {
		return VL_ICMS_ST_C600;
	}

	public void setVL_ICMS_ST_C600(float vL_ICMS_ST_C600) {
		VL_ICMS_ST_C600 = vL_ICMS_ST_C600;
	}

	public float getVL_PIS_C600() {
		return VL_PIS_C600;
	}

	public void setVL_PIS_C600(float vL_PIS_C600) {
		VL_PIS_C600 = vL_PIS_C600;
	}

	public float getVL_COFINS_C600() {
		return VL_COFINS_C600;
	}

	public void setVL_COFINS_C600(float vL_COFINS_C600) {
		VL_COFINS_C600 = vL_COFINS_C600;
	}

	public ArrayList<C601> getListC601() {
		return listC601;
	}

	public void setListC601(ArrayList<C601> listC601) {
		this.listC601 = listC601;
	}

	public ArrayList<C610> getListC610() {
		return listC610;
	}

	public void setListC610(ArrayList<C610> listC610) {
		this.listC610 = listC610;
	}

	public ArrayList<C690> getListC690() {
		return listC690;
	}

	public void setListC690(ArrayList<C690> listC690) {
		this.listC690 = listC690;
	}

	public C600() {
	}

	public C600(List<String> strs1) {
		int ano, mes, dia;
		this.setREG_C600(strs1.get(0));
		this.setCOD_MOD_C600(strs1.get(1));
		if (strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)))
			this.setCOD_MUN_C600(Integer.parseInt(strs1.get(2)));
		this.setSER_C600(strs1.get(3));
		if (strs1.get(4).length() >= 1 && RegexL.isNumber(strs1.get(4)))
			this.setSUB_C600(Integer.parseInt(strs1.get(4)));
		this.setCOD_CONS_C600(strs1.get(5));
		if (strs1.get(6).length() >= 1 && RegexL.isNumber(strs1.get(6)))
			this.setQTD_CONS_C600(Integer.parseInt(strs1.get(6)));
		if (strs1.get(7).length() >= 1 && RegexL.isNumber(strs1.get(7)))
			this.setQTD_CANC_C600(Integer.parseInt(strs1.get(7)));
		if (strs1.get(8).length() == 8) {
			ano = Integer.parseInt(strs1.get(8).substring(4, 8));
			mes = Integer.parseInt(strs1.get(8).substring(2, 4)) - 1;
			dia = Integer.parseInt(strs1.get(8).substring(0, 2));
		} else {
			ano = 0;
			mes = 0;
			dia = 0;
		}
		Calendar calendar = new GregorianCalendar(ano, mes, dia);
		this.setDT_DOC_C600(calendar);
		if (strs1.get(9).length() >= 1 && RegexL.isNumber(strs1.get(9)))
			this.setVL_DOC_C600(Float.parseFloat(strs1.get(9).replace(",", ".")));
		if (strs1.get(10).length() >= 1 && RegexL.isNumber(strs1.get(10)))
			this.setVL_DESC_C600(Float.parseFloat(strs1.get(10).replace(",", ".")));
		if (strs1.get(11).length() >= 1 && RegexL.isNumber(strs1.get(11)))
			this.setCONS_C600(Float.parseFloat(strs1.get(11).replace(",", ".")));
		if (strs1.get(12).length() >= 1 && RegexL.isNumber(strs1.get(12)))
			this.setVL_FORN_C600(Float.parseFloat(strs1.get(12).replace(",", ".")));
		if (strs1.get(13).length() >= 1 && RegexL.isNumber(strs1.get(13)))
			this.setVL_SERV_NT_C600(Float.parseFloat(strs1.get(13).replace(",", ".")));
		if (strs1.get(14).length() >= 1 && RegexL.isNumber(strs1.get(14)))
			this.setVL_TERC_C600(Float.parseFloat(strs1.get(14).replace(",", ".")));
		if (strs1.get(15).length() >= 1 && RegexL.isNumber(strs1.get(15)))
			this.setVL_DA_C600(Float.parseFloat(strs1.get(15).replace(",", ".")));
		if (strs1.get(16).length() >= 1 && RegexL.isNumber(strs1.get(16)))
			this.setVL_BC_ICMS_C600(Float.parseFloat(strs1.get(16).replace(",", ".")));
		if (strs1.get(17).length() >= 1 && RegexL.isNumber(strs1.get(17)))
			this.setVL_ICMS_C600(Float.parseFloat(strs1.get(17).replace(",", ".")));
		if (strs1.get(18).length() >= 1 && RegexL.isNumber(strs1.get(18)))
			this.setVL_BC_ICMS_ST_C600(Float.parseFloat(strs1.get(18).replace(",", ".")));
		if (strs1.get(19).length() >= 1 && RegexL.isNumber(strs1.get(19)))
			this.setVL_ICMS_ST_C600(Float.parseFloat(strs1.get(19).replace(",", ".")));
		if (strs1.get(20).length() >= 1 && RegexL.isNumber(strs1.get(20)))
			this.setVL_PIS_C600(Float.parseFloat(strs1.get(20).replace(",", ".")));
		if (strs1.get(21).length() >= 1 && RegexL.isNumber(strs1.get(21)))
			this.setVL_COFINS_C600(Float.parseFloat(strs1.get(21).replace(",", ".")));
	}

}
