package modelBlocoE;

import java.util.ArrayList;
import java.util.List;

public class BlocoE {

	List<E100> listE100;
	List<E200> listE200;
	List<E300> listE300;
	List<E500> listE500;	
	
	E001 e001;
	E100 e100 ;
	E110 e110 ;
	E111 e111 ;
	E112 e112 ;
	E113 e113 ;
	E115 e115 ;
	E116 e116 ;
	E200 e200 ;
	E210 e210 ;
	E220 e220 ;
	E230 e230 ;
	E240 e240 ;
	E250 e250 ;
	E300 e300 ;
	E310 e310 ;
	E311 e311 ;
	E312 e312 ;
	E313 e313 ;
	E316 e316 ;
	E500 e500 ;
	E510 e510 ;
	E520 e520 ;
	E530 e530 ;
	
	public static int contaE100 = 0;
	
	
	public List<E100> getListE100() {
		return listE100;
	}

	public void setListE100(List<E100> listE100) {
		this.listE100 = listE100;
	}

	public List<E200> getListE200() {
		return listE200;
	}

	public void setListE200(List<E200> listE200) {
		this.listE200 = listE200;
	}

	public List<E300> getListE300() {
		return listE300;
	}

	public void setListE300(List<E300> listE300) {
		this.listE300 = listE300;
	}

	public List<E500> getListE500() {
		return listE500;
	}

	public void setListE500(List<E500> listE500) {
		this.listE500 = listE500;
	}

	public BlocoE() {
		this.listE100 = new ArrayList<E100>();
		this.listE200 = new ArrayList<E200>();
		this.listE300 = new ArrayList<E300>();
		this.listE500 = new ArrayList<E500>();
	}

	public void carregaListasBlocoE(String regActive, List<String> strs1) {

		if (regActive.equals("E100")) {
			this.e100 = new E100(strs1);
			this.listE100.add(e100);
			contaE100++;

		}
		if (regActive.equals("E110")) {
			this.e110 = new E110(strs1);
			//e110.setE100(this.e100);
			//this.e100 = this.listE100.get(contaE100-1);
			
			
			
			
			//this.listE100.get(contaE100-1).setE110(e110);
		}

		if (regActive.equals("E111")) {
				
			e111 = new E111(strs1);
			e111.setE110(e110);
			//e110.getListE111().add(e111);
		}

		if (regActive.equals("E112")) {
			e112 = new E112(strs1);
			e112.setE111(e111);
			e111.getListE112().add(e112);
		}

		if (regActive.equals("E113")) {
			e113 = new E113(strs1);
			e113.setE111(e111);
			e111.getListE113().add(e113);
		}

		if (regActive.equals("E115")) {
			e115 = new E115(strs1);
			e115.setE110(e110);
			e110.getListE115().add(e115);
		}

		if (regActive.equals("E116")) {
			e116 = new E116(strs1);
			e116.setE110(e110);
			e110.getListE116().add(e116);
		}

		if (regActive.equals("E200")) {
			e200 = new E200(strs1);
			listE200.add(e200);
		}
		if (regActive.equals("E210")) {
			e210 = new E210(strs1);
			e210.setE200(e200);
			//e200.setE210(e210);
		}

		if (regActive.equals("E220")) {
			e220 = new E220(strs1);
			e220.setE210(e210);
			e210.getListE220().add(e220);
		}
		if (regActive.equals("E230")) {
			e230 = new E230(strs1);
			e230.setE220(e220);
			e220.getListE230().add(e230);
		}
		if (regActive.equals("E240")) {
			e240 = new E240(strs1);
			e240.setE220(e220);
			e220.getListE240().add(e240);
		}

		if (regActive.equals("E250")) {
			e250 = new E250(strs1);
			e250.setE210(e210);
			e210.getListE250().add(e250);
		}

		if (regActive.equals("E300")) {
			e300 = new E300(strs1);
			listE300.add(e300);
		}
		if (regActive.equals("E310")) {
		/*	if (r0000.getDT_FIN_R0000().YEAR >= 2017)
				e310 = new E310(strs1);
			else
				e310 = new E310AC2017(strs1);
			e310.setE300(e300);
			e300.setE310(e310);*/
		}

		if (regActive.equals("E311")) {
			e311 = new E311(strs1);
			e311.setE310(e310);
			e310.getListE311().add(e311);
		}

		if (regActive.equals("E312")) {
			e312 = new E312(strs1);
			e312.setE311(e311);
			e311.getListE312().add(e312);
		}
		if (regActive.equals("E313")) {
			e313 = new E313(strs1);
			e313.setE311(e311);
			e311.getListE313().add(e313);
		}

		if (regActive.equals("E316")) {
			e316 = new E316(strs1);
			e316.setE310(e310);
			e310.getListE316().add(e316);
		}

		if (regActive.equals("E500")) {
			e500 = new E500(strs1);
			listE500.add(e500);
		}

		if (regActive.equals("E510")) {
			e510 = new E510(strs1);
			e510.setE500(e500);
			e500.getListE510().add(e510);
		}

		if (regActive.equals("E520")) {
			e520 = new E520(strs1);
			e520.setE500(e500);
			e500.setE520(e520);
		}
		if (regActive.equals("E530")) {
			e530 = new E530(strs1);
			e530.setE520(e520);
			e520.getListE530().add(e530);
		}

	}
	
	public void imprimeListE100() {
		for(E100 e100 : this.listE100) {
			System.out.println(e100.toString());
		}
	}
	
	public void imprimeListE200() {
		for(E200 e200 : this.listE200) {
			System.out.println(e200.toString());
		}
	}
	
	public void imprimeListE300() {
		for(E300 e300 : this.listE300) {
			System.out.println(e300.toString());
		}
	}

}
