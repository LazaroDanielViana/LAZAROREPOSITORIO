package modelBlocoC;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import efdUtil.RegexL;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.LinkedList;

@Entity
public class C100 implements CXXX, Serializable {
	private static final long serialVersionUID = 1L;
	Long idC100;

	String REGC100;

	String IND_OPERC100, IND_EMITC100, COD_PARTC100, COD_MODC100;

	String COD_SITC100;

	String SERC100;

	int NUM_DOCC100;

	String CHV_NFEC100;
	
	Calendar DT_DOCC100;
	
	Calendar DT_E_SC100;

	float VL_DOCC100;

	String IND_PGTOC100;

	float VL_DESCC100, VL_ABAT_NT, VL_MERC;

	String IND_FRTC100;

	float VL_FRTC100, VL_SEGC100, VL_OUT_DAC100, VL_BC_ICMSC100, VL_ICMSC100, VL_BC_ICMS_STC100, VL_ICMS_STC100,
			VL_IPIC100, VL_PISC100, VL_COFINSC100, VL_PIS_STC100, VL_COFINS_STC100;
	

	public static String CNPJFILIAL;

	
	public static String razaoSocial;

	//@javax.persistence.Transient
	public static String inscricaoEstadual;
	
	public static String competencia;

	//@Embedded
	//@javax.persistence.Transient
	C101 c101;// = new C101();

	//@Embedded
	//@javax.persistence.Transient
	C105 c105;// = new C105();

	//@OneToMany(mappedBy = "c100")
	//@javax.persistence.Transient
	List<C110> listC110 = new ArrayList<>();

	public void addC110(C110 c110) {
		listC110.add(c110);
		c110.setC100(this);
	}

	public void removeC110(C110 c110) {
		listC110.remove(c110);
		c110.setC100(null);
	}

	//@OneToMany(mappedBy = "c100")
	//@javax.persistence.Transient
	List<C120> listC120 = new ArrayList<>();

	public void addC120(C120 c120) {
		listC120.add(c120);
		c120.setC100(this);
	}

	public void removeC120(C120 c120) {
		listC120.remove(c120);
		c120.setC100(this);
	}

	//@Embedded
	//@javax.persistence.Transient
	C130 c130 = new C130();

	
	
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//@javax.persistence.Transient
	C140 c140 = new C140();

	//@Embedded
	//@javax.persistence.Transient
	C160 c160 = new C160();

	//@OneToMany(mappedBy = "c100")
	//@javax.persistence.Transient
	List<C165> listC165 = new ArrayList<>();

	public void addC165(C165 c165) {
		listC165.add(c165);
		c165.setC100(this);
	}

	public void removeC165(C165 c165) {
		listC165.remove(c165);
		c165.setC100(this);
	}

	//@javax.persistence.Transient
	
	List<C170> listC170 = new LinkedList<C170>();

	/*public void addC170(C170 c170) {
		listC170.add(c170);
		c170.setC100(null);
	}

	public void removeC170(C170 c170) {
		listC170.remove(c170);
		c170.setC100(this);
	}*/

	//@OneToMany(mappedBy = "c100")
	//@javax.persistence.Transient
	List<C190> listC190 = new ArrayList<>();

	public void addC190(C190 c190) {
		listC190.add(c190);
		c190.setC100(this);
	}

	public void removeC190(C190 c190) {
		listC190.remove(c190);
		c190.setC100(this);
	}

	//@OneToMany(mappedBy = "c100")
	//@javax.persistence.Transient
	List<C195> listC195 = new ArrayList<>();

	public void addC195(C195 c195) {
		listC195.add(c195);
		c195.setC100(this);
	}

	public void removeC195(C195 c195) {
		listC195.remove(c195);
		c195.setC100(null);
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public Long getIdC100() {
		return idC100;
	}

	public void setIdC100(Long id) {
		this.idC100 = id;
	}

	public String getREGC100() {
		return REGC100;
	}

	public void setREGC100(String rEG) {
		REGC100 = rEG;
	}

	public String getIND_OPERC100() {
		return IND_OPERC100;
	}

	public void setIND_OPERC100(String iND_OPER) {
		
		if(RegexL.isInteger(iND_OPER)) {
			
			if(Integer.parseInt(iND_OPER) == 0)
				IND_OPERC100 = "Entrada";
			else
				IND_OPERC100 = "Saída";
		}
		
	}

	public String getIND_EMITC100() {
		return IND_EMITC100;
	}

	public void setIND_EMITC100(String iND_EMIT) {
		
		if(RegexL.isInteger(iND_EMIT)) {
			
			if (Integer.parseInt(iND_EMIT) == 0)
				IND_EMITC100 = "Própria";
			else
				IND_EMITC100 = "Terceiros";
		}else {
			
			IND_EMITC100 = "Própria";
		}		
	}

	public String getCOD_PARTC100() {
		return COD_PARTC100;
	}

	public void setCOD_PARTC100(String cOD_PART) {
		/*String temp = RegexL.pegaCNPJCPF(cOD_PART);
		if (temp.length() != 0)
			COD_PARTC100 = temp;
		else*/
			COD_PARTC100 = cOD_PART;
	}

	public String getCOD_MODC100() {
		return COD_MODC100;
	}

	public void setCOD_MODC100(String cOD_MOD) {
		COD_MODC100 = cOD_MOD;
	}

	public String getCOD_SITC100() {
		return COD_SITC100;
	}

	public void setCOD_SITC100(String cOD_SIT) {
		if(RegexL.isInteger(cOD_SIT)) {
		
			if (Integer.parseInt(cOD_SIT) >= 2 && Integer.parseInt(cOD_SIT) <= 5)
				COD_SITC100 = "Sim";
			else
				COD_SITC100 = "Não";
		}else {
			
		COD_SITC100 = "Sim";
		}
	}	

	public String getSERC100() {
		return SERC100;
	}

	public void setSERC100(String sER) {
		SERC100 = sER;
	}

	public int getNUM_DOCC100() {
		return NUM_DOCC100;
	}

	public void setNUM_DOCC100(int nUM_DOC) {
		NUM_DOCC100 = nUM_DOC;
	}

	public String getCHV_NFEC100() {
		return CHV_NFEC100;
	}

	public void setCHV_NFEC100(String cHV_NFE) {
		CHV_NFEC100 = cHV_NFE;
	}
	@Temporal(TemporalType.DATE) 
	public Calendar getDT_DOCC100() {
		return DT_DOCC100;
	}

	public void setDT_DOCC100(Calendar dT_DOC) {
		DT_DOCC100 = dT_DOC;
	}
	@Temporal(TemporalType.DATE)
	public Calendar getDT_E_SC100() {
		return DT_E_SC100;
	}

	public void setDT_E_SC100(Calendar dT_E_S) {
		DT_E_SC100 = dT_E_S;
	}

	public float getVL_DOCC100() {
		return VL_DOCC100;
	}

	public void setVL_DOCC100(float vL_DOC) {
		VL_DOCC100 = vL_DOC;
	}

	public String getIND_PGTOC100() {
		return IND_PGTOC100;
	}

	public void setIND_PGTOC100(String iND_PGTO) {
		IND_PGTOC100 = iND_PGTO;
	}

	public float getVL_DESCC100() {
		return VL_DESCC100;
	}

	public void setVL_DESCC100(float vL_DESC) {
		VL_DESCC100 = vL_DESC;
	}

	public float getVL_ABAT_NT() {
		return VL_ABAT_NT;
	}

	public void setVL_ABAT_NT(float vL_ABAT_NT) {
		VL_ABAT_NT = vL_ABAT_NT;
	}

	public float getVL_MERC() {
		return VL_MERC;
	}

	public void setVL_MERC(float vL_MERC) {
		VL_MERC = vL_MERC;
	}

	public String getIND_FRTC100() {
		return IND_FRTC100;
	}

	public void setIND_FRTC100(String iND_FRT) {
		IND_FRTC100 = iND_FRT;
	}

	public float getVL_FRTC100() {
		return VL_FRTC100;
	}

	public void setVL_FRTC100(float vL_FRT) {
		VL_FRTC100 = vL_FRT;
	}

	public float getVL_SEGC100() {
		return VL_SEGC100;
	}

	public void setVL_SEGC100(float vL_SEG) {
		VL_SEGC100 = vL_SEG;
	}

	public float getVL_OUT_DAC100() {
		return VL_OUT_DAC100;
	}

	public void setVL_OUT_DAC100(float vL_OUT_DA) {
		VL_OUT_DAC100 = vL_OUT_DA;
	}

	public float getVL_BC_ICMSC100() {
		return VL_BC_ICMSC100;
	}

	public void setVL_BC_ICMSC100(float vL_BC_ICMS) {
		VL_BC_ICMSC100 = vL_BC_ICMS;
	}

	public float getVL_ICMSC100() {
		return VL_ICMSC100;
	}

	public void setVL_ICMSC100(float vL_ICMS) {
		VL_ICMSC100 = vL_ICMS;
	}

	public float getVL_BC_ICMS_STC100() {
		return VL_BC_ICMS_STC100;
	}

	public void setVL_BC_ICMS_STC100(float vL_BC_ICMS_ST) {
		VL_BC_ICMS_STC100 = vL_BC_ICMS_ST;
	}

	public float getVL_ICMS_STC100() {
		return VL_ICMS_STC100;
	}

	public void setVL_ICMS_STC100(float vL_ICMS_ST) {
		VL_ICMS_STC100 = vL_ICMS_ST;
	}

	public float getVL_IPIC100() {
		return VL_IPIC100;
	}

	public void setVL_IPIC100(float vL_IPI) {
		VL_IPIC100 = vL_IPI;
	}

	public float getVL_PISC100() {
		return VL_PISC100;
	}

	public void setVL_PISC100(float vL_PIS) {
		VL_PISC100 = vL_PIS;
	}

	public float getVL_COFINSC100() {
		return VL_COFINSC100;
	}

	public void setVL_COFINSC100(float vL_COFINS) {
		VL_COFINSC100 = vL_COFINS;
	}

	public float getVL_PIS_STC100() {
		return VL_PIS_STC100;
	}

	public void setVL_PIS_STC100(float vL_PIS_ST) {
		VL_PIS_STC100 = vL_PIS_ST;
	}

	public float getVL_COFINS_STC100() {
		return VL_COFINS_STC100;
	}

	public void setVL_COFINS_STC100(float vL_COFINS_ST) {
		VL_COFINS_STC100 = vL_COFINS_ST;
	}

	

	public String getCNPJFILIAL() {
		return CNPJFILIAL;
	}

	public void setCNPJFILIAL(String cNPJFILIAL) {
		CNPJFILIAL = cNPJFILIAL;
	}

	
	@Transient		
	public C101 getC101() {
		return c101;
	}

	public void setC101(C101 c101) {
		this.c101 = c101;
	}
	@Transient
	public C105 getC105() {
		return c105;
	}

	public void setC105(C105 c105) {
		this.c105 = c105;
	}
	@Transient
	public C130 getC130() {
		return c130;
	}

	public void setC130(C130 c130) {
		this.c130 = c130;
	}
	@Transient
	public C140 getC140() {
		return c140;
	}

	public void setC140(C140 c140) {
		this.c140 = c140;
	}
	@Transient
	public C160 getC160() {
		return c160;
	}

	public void setC160(C160 c160) {
		this.c160 = c160;
	}
	@Transient
	public List<C110> getListC110() {
		return listC110;
	}

	public void setListC110(List<C110> listC110) {
		this.listC110 = listC110;
	}
	@Transient
	public List<C120> getListC120() {
		return listC120;
	}

	public void setListC120(List<C120> listC120) {
		this.listC120 = listC120;
	}
	@Transient
	public List<C165> getListC165() {
		return listC165;
	}

	public void setListC165(List<C165> listC165) {
		this.listC165 = listC165;
	}
	
	@OneToMany(mappedBy = "c100")
	public List<C170> getListC170() {
		return listC170;
	}

	public void setListC170(List<C170> listC170) {
		this.listC170 = listC170;
	}
    
	@Transient
	public List<C190> getListC190() {
		return listC190;
	}

	public void setListC190(List<C190> listC190) {
		this.listC190 = listC190;
	}
    
	@Transient
	public List<C195> getListC195() {
		return listC195;
	}

	public void setListC195(List<C195> listC195) {
		this.listC195 = listC195;
	}

	public C100(){}
	public C100(List<String> strs1) {
		if (strs1.size() >= 29) {
			int ano, mes, dia;
			this.setREGC100(strs1.get(0));
			this.setIND_OPERC100(strs1.get(1));
			this.setIND_EMITC100(strs1.get(2));
			this.setCOD_PARTC100(strs1.get(3));
			this.setCOD_MODC100(strs1.get(4));
			this.setCOD_SITC100(strs1.get(5));
			this.setSERC100(strs1.get(6));
			if (strs1.get(7).length() >= 1)// && RegexL.isNumber(strs1.get(7))
				this.setNUM_DOCC100(Integer.parseInt(strs1.get(7)));
			this.setCHV_NFEC100(strs1.get(8));
			if (strs1.get(9).length() == 8) {
				ano = Integer.parseInt(strs1.get(9).substring(4, 8));
				mes = Integer.parseInt(strs1.get(9).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(9).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			Calendar calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_DOCC100(calendar);
			if (strs1.get(10).length() == 8) {
				ano = Integer.parseInt(strs1.get(10).substring(4, 8));
				mes = Integer.parseInt(strs1.get(10).substring(2, 4)) - 1;
				dia = Integer.parseInt(strs1.get(10).substring(0, 2));
			} else {
				ano = 0;
				mes = 0;
				dia = 0;
			}
			calendar = new GregorianCalendar(ano, mes, dia);
			this.setDT_E_SC100(calendar);
			if (strs1.get(11).length() >= 1)// && RegexL.isNumber(strs1.get(11))
				this.setVL_DOCC100(Float.parseFloat(strs1.get(11).replace(",", ".")));
			this.setIND_PGTOC100(strs1.get(12));
			if (strs1.get(13).length() >= 1)// && RegexL.isNumber(strs1.get(13))
				this.setVL_DESCC100(Float.parseFloat(strs1.get(13).replace(",", ".")));
			if (strs1.get(14).length() >= 1)// && RegexL.isNumber(strs1.get(14))
				this.setVL_ABAT_NT(Float.parseFloat(strs1.get(14).replace(",", ".")));
			if (strs1.get(15).length() >= 1)// && RegexL.isNumber(strs1.get(15))
				this.setVL_MERC(Float.parseFloat(strs1.get(15).replace(",", ".")));
			this.setIND_FRTC100(strs1.get(16));
			if (strs1.get(17).length() >= 1)// && RegexL.isNumber(strs1.get(17))
				this.setVL_FRTC100(Float.parseFloat(strs1.get(17).replace(",", ".")));
			if (strs1.get(18).length() >= 1)// && RegexL.isNumber(strs1.get(18))
				this.setVL_SEGC100(Float.parseFloat(strs1.get(18).replace(",", ".")));
			if (strs1.get(19).length() >= 1)// && RegexL.isNumber(strs1.get(19))
				this.setVL_OUT_DAC100(Float.parseFloat(strs1.get(19).replace(",", ".")));
			if (strs1.get(20).length() >= 1)// && RegexL.isNumber(strs1.get(20))
				this.setVL_BC_ICMSC100(Float.parseFloat(strs1.get(20).replace(",", ".")));
			if (strs1.get(21).length() >= 1)// && RegexL.isNumber(strs1.get(21))
				this.setVL_ICMSC100(Float.parseFloat(strs1.get(21).replace(",", ".")));
			if (strs1.get(22).length() >= 1)// && RegexL.isNumber(strs1.get(22))
				this.setVL_BC_ICMS_STC100(Float.parseFloat(strs1.get(22).replace(",", ".")));
			if (strs1.get(23).length() >= 1)// && RegexL.isNumber(strs1.get(23))
				this.setVL_ICMS_STC100(Float.parseFloat(strs1.get(23).replace(",", ".")));
			if (strs1.get(24).length() >= 1)// && RegexL.isNumber(strs1.get(24))
				this.setVL_IPIC100(Float.parseFloat(strs1.get(24).replace(",", ".")));
			if (strs1.get(25).length() >= 1)// && RegexL.isNumber(strs1.get(25))
				this.setVL_PISC100(Float.parseFloat(strs1.get(25).replace(",", ".")));
			if (strs1.get(26).length() >= 1)// && RegexL.isNumber(strs1.get(26))
				this.setVL_COFINSC100(Float.parseFloat(strs1.get(26).replace(",", ".")));
			if (strs1.get(27).length() >= 1)// && RegexL.isNumber(strs1.get(27))
				this.setVL_PIS_STC100(Float.parseFloat(strs1.get(27).replace(",", ".")));
			if (strs1.get(28).length() >= 1)// && RegexL.isNumber(strs1.get(28))
				this.setVL_COFINS_STC100(Float.parseFloat(strs1.get(28).replace(",", ".")));
			this.setCNPJFILIAL("");
		}
	}

	@Override
	public String toString() {
		return "C100 [REGC100=" + REGC100 + ", IND_OPERC100=" + IND_OPERC100 + ", IND_EMITC100=" + IND_EMITC100
				+ ", COD_PARTC100=" + COD_PARTC100 + ", COD_MODC100=" + COD_MODC100 + ", COD_SITC100=" + COD_SITC100
				+ ", SERC100=" + SERC100 + ", NUM_DOCC100=" + NUM_DOCC100 + "]";
	}// end C100(List<String> strs1)
	
	

}
