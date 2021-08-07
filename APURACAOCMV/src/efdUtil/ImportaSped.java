package efdUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import DAO.MovimentoDao;
import diretorios.util.DiretoriosUtil;
import excelText.ToExcel_InCMV;
import modelBloco0.Bloco0;
import modelBloco0.R0200;
import modelBlocoC.BlocoC;
import modelBlocoC.C100;
import modelBlocoD.BlocoD;
import modelBlocoE.BlocoE;
import modelBlocoG.BlocoG;
import modelFCE.CarregaFCE;
import modelFCE.FCEBasica;
import modelFCE.MovimentoESS;
import view.TableView;

public class ImportaSped {

	public static void parseArquivo2(String pathOfFile) throws SQLException {

		System.out.println("pathOfFile vale: " + pathOfFile);
		List<String> strs1 = new ArrayList<>();
		String regActive;
		String line;
		String cnpjArquivo = "";

		BufferedReader reader = null;
		try {
			Path path = java.nio.file.Paths.get(pathOfFile);
			Charset latin1 = java.nio.charset.StandardCharsets.ISO_8859_1;
			reader = java.nio.file.Files.newBufferedReader(path, latin1);

			Bloco0 bloco0 = new Bloco0();
			BlocoC blocoC = new BlocoC();
			BlocoD blocoD = new BlocoD();
			BlocoE blocoE = new BlocoE();
			BlocoG blocoG = new BlocoG();

			RegistroAtivo registroA = new RegistroAtivo();

			while ((line = reader.readLine()) != null) {

				if (line.length() >= 5) {// line.startsWith("|")
					regActive = line.substring(1, 5);

					strs1 = TextUtil.stringToArray(line, "|");
					registroA.registroAtivo(regActive);

					if (registroA.isrR0000IsActive()) {
						bloco0.carregaListasBloco0(regActive, strs1);

					} // if rR0001IsActive

					else if (registroA.isrC001IsActive()) {

						if (registroA.isrC100IsActive()) {
							blocoC.carregaListaBlocoCC100(regActive, strs1);
						}
						if (registroA.isrC300IsActive()) {
							blocoC.carregaListaBlocoCC300(regActive, strs1);
						}
						if (registroA.isrC350IsActive()) {
							blocoC.carregaListaBlocoCC350(regActive, strs1);
						}
					} // ifrc100IsActive

					else if (registroA.isrD001IsActive()) {
						blocoD.carregaListasBlocoD(regActive, strs1);

					} // rD001IsActive

					else if (registroA.isrE001IsActive()) {

						blocoE.carregaListasBlocoE(regActive, strs1);

					} // rE001IsActive

					else if (registroA.isrG001IsActive()) {
						blocoG.carregaListasBlocoG(regActive, strs1);

					} // if (rG001IsActive)

					else if (registroA.isrH001IsActive()) {

					} // if (rG001IsActive)

				} // ifLineLength

			} // END while

			System.out.println("Visualizando tabela excel de MovimentoESS.veTabelaExcel()");
			MovimentoESS.veTabelaExcel();

			Map<String, FCEBasica> mapFCEBasica = FCEBasica.getMapFCEBasica(blocoC.getListC100(), bloco0);
			MovimentoDao mdao = new MovimentoDao();
			String diretorio = DiretoriosUtil.selecionaPasta("D:\\LAZAROREPOSITORIO\\APURACAOCMV\\SERIAL", "Selecione uma pasta para salvar o(s) arquivo(s) serializados.");
			// String filename
			if (diretorio != null) {
				//deleta-se o arquivo para evitar o erro: java.io.StreamCorruptedException: invalid stream header: 504B0304
				File f = new File(diretorio+"\\"+"CMV.cmv");
				if(f.exists() && !f.isDirectory()) { 
				    f.delete();
				    try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Diretorio vale: " +diretorio);
				List<FCEBasica> listFCET = new ArrayList<FCEBasica>(mapFCEBasica.values());
				FCEBasica.escreveListaFCEBasica(listFCET, diretorio+"\\", "CMV.cmv");				
				JOptionPane.showMessageDialog(null, "Importação concluída com sucesso!");
			} 
			else {
				JOptionPane.showMessageDialog(null, "Favor escolher um diretório");
			}

		} catch (IOException e) {
			System.out.println("Pego pelo catch de parseArquivo2(String pathOfFile)");
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();

			} catch (IOException e) {
				System.out.println("Pego pelo catch/finally de IOException");
				e.printStackTrace();
			}

		} // end finally

	}// end parseArquivo2

	public static void gravaFCE(Bloco0 bloco0, List<C100> listC100) {
		Map<String, R0200> mapR0200 = new HashMap<>();

		for (R0200 r0200 : bloco0.getR0001().getListR0200()) {
			mapR0200.put(r0200.getCOD_ITEM_R0200(), r0200);
		}
		Map<String, FCEBasica> mapFCEBasica = FCEBasica.getMapFCEBasica(listC100, bloco0);

		for (Map.Entry<String, FCEBasica> pairFCE : mapFCEBasica.entrySet()) {
			//FCEBasica.escreveFCEBasica(pairFCE.getValue(), null);

		}
		System.out.println(MovimentoESS.set.toString());

	}

	public static java.awt.Dimension Largura100Altura100() {
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		java.awt.Dimension dimension = toolkit.getScreenSize();
		return new java.awt.Dimension(dimension.width, dimension.height);

	}

	

}
