package writeobject.utils;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;

import javax.swing.JOptionPane;

public class WriteObject {

	public static void writeObject(String fullName, Object obj) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream(fullName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream out = new ObjectOutputStream(bos)) {
			out.writeObject(obj);
		}
	}

	public static void writeObject(String diretorio, String filename, Object obj) {
		//FileOutputStream fos = null;
		//ObjectOutputStream out = null;
		try {
			//fos = new FileOutputStream(diretorio + "\\" + filename);
			//out = new ObjectOutputStream(fos);
			//out.writeObject(obj);
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(diretorio+filename));
			out.writeObject(obj); //Write byte stream to file system.
			out.close();
		} 
		catch (FileNotFoundException e) {			
			/*
			 * if (fos != null) try { fos.close(); } catch (IOException e1) { // TODO
			 * Auto-generated catch block e1.printStackTrace(); } if (out != null) try {
			 * out.close(); } catch (IOException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); }
			 */
			System.out.println("writeObject "+"catch (FileNotFoundException e)");
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			/*
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if (out != null)
				try {
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				*/
			System.out.println("writeObject "+"catch (IOException e)");
			e.printStackTrace();
		} 
		/*finally {
			if (out != null) {
				try {
					out.close();
					System.out.println("Finally de ou != null try em writeObject(String diretorio, String filename, Object obj)");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("Finally de out != null catch writeObject(String diretorio, String filename, Object obj)");
				}
			}
			if (fos != null) {
				try {
					fos.close();
					System.out.println("Finally de fos != null try em writeObject(String diretorio, String filename, Object obj)");
				} 
				catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Finally de fos != null catch writeObject(String diretorio, String filename, Object obj)");
					e1.printStackTrace();
				}
			}

		}//END finally*/

	}

}
