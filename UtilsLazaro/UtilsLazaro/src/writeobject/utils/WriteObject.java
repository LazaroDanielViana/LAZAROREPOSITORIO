package writeobject.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;

import javax.swing.JOptionPane;

public class WriteObject {

	public static void writeObject(String diretorio, String filename, Object obj) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(diretorio +"\\"+ filename));
			out.writeObject(obj); // Write byte stream to file system.
			out.close();
		} 
		catch (IOException ex) {
			System.out.printf("Erro do tipo: %s", ex.getMessage());
			JOptionPane.showMessageDialog(null, "Erro ao serializar arquivo relacionado à: "+obj.getClass());
			ex.printStackTrace();
		}
	}

}
