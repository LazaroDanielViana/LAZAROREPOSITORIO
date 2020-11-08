package util;



import javaToCpp.MakeGettersAndSettersCpp;
import makeCode.TTipo;

public class WriteGettersSetters {
	
	public static String buildGetMethodName(String fieldName) {
		StringBuilder methodName = new StringBuilder("get");
		methodName.append(fieldName.substring(0, 1).toUpperCase());
		methodName.append(fieldName.substring(1,fieldName.length()));
		return methodName.toString();		
	}
	
	public static String firstLetterToUpper(String fieldName) {
		return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1,fieldName.length());
			
	}
	
	
	public static String buildGetMethodNameCpp(TTipo tipo) {
		
		StringBuilder methodName = new StringBuilder("");
		
		
		String modifier = "";
		if(tipo.getModifiers() != null)
			methodName.append(tipo.getModifiers()[0]);
		
		if(tipo.getTipo().contains("List<")) {
			methodName.append(tipo.getTipo().replaceAll("List", "vector"));
		}
		else if(!tipo.getTipo().contains("byte") && !tipo.getTipo().contains("short") && !tipo.getTipo().contains("int") &&
				!tipo.getTipo().contains("long") && !tipo.getTipo().contains("float") && !tipo.getTipo().contains("double") &&
				!tipo.getTipo().contains("String") && !tipo.getTipo().contains("boolean") && !tipo.getTipo().contains("Calendar")){
					methodName.append(tipo.getTipo());
		}
		else {
		
			methodName.append(MakeGettersAndSettersCpp.converteTipoJavaToCpp(tipo.getTipo()));
		}
				
		methodName.append(" get");
		methodName.append(tipo.getIdentifier().substring(0, 1).toUpperCase());
		methodName.append(tipo.getIdentifier().substring(1,tipo.getIdentifier().length()));
		methodName.append("() const { \n \t return this->" + tipo.getIdentifier() + ";" + '\n' + "}");
		return methodName.toString();
		
	}
	
	public static String buildSetMethodName(String fieldName) {
		StringBuilder methodName = new StringBuilder("set");
		methodName.append(fieldName.substring(0, 1).toUpperCase());
		methodName.append(fieldName.substring(1,fieldName.length()));
		return methodName.toString();
		
	}
	
	public static String buildSetMethodNameCpp(TTipo tipo) {
		StringBuilder methodName = new StringBuilder("void" + " ");
		methodName.append("set");
		methodName.append(tipo.getIdentifier().substring(0, 1).toUpperCase());
		methodName.append(tipo.getIdentifier().substring(1,tipo.getIdentifier().length()));
		
		methodName.append("(");
		
		if(tipo.getTipo().contains("List<")) {
			methodName.append(tipo.getTipo().replaceAll("List", "vector") + " " + tipo.getIdentifier());
		}
		else if(!tipo.getTipo().contains("byte") && !tipo.getTipo().contains("short") && !tipo.getTipo().contains("int") &&
				!tipo.getTipo().contains("long") && !tipo.getTipo().contains("float") && !tipo.getTipo().contains("double") &&
				!tipo.getTipo().contains("String") && !tipo.getTipo().contains("boolean") && !tipo.getTipo().contains("Calendar")){
					methodName.append(tipo.getTipo() + " " + tipo.getIdentifier());
		}
		else {
		
			methodName.append(MakeGettersAndSettersCpp.converteTipoJavaToCpp(tipo.getTipo()) + " " + tipo.getIdentifier());
		}
		
		methodName.append( ")" + "{" + '\n');		
		
		methodName.append("\t this->" + tipo.getIdentifier() + " = " + tipo.getIdentifier() + ";" + '\n' + "}");
		return methodName.toString();
	}
	
	public static void main(String[] args) {
		String mName = "arredonda";
		System.out.println(WriteGettersSetters.buildGetMethodName(mName));
		System.out.println(WriteGettersSetters.buildSetMethodName(mName));
	}

}
