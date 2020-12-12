package readobject.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;




public class ReadObject{
	
	public  class Favorites {
	    private Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

	    public <T> T get(Class<T> clazz) {
	        return clazz.cast(map.get(clazz));
	    }

	    public <T> void put(Class<T> clazz, T favorite) {
	        map.put(clazz, favorite);
	    }
	}
	
	/*
	 Favorites favs = new Favorites();
	favs.put(String.class, "Hello");
	String favoriteString = favs.get(String.class);
	 */
	
	
	@SuppressWarnings("unchecked")
	public static <T> T readObject(String filename,Class<T> classT, T referenceObject ) {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
			referenceObject = (T) in.readObject();
			in.close();
			return referenceObject;
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