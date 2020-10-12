package modelBlocoC;

import java.util.ArrayList;
import java.util.List;

import modelBlocoE.E100;

public class BlocoC {

	// Classe interna
	public class BlocoCListasSize {
		public int listaC100Size;

		public int listaC300Size;
		public int listaC350Size;

		public BlocoCListasSize() {
			this.listaC100Size = -1;

			this.listaC300Size = -1;

			this.listaC350Size = -1;
		}

	}

	BlocoCListasSize blocoCListasSize;

	List<C100> listC100;

	List<C300> listC300;
	List<C350> listC350;
	List<C400> listC400;
	List<C495> listC495;
	List<C500> listC500;
	List<C600> listC600;
	List<C700> listC700;
	List<C800> listC800;
	List<C860> listC860;

	C001 c001;
	C100 c100;
	C101 c101;
	C105 c105;
	C110 c110;
	C111 c111;
	C112 c112;
	C113 c113;
	C114 c114;
	C115 c115;
	C116 c116;
	C120 c120;
	C130 c130;
	C140 c140;
	C141 c141;
	C160 c160;
	C165 c165;
	C170 c170;
	C171 c171;
	C172 c172;
	C173 c173;
	C174 c174;
	C175 c175;
	C176 c176;
	C177 c177;
	C178 c178;
	C179 c179;
	C190 c190;
	C195 c195;
	C197 c197;

	C300 c300;
	C310 c310;
	C320 c320;
	C321 c321;

	C350 c350;
	C370 c370;
	C390 c390;

	C400 c400;
	C405 c405;
	C410 c410;
	C420 c420;
	C425 c425;
	C460 c460;
	C465 c465;
	C470 c470;
	C490 c490;

	C495 c495;

	C500 c500;
	C510 c510;
	C590 c590;

	C600 c600;
	C601 c601;
	C610 c610;
	C690 c690;

	C700 c700;
	C790 c790;
	C791 c791;

	C800 c800;
	C850 c850;

	C860 c860;
	C890 c890;

	public BlocoC() {
		this.blocoCListasSize = new BlocoCListasSize();
		this.listC100 = new ArrayList<C100>();
		this.listC300 = new ArrayList<C300>();
		this.listC350 = new ArrayList<C350>();
		this.listC400 = new ArrayList<C400>();
		this.listC495 = new ArrayList<C495>();
		this.listC500 = new ArrayList<C500>();
		this.listC600 = new ArrayList<C600>();
		this.listC700 = new ArrayList<C700>();
		this.listC800 = new ArrayList<C800>();
		this.listC860 = new ArrayList<C860>();

	}

	public void carregaListaBlocoCC100(String regActive, List<String> strs1) {

		if (regActive.equals("C100")) {
			c100 = new C100(strs1);
			listC100.add(c100);
			//this.blocoCListasSize.listaC100Size++;

		}
		if (regActive.equals("C101")) {
			c101 = new C101(strs1);
			c101.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).setC101(c101);
			c100.setC101(c101);
		}

		if (regActive.equals("C105")) {
			c105 = new C105(strs1);
			c105.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).setC105(c105);
			c100.setC105(c105);
			
		}

		if (regActive.equals("c110")) {
			c110 = new C110(strs1);
			c110.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC110().add(c110);
			c100.getListC110().add(c110);
		}
		if (regActive.equals("C111")) {
			c111 = new C111(strs1);
			c111.setC110(c110);
			c110.getListC111().add(c111);

		}
		if (regActive.equals("C112")) {
			c112 = new C112(strs1);
			c112.setC110(c110);
			c110.getListC112().add(c112);
		}
		if (regActive.equals("C113")) {
			c113 = new C113(strs1);
			c113.setC110(c110);
			c110.getListC113().add(c113);

		}
		if (regActive.equals("C114")) {
			c114 = new C114(strs1);
			c114.setC110(c110);
			c110.getListC114().add(c114);

		}

		if (regActive.equals("C115")) {
			c115 = new C115(strs1);
			c115.setC110(c110);
			c110.getListC115().add(c115);

		}
		if (regActive.equals("C116")) {
			c116 = new C116(strs1);
			c116.setC110(c110);
			c110.getListC116().add(c116);

		}
		if (regActive.equals("C120")) {
			c120 = new C120(strs1);
			c120.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC120().add(c120);
			c100.getListC120().add(c120);

		}

		if (regActive.equals("C130")) {
			c130 = new C130(strs1);
			c130.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).setC130(c130);
			c100.setC130(c130);

		}

		if (regActive.equals("C140")) {
			c140 = new C140(strs1);
			c140.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).setC140(c140);
			c100.setC140(c140);

		}

		if (regActive.equals("C141")) {
			c141 = new C141(strs1);
			c141.setC140(c140);
			c140.getListC141().add(c141);
		}

		if (regActive.equals("C160")) {
			c160 = new C160(strs1);
			c160.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).setC160(c160);
			c100.setC160(c160);
		}

		if (regActive.equals("C165")) {
			c165 = new C165(strs1);
			c165.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC165().add(c165);
			c100.getListC165().add(c165);
		}

		if (regActive.equals("C170")) {
			c170 = new C170(strs1);
			c170.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC170().add(c170);
			c100.getListC170().add(c170);

		}

		/*
		 * if (regActive.equals("C171")) { c171 = new C171(strs1); c171.setC170(c170);
		 * c170.getListC171().add(c171); }
		 * 
		 * if (regActive.equals("C172")) { c172 = new C172(strs1); c172.setC170(c170);
		 * c170.setC172(c172); }
		 * 
		 * if (regActive.equals("C173")) { c173 = new C173(strs1); c173.setC170(c170);
		 * c170.getListC173().add(c173); } if (regActive.equals("C174")) { c174 = new
		 * C174(strs1); c174.setC170(c170); c170.getListC174().add(c174); }
		 * 
		 * if (regActive.equals("C175")) { c175 = new C175(strs1); c175.setC170(c170);
		 * c170.getListC175().add(c175);
		 * 
		 * }
		 * 
		 * if (regActive.equals("C176")) { c176 = new C176(strs1); c176.setC170(c170);
		 * c170.getListC176().add(c176); }
		 * 
		 * if (regActive.equals("C177")) { c177 = new C177(strs1); c177.setC170(c170);
		 * c170.setC177(c177); }
		 * 
		 * if (regActive.equals("C178")) { c178 = new C178(strs1); c178.setC170(c170);
		 * c170.setC178(c178); }
		 * 
		 * if (regActive.equals("C179")) { c179 = new C179(strs1); c179.setC170(c170);
		 * c170.setC179(c179); }
		 */
		if (regActive.equals("C190")) {
			c190 = new C190(strs1);
			c190.setC100(c100);
			c100.getListC190().add(c190);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC190().add(c190);
			c100.getListC190().add(c190);

		}

		if (regActive.equals("C195")) {
			c195 = new C195(strs1);
			c195.setC100(c100);
			//listC100.get(this.blocoCListasSize.listaC100Size).getListC195().add(c195);
			c100.getListC195().add(c195);
		}

		if (regActive.equals("C197")) {
			c197 = new C197(strs1);
			c197.setC195(c195);
			c195.getListC197().add(c197);
		}

	}

	public void carregaListaBlocoCC300(String regActive, List<String> strs1) {
		if (regActive.equals("C300")) {
			c300 = new C300(strs1);
			listC300.add(c300);
			this.blocoCListasSize.listaC300Size++;

		}

		if (regActive.equals("C310")) {
			c310 = new C310(strs1);
			c310.setC300(c300);
			listC300.get(this.blocoCListasSize.listaC300Size).getListC310().add(c310);
		}
		if (regActive.equals("C320")) {
			c320 = new C320(strs1);
			c320.setC300(c300);
			listC300.get(this.blocoCListasSize.listaC300Size).getListC320().add(c320);

		}
		if (regActive.equals("C321")) {
			c321 = new C321(strs1);
			c321.setC320(c320);
			c320.getListC321().add(c321);

		}

	}

	public void carregaListaBlocoCC350(String regActive, List<String> strs1) {

		if (regActive.equals("C350")) {
			c350 = new C350(strs1);
			listC350.add(c350);
			this.blocoCListasSize.listaC350Size++;
		}

		if (regActive.equals("C370")) {
			c370 = new C370(strs1);
			c370.setC350(c350);
			listC350.get(this.blocoCListasSize.listaC350Size).getListC370().add(c370);

		}

		if (regActive.equals("C390")) {
			c390 = new C390(strs1);
			c390.setC350(c350);
			listC350.get(this.blocoCListasSize.listaC350Size).getListC390().add(c390);
		}

	}
	/*
	 * public void carregaListaBlocoCC400(String regActive, List<String> strs1) {
	 * 
	 * if (regActive.equals("C400")) { c400 = new C400(strs1); listC400.add(c400); }
	 * 
	 * if (regActive.equals("C405")) { c405 = new C405(strs1); c405.setC400(c400);
	 * c400.getListC405().add(c405); }
	 * 
	 * if (regActive.equals("C410")) { c410 = new C410(strs1); c410.setC405(c405);
	 * c405.setC410(c410); } if (regActive.equals("C420")) { c420 = new C420(strs1);
	 * c420.setC405(c405); c405.getListC420().add(c420); }
	 * 
	 * if (regActive.equals("C425")) { c425 = new C425(strs1); c425.setC420(c420);
	 * c420.getListC425().add(c425); }
	 * 
	 * if (regActive.equals("C460")) { c460 = new C460(strs1); c460.setC405(c405);
	 * c405.getListC460().add(c460); }
	 * 
	 * if (regActive.equals("C465")) {
	 * 
	 * c465 = new C465(strs1); c465.setC460(c460); c460.setC465(c465);
	 * 
	 * }
	 * 
	 * if (regActive.equals("C470")) { c470 = new C470(strs1); c470.setC460(c460);
	 * c460.getListC470().add(c470); }
	 * 
	 * if (regActive.equals("C490")) { c490 = new C490(strs1); c490.setC405(c405);
	 * c405.getListC490().add(c490); }
	 * 
	 * } /* if (rC495IsActive) { if (regActive.equals("C495")) { c495 = new
	 * C495(strs1); listC495.add(c495); }
	 * 
	 * }
	 * 
	 * if (rC500IsActive) { if (regActive.equals("C500")) { c500 = new C500(strs1);
	 * listC500.add(c500); } if (regActive.equals("C510")) { c510 = new C510(strs1);
	 * c510.setC500(c500); c500.getListC510().add(c510);
	 * 
	 * }
	 * 
	 * if (regActive.equals("C590")) { c590 = new C590(strs1); c590.setC500(c500);
	 * c500.getListC590().add(c590); }
	 * 
	 * } // end rC500IsActive
	 * 
	 * if (rC600IsActive) { if (regActive.equals("C600")) { c600 = new C600(strs1);
	 * listC600.add(c600); } if (regActive.equals("C601")) { c601 = new C601(strs1);
	 * c601.setC600(c600); c600.getListC601().add(c601); }
	 * 
	 * if (regActive.equals("C610")) { c610 = new C610(strs1); c610.setC600(c600);
	 * c600.getListC610().add(c610); }
	 * 
	 * if (regActive.equals("C690")) { c690 = new C690(strs1); c690.setC600(c600);
	 * c600.getListC690().add(c690); }
	 * 
	 * } // end rC600IsActive
	 * 
	 * if (rC700IsActive) { if (regActive.equals("C700")) { c700 = new C700(strs1);
	 * listC700.add(c700); } if (regActive.equals("C790")) { c790 = new C790(strs1);
	 * c790.setC700(c700); c700.getListC790().add(c790); }
	 * 
	 * if (regActive.equals("C791")) { c791 = new C791(strs1); c791.setC790(c790);
	 * c790.getListC791().add(c791); }
	 * 
	 * } // end rc700IsActive
	 * 
	 * if (rC800IsActive) { if (regActive.equals("C800")) { c800 = new C800(strs1);
	 * listC800.add(c800); } if (regActive.equals("C850")) { c850 = new C850(strs1);
	 * c850.setC800(c800); c800.getListC850().add(c850); }
	 * 
	 * } // end rC800IsActive
	 * 
	 * if (rC860IsActive) { if (regActive.equals("C860")) { c860 = new C860(strs1);
	 * listC860.add(c860); }
	 * 
	 * if (regActive.equals("C890")) { c890 = new C890(strs1); c890.setC860(c860);
	 * c860.getListC890().add(c890); }
	 * 
	 * } // end rC860IsActive
	 * 
	 */

	public List<C100> getListC100() {
		return listC100;
	}

	public void setListC100(List<C100> listC100) {
		this.listC100 = listC100;
	}

	public void imprimeListC100() {
		// this.listC100.forEach(System.out::println);
		for (C100 c100 : listC100) {
			System.out.println(c100.toString());
			List<C170> listC170 = c100.getListC170();
			for (C170 c170 : listC170) {
				System.out.println(c170.toString());
			}
		}
	}

	public void imprimeListC300() {
		this.listC300.forEach(System.out::println);

	}

}
