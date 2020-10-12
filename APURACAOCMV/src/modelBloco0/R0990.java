package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0990 {
	String REG_R0990;
	int QTD_LIN_0_R0990;

	public String getREG_R0990() {
		return REG_R0990;
	}

	public void setREG_R0990(String rEG_R0990) {
		REG_R0990 = rEG_R0990;
	}

	public int getQTD_LIN_0_R0990() {
		return QTD_LIN_0_R0990;
	}

	public void setQTD_LIN_0_R0990(int qTD_LIN_0_R0990) {
		QTD_LIN_0_R0990 = qTD_LIN_0_R0990;
	}

	public R0990() {
	}

	public R0990(List<String> strs1) {
		this.setREG_R0990(strs1.get(0));
		if (strs1.get(1).length() >= 1 )
			this.setQTD_LIN_0_R0990(Integer.parseInt(strs1.get(1)));
	}
}
