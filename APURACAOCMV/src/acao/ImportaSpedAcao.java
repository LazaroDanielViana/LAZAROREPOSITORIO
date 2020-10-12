package acao;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;

import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ImportaSped;

public class ImportaSpedAcao extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {

		List<String> pastaMensal = ArquivoDiretorioUtil.listaArquivos();
		for (String pathOfFile : pastaMensal) {
			ImportaSped.parseArquivo2(pathOfFile);
		}
	}

	public ImportaSpedAcao() {
		super("Importar");
	}

}
