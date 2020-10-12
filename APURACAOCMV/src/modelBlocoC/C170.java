package modelBlocoC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Query;
import javax.persistence.Transient;

import DAO.EntityManagerSingleton;
import efdUtil.RegexL;

@Entity
public class C170 implements CXXX, Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idC170;

	String REGC170;

	int NUM_ITEMC170;

	String COD_ITEMC170, DESCR_COMPLC170;

	float QTDC170;

	String UNIDC170;

	float VL_ITEMC170, VL_DESCC170;

	String IND_MOVC170;

	int CST_ICMSC170; 
	
	String CFOPC170;

	String COD_NATC170;

	float VL_BC_ICMSC170, ALIQ_ICMSC170, VL_ICMSC170, VL_BC_ICMS_STC170, ALIQ_STC170, VL_ICMS_STC170;

	String IND_APURC170, CST_IPIC170, COD_ENQC170;

	float VL_BC_IPIC170, ALIQ_IPIC170, VL_IPIC170;

	int CST_PISC170;

	float VL_BC_PISC170, ALIQ_PISC170, QUANT_BC_PISC170, ALIQ_PISVC170, VL_PISC170;

	int CST_COFINSC170;

	float VL_BC_COFINSC170, ALIQ_COFINSC170, QUANT_BC_COFINSC170, ALIQ_COFINSVC170, VL_COFINSC170;

	String COD_CTAC170;

	String NF;
	
	public static String CNPJFILIAL;

	
	public static String razaoSocial;

	//@javax.persistence.Transient
	public static String inscricaoEstadual;
	
	public static String competencia;

	
	 //fetch = FetchType.LAZY
	//@JoinColumn(name = "c100_id")	
	
	
	C100 c100;

	@ManyToOne(targetEntity=C100.class)
	public C100 getC100() {
		return c100;
	}

	public void setC100(C100 c100) {
		this.c100 = c100;
	}

	//@Override
	/*public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof C170))
			return false;
		return idC170 != null && idC170.equals(((C170) o).idC170);

	}

	@Override
	public int hashCode() {
		return 31;
	}*/

	//@OneToMany(mappedBy = "c170")
	
	List<C171> listC171 = new ArrayList<C171>();

	public void addC171(C171 c171) {
		listC171.add(c171);
		c171.setC170(this);
	}

	public void removeC171(C171 c171) {
		listC171.remove(c171);
		c171.setC170(null);
	}

	//@Embedded
	C172 c172 = new C172();

	//@OneToMany(mappedBy = "c170")
	//@javax.persistence.Transient
	List<C173> listC173 = new ArrayList<C173>();

	public void addC173(C173 c173) {
		listC173.add(c173);
		c173.setC170(this);
	}

	public void removeC173(C173 c173) {
		listC173.remove(c173);
		c173.setC170(null);
	}

	//@OneToMany(mappedBy = "c170")
	//@javax.persistence.Transient
	List<C174> listC174 = new ArrayList<C174>();

	public void addC174(C174 c174) {
		listC174.add(c174);
		c174.setC170(this);
	}

	public void removeC174(C174 c174) {
		listC174.remove(c174);
		c174.setC170(null);
	}

	//@OneToMany(mappedBy = "c170")
	//@javax.persistence.Transient
	List<C175> listC175 = new ArrayList<C175>();

	public void addC175(C175 c175) {
		listC175.add(c175);
		c175.setC170(this);
	}

	public void removeC175(C175 c175) {
		listC175.remove(c175);
		c175.setC170(null);
	}

	//@OneToMany(mappedBy = "c170")
	//@javax.persistence.Transient
	List<C176> listC176 = new ArrayList<C176>();

	public void addC176(C176 c176) {
		listC176.add(c176);
		c176.setC170(this);
	}

	public void removeC176(C176 c176) {
		listC176.remove(c176);
		c176.setC170(null);
	}

	//@Embedded
	C177 c177 = new C177();
	//@Embedded
	C178 c178 = new C178();
	//@Embedded
	C179 c179 = new C179();

	@Id
	@GeneratedValue
	public Long getIdC170() {
		return idC170;
	}

	public void setIdC170(Long id) {
		this.idC170 = id;
	}

	public String getREGC170() {
		return REGC170;
	}

	public void setREGC170(String rEG) {
		REGC170 = rEG;
	}

	public int getNUM_ITEMC170() {
		return NUM_ITEMC170;
	}

	public void setNUM_ITEMC170(int nUM_ITEM) {
		NUM_ITEMC170 = nUM_ITEM;
	}

	public String getCOD_ITEMC170() {
		return COD_ITEMC170;
	}

	public void setCOD_ITEMC170(String cOD_ITEM) {
		COD_ITEMC170 = cOD_ITEM;
	}

	public String getDESCR_COMPLC170() {
		return DESCR_COMPLC170;
	}

	public void setDESCR_COMPLC170(String dESCR_COMPL) {
		DESCR_COMPLC170 = dESCR_COMPL;
	}

	public float getQTDC170() {
		return QTDC170;
	}

	public void setQTDC170(float qTD) {
		QTDC170 = qTD;
	}

	public String getUNIDC170() {
		return UNIDC170;
	}

	public void setUNIDC170(String uNID) {
		UNIDC170 = uNID;
	}

	public float getVL_ITEMC170() {
		return VL_ITEMC170;
	}

	public void setVL_ITEMC170(float vL_ITEM) {
		VL_ITEMC170 = vL_ITEM;
	}

	public float getVL_DESCC170() {
		return VL_DESCC170;
	}

	public void setVL_DESCC170(float vL_DESC) {
		VL_DESCC170 = vL_DESC;
	}

	public String getIND_MOVC170() {
		return IND_MOVC170;
	}

	public void setIND_MOVC170(String iND_MOV) {
		IND_MOVC170 = iND_MOV;
	}

	public int getCST_ICMSC170() {
		return CST_ICMSC170;
	}

	public void setCST_ICMSC170(int cST_ICMS) {
		CST_ICMSC170 = cST_ICMS;
	}

	public String getCFOPC170() {
		return CFOPC170;
	}

	public void setCFOPC170(String cFOP) {
		CFOPC170 = cFOP;
	}

	public String getCOD_NATC170() {
		return COD_NATC170;
	}

	public void setCOD_NATC170(String cOD_NAT) {
		COD_NATC170 = cOD_NAT;
	}

	public float getVL_BC_ICMSC170() {
		return VL_BC_ICMSC170;
	}

	public void setVL_BC_ICMSC170(float vL_BC_ICMS) {
		VL_BC_ICMSC170 = vL_BC_ICMS;
	}

	public float getALIQ_ICMSC170() {
		return ALIQ_ICMSC170;
	}

	public void setALIQ_ICMSC170(float aLIQ_ICMS) {
		ALIQ_ICMSC170 = aLIQ_ICMS;
	}

	public float getVL_ICMSC170() {
		return VL_ICMSC170;
	}

	public void setVL_ICMSC170(float vL_ICMS) {
		VL_ICMSC170 = vL_ICMS;
	}

	public float getVL_BC_ICMS_STC170() {
		return VL_BC_ICMS_STC170;
	}

	public void setVL_BC_ICMS_STC170(float vL_BC_ICMS_ST) {
		VL_BC_ICMS_STC170 = vL_BC_ICMS_ST;
	}

	public float getALIQ_STC170() {
		return ALIQ_STC170;
	}

	public void setALIQ_STC170(float aLIQ_ST) {
		ALIQ_STC170 = aLIQ_ST;
	}

	public float getVL_ICMS_STC170() {
		return VL_ICMS_STC170;
	}

	public void setVL_ICMS_STC170(float vL_ICMS_ST) {
		VL_ICMS_STC170 = vL_ICMS_ST;
	}

	public String getIND_APURC170() {
		return IND_APURC170;
	}

	public void setIND_APURC170(String iND_APUR) {
		IND_APURC170 = iND_APUR;
	}

	public String getCST_IPIC170() {
		return CST_IPIC170;
	}

	public void setCST_IPIC170(String cST_IPI) {
		CST_IPIC170 = cST_IPI;
	}

	public String getCOD_ENQC170() {
		return COD_ENQC170;
	}

	public void setCOD_ENQC170(String cOD_ENQ) {
		COD_ENQC170 = cOD_ENQ;
	}

	public float getVL_BC_IPIC170() {
		return VL_BC_IPIC170;
	}

	public void setVL_BC_IPIC170(float vL_BC_IPI) {
		VL_BC_IPIC170 = vL_BC_IPI;
	}

	public float getALIQ_IPIC170() {
		return ALIQ_IPIC170;
	}

	public void setALIQ_IPIC170(float aLIQ_IPI) {
		ALIQ_IPIC170 = aLIQ_IPI;
	}

	public float getVL_IPIC170() {
		return VL_IPIC170;
	}

	public void setVL_IPIC170(float vL_IPI) {
		VL_IPIC170 = vL_IPI;
	}

	public int getCST_PISC170() {
		return CST_PISC170;
	}

	public void setCST_PISC170(int cST_PIS) {
		CST_PISC170 = cST_PIS;
	}

	public float getVL_BC_PISC170() {
		return VL_BC_PISC170;
	}

	public void setVL_BC_PISC170(float vL_BC_PIS) {
		VL_BC_PISC170 = vL_BC_PIS;
	}

	public float getALIQ_PISC170() {
		return ALIQ_PISC170;
	}

	public void setALIQ_PISC170(float aLIQ_PIS) {
		ALIQ_PISC170 = aLIQ_PIS;
	}

	public float getQUANT_BC_PISC170() {
		return QUANT_BC_PISC170;
	}

	public void setQUANT_BC_PISC170(float qUANT_BC_PIS) {
		QUANT_BC_PISC170 = qUANT_BC_PIS;
	}

	public float getALIQ_PISVC170() {
		return ALIQ_PISVC170;
	}

	public void setALIQ_PISVC170(float aLIQ_PISV) {
		ALIQ_PISVC170 = aLIQ_PISV;
	}

	public float getVL_PISC170() {
		return VL_PISC170;
	}

	public void setVL_PISC170(float vL_PIS) {
		VL_PISC170 = vL_PIS;
	}

	public int getCST_COFINSC170() {
		return CST_COFINSC170;
	}

	public void setCST_COFINSC170(int cST_COFINS) {
		CST_COFINSC170 = cST_COFINS;
	}

	public float getVL_BC_COFINSC170() {
		return VL_BC_COFINSC170;
	}

	public void setVL_BC_COFINSC170(float vL_BC_COFINS) {
		VL_BC_COFINSC170 = vL_BC_COFINS;
	}

	public float getALIQ_COFINSC170() {
		return ALIQ_COFINSC170;
	}

	public void setALIQ_COFINSC170(float aLIQ_COFINS) {
		ALIQ_COFINSC170 = aLIQ_COFINS;
	}

	public float getQUANT_BC_COFINSC170() {
		return QUANT_BC_COFINSC170;
	}

	public void setQUANT_BC_COFINSC170(float qUANT_BC_COFINS) {
		QUANT_BC_COFINSC170 = qUANT_BC_COFINS;
	}

	public float getALIQ_COFINSVC170() {
		return ALIQ_COFINSVC170;
	}

	public void setALIQ_COFINSVC170(float aLIQ_COFINSV) {
		ALIQ_COFINSVC170 = aLIQ_COFINSV;
	}

	public float getVL_COFINSC170() {
		return VL_COFINSC170;
	}

	public void setVL_COFINSC170(float vL_COFINS) {
		VL_COFINSC170 = vL_COFINS;
	}

	public String getCOD_CTAC170() {
		return COD_CTAC170;
	}

	public void setCOD_CTAC170(String cOD_CTA) {
		COD_CTAC170 = cOD_CTA;
	}
	
	@Transient
	public List<C171> getListC171() {
		return listC171;
	}

	public void setListC171(List<C171> listC171) {
		this.listC171 = listC171;
	}
	@Transient
	public C172 getC172() {
		return c172;
	}

	public void setC172(C172 c172) {
		this.c172 = c172;
	}
	@Transient
	public List<C173> getListC173() {
		return listC173;
	}

	public void setListC173(List<C173> listC173) {
		this.listC173 = listC173;
	}
	@Transient
	public List<C174> getListC174() {
		return listC174;
	}

	public void setListC174(List<C174> listC174) {
		this.listC174 = listC174;
	}
	@Transient
	public List<C175> getListC175() {
		return listC175;
	}

	public void setListC175(List<C175> listC175) {
		this.listC175 = listC175;
	}
	@Transient
	public List<C176> getListC176() {
		return listC176;
	}

	public void setListC176(List<C176> listC176) {
		this.listC176 = listC176;
	}
	@Transient
	public C177 getC177() {
		return c177;
	}

	public void setC177(C177 c177) {
		this.c177 = c177;
	}
	@Transient
	public C178 getC178() {
		return c178;
	}

	public void setC178(C178 c178) {
		this.c178 = c178;
	}
	@Transient
	public C179 getC179() {
		return c179;
	}

	public void setC179(C179 c179) {
		this.c179 = c179;
	}

	public C170() {
	}

	public C170(List<String> strs1) {
		
		//if(strs1.size() >= 37){
			
			this.setREGC170(strs1.get(0));
			if (strs1.get(1).length() >= 1)
				this.setNUM_ITEMC170(Integer.parseInt(strs1.get(1)));
			this.setCOD_ITEMC170(strs1.get(2));
			this.setDESCR_COMPLC170(strs1.get(3));
			if (strs1.get(4).length() >= 1)
				this.setQTDC170(Float.parseFloat(strs1.get(4).replace(",", ".")));
			this.setUNIDC170(strs1.get(5));
			
			
			if (strs1.get(6).length() >= 1)
				this.setVL_ITEMC170(Float.parseFloat(strs1.get(6).replace(",", ".")));
			if (strs1.get(7).length() >= 1)
				this.setVL_DESCC170(Float.parseFloat(strs1.get(7).replace(",", ".")));
			
			this.setIND_MOVC170(strs1.get(8));
			
			if (strs1.get(9).length() >= 1)
				this.setCST_ICMSC170(Integer.parseInt(strs1.get(9)));
			if (strs1.get(10).length() >= 1)
				this.setCFOPC170(strs1.get(10));
			this.setCOD_NATC170(strs1.get(11));
			if (strs1.get(12).length() >= 1)
				this.setVL_BC_ICMSC170(Float.parseFloat(strs1.get(12).replace(",", ".")));
			if (strs1.get(13).length() >= 1)
				this.setALIQ_ICMSC170(Float.parseFloat(strs1.get(13).replace(",", ".")));
			if (strs1.get(14).length() >= 1)
				this.setVL_ICMSC170(Float.parseFloat(strs1.get(14).replace(",", ".")));
			if (strs1.get(15).length() >= 1)
				this.setVL_BC_ICMS_STC170(Float.parseFloat(strs1.get(15).replace(",", ".")));
			if (strs1.get(16).length() >= 1)
				this.setALIQ_STC170(Float.parseFloat(strs1.get(16).replace(",", ".")));
			if (strs1.get(17).length() >= 1)
				this.setVL_ICMS_STC170(Float.parseFloat(strs1.get(17).replace(",", ".")));
			this.setIND_APURC170(strs1.get(18));
			this.setCST_IPIC170(strs1.get(19));
			this.setCOD_ENQC170(strs1.get(20));
			if (strs1.get(21).length() >= 1)
				this.setVL_BC_IPIC170(Float.parseFloat(strs1.get(21).replace(",", ".")));
			if (strs1.get(22).length() >= 1)
				this.setALIQ_IPIC170(Float.parseFloat(strs1.get(22).replace(",", ".")));
			if (strs1.get(23).length() >= 1)
				this.setVL_IPIC170(Float.parseFloat(strs1.get(23).replace(",", ".")));
			if (strs1.get(24).length() >= 1)
				this.setCST_PISC170(Integer.parseInt(strs1.get(24)));
			if (strs1.get(25).length() >= 1)
				this.setVL_BC_PISC170(Float.parseFloat(strs1.get(25).replace(",", ".")));
			if (strs1.get(26).length() >= 1)
				this.setALIQ_PISC170(Float.parseFloat(strs1.get(26).replace(",", ".")));
			if (strs1.get(27).length() >= 1)
				this.setQUANT_BC_PISC170(Float.parseFloat(strs1.get(27).replace(",", ".")));
			if (strs1.get(28).length() >= 1)
				this.setALIQ_PISVC170(Float.parseFloat(strs1.get(28).replace(",", ".")));
			if (strs1.get(29).length() >= 1)
				this.setVL_PISC170(Float.parseFloat(strs1.get(29).replace(",", ".")));
			if (strs1.get(30).length() >= 1)
				this.setCST_COFINSC170(Integer.parseInt(strs1.get(30)));
			if (strs1.get(31).length() >= 1)
				this.setVL_BC_COFINSC170(Float.parseFloat(strs1.get(31).replace(",", ".")));
			if (strs1.get(32).length() >= 1)
				this.setALIQ_COFINSC170(Float.parseFloat(strs1.get(32).replace(",", ".")));
			if (strs1.get(33).length() >= 1)
				this.setQUANT_BC_COFINSC170(Float.parseFloat(strs1.get(33).replace(",", ".")));
			if (strs1.get(34).length() >= 1)
				this.setALIQ_COFINSVC170(Float.parseFloat(strs1.get(34).replace(",", ".")));
			if (strs1.get(35).length() >= 1)
				this.setVL_COFINSC170(Float.parseFloat(strs1.get(35).replace(",", ".")));
			this.setCOD_CTAC170(strs1.get(36));
			
		//}
	}

	@Override
	public String toString() {
		return "C170 [REGC170=" + REGC170 + ", NUM_ITEMC170=" + NUM_ITEMC170 + ", COD_ITEMC170=" + COD_ITEMC170
				+ ", DESCR_COMPLC170=" + DESCR_COMPLC170 + ", QTDC170=" + QTDC170 + ", UNIDC170=" + UNIDC170
				+ ", VL_ITEMC170=" + VL_ITEMC170 + ", VL_DESCC170=" + VL_DESCC170 + ", IND_MOVC170=" + IND_MOVC170
				+ ", CST_ICMSC170=" + CST_ICMSC170 + ", CFOPC170=" + CFOPC170 + "]";
	}
	
	

	// manager.getTransaction().commit();
	// manager.close();
}
