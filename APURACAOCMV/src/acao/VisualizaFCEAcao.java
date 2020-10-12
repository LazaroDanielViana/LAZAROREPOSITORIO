package acao;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ImportaSped;
import modelFCE.FCEBasica;
import view.TableView;

public class VisualizaFCEAcao extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		List<String> arquivosFce = ArquivoDiretorioUtil.listaArquivos();
		
		int contadorTabela = 0;
		for(String arqFCE : arquivosFce) {
			FCEBasica fceImportada =  (FCEBasica) FCEBasica.leFCEBasica(arqFCE);
			JTable tab = FCEBasica.preencheTabela(fceImportada);
			TableView.mostraTabela(tab);
			if( contadorTabela > 4) {
				break;
			}
		}
	}

	public VisualizaFCEAcao() {
		super("VisualizaFCE");
	}
}
