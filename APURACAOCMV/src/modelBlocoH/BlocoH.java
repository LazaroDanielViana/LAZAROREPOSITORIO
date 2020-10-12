package modelBlocoH;

import java.util.ArrayList;
import java.util.List;

public class BlocoH {
	List<H005> listH005;

	H001 h001 = null;
	H005 h005 = null;
	H010 h010 = null;
	H020 h020 = null;

	public BlocoH() {
		this.listH005 = new ArrayList<H005>();
	}

	public void carregaListasBlocoH(String regActive, List<String> strs1) {
		if (regActive.equals("H005")) {
			h005 = new H005(strs1);
			listH005.add(h005);

		}

		if (regActive.equals("H010")) {
			h010 = new H010(strs1);
			h010.setH005(h005);
			h005.getListH010().add(h010);
		}

		if (regActive.equals("h020")) {
			h020 = new H020(strs1);
			h020.setH010(h010);
			h010.getListH020().add(h020);
		}
	}

}
