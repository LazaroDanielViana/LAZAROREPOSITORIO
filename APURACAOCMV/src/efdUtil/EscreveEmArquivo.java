package efdUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscreveEmArquivo {

	FileWriter arquivo;
	BufferedWriter gravaArq;
	static int numeroArquivo;

	public EscreveEmArquivo() {		
		try{
			arquivo = new FileWriter(new File("D:\\JavaCode\\" + "Debug" + numeroArquivo++ + ".txt"));
			gravaArq = new BufferedWriter(arquivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
	}

	public EscreveEmArquivo(String fullPath) {		

		try {
			arquivo = new FileWriter(new File(fullPath));
			gravaArq = new BufferedWriter(arquivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
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
	public void closeArquivo() {
		try {
			if(this.arquivo != null)
				this.arquivo.close();
			if(this.gravaArq != null)
				this.gravaArq.close();
			
		}
		catch (IOException e) {
			if(this.arquivo != null)
				try {
					this.arquivo.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(this.gravaArq != null)
				try {
					this.gravaArq.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
		finally {
			if(this.arquivo != null)
				try {
					this.arquivo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(this.gravaArq != null)
				try {
					this.gravaArq.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
