package javaToCpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import makeCode.MakeConstructor;
import makeCode.TTipo;

public class MakeConstructorCpp {
int contadorGet = 0;
	
	int contadorSet = 0;

	public static void main(String[] args) {
		
		MakeConstructor mc = new MakeConstructor();
		
		
		String fullPath = "C:\\JavaCode\\Desktop\\tFontConstuctor.txt";		
		
		String line = "";
		
		String bigString = "";
		
		int contaLinha = 0;	
				
			
		try{  		
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);     		   
		  
    	   
		    while( (line = reader.readLine() ) != null ){ 
    	    	
    	    	//System.out.println(line);
    	    	if(line.length() > 1) {   	    		
    	    		/*if(line.contains("Calendar") || line.contains) {
    	    			String[] vetorCalendar = bigString.split("\\s");
    	    			//line = 
    	    			System.out.println("Tamanho do vetorCalendar: " + vetorCalendar.length);
    	    			System.out.println(vetorCalendar[0] + " " + vetorCalendar[1] + ";" );
    	    		}*/
    	    		Pattern pattern = Pattern.compile("Calendar");
    	    		Matcher matcher = pattern.matcher(line);
    	    		if (matcher.find()) {
    	    			line = line.trim();
    	    			String[] vetorCalendar = line.split("\\s");
    	    			line = vetorCalendar[0] + " " + vetorCalendar[1] + ";" ;
    	    			//System.out.println("Line quando tem Calendar: "+ line);
    	    		}
    	    		
    	    		pattern = Pattern.compile("Time");
    	    		matcher = pattern.matcher(line);
    	    		if (matcher.find()) {
    	    			line = line.trim();
    	    			String[] vetorCalendar = line.split("\\s");
    	    			line = vetorCalendar[0] + " " + vetorCalendar[1] + ";" ;
    	    			//System.out.println("Line quando tem Calendar: "+ line);
    	    		}
    	    		
    	    			
    	    		bigString += line.replace(",", " ");
    	    	}	
				contaLinha++;
     		}//while  
      
        //
    	}catch(IOException e){
		System.out.println("Pego pelo catch de IOException");
		e.printStackTrace();
		}
		
		
		String [] vetor;
		vetor = bigString.split(";");
		
		ArrayList<TTipo> lTTipo = new ArrayList<TTipo>();
		//System.out.println("Mostrando a chamada a listTip");
		
		
		
		
		for(String teste : vetor) {
			lTTipo.addAll( mc.listTTipo(teste) );
		}
		int contador = 1;
		
		String registro = "";
		registro = JOptionPane.showInputDialog("Informe o nome da classe: ");
		
		for(TTipo tipo : lTTipo) {				
			
			
			String ifInit = "public " + registro + "(vector<string> strs1) {";		
			String ifInit2 = "public " + registro + "(){}";
			
			if(contador == 1) {
				System.out.println(ifInit2);	
				System.out.println(ifInit);
				if (bigString.contains("Calendar")) {
					System.out.println("int ano, mes, dia;");
				}
				if (bigString.contains("Time")) {
					System.out.println("int hora, minuto, segundo;");
				}
				
				System.out.println(mc.escreveConstrutor(tipo) );
				
			}
			else {
				System.out.println(mc.escreveConstrutor(tipo) );
			}
			
			
			
			contador++;
			int lista = 2;
			//Scanner scan = new Scanner(System.in);
			//System.out.println("Deseja criar lista: 1 - para sim / 2 - para não");
			//lista = scan.nextInt();
			
			//if(lista == 1)
				//System.out.println("");
			if(contador > lTTipo.size())
				System.out.println("}");
			//System.out.println(mc.escreveGeter("c100", tipo) );
		}

	}//end main
	
	
	public ArrayList<TTipo> listTTipo(String t){//uma string a cada ;
		
		String semEspacoPontas = t.trim();
		List<String> semVazio = new ArrayList<String>();					
		ArrayList<TTipo> lTTipo = new ArrayList<TTipo>();
		
		String[] vetor;
		
		semEspacoPontas.replace("\\s", " ");
		vetor = semEspacoPontas.split(" ");
	
		
		
		for(String teste : vetor) {
			if(teste.length() > 1) //|| !teste.equals("\t") || !teste.equals("\n") || !teste.equals("\r")
				semVazio.add(teste);
		}
		//System.out.println("Tamanho de semVazio Ã©: " + semVazio.size());
		//System.out.println("Mostrando strings de listTip sem vazio");
			
		
		
				
		if(semEspacoPontas.contains("static")) {
			
			for(int i = 2; i< semVazio.size();i++) {
				TTipo tipo = new TTipo();
				String[] modifier = {semVazio.get(0).trim()};
				tipo.setModifiers(modifier);
				tipo.setTipo(semVazio.get(1).trim());				
				tipo.setIdentifier(semVazio.get(i).trim());
				lTTipo.add(tipo);			
			}
			
			
			
			
		}else if(semEspacoPontas.contains("List<")) {
			TTipo tipo = new TTipo();				
			tipo.setTipo(semVazio.get(0).trim());
			tipo.setIdentifier(semVazio.get(1).trim());
			lTTipo.add(tipo);	
			
		}
		else if(!semEspacoPontas.contains("List<") && semEspacoPontas.contains("new") ) {
			//System.out.println("Entrou na condição !semEspacoPontas.contains(\"List<\") && semEspacoPontas.contains(\"new\") " + semEspacoPontas);
			TTipo tipo = new TTipo();				
			tipo.setTipo(semVazio.get(0).trim());
			tipo.setIdentifier(semVazio.get(1).trim());
			lTTipo.add(tipo);	
			
		}
		
		else {
			for(int i = 1; i< semVazio.size();i++) {
				TTipo tipo = new TTipo();				
				tipo.setTipo(semVazio.get(0).trim());
				tipo.setIdentifier(semVazio.get(i).trim());
				lTTipo.add(tipo);			
			}
			
		}
		
				
		
		return lTTipo;
		
	}
	
	
	
	public String escreveConstrutorCpp(TTipo tipo) {
		if(tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");			
		}	
		
		String nomeLista = "strs1";		
			
		String prefixoSetter =  "this->" + "set" + tipo.getIdentifier() + "(" ;
		
		
		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		
		String splitString = "strs1[" + contadorSet + "]";
		String predicadoNumero = "if( " + splitString + ".size() >= 1 )\n\t" ;
		
		
		switch(tipo.getTipo()) {
			case "byte" :
				wraper = "atoi(";
				break;	
			case "short" :
				wraper = "atoi(";
				break;		
			case "int" :
				wraper = "atoi(";
				break;			
		
			case "long" :
				wraper = "atol(";
				break;		
		
			case "float" :
				wraper = "atof(";
				break;	
				
			case "double" :
				wraper = "atod(";
				break;	
				
			case "bool" :
				wraper = "(bool)";
				break;
			case "Calendar" :
				GregorianCalendar1 = "if(strs1[" + contadorSet + "].size() == 8) {\n";
				GregorianCalendar1 += "\tcalendar.tm_mday = atoi(strs1[" + contadorSet + "].substr(0,2).c_str());\n";
				GregorianCalendar1 += "\tcalendar.tm_mon = atoi(strs1[" + contadorSet + "].substr(2,2).c_str()) - 1;\n";
				GregorianCalendar1 += "\tcalendar.tm_year = atoi(strs1[" + contadorSet + "].substr(4,4).c_str());\n";
				GregorianCalendar1 += "}else {\n \tcalendar.tm_mday = 0;	\n \tcalendar.tm_mon = 0; \n \tcalendar.tm_year = 0; \n }\n";
				
				//GregorianCalendar1 += "Calendar calendar = new GregorianCalendar(ano, mes, dia);\n";			
		
				wraper = "GregorianCalendar(";
				break;						
		
							
			case "Time" :
				Time1 = "calendar.tm_hour = atoi(strs1[\" + contadorSet + \"].substr(0,2).c_str()) -1;\n";
				Time1 += "calendar.tm_min = atoi(strs1[\" + contadorSet + \"].substr(2,2).c_str()) - 1;\n";
				Time1 += "calendar.tm_sec = atoi(strs1[\" + contadorSet + \"].substr(4,2).c_str()) -1;\n";
				//Time1 += "time = new Time(hora, minuto, segundo);\n";
				wraper = "Time(";
				break;		
			case "C101" :
				wraper = "C101(";
				break;
			
			case "C105" :
				wraper = "C105(";
				break;
				
			case "C172" :
				wraper = "C172(";
				break;	
			case "C177" :
				wraper = "C177(";
				break;
			case "C178" :
				wraper = "C178(";
				break;
			case "C179" :
				wraper = "C179(";
				break;	
			case "ArrayList<C110>" :
				wraper = "ArrayList<C110>(";
				break;	
			case "String" :
				wraper = "";
				break;
		
		}
		String isString = "";
		
		//;
		String replace = "replaceVirgula(" + splitString ;
		
		if(!wraper.equals(""))
			isString = "))";
		
		
		
		prefixoSetter += wraper;
		
		if(tipo.getTipo().equals("float") || tipo.getTipo().equals("double")) {
			//String antePrefixo = "if ((strs1.get(" +contadorSet + ").length() >= 1))";
			prefixoSetter +=  replace + ")" + isString + ";";
			prefixoSetter = predicadoNumero + prefixoSetter;
		}
		else if (tipo.getTipo().equals("byte") || tipo.getTipo().equals("short") || tipo.getTipo().equals("int") || tipo.getTipo().equals("long")) {
			
			prefixoSetter +=   splitString + ".c_str()));"; 			
			prefixoSetter = predicadoNumero + prefixoSetter;
		}
		
		else
			prefixoSetter +=   splitString + isString + ");";
		//c100.setCOD_MOD(strs1.get(4));
		//c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));
		
		if(tipo.getTipo().equals("Calendar")) {
			prefixoSetter =  "this->" + "set" + tipo.getIdentifier() + "(calendar);";
			prefixoSetter =  GregorianCalendar1 + prefixoSetter;
			
		}
		
		if(tipo.getTipo().equals("Time")) {
			prefixoSetter = "this->" + "set" + tipo.getIdentifier() + "(time);";
			prefixoSetter =  Time1 + prefixoSetter;
			
		}
		if(tipo.getIdentifier().equals("Linha")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(nLinha);";
			
			//setLinha(nLinha);
		}
		if(tipo.getTipo().startsWith("ArrayList")) {
			prefixoSetter = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";			
			
		}
		
		contadorSet++;
		return prefixoSetter;
	}

	
	
	
	
}
