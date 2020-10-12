package modelBlocoG;

import java.util.ArrayList;
import java.util.List;

import modelBlocoE.E100;

public class BlocoG {

	List<G110> listG110;

	G001 g001;
	G110 g110;
	G125 g125;
	G126 g126;
	G130 g130;
	G140 g140;
	
	public BlocoG() {
		this.listG110 = new ArrayList<G110>();
	}

	public void carregaListasBlocoG(String regActive, List<String> strs1) {
		
		if (regActive.equals("G110")) {
			g110 = new G110(strs1);
			listG110.add(g110);
			
		}
		if (regActive.equals("G125")) {
			g125 = new G125(strs1);
			g125.setG110(g110);
			listG110.get(listG110.size()-1).getListG125().add(g125);
		}
		//PAREI AQUI 09/11/2019
		if (regActive.equals("G126")) {
			g126 = new G126(strs1);
			g126.setG125(g125);
			g125.getListG126().add(g126);
		}

		if (regActive.equals("G130")) {
			g130 = new G130(strs1);
			g130.setG125(g125);
			g125.getListG130().add(g130);
			
		}
				
		if (regActive.equals("G140")) {
			g140 = new G140(strs1);
			g140.setG130(g130);
			//chegando no G130
			
			g130.getListG140().add(g140);
		}
		/*
		g140 = new G140(strs1);
		g140.setG130(g130);
		g130.getListG140().add(g140);*/
	}
	
	public void imprimeListG110() {
		for(G110 g110 : this.listG110) {
			System.out.println(g110.toString());
		}
	}
	
	
}
