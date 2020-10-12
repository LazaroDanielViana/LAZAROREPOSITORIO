package efdUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscreveEmArquivo {
	
	FileWriter arquivo;		
	BufferedWriter  gravaArq;
	static int numeroArquivo;
	
	
	public EscreveEmArquivo() {
		
		//numeroArquivo = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do arquivo"));		
		
		try {			
			arquivo = new FileWriter(new File("D:\\JavaCode\\"+"Debug" + numeroArquivo++ +".txt"));			
			gravaArq = new BufferedWriter(arquivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void escreveNoArquivo(String texto) {
		try {
			this.gravaArq.write(texto + "\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
