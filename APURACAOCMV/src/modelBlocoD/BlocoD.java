package modelBlocoD;

import java.util.ArrayList;
import java.util.List;

import modelBlocoE.E100;

public class BlocoD {
	
	
	List<D100> listD100;
	
	/*
	List<D300> listD300;
	List<D350> listD350;
	List<D400> listD400;
	List<D500> listD500;
	List<D600> listD600;
	List<D695> listD695;
	*/
	D001 d001;
	D100 d100;	
	D101 d101;
	D110 d110;
	D120 d120;
	D130 d130;
	D140 d140;
	D150 d150;
	
	public BlocoD() {
		this.listD100 = new ArrayList<D100>();
	}
	
	
	public void carregaListasBlocoD(String regActive, List<String> strs1) {	
		
		if (regActive.equals("D001")) {
			d001 = new D001(strs1);
			
		}
		
		if (regActive.equals("D100")) {
			d100 = new D100(strs1);
			listD100.add(d100);
			// ctr.D100++;

		}

		if (regActive.equals("D101")) {
			d101 = new D101(strs1);
			d101.setD100(d100);
			d100.setD101(d101);
		}
		if (regActive.equals("D110")) {
			d110 = new D110(strs1);
			d110.setD100(d100);
			d100.getListD110().add(d110);

		}

		if (regActive.equals("D120")) {
			d120 = new D120(strs1);
			d120.setD110(d110);
			d110.getListD120().add(d120);

		}
		if (regActive.equals("D130")) {
			d130 = new D130(strs1);
			d130.setD100(d100);
			d100.getListD130().add(d130);

		}

		if (regActive.equals("D140")) {
			d140 = new D140(strs1);
			d140.setD100(d100);
			d100.setD140(d140);
		}

		
		if (regActive.equals("D150")) {
			d150 = new D150(strs1);
			d150.setD100(d100);
			d100.setD150(d150);
		}

		/*
		if (regActive.equals("C321")) {
			c321 = new C321(strs1);
			c321.setC320(c320);
			c320.getListC321().add(c321);

		}
		if (regActive.equals("D160")) {
			d160 = new D160(strs1);
			d160.setD100(d100);
			d100.getListD160().add(d160);

		}

		if (regActive.equals("D161")) {
			d161 = new D161(strs1);
			d161.setD160(d160);
			d160.setD161(d161);

		}
		if (regActive.equals("D162")) {
			d162 = new D162(strs1);
			d162.setD160(d160);
			d160.getListD162().add(d162);

		}

		if (regActive.equals("D170")) {
			d170 = new D170(strs1);
			d170.setD100(d100);
			d100.setD170(d170);
		}

		if (regActive.equals("D180")) {
			d180 = new D180(strs1);
			d180.setD100(d100);
			d100.getListD180().add(d180);

		}
		if (regActive.equals("D190")) {
			d190 = new D190(strs1);
			d190.setD100(d100);
			d100.getListD190().add(d190);

		}

		if (regActive.equals("D195")) {
			d195 = new D195(strs1);
			d195.setD100(d100);
			d100.getListD195().add(d195);

		}

		if (regActive.equals("D197")) {
			d197 = new D197(strs1);
			d197.setD195(d195);
			d195.getListD197().add(d197);

		}

		if (regActive.equals("D300")) {
			d300 = new D300(strs1);
			listD300.add(d300);
		}

		if (regActive.equals("D301")) {
			d301 = new D301(strs1);
			d301.setD300(d300);
			d300.getListD301().add(d301);
		}
		if (regActive.equals("D310")) {
			d310 = new D310(strs1);
			d310.setD300(d300);
			d300.getListD310().add(d310);
		}

		if (regActive.equals("D350")) {
			d350 = new D350(strs1);
			listD350.add(d350);
		}
		if (regActive.equals("D355")) {
			d355 = new D355(strs1);
			d355.setD350(d350);
			d350.getListD355().add(d355);

		}

		if (regActive.equals("D360")) {
			d360 = new D360(strs1);
			d360.setD355(d355);
			d355.setD360(d360);

		}

		if (regActive.equals("D365")) {
			d365 = new D365(strs1);
			d365.setD355(d355);
			d355.getListD365().add(d365);

		}

		if (regActive.equals("D370")) {
			d370 = new D370(strs1);
			d370.setD365(d365);
			d365.getListD370().add(d370);

		}

		if (regActive.equals("D390")) {
			d390 = new D390(strs1);
			d390.setD355(d355);
			d355.getListD390().add(d390);

		}

		if (regActive.equals("D400")) {
			d400 = new D400(strs1);
			listD400.add(d400);
		}

		if (regActive.equals("D410")) {
			d410 = new D410(strs1);
			d410.setD400(d400);
			d400.getListD410().add(d410);
		}
		if (regActive.equals("D411")) {
			d411 = new D411(strs1);
			d411.setD410(d410);
			d410.getListD411().add(d411);
		}

		if (regActive.equals("D420")) {
			d420 = new D420(strs1);
			d420.setD400(d400);
			d400.getListD420().add(d420);
		}

		if (regActive.equals("D500")) {
			d500 = new D500(strs1);
			listD500.add(d500);
		}

		if (regActive.equals("D510")) {
			d510 = new D510(strs1);
			d510.setD500(d500);
			d500.getListD510().add(d510);
		}

		if (regActive.equals("D530")) {
			d530 = new D530(strs1);
			d530.setD500(d500);
			d500.getListD530().add(d530);
		}

		if (regActive.equals("D590")) {
			d590 = new D590(strs1);
			d590.setD500(d500);
			d500.getListD590().add(d590);
		}

		if (regActive.equals("D600")) {
			d600 = new D600(strs1);
			listD600.add(d600);
		}

		if (regActive.equals("D610")) {
			d610 = new D610(strs1);
			d610.setD600(d600);
			d600.getListD610().add(d610);
		}

		if (regActive.equals("D690")) {
			d690 = new D690(strs1);
			d690.setD600(d600);
			d600.getListD690().add(d690);
		}

		if (regActive.equals("D695")) {
			d695 = new D695(strs1);
			listD695.add(d695);
		}

		if (regActive.equals("D696")) {
			d696 = new D696(strs1);
			d696.setD695(d695);
			d695.getListD696().add(d696);
		}

		if (regActive.equals("D697")) {
			d697 = new D697(strs1);
			d697.setD696(d696);
			d696.getListD697().add(d697);
		}

		*/
	}
	
	
	public void imprimeListD100() {
		for(D100 d100 : this.listD100) {
			System.out.println(d100.toString());
		}
	}
	
	
	

}

