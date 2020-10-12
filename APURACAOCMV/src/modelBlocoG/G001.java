package modelBlocoG;

import java.util.ArrayList;
import java.util.List;

public class G001 {
	String REG_G001, IND_MOV_G001;
	
	G110 g110 = new G110();

	public String getREG_G001() {
		return REG_G001;
	}

	public void setREG_G001(String rEG_G001) {
		REG_G001 = rEG_G001;
	}

	public String getIND_MOV_G001() {
		return IND_MOV_G001;
	}

	public void setIND_MOV_G001(String iND_MOV_G001) {
		IND_MOV_G001 = iND_MOV_G001;
	}

	
	public G110 getG110() {
		return g110;
	}

	public void setG110(G110 g110) {
		this.g110 = g110;
	}

	public G001() {
	}

	public G001(List<String> strs1) {
		this.setREG_G001(strs1.get(0));
		this.setIND_MOV_G001(strs1.get(1));
	}

}
