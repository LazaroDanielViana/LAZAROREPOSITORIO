package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

/**
 * @author lazaro
 *
 */
public class R0150 {

	String REG_R0150, COD_PART_R0150, NOME_R0150;
	int COD_PAIS_R0150;
	String CNPJ_R0150;
	long CPF_R0150;
	String IE_R0150;
	int COD_MUN_R0150;
	
	String SUFRAMA_R0150, END_R0150, NUM_R0150, COMPL_R0150, BAIRRO_R0150;
	R0001 r0001;

	List<R0175> listR0175 = new ArrayList<>();

	public String getREG_R0150() {
		return REG_R0150;
	}

	public void setREG_R0150(String rEG_R0150) {
		REG_R0150 = rEG_R0150;
	}

	public String getCOD_PART_R0150() {
		return COD_PART_R0150;
	}

	public void setCOD_PART_R0150(String cOD_PART_R0150) {
		COD_PART_R0150 = cOD_PART_R0150;
	}

	public String getNOME_R0150() {
		return NOME_R0150;
	}

	public void setNOME_R0150(String nOME_R0150) {
		NOME_R0150 = nOME_R0150;
	}

	public int getCOD_PAIS_R0150() {
		return COD_PAIS_R0150;
	}

	public void setCOD_PAIS_R0150(int cOD_PAIS_R0150) {
		COD_PAIS_R0150 = cOD_PAIS_R0150;
	}

	public String getCNPJ_R0150() {
		return CNPJ_R0150;
	}

	public void setCNPJ_R0150(String cNPJ_R0150) {
		CNPJ_R0150 = cNPJ_R0150;
	}

	public long getCPF_R0150() {
		return CPF_R0150;
	}

	public void setCPF_R0150(long cPF_R0150) {
		CPF_R0150 = cPF_R0150;
	}

	public String getIE_R0150() {
		return IE_R0150;
	}

	public void setIE_R0150(String iE_R0150) {
		IE_R0150 = iE_R0150;
	}

	public int getCOD_MUN_R0150() {
		return COD_MUN_R0150;
	}

	public void setCOD_MUN_R0150(int cOD_MUN_R0150) {
		COD_MUN_R0150 = cOD_MUN_R0150;
	}

	public String getSUFRAMA_R0150() {
		return SUFRAMA_R0150;
	}

	public void setSUFRAMA_R0150(String sUFRAMA_R0150) {
		SUFRAMA_R0150 = sUFRAMA_R0150;
	}

	public String getEND_R0150() {
		return END_R0150;
	}

	public void setEND_R0150(String eND_R0150) {
		END_R0150 = eND_R0150;
	}

	public String getNUM_R0150() {
		return NUM_R0150;
	}

	public void setNUM_R0150(String nUM_R0150) {
		NUM_R0150 = nUM_R0150;
	}

	public String getCOMPL_R0150() {
		return COMPL_R0150;
	}

	public void setCOMPL_R0150(String cOMPL_R0150) {
		COMPL_R0150 = cOMPL_R0150;
	}

	public String getBAIRRO_R0150() {
		return BAIRRO_R0150;
	}

	public void setBAIRRO_R0150(String bAIRRO_R0150) {
		BAIRRO_R0150 = bAIRRO_R0150;
	}

	public List<R0175> getListR0175() {
		return listR0175;
	}

	public void setListR0175(List<R0175> listR0175) {
		this.listR0175 = listR0175;
	}
	
	

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0150() {
	}

	public R0150(List<String> strs1) {
		this.setREG_R0150(strs1.get(0));
		this.setCOD_PART_R0150(strs1.get(1));
		this.setNOME_R0150(strs1.get(2));
		if (strs1.get(3).length() >= 1 )
			this.setCOD_PAIS_R0150(Integer.parseInt(strs1.get(3)));
		this.setCNPJ_R0150(strs1.get(4));
		if (strs1.get(5).length() >= 1 )
			this.setCPF_R0150(Long.parseLong(strs1.get(5)));
		this.setIE_R0150(strs1.get(6));
		if (strs1.get(7).length() >= 1 )
			this.setCOD_MUN_R0150(Integer.parseInt(strs1.get(7)));
		this.setSUFRAMA_R0150(strs1.get(8));
		this.setEND_R0150(strs1.get(9));
		this.setNUM_R0150(strs1.get(10));
		this.setCOMPL_R0150(strs1.get(11));
		this.setBAIRRO_R0150(strs1.get(12));
	}

}
