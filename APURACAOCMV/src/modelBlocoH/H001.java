package modelBlocoH;

import java.util.ArrayList;
import java.util.List;

public class H001 {

	String REG_H001, IND_MOV_H001;

	public String getREG_H001() {
		return REG_H001;
	}

	public void setREG_H001(String rEG_H001) {
		REG_H001 = rEG_H001;
	}

	public String getIND_MOV_H001() {
		return IND_MOV_H001;
	}

	public void setIND_MOV_H001(String iND_MOV_H001) {
		IND_MOV_H001 = iND_MOV_H001;
	}

	public H001() {
	}

	public H001(List<String> strs1) {
		this.setREG_H001(strs1.get(0));
		this.setIND_MOV_H001(strs1.get(1));
	}

}
