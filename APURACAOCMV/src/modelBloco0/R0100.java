package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0100 {
	String REG_R0100, NOME_R0100;
	long CPF_R0100;
	String CRC_R0100, CNPJ_R0100, CEP_R0100, END_R0100, NUM_R0100, COMPL_R0100, BAIRRO_R0100, FONE_R0100, FAX_R0100,
			EMAIL_R0100;
	int COD_MUN_R0100;
	
	R0001 r0001;

	public String getREG_R0100() {
		return REG_R0100;
	}

	public void setREG_R0100(String rEG_R0100) {
		REG_R0100 = rEG_R0100;
	}

	public String getNOME_R0100() {
		return NOME_R0100;
	}

	public void setNOME_R0100(String nOME_R0100) {
		NOME_R0100 = nOME_R0100;
	}

	public long getCPF_R0100() {
		return CPF_R0100;
	}

	public void setCPF_R0100(long cPF_R0100) {
		CPF_R0100 = cPF_R0100;
	}

	public String getCRC_R0100() {
		return CRC_R0100;
	}

	public void setCRC_R0100(String cRC_R0100) {
		CRC_R0100 = cRC_R0100;
	}

	public String getCNPJ_R0100() {
		return CNPJ_R0100;
	}

	public void setCNPJ_R0100(String cNPJ_R0100) {
		CNPJ_R0100 = cNPJ_R0100;
	}

	public String getCEP_R0100() {
		return CEP_R0100;
	}

	public void setCEP_R0100(String cEP_R0100) {
		CEP_R0100 = cEP_R0100;
	}

	public String getEND_R0100() {
		return END_R0100;
	}

	public void setEND_R0100(String eND_R0100) {
		END_R0100 = eND_R0100;
	}

	public String getNUM_R0100() {
		return NUM_R0100;
	}

	public void setNUM_R0100(String nUM_R0100) {
		NUM_R0100 = nUM_R0100;
	}

	public String getCOMPL_R0100() {
		return COMPL_R0100;
	}

	public void setCOMPL_R0100(String cOMPL_R0100) {
		COMPL_R0100 = cOMPL_R0100;
	}

	public String getBAIRRO_R0100() {
		return BAIRRO_R0100;
	}

	public void setBAIRRO_R0100(String bAIRRO_R0100) {
		BAIRRO_R0100 = bAIRRO_R0100;
	}

	public String getFONE_R0100() {
		return FONE_R0100;
	}

	public void setFONE_R0100(String fONE_R0100) {
		FONE_R0100 = fONE_R0100;
	}

	public String getFAX_R0100() {
		return FAX_R0100;
	}

	public void setFAX_R0100(String fAX_R0100) {
		FAX_R0100 = fAX_R0100;
	}

	public String getEMAIL_R0100() {
		return EMAIL_R0100;
	}

	public void setEMAIL_R0100(String eMAIL_R0100) {
		EMAIL_R0100 = eMAIL_R0100;
	}

	public int getCOD_MUN_R0100() {
		return COD_MUN_R0100;
	}

	public void setCOD_MUN_R0100(int cOD_MUN_R0100) {
		COD_MUN_R0100 = cOD_MUN_R0100;
	}
	
	

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0100() {
	}

	public R0100(List<String> strs1) {
		this.setREG_R0100(strs1.get(0));
		this.setNOME_R0100(strs1.get(1));
		if (strs1.get(2).length() >= 1 )
			this.setCPF_R0100(Long.parseLong(strs1.get(2)));
		this.setCRC_R0100(strs1.get(3));
		this.setCNPJ_R0100(strs1.get(4));
		this.setCEP_R0100(strs1.get(5));
		this.setEND_R0100(strs1.get(6));
		this.setNUM_R0100(strs1.get(7));
		this.setCOMPL_R0100(strs1.get(8));
		this.setBAIRRO_R0100(strs1.get(9));
		this.setFONE_R0100(strs1.get(10));
		this.setFAX_R0100(strs1.get(11));
		this.setEMAIL_R0100(strs1.get(12));
		if (strs1.get(13).length() >= 1 )
			this.setCOD_MUN_R0100(Integer.parseInt(strs1.get(13)));
	}

}
