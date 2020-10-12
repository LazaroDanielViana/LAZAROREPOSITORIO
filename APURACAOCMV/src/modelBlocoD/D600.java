package modelBlocoD;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class D600 {
	String REG_D600, COD_MOD_D600;
	int COD_MUN_D600;
	String SER_D600;
	int SUB_D600, COD_CONS_D600, QTD_CONS_D600;
	Calendar DT_DOC_D600 = new GregorianCalendar();
	float VL_DOC_D600, VL_DESC_D600, VL_SERV_D600, VL_SERV_N_D600, VL_TERC_D600, VL_DA_D600, VL_BC_ICMS_D600,
			VL_ICMS_D600, VL_PIS_D600, VL_COFINS_D600;
	
	ArrayList<D610> listD610 = new ArrayList<>();
	ArrayList<D690> listD690 = new ArrayList<>();

	public String getREG_D600() {
		return REG_D600;
	}

	public void setREG_D600(String rEG_D600) {
		REG_D600 = rEG_D600;
	}

	public String getCOD_MOD_D600() {
		return COD_MOD_D600;
	}

	public void setCOD_MOD_D600(String cOD_MOD_D600) {
		COD_MOD_D600 = cOD_MOD_D600;
	}

	public int getCOD_MUN_D600() {
		return COD_MUN_D600;
	}

	public void setCOD_MUN_D600(int cOD_MUN_D600) {
		COD_MUN_D600 = cOD_MUN_D600;
	}

	public String getSER_D600() {
		return SER_D600;
	}

	public void setSER_D600(String sER_D600) {
		SER_D600 = sER_D600;
	}

	public int getSUB_D600() {
		return SUB_D600;
	}

	public void setSUB_D600(int sUB_D600) {
		SUB_D600 = sUB_D600;
	}

	public int getCOD_CONS_D600() {
		return COD_CONS_D600;
	}

	public void setCOD_CONS_D600(int cOD_CONS_D600) {
		COD_CONS_D600 = cOD_CONS_D600;
	}

	public int getQTD_CONS_D600() {
		return QTD_CONS_D600;
	}

	public void setQTD_CONS_D600(int qTD_CONS_D600) {
		QTD_CONS_D600 = qTD_CONS_D600;
	}

	public Calendar getDT_DOC_D600() {
		return DT_DOC_D600;
	}

	public void setDT_DOC_D600(Calendar dT_DOC_D600) {
		DT_DOC_D600 = dT_DOC_D600;
	}

	public float getVL_DOC_D600() {
		return VL_DOC_D600;
	}

	public void setVL_DOC_D600(float vL_DOC_D600) {
		VL_DOC_D600 = vL_DOC_D600;
	}

	public float getVL_DESC_D600() {
		return VL_DESC_D600;
	}

	public void setVL_DESC_D600(float vL_DESC_D600) {
		VL_DESC_D600 = vL_DESC_D600;
	}

	public float getVL_SERV_D600() {
		return VL_SERV_D600;
	}

	public void setVL_SERV_D600(float vL_SERV_D600) {
		VL_SERV_D600 = vL_SERV_D600;
	}

	public float getVL_SERV_N_D600() {
		return VL_SERV_N_D600;
	}

	public void setVL_SERV_N_D600(float vL_SERV_N_D600) {
		VL_SERV_N_D600 = vL_SERV_N_D600;
	}

	public float getVL_TERC_D600() {
		return VL_TERC_D600;
	}

	public void setVL_TERC_D600(float vL_TERC_D600) {
		VL_TERC_D600 = vL_TERC_D600;
	}

	public float getVL_DA_D600() {
		return VL_DA_D600;
	}

	public void setVL_DA_D600(float vL_DA_D600) {
		VL_DA_D600 = vL_DA_D600;
	}

	public float getVL_BC_ICMS_D600() {
		return VL_BC_ICMS_D600;
	}

	public void setVL_BC_ICMS_D600(float vL_BC_ICMS_D600) {
		VL_BC_ICMS_D600 = vL_BC_ICMS_D600;
	}

	public float getVL_ICMS_D600() {
		return VL_ICMS_D600;
	}

	public void setVL_ICMS_D600(float vL_ICMS_D600) {
		VL_ICMS_D600 = vL_ICMS_D600;
	}

	public float getVL_PIS_D600() {
		return VL_PIS_D600;
	}

	public void setVL_PIS_D600(float vL_PIS_D600) {
		VL_PIS_D600 = vL_PIS_D600;
	}

	public float getVL_COFINS_D600() {
		return VL_COFINS_D600;
	}

	public void setVL_COFINS_D600(float vL_COFINS_D600) {
		VL_COFINS_D600 = vL_COFINS_D600;
	}

	
	public ArrayList<D610> getListD610() {
		return listD610;
	}

	public void setListD610(ArrayList<D610> listD610) {
		this.listD610 = listD610;
	}

	public ArrayList<D690> getListD690() {
		return listD690;
	}

	public void setListD690(ArrayList<D690> listD690) {
		this.listD690 = listD690;
	}

	public D600() {
	}

	public D600(ArrayList<String> strs1) {
		int ano, mes, dia;
		this.setREG_D600(strs1.get(0));
		this.setCOD_MOD_D600(strs1.get(1));
		this.setCOD_MUN_D600(Integer.parseInt(strs1.get(2)));
		this.setSER_D600(strs1.get(3));
		this.setSUB_D600(Integer.parseInt(strs1.get(4)));
		this.setCOD_CONS_D600(Integer.parseInt(strs1.get(5)));
		this.setQTD_CONS_D600(Integer.parseInt(strs1.get(6)));
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
		this.setDT_DOC_D600(calendar);
		this.setVL_DOC_D600(Float.parseFloat(strs1.get(8).replace(",", ".")));
		this.setVL_DESC_D600(Float.parseFloat(strs1.get(9).replace(",", ".")));
		this.setVL_SERV_D600(Float.parseFloat(strs1.get(10).replace(",", ".")));
		this.setVL_SERV_N_D600(Float.parseFloat(strs1.get(11).replace(",", ".")));
		this.setVL_TERC_D600(Float.parseFloat(strs1.get(12).replace(",", ".")));
		this.setVL_DA_D600(Float.parseFloat(strs1.get(13).replace(",", ".")));
		this.setVL_BC_ICMS_D600(Float.parseFloat(strs1.get(14).replace(",", ".")));
		this.setVL_ICMS_D600(Float.parseFloat(strs1.get(15).replace(",", ".")));
		this.setVL_PIS_D600(Float.parseFloat(strs1.get(16).replace(",", ".")));
		this.setVL_COFINS_D600(Float.parseFloat(strs1.get(17).replace(",", ".")));
	}

}
