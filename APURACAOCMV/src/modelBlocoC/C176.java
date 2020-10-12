package modelBlocoC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import efdUtil.RegexL;

//@Entity
public class C176 {
	@Id
	@GeneratedValue
	private Long id;
	String REGC176, COD_MOD_ULT_E;

	int NUM_DOC_ULT_E;

	String SER_ULT_E;

	Calendar DT_ULT_E = new GregorianCalendar();

	String COD_PART_ULT_E;

	float QUANT_ULT_E, VL_UNIT_ULT_E, VL_UNIT_BC_ST;

	String CHAVE_NFE_ULT_E;

	int NUM_ITEM_ULT_E;

	float VL_UNIT_BC_ICMS_ULT_E, ALIQ_ICMS_ULT_E, VL_UNIT_LIMITE_BC_ICMS_ULT_E, VL_UNIT_ICMS_ULT_E, ALIQ_ST_ULT_E,
			VL_UNIT_RES;

	int COD_RESP_RET, COD_MOT_RES;

	String CHAVE_NFE_RET, COD_PART_NFE_RET, SER_NFE_RET;

	int NUM_NFE_RET, ITEM_NFE_RET;

	String COD_DA, NUM_DA;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c170_id")
	C170 c170;

	public C170 getC170() {
		return c170;
	}

	public void setC170(C170 c170) {
		this.c170 = c170;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C176))
			return false;
		return id != null && id.equals(((C176) o).id);

	}

	@Override
	public int hashCode() {
		return 31;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getREGC176() {
		return REGC176;
	}

	public void setREGC176(String rEG) {
		REGC176 = rEG;
	}

	public String getCOD_MOD_ULT_E() {
		return COD_MOD_ULT_E;
	}

	public void setCOD_MOD_ULT_E(String cOD_MOD_ULT_E) {
		COD_MOD_ULT_E = cOD_MOD_ULT_E;
	}

	public int getNUM_DOC_ULT_E() {
		return NUM_DOC_ULT_E;
	}

	public void setNUM_DOC_ULT_E(int nUM_DOC_ULT_E) {
		NUM_DOC_ULT_E = nUM_DOC_ULT_E;
	}

	public String getSER_ULT_E() {
		return SER_ULT_E;
	}

	public void setSER_ULT_E(String sER_ULT_E) {
		SER_ULT_E = sER_ULT_E;
	}

	public Calendar getDT_ULT_E() {
		return DT_ULT_E;
	}

	public void setDT_ULT_E(Calendar dT_ULT_E) {
		DT_ULT_E = dT_ULT_E;
	}

	public String getCOD_PART_ULT_E() {
		return COD_PART_ULT_E;
	}

	public void setCOD_PART_ULT_E(String cOD_PART_ULT_E) {
		COD_PART_ULT_E = cOD_PART_ULT_E;
	}

	public float getQUANT_ULT_E() {
		return QUANT_ULT_E;
	}

	public void setQUANT_ULT_E(float qUANT_ULT_E) {
		QUANT_ULT_E = qUANT_ULT_E;
	}

	public float getVL_UNIT_ULT_E() {
		return VL_UNIT_ULT_E;
	}

	public void setVL_UNIT_ULT_E(float vL_UNIT_ULT_E) {
		VL_UNIT_ULT_E = vL_UNIT_ULT_E;
	}

	public float getVL_UNIT_BC_ST() {
		return VL_UNIT_BC_ST;
	}

	public void setVL_UNIT_BC_ST(float vL_UNIT_BC_ST) {
		VL_UNIT_BC_ST = vL_UNIT_BC_ST;
	}

	public String getCHAVE_NFE_ULT_E() {
		return CHAVE_NFE_ULT_E;
	}

	public void setCHAVE_NFE_ULT_E(String cHAVE_NFE_ULT_E) {
		CHAVE_NFE_ULT_E = cHAVE_NFE_ULT_E;
	}

	public int getNUM_ITEM_ULT_E() {
		return NUM_ITEM_ULT_E;
	}

	public void setNUM_ITEM_ULT_E(int nUM_ITEM_ULT_E) {
		NUM_ITEM_ULT_E = nUM_ITEM_ULT_E;
	}

	public float getVL_UNIT_BC_ICMS_ULT_E() {
		return VL_UNIT_BC_ICMS_ULT_E;
	}

	public void setVL_UNIT_BC_ICMS_ULT_E(float vL_UNIT_BC_ICMS_ULT_E) {
		VL_UNIT_BC_ICMS_ULT_E = vL_UNIT_BC_ICMS_ULT_E;
	}

	public float getALIQ_ICMS_ULT_E() {
		return ALIQ_ICMS_ULT_E;
	}

	public void setALIQ_ICMS_ULT_E(float aLIQ_ICMS_ULT_E) {
		ALIQ_ICMS_ULT_E = aLIQ_ICMS_ULT_E;
	}

	public float getVL_UNIT_LIMITE_BC_ICMS_ULT_E() {
		return VL_UNIT_LIMITE_BC_ICMS_ULT_E;
	}

	public void setVL_UNIT_LIMITE_BC_ICMS_ULT_E(float vL_UNIT_LIMITE_BC_ICMS_ULT_E) {
		VL_UNIT_LIMITE_BC_ICMS_ULT_E = vL_UNIT_LIMITE_BC_ICMS_ULT_E;
	}

	public float getVL_UNIT_ICMS_ULT_E() {
		return VL_UNIT_ICMS_ULT_E;
	}

	public void setVL_UNIT_ICMS_ULT_E(float vL_UNIT_ICMS_ULT_E) {
		VL_UNIT_ICMS_ULT_E = vL_UNIT_ICMS_ULT_E;
	}

	public float getALIQ_ST_ULT_E() {
		return ALIQ_ST_ULT_E;
	}

	public void setALIQ_ST_ULT_E(float aLIQ_ST_ULT_E) {
		ALIQ_ST_ULT_E = aLIQ_ST_ULT_E;
	}

	public float getVL_UNIT_RES() {
		return VL_UNIT_RES;
	}

	public void setVL_UNIT_RES(float vL_UNIT_RES) {
		VL_UNIT_RES = vL_UNIT_RES;
	}

	public int getCOD_RESP_RET() {
		return COD_RESP_RET;
	}

	public void setCOD_RESP_RET(int cOD_RESP_RET) {
		COD_RESP_RET = cOD_RESP_RET;
	}

	public int getCOD_MOT_RES() {
		return COD_MOT_RES;
	}

	public void setCOD_MOT_RES(int cOD_MOT_RES) {
		COD_MOT_RES = cOD_MOT_RES;
	}

	public String getCHAVE_NFE_RET() {
		return CHAVE_NFE_RET;
	}

	public void setCHAVE_NFE_RET(String cHAVE_NFE_RET) {
		CHAVE_NFE_RET = cHAVE_NFE_RET;
	}

	public String getCOD_PART_NFE_RET() {
		return COD_PART_NFE_RET;
	}

	public void setCOD_PART_NFE_RET(String cOD_PART_NFE_RET) {
		COD_PART_NFE_RET = cOD_PART_NFE_RET;
	}

	public String getSER_NFE_RET() {
		return SER_NFE_RET;
	}

	public void setSER_NFE_RET(String sER_NFE_RET) {
		SER_NFE_RET = sER_NFE_RET;
	}

	public int getNUM_NFE_RET() {
		return NUM_NFE_RET;
	}

	public void setNUM_NFE_RET(int nUM_NFE_RET) {
		NUM_NFE_RET = nUM_NFE_RET;
	}

	public int getITEM_NFE_RET() {
		return ITEM_NFE_RET;
	}

	public void setITEM_NFE_RET(int iTEM_NFE_RET) {
		ITEM_NFE_RET = iTEM_NFE_RET;
	}

	public String getCOD_DA() {
		return COD_DA;
	}

	public void setCOD_DA(String cOD_DA) {
		COD_DA = cOD_DA;
	}

	public String getNUM_DA() {
		return NUM_DA;
	}

	public void setNUM_DA(String nUM_DA) {
		NUM_DA = nUM_DA;
	}

	public C176() {
	}

	public C176(List<String> strs1) {
		if (strs1.size() >= 26) {
			int ano, mes, dia;
			this.setREGC176(strs1.get(0));
			this.setCOD_MOD_ULT_E(strs1.get(1));
			if (strs1.get(2).length() >= 1 )
				this.setNUM_DOC_ULT_E(Integer.parseInt(strs1.get(2)));
			this.setSER_ULT_E(strs1.get(3));
			if (strs1.get(4).length() == 8) {
				ano = Integer.parseInt(strs1.get(4).substring(4, 8));
				mes = Integer.parseInt(strs1.get(4).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(4).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_ULT_E(calendar);
			this.setCOD_PART_ULT_E(strs1.get(5));
			if (strs1.get(6).length() >= 1 )
				this.setQUANT_ULT_E(Float.parseFloat(strs1.get(6).replace(",", ".")));
			if (strs1.get(7).length() >= 1 )
				this.setVL_UNIT_ULT_E(Float.parseFloat(strs1.get(7).replace(",", ".")));
			if (strs1.get(8).length() >= 1 )
				this.setVL_UNIT_BC_ST(Float.parseFloat(strs1.get(8).replace(",", ".")));
			this.setCHAVE_NFE_ULT_E(strs1.get(9));
			if (strs1.get(10).length() >= 1 )
				this.setNUM_ITEM_ULT_E(Integer.parseInt(strs1.get(10)));
			if (strs1.get(11).length() >= 1 )
				this.setVL_UNIT_BC_ICMS_ULT_E(Float.parseFloat(strs1.get(11).replace(",", ".")));
			if (strs1.get(12).length() >= 1 )
				this.setALIQ_ICMS_ULT_E(Float.parseFloat(strs1.get(12).replace(",", ".")));
			if (strs1.get(13).length() >= 1 )
				this.setVL_UNIT_LIMITE_BC_ICMS_ULT_E(Float.parseFloat(strs1.get(13).replace(",", ".")));
			if (strs1.get(14).length() >= 1 )
				this.setVL_UNIT_ICMS_ULT_E(Float.parseFloat(strs1.get(14).replace(",", ".")));
			if (strs1.get(15).length() >= 1 )
				this.setALIQ_ST_ULT_E(Float.parseFloat(strs1.get(15).replace(",", ".")));
			if (strs1.get(16).length() >= 1 )
				this.setVL_UNIT_RES(Float.parseFloat(strs1.get(16).replace(",", ".")));
			if (strs1.get(17).length() >= 1 )
				this.setCOD_RESP_RET(Integer.parseInt(strs1.get(17)));
			if (strs1.get(18).length() >= 1 )
				this.setCOD_MOT_RES(Integer.parseInt(strs1.get(18)));
			this.setCHAVE_NFE_RET(strs1.get(19));
			this.setCOD_PART_NFE_RET(strs1.get(20));
			this.setSER_NFE_RET(strs1.get(21));
			if (strs1.get(22).length() >= 1 )
				this.setNUM_NFE_RET(Integer.parseInt(strs1.get(22)));
			if (strs1.get(23).length() >= 1 )
				this.setITEM_NFE_RET(Integer.parseInt(strs1.get(23)));
			this.setCOD_DA(strs1.get(24));
			this.setNUM_DA(strs1.get(25));
		}
	}

}
