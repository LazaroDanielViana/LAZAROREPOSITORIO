package modelBloco0;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lazaro
 *
 */
public class R0400 {
	String REG_R0400,
	COD_NAT_R0400,
	DESCR_NAT_R0400;

	
	public String getREG_R0400() {
		return REG_R0400;
	}

	
	public void setREG_R0400(String rEG_R0400) {
		REG_R0400 = rEG_R0400;
	}

	
	public String getCOD_NAT_R0400() {
		return COD_NAT_R0400;
	}

	
	public void setCOD_NAT_R0400(String cOD_NAT_R0400) {
		COD_NAT_R0400 = cOD_NAT_R0400;
	}

	
	public String getDESCR_NAT_R0400() {
		return DESCR_NAT_R0400;
	}

	
	public void setDESCR_NAT_R0400(String dESCR_NAT_R0400) {
		DESCR_NAT_R0400 = dESCR_NAT_R0400;
	}
	
	public R0400() {
	}

	public R0400(List<String> strs1) {
		this.setREG_R0400(strs1.get(0));
		this.setCOD_NAT_R0400(strs1.get(1));
		this.setDESCR_NAT_R0400(strs1.get(2));
	}

	
	
	
	

}
