package modelBlocoD;

import java.util.ArrayList;

public class D697 {
	String REG_D697, UF_D697;
	float VL_BC_ICMS_D697, VL_ICMS_D697;
	
	D696 d696;

	public String getREG_D697() {
		return REG_D697;
	}

	public void setREG_D697(String rEG_D697) {
		REG_D697 = rEG_D697;
	}

	public String getUF_D697() {
		return UF_D697;
	}

	public void setUF_D697(String uF_D697) {
		UF_D697 = uF_D697;
	}

	public float getVL_BC_ICMS_D697() {
		return VL_BC_ICMS_D697;
	}

	public void setVL_BC_ICMS_D697(float vL_BC_ICMS_D697) {
		VL_BC_ICMS_D697 = vL_BC_ICMS_D697;
	}

	public float getVL_ICMS_D697() {
		return VL_ICMS_D697;
	}

	public void setVL_ICMS_D697(float vL_ICMS_D697) {
		VL_ICMS_D697 = vL_ICMS_D697;
	}
	
	

	public D696 getD696() {
		return d696;
	}

	public void setD696(D696 d696) {
		this.d696 = d696;
	}

	public D697() {
	}

	public D697(ArrayList<String> strs1) {
		this.setREG_D697(strs1.get(0));
		this.setUF_D697(strs1.get(1));
		this.setVL_BC_ICMS_D697(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setVL_ICMS_D697(Float.parseFloat(strs1.get(3).replace(",", ".")));
	}

}
