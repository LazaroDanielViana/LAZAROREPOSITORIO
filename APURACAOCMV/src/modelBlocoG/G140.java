package modelBlocoG;

import java.util.ArrayList;
import java.util.List;

public class G140 {

	String REG_G140;
	int NUM_ITEM_G140;
	String COD_ITEM_G140;
	
	G130 g130;

	public String getREG_G140() {
		return REG_G140;
	}

	public void setREG_G140(String rEG_G140) {
		REG_G140 = rEG_G140;
	}

	public int getNUM_ITEM_G140() {
		return NUM_ITEM_G140;
	}

	public void setNUM_ITEM_G140(int nUM_ITEM_G140) {
		NUM_ITEM_G140 = nUM_ITEM_G140;
	}

	public String getCOD_ITEM_G140() {
		return COD_ITEM_G140;
	}

	public void setCOD_ITEM_G140(String cOD_ITEM_G140) {
		COD_ITEM_G140 = cOD_ITEM_G140;
	}
	
	

	public G130 getG130() {
		return g130;
	}

	public void setG130(G130 g130) {
		this.g130 = g130;
	}

	public G140() {
	}

	public G140(List<String> strs1) {
		this.setREG_G140(strs1.get(0));
		this.setNUM_ITEM_G140(Integer.parseInt(strs1.get(1)));
		this.setCOD_ITEM_G140(strs1.get(2));
	}

}
