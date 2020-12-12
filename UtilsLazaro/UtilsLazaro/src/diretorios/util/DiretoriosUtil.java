package diretorios.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DiretoriosUtil {

	public static String selecionaPasta() {
		String nome = "";
		JFileChooser chooser = new JFileChooser();
		
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setDialogTitle("Selecione uma pasta.");
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Normal text
		// file", "*.txt");
		// chooser.setFileFilter(filter);
		File diretorioPadrao = new File("D:\\LAZAROREPOSITORIO\\APURACAOCMV");
		chooser.setCurrentDirectory(diretorioPadrao);
		int returnVal = chooser.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			nome = chooser.getSelectedFile().getPath();
			JOptionPane.showMessageDialog(null, "O caminho da pasta escolhida é: " + nome,"Caminho escolhido",JOptionPane.INFORMATION_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "Favor selecionar uma pasta ...");
			return null;
		}

		return nome;

	}

	public static List<String> listaArquivos() {
		List<String> nomes = new ArrayList<String>();
		List<String> nomesArquivos = new ArrayList<String>();

		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		File diretorioPadrao = new File("D:\\Dados_Teste");
		chooser.setCurrentDirectory(diretorioPadrao);
		int returnVal = chooser.showOpenDialog(null);
		String nomeDiretorio = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			nomeDiretorio = chooser.getSelectedFile().getPath();

		} else {
			JOptionPane.showMessageDialog(null,
					"Favor selecionar uma pasta contendo os arquivos a serem trabalhados! Finalizando o aplicativo ...");
			return null;
		}

		File diretorio = new File(nomeDiretorio);

		nomes = Arrays.asList(diretorio.list()); // lista os arquivos
		for (int i = 0; i < nomes.size(); i++) {
			String nomeArquivo = nomeDiretorio + "\\" + nomes.get(i);
			File arquivo = new File(nomeArquivo);
			if (arquivo.isFile()) {
				nomesArquivos.add(nomeArquivo);
			}
		}

		return nomesArquivos;
	}

	public static String pedeArquivoTexto() {
		String nome = "";
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Normal text
		// file", "*.txt");
		// chooser.setFileFilter(filter);
		File diretorioPadrao = new File("D:\\JavaCode\\APURACAOCMV\\SERIAL");
		chooser.setCurrentDirectory(diretorioPadrao);
		int returnVal = chooser.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			nome = chooser.getSelectedFile().getAbsolutePath();
			JOptionPane.showMessageDialog(null, "O nome do arquivo é: " + nome);
		} else {
			JOptionPane.showMessageDialog(null, "Favor selecionar um arquivo! Finalizando o aplicativo ...");
			return null;
		}

		return nome;
	}

}
