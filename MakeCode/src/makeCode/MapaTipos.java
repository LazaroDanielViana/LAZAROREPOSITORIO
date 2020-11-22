package makeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MapaTipos {
	public static Map<String, Vector<String>> javaToSQL = new HashMap<String, Vector<String>>();
	static {
		javaToSQL.put("String",new Vector<String>(Arrays.asList("VARCHAR","LONGVARCHAR","CHAR") ));
		javaToSQL.put("BigDecimal",new Vector<String>(Arrays.asList("DECIMAL") ));
		javaToSQL.put("boolean",new Vector<String>(Arrays.asList("BOOLEAN","BIT") ));
		javaToSQL.put("Boolean",new Vector<String>(Arrays.asList("BOOLEAN","BIT") ));
		javaToSQL.put("byte",new Vector<String>(Arrays.asList("SMALLINT","TINYINT") ));
		javaToSQL.put("Byte",new Vector<String>(Arrays.asList("SMALLINT","TINYINT") ));
		javaToSQL.put("short",new Vector<String>(Arrays.asList("SMALLINT") ));
		javaToSQL.put("Short",new Vector<String>(Arrays.asList("SMALLINT") ));	
		javaToSQL.put("int",new Vector<String>(Arrays.asList("INTEGER") ));
		javaToSQL.put("Integer",new Vector<String>(Arrays.asList("INTEGER") ));
		javaToSQL.put("long",new Vector<String>(Arrays.asList("BIGINT") ));
		javaToSQL.put("Long",new Vector<String>(Arrays.asList("BIGINT") ));
		javaToSQL.put("float",new Vector<String>(Arrays.asList("REAL") ));
		javaToSQL.put("Float",new Vector<String>(Arrays.asList("REAL") ));
		javaToSQL.put("double",new Vector<String>(Arrays.asList("DOUBLE","FLOAT") ));
		javaToSQL.put("Double",new Vector<String>(Arrays.asList("DOUBLE","FLOAT") ));
		javaToSQL.put("byte[]",new Vector<String>(Arrays.asList("BINARY","VARBINARY","LONGVARBYNARY") ));
		
		javaToSQL.put("Date",new Vector<String>(Arrays.asList("DATE") ));
		javaToSQL.put("Time",new Vector<String>(Arrays.asList("TIME") ));
		
		
		
	}
	
	
	

}
