package modelBloco0;

import java.util.ArrayList;
import java.util.List;

public class R0005 {

	String REG_R0005, FANTASIA_R0005;
	String CEP_R0005, END_R0005, NUM_R0005, COMPL_R0005, BAIRRO_R0005, FONE_R0005, FAX_R0005, EMAIL_R0005;

	R0001 r0001;

	public String getREG_R0005() {
		return REG_R0005;
	}

	public void setREG_R0005(String rEG_R0005) {
		REG_R0005 = rEG_R0005;
	}

	public String getFANTASIA_R0005() {
		return FANTASIA_R0005;
	}

	public void setFANTASIA_R0005(String fANTASIA_R0005) {
		FANTASIA_R0005 = fANTASIA_R0005;
	}

	public String getCEP_R0005() {
		return CEP_R0005;
	}

	public void setCEP_R0005(String cEP_R0005) {
		CEP_R0005 = cEP_R0005;
	}

	public String getEND_R0005() {
		return END_R0005;
	}

	public void setEND_R0005(String eND_R0005) {
		END_R0005 = eND_R0005;
	}

	public String getNUM_R0005() {
		return NUM_R0005;
	}

	public void setNUM_R0005(String nUM_R0005) {
		NUM_R0005 = nUM_R0005;
	}

	public String getCOMPL_R0005() {
		return COMPL_R0005;
	}

	public void setCOMPL_R0005(String cOMPL_R0005) {
		COMPL_R0005 = cOMPL_R0005;
	}

	public String getBAIRRO_R0005() {
		return BAIRRO_R0005;
	}

	public void setBAIRRO_R0005(String bAIRRO_R0005) {
		BAIRRO_R0005 = bAIRRO_R0005;
	}

	public String getFONE_R0005() {
		return FONE_R0005;
	}

	public void setFONE_R0005(String fONE_R0005) {
		FONE_R0005 = fONE_R0005;
	}

	public String getFAX_R0005() {
		return FAX_R0005;
	}

	public void setFAX_R0005(String fAX_R0005) {
		FAX_R0005 = fAX_R0005;
	}

	public String getEMAIL_R0005() {
		return EMAIL_R0005;
	}

	public void setEMAIL_R0005(String eMAIL_R0005) {
		EMAIL_R0005 = eMAIL_R0005;
	}

	

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0005() {
	}

	public R0005(List<String> strs1) {
		this.setREG_R0005(strs1.get(0));
		this.setFANTASIA_R0005(strs1.get(1));
		this.setCEP_R0005(strs1.get(2));
		this.setEND_R0005(strs1.get(3));
		this.setNUM_R0005(strs1.get(4));
		this.setCOMPL_R0005(strs1.get(5));
		this.setBAIRRO_R0005(strs1.get(6));
		this.setFONE_R0005(strs1.get(7));
		this.setFAX_R0005(strs1.get(8));
		this.setEMAIL_R0005(strs1.get(9));
	}

	@Override
	public String toString() {
		return "R0005 [REG_R0005=" + REG_R0005 + ", FANTASIA_R0005=" + FANTASIA_R0005 + ", CEP_R0005=" + CEP_R0005
				+ ", END_R0005=" + END_R0005 + ", NUM_R0005=" + NUM_R0005 + ", COMPL_R0005=" + COMPL_R0005 + "]";
	}
	
	

}
