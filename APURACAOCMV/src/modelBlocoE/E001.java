package modelBlocoE;

import java.util.ArrayList;

public class E001 {
	String REG_E001, IND_MOV_E001;

	public String getREG_E001() {
		return REG_E001;
	}

	public void setREG_E001(String rEG_E001) {
		REG_E001 = rEG_E001;
	}

	public String getIND_MOV_E001() {
		return IND_MOV_E001;
	}

	public void setIND_MOV_E001(String iND_MOV_E001) {
		IND_MOV_E001 = iND_MOV_E001;
	}

	public E001() {
	}

	public E001(ArrayList<String> strs1) {
		this.setREG_E001(strs1.get(0));
		this.setIND_MOV_E001(strs1.get(1));
	}

}
