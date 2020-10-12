package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class E520 {
	String REG_E520;
	float VL_SD_ANT_IPI_E520, VL_DEB_IPI_E520, VL_CRED_IPI_E520, VL_OD_IPI_E520, VL_OC_IPI_E520, VL_SC_IPI_E520,
			VL_SD_IPI_E520;
	E500 e500;
	
	ArrayList<E530> listE530 = new ArrayList<>();

	public String getREG_E520() {
		return REG_E520;
	}

	public void setREG_E520(String rEG_E520) {
		REG_E520 = rEG_E520;
	}

	public float getVL_SD_ANT_IPI_E520() {
		return VL_SD_ANT_IPI_E520;
	}

	public void setVL_SD_ANT_IPI_E520(float vL_SD_ANT_IPI_E520) {
		VL_SD_ANT_IPI_E520 = vL_SD_ANT_IPI_E520;
	}

	public float getVL_DEB_IPI_E520() {
		return VL_DEB_IPI_E520;
	}

	public void setVL_DEB_IPI_E520(float vL_DEB_IPI_E520) {
		VL_DEB_IPI_E520 = vL_DEB_IPI_E520;
	}

	public float getVL_CRED_IPI_E520() {
		return VL_CRED_IPI_E520;
	}

	public void setVL_CRED_IPI_E520(float vL_CRED_IPI_E520) {
		VL_CRED_IPI_E520 = vL_CRED_IPI_E520;
	}

	public float getVL_OD_IPI_E520() {
		return VL_OD_IPI_E520;
	}

	public void setVL_OD_IPI_E520(float vL_OD_IPI_E520) {
		VL_OD_IPI_E520 = vL_OD_IPI_E520;
	}

	public float getVL_OC_IPI_E520() {
		return VL_OC_IPI_E520;
	}

	public void setVL_OC_IPI_E520(float vL_OC_IPI_E520) {
		VL_OC_IPI_E520 = vL_OC_IPI_E520;
	}

	public float getVL_SC_IPI_E520() {
		return VL_SC_IPI_E520;
	}

	public void setVL_SC_IPI_E520(float vL_SC_IPI_E520) {
		VL_SC_IPI_E520 = vL_SC_IPI_E520;
	}

	public float getVL_SD_IPI_E520() {
		return VL_SD_IPI_E520;
	}

	public void setVL_SD_IPI_E520(float vL_SD_IPI_E520) {
		VL_SD_IPI_E520 = vL_SD_IPI_E520;
	}
	
	

	public E500 getE500() {
		return e500;
	}

	public void setE500(E500 e500) {
		this.e500 = e500;
	}
	
	

	public ArrayList<E530> getListE530() {
		return listE530;
	}

	public void setListE530(ArrayList<E530> listE530) {
		this.listE530 = listE530;
	}

	public E520() {
	}

	public E520(List<String> strs1) {
		this.setVL_SD_ANT_IPI_E520(Float.parseFloat(strs1.get(0).replace(",", ".")));
		this.setVL_DEB_IPI_E520(Float.parseFloat(strs1.get(1).replace(",", ".")));
		this.setVL_CRED_IPI_E520(Float.parseFloat(strs1.get(2).replace(",", ".")));
		this.setVL_OD_IPI_E520(Float.parseFloat(strs1.get(3).replace(",", ".")));
		this.setVL_OC_IPI_E520(Float.parseFloat(strs1.get(4).replace(",", ".")));
		this.setVL_SC_IPI_E520(Float.parseFloat(strs1.get(5).replace(",", ".")));
		this.setVL_SD_IPI_E520(Float.parseFloat(strs1.get(6).replace(",", ".")));
	}

}
