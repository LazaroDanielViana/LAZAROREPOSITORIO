package acao;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ImportaSped;
import modelFCE.FCEBasica;
import view.TableView;

public class VisualizaFCEAcao extends AbstractAction implements Serializable {
	/*
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * List<String> arquivosFce = ArquivoDiretorioUtil.listaArquivos();
	 * 
	 * int contadorTabela = 0; for(String arqFCE : arquivosFce) { FCEBasica
	 * fceImportada = (FCEBasica) FCEBasica.leFCEBasica(arqFCE); JTable tab =
	 * FCEBasica.preencheTabela(fceImportada); TableView.mostraTabela(tab);
	 * if(contadorTabela > 4) { break; } } }
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {

		List<String> arquivosFce = ArquivoDiretorioUtil.listaArquivos("D:\\LAZAROREPOSITORIO\\APURACAOCMV\\SERIAL",
				"Selecione o arquivo a ser desserializado!");

		int contadorTabela = 0;
		if (arquivosFce != null) {

			for (String arqFCE : arquivosFce) {

				if (arqFCE.endsWith("cmv")) {
					@SuppressWarnings("unchecked")
					List<FCEBasica> fceImportada = null;

					fceImportada = (List<FCEBasica>) FCEBasica.leFCEBasica(arqFCE, null);

					if (fceImportada != null) {
						JTable tab = TableView.preencheTabela(fceImportada);
						TableView.mostraTabela(tab);
					} else {
						System.out.println("Problemas na leitura do arquivo em VisualizaFCEAcao");
					}
					if (contadorTabela > 4) {
						break;
					}
				}
			} // end for
		} else {
			JOptionPane.showMessageDialog(null, "É necessário escolher os arquivos para poder visualizá-los!");
		}
	}

	public VisualizaFCEAcao() {
		super("VisualizaFCE");
	}
}
