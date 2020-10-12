package modelBloco0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import modelBlocoD.D100;

public class Bloco0 {

	List<R0005> listR0005;
	List<R0015> listR0015;
	
	Map<String, String> hashClienteFornecedor;
	Map<String, String> hashCodItem_CodNcm;


	R0000 r0000;
	R0001 r0001;
	R0005 r0005;
	R0015 r0015;
	R0100 r0100;
	R0150 r0150;
	R0175 r0175;
	R0190 r0190;
	R0200 r0200;
	R0205 r0205;

	R0206 r0206;
	R0210 r0210;
	R0220 r0220;
	R0300 r0300;
	R0305 r0305;
	R0400 r0400;
	R0450 r0450;
	R0460 r0460;
	R0500 r0500;
	R0600 r0600;
	
	
	
	
	public List<R0005> getListR0005() {
		return listR0005;
	}

	public void setListR0005(List<R0005> listR0005) {
		this.listR0005 = listR0005;
	}

	public List<R0015> getListR0015() {
		return listR0015;
	}

	public void setListR0015(List<R0015> listR0015) {
		this.listR0015 = listR0015;
	}

	public Map<String, String> getHashClienteFornecedor() {
		return hashClienteFornecedor;
	}

	public void setHashClienteFornecedor(Map<String, String> hashClienteFornecedor) {
		this.hashClienteFornecedor = hashClienteFornecedor;
	}

	public Map<String, String> getHashCodItem_CodNcm() {
		return hashCodItem_CodNcm;
	}

	public void setHashCodItem_CodNcm(Map<String, String> hashCodItem_CodNcm) {
		this.hashCodItem_CodNcm = hashCodItem_CodNcm;
	}

	public R0000 getR0000() {
		return r0000;
	}

	public void setR0000(R0000 r0000) {
		this.r0000 = r0000;
	}

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}

	public R0005 getR0005() {
		return r0005;
	}

	public void setR0005(R0005 r0005) {
		this.r0005 = r0005;
	}

	public R0015 getR0015() {
		return r0015;
	}

	public void setR0015(R0015 r0015) {
		this.r0015 = r0015;
	}

	public R0100 getR0100() {
		return r0100;
	}

	public void setR0100(R0100 r0100) {
		this.r0100 = r0100;
	}

	public R0150 getR0150() {
		return r0150;
	}

	public void setR0150(R0150 r0150) {
		this.r0150 = r0150;
	}

	public R0175 getR0175() {
		return r0175;
	}

	public void setR0175(R0175 r0175) {
		this.r0175 = r0175;
	}

	public R0190 getR0190() {
		return r0190;
	}

	public void setR0190(R0190 r0190) {
		this.r0190 = r0190;
	}

	public R0200 getR0200() {
		return r0200;
	}

	public void setR0200(R0200 r0200) {
		this.r0200 = r0200;
	}

	public R0205 getR0205() {
		return r0205;
	}

	public void setR0205(R0205 r0205) {
		this.r0205 = r0205;
	}

	public R0206 getR0206() {
		return r0206;
	}

	public void setR0206(R0206 r0206) {
		this.r0206 = r0206;
	}

	public R0210 getR0210() {
		return r0210;
	}

	public void setR0210(R0210 r0210) {
		this.r0210 = r0210;
	}

	public R0220 getR0220() {
		return r0220;
	}

	public void setR0220(R0220 r0220) {
		this.r0220 = r0220;
	}

	public R0300 getR0300() {
		return r0300;
	}

	public void setR0300(R0300 r0300) {
		this.r0300 = r0300;
	}

	public R0305 getR0305() {
		return r0305;
	}

	public void setR0305(R0305 r0305) {
		this.r0305 = r0305;
	}

	public R0400 getR0400() {
		return r0400;
	}

	public void setR0400(R0400 r0400) {
		this.r0400 = r0400;
	}

	public R0450 getR0450() {
		return r0450;
	}

	public void setR0450(R0450 r0450) {
		this.r0450 = r0450;
	}

	public R0460 getR0460() {
		return r0460;
	}

	public void setR0460(R0460 r0460) {
		this.r0460 = r0460;
	}

	public R0500 getR0500() {
		return r0500;
	}

	public void setR0500(R0500 r0500) {
		this.r0500 = r0500;
	}

	public R0600 getR0600() {
		return r0600;
	}

	public void setR0600(R0600 r0600) {
		this.r0600 = r0600;
	}

	public Bloco0() {
		this.listR0005 = new ArrayList<R0005>();
		this.listR0015 = new ArrayList<R0015>();
		this.hashClienteFornecedor = new Hashtable<String, String>();
		this.hashCodItem_CodNcm = new Hashtable<String, String>();
	}

	public void carregaListasBloco0(String regActive, List<String> strs1) {

		if (regActive.equals("0000")) {
			r0000 = new R0000(strs1);
		}

		if (regActive.equals("0001")) {
			r0001 = new R0001(strs1);
			// ContaTiposDeRegistroStatic.R0001++;
		}
		if (regActive.equals("0005")) {
			r0005 = new R0005(strs1);
			r0005.setR0001(r0001);
			r0001.setR0005(r0005);
			listR0005.add(r0005);
		}

		if (regActive.equals("0015")) {
			r0015 = new R0015(strs1);
			r0015.setR0001(r0001);
			r0001.getListR0015().add(r0015);
		}

		if (regActive.equals("0100")) {
			r0100 = new R0100(strs1);
			r0100.setR0001(r0001);
			r0001.setR0100(r0100);

		}
		if (regActive.equals("0150")) {
			r0150 = new R0150(strs1);
			r0150.setR0001(r0001);
			this.hashClienteFornecedor.put(r0150.getCOD_PART_R0150(), r0150.getNOME_R0150());
			r0001.getListR0150().add(r0150);

		}
		if (regActive.equals("0175")) {
			r0175 = new R0175(strs1);
			r0175.setR0150(r0150);
			r0150.getListR0175().add(r0175);

		}
		if (regActive.equals("0190")) {
			r0190 = new R0190(strs1);
			r0190.setR0001(r0001);
			r0001.getListR0190().add(r0190);

		}
		if (regActive.equals("0200")) {
			r0200 = new R0200(strs1, r0000);
			r0200.setR0001(r0001);
			hashCodItem_CodNcm.put(r0200.getCOD_ITEM_R0200(), r0200.getCOD_NCM_R0200());
			r0001.getListR0200().add(r0200);
		}

		if (regActive.equals("0205")) {
			r0205 = new R0205(strs1);
			r0205.setR0200(r0200);
			r0200.getListR0205().add(r0205);

		}
		if (regActive.equals("0206")) {
			r0206 = new R0206(strs1);
			r0206.setR0200(r0200);
			r0200.setR0206(r0206);

		}
		if (regActive.equals("0210")) {
			r0210 = new R0210(strs1);
			r0210.setR0200(r0200);
			r0200.getListR0210().add(r0210);

		}

		if (regActive.equals("0220")) {
			r0220 = new R0220(strs1);
			r0220.setR0200(r0200);
			r0200.getListR0220().add(r0220);
		}

		if (regActive.equals("0300")) {
			r0300 = new R0300(strs1);
			r0001.getListR0300().add(r0300);

		}

		if (regActive.equals("0305")) {
			r0305 = new R0305(strs1);
			r0305.setR0300(r0300);
			r0300.setR0305(r0305);
		}

		if (regActive.equals("0400")) {
			r0400 = new R0400(strs1);
			r0001.getListR0400().add(r0400);
		}

		if (regActive.equals("0450")) {
			r0450 = new R0450(strs1);
			r0001.getListR0450().add(r0450);
		}

		if (regActive.equals("0460")) {
			r0460 = new R0460(strs1);
			r0001.getListR0460().add(r0460);
		}

		if (regActive.equals("0500")) {
			r0500 = new R0500(strs1);
			r0001.getListR0500().add(r0500);
		}

		if (regActive.equals("0600")) {
			r0600 = new R0600(strs1);
			r0001.getListR0600().add(r0600);
		}

	}
	
	public void imprimeListR0005() {
		for(R0005 r0005 : this.listR0005) {
			System.out.println(r0005.toString());
		}
	}
	
	public static Map<String, R0200> getMapR0200(Bloco0 bloco0){
		
		Map<String, R0200> mapR0200 = new HashMap<>();	
		for (R0200 r0200 : bloco0.getR0001().getListR0200()) {
			mapR0200.put(r0200.getCOD_ITEM_R0200(), r0200);
		}
		return mapR0200;

	}
}
