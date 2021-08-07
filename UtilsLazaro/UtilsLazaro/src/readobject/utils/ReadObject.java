package readobject.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class ReadObject {

	public class Favorites {
		private Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

		public <T> T get(Class<T> clazz) {
			return clazz.cast(map.get(clazz));
		}

		public <T> void put(Class<T> clazz, T favorite) {
			map.put(clazz, favorite);
		}
	}

	/*
	 * Favorites favs = new Favorites(); favs.put(String.class, "Hello"); String
	 * favoriteString = favs.get(String.class);
	 */

	@SuppressWarnings("unchecked")
	public static <T> T readObject(String filename, Class<T> classT, T referenceObject)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream(filename);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream in = new ObjectInputStream(bis);) {
			// ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
			// referenceObject = (T) in.readObject();
			// in.close();
			referenceObject = (T) in.readObject();
			return referenceObject;
		}

	}

	@SuppressWarnings("unchecked")
	public static <T> T readObject(String filename, Class<T> classT, T referenceObject, String placeHolder)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		try {

			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);
			referenceObject = (T) in.readObject();

			return referenceObject;

		} finally {
			if (in != null)
				in.close();
			if (bis != null)
				bis.close();
			if (fis != null)
				fis.close();
		}

	}

}