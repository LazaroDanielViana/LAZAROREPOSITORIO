package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E510 {
	String REG_E510;
	int CFOP_E510, CST_IPI_E510;
	float VL_CONT_IPI_E510, VL_BC_IPI_E510, VL_IPI_E510;

	E500 e500;
	public String getREG_E510() {
		return REG_E510;
	}

	public void setREG_E510(String rEG_E510) {
		REG_E510 = rEG_E510;
	}

	public int getCFOP_E510() {
		return CFOP_E510;
	}

	public void setCFOP_E510(int cFOP_E510) {
		CFOP_E510 = cFOP_E510;
	}

	public int getCST_IPI_E510() {
		return CST_IPI_E510;
	}

	public void setCST_IPI_E510(int cST_IPI_E510) {
		CST_IPI_E510 = cST_IPI_E510;
	}

	public float getVL_CONT_IPI_E510() {
		return VL_CONT_IPI_E510;
	}

	public void setVL_CONT_IPI_E510(float vL_CONT_IPI_E510) {
		VL_CONT_IPI_E510 = vL_CONT_IPI_E510;
	}

	public float getVL_BC_IPI_E510() {
		return VL_BC_IPI_E510;
	}

	public void setVL_BC_IPI_E510(float vL_BC_IPI_E510) {
		VL_BC_IPI_E510 = vL_BC_IPI_E510;
	}

	public float getVL_IPI_E510() {
		return VL_IPI_E510;
	}

	public void setVL_IPI_E510(float vL_IPI_E510) {
		VL_IPI_E510 = vL_IPI_E510;
	}

	
	public E500 getE500() {
		return e500;
	}

	public void setE500(E500 e500) {
		this.e500 = e500;
	}

	public E510() {
	}

	public E510(List<String> strs1) {
		this.setREG_E510(strs1.get(0));
		this.setCFOP_E510(Integer.parseInt(strs1.get(1)));
		this.setCST_IPI_E510(Integer.parseInt(strs1.get(2)));
		this.setVL_CONT_IPI_E510(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_BC_IPI_E510(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_IPI_E510(Float.parseFloat(strs1.get(5).replace(",", ".")));
	}

}
