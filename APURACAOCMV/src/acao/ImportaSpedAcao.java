package acao;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.AbstractAction;

import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ImportaSped;

public class ImportaSpedAcao extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {

		List<String> pastaMensal = ArquivoDiretorioUtil.listaArquivos();
		for (String pathOfFile : pastaMensal) {
			try {
				ImportaSped.parseArquivo2(pathOfFile);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public ImportaSpedAcao() {
		super("Importar");
	}

}
