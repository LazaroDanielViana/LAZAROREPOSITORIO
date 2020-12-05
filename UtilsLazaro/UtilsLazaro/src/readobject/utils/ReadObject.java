package readobject.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadObject {

	public Object readObject(String filename, Object object) {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));			
			
			Object object1 = in.readObject();
			in.close();
			return object1;
		} 
		catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} 
		catch (ClassNotFoundException cnfe) {
			System.out.printf("Erro: %s", cnfe.getMessage());
			cnfe.printStackTrace();
			return null;
		}

	}

}
