package modelBloco0;

import java.util.ArrayList;
import java.util.List;

public class R0460 {
	
	String REG_R0460,
	COD_OBS_R0460,
	TXT_R0460;

	/**
	 * @return the rEG_R0460
	 */
	public String getREG_R0460() {
		return REG_R0460;
	}

	/**
	 * @param rEG_R0460 the rEG_R0460 to set
	 */
	public void setREG_R0460(String rEG_R0460) {
		REG_R0460 = rEG_R0460;
	}

	/**
	 * @return the cOD_OBS_R0460
	 */
	public String getCOD_OBS_R0460() {
		return COD_OBS_R0460;
	}

	/**
	 * @param cOD_OBS_R0460 the cOD_OBS_R0460 to set
	 */
	public void setCOD_OBS_R0460(String cOD_OBS_R0460) {
		COD_OBS_R0460 = cOD_OBS_R0460;
	}

	/**
	 * @return the tXT_R0460
	 */
	public String getTXT_R0460() {
		return TXT_R0460;
	}

	/**
	 * @param tXT_R0460 the tXT_R0460 to set
	 */
	public void setTXT_R0460(String tXT_R0460) {
		TXT_R0460 = tXT_R0460;
	}
	
	public R0460() {
	}

	public R0460(List<String> strs1) {
		this.setREG_R0460(strs1.get(0));
		this.setCOD_OBS_R0460(strs1.get(1));
		this.setTXT_R0460(strs1.get(2));
	}

}
