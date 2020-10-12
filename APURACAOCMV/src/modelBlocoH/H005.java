package modelBlocoH;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import efdUtil.RegexL;

public class H005 {
	String REG_H005;
	Calendar DT_INV_H005 = new GregorianCalendar();
	float VL_INV_H005;
	String MOT_INV_H005;
	ArrayList<H010> listH010 = new ArrayList<>();

	public String getREG_H005() {
		return REG_H005;
	}

	public void setREG_H005(String rEG_H005) {
		REG_H005 = rEG_H005;
	}

	public Calendar getDT_INV_H005() {
		return DT_INV_H005;
	}

	public void setDT_INV_H005(Calendar dT_INV_H005) {
		DT_INV_H005 = dT_INV_H005;
	}

	public float getVL_INV_H005() {
		return VL_INV_H005;
	}

	public void setVL_INV_H005(float vL_INV_H005) {
		VL_INV_H005 = vL_INV_H005;
	}

	public String getMOT_INV_H005() {
		return MOT_INV_H005;
	}

	public void setMOT_INV_H005(String mOT_INV_H005) {
		MOT_INV_H005 = mOT_INV_H005;
	}

	
	public ArrayList<H010> getListH010() {
		return listH010;
	}

	public void setListH010(ArrayList<H010> listH010) {
		this.listH010 = listH010;
	}

	public H005(){}
	public H005(List<String> strs1) {
	int ano, mes, dia;
	this.setREG_H005(strs1.get(0));
	if(strs1.get(1).length() == 8) {
	ano = Integer.parseInt(strs1.get(1).substring(4,8));
	mes = Integer.parseInt(strs1.get(1).substring(2,4)) - 1;
	dia = Integer.parseInt(strs1.get(1).substring(0,2));
	}else {
	 ano = 0;	
	 mes = 0; 
	 dia = 0; 
	 }
	Calendar calendar = new GregorianCalendar(ano, mes, dia);
	this.setDT_INV_H005(calendar);
	if ( strs1.get(2).length() >= 1 && RegexL.isNumber(strs1.get(2)) )
		this.setVL_INV_H005(Float.parseFloat(strs1.get(2).replace(",",".")));
	this.setMOT_INV_H005(strs1.get(3));
	}

}
