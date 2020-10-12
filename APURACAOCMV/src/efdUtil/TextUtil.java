package efdUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TextUtil {
	
	public static List<String> stringToArray(String s, String sep) {

		ArrayList<String> strs = new ArrayList<String>();
		
		if (s != null && sep != null) { 
			String[] resultA = s.split(Pattern.quote("|"), -1);	
			/*if(s.contains("E111")) {
				System.out.println("Length of resultA vale: " + resultA.length);
				for(int i = 1; i< resultA.length; i++)
					System.out.println(resultA[i]);
			}*/
			if(resultA.length >= 2) {
				for(int i = 1; i < resultA.length; i++)
					strs.add(resultA[i]);
			}
		}
		else {
			strs = null;
			
			
		}
		return strs;

	}

}
