package arquivoTexto.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ContaLinhasArquivoTexto {
	
	public int contaLinhasArquivoTexto(String fullPath) {
		File arquivoLeitura = new File(fullPath);
		LineNumberReader linhaLeitura = null;
		try {
			linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			linhaLeitura.skip(arquivoLeitura.length());
			int qtdLinha = linhaLeitura.getLineNumber();
			
			return qtdLinha;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(linhaLeitura != null) {
				try {
					linhaLeitura.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return -1;
				
	}	

}
