package acao;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import efdUtil.ArquivoDiretorioUtil;
import modelFCE.FCEBasica;
import view.TableView;

public class VisualizaFCEAleatoriaAcao extends AbstractAction{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String arquivoFce = ArquivoDiretorioUtil.pedeArquivoTexto();		
		if(arquivoFce != null) {
			FCEBasica fceImportada =  (FCEBasica) FCEBasica.leFCEBasica(arquivoFce);
			
			JTable tab = FCEBasica.preencheTabela(fceImportada);
			TableView.mostraTabela(tab);
		}		
		
	}

	public VisualizaFCEAleatoriaAcao() {
		super("VisualizaFCEAleatória");
	}

}
