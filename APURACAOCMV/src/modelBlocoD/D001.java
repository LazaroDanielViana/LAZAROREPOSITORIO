package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

public class D001 {
	String REG_D001, IND_MOV_D001;

	public String getREG_D001() {
		return REG_D001;
	}

	public void setREG_D001(String rEG_D001) {
		REG_D001 = rEG_D001;
	}

	public String getIND_MOV_D001() {
		return IND_MOV_D001;
	}

	public void setIND_MOV_D001(String iND_MOV_D001) {
		IND_MOV_D001 = iND_MOV_D001;
	}
	


	public D001() {
	}

	public D001(List<String> strs1) {
		this.setREG_D001(strs1.get(0));
		this.setIND_MOV_D001(strs1.get(1));
	}
	
	public String toString() {
		return (this.IND_MOV_D001 == "0") ? "Bloco D001 COM movimento" : "Bloco D001 SEM movimento ";
		
	}

}
