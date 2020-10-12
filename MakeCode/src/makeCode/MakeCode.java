package makeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//import org.apache.poi.ss.usermodel.Cell;

public class MakeCode {
	
	int contadorGet = 0;
	
	int contadorSet = 0;
	
	//Cell cellRegC170 = row.createCell(cellnum++);
	//cellNumHeader rowHeader
	static String Cell1 = "Cell cell";
	static String Cell2 = " = rowHeader.createCell(cellNumHeader++);";
	
    //cellRegC170.setCellValue(c170.getREGC170());
	static String Cell3 = ".setCellValue(";
	static String Cell4 = ");";
	
	
	

	public static void main(String[] args) {
		
		List<TTipo> tTipo = atributeFromFile();
		
		for(TTipo t : tTipo) {
			
			System.out.println(Cell1 + t.identifier + Cell2);
			System.out.println("cell" + t.identifier + Cell3 + "\"" + t.identifier + "\"" + Cell4);
			//System.out.println("writer.write(listaC170.get(i).get" + t.identifier + "()"  + "+" + "\""+ "\\" + "t" +"\"" +");");
			
		}
		//+".toString()" + "+"
		/*MakeCode mc = new MakeCode();
		
		
		String fullPath = "C:\\JavaCode\\Desktop\\tFontGetSet.txt";		
		
		String line = "";
		
		String bigString = "";
		
		int contaLinha = 0;	
				
			
		try{  		
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);     		   
		  
    	   
		    while( (line = reader.readLine() ) != null ){ 
    	    	
    	    	//System.out.println(line);
    	    	if(line.length() > 1)
    	    		bigString += line.replace(",", " ");
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
		for(TTipo tipo : lTTipo) {
				
			
			String registro = "C410";
			String ifInit = "if(regActive.equals(" + "\"" + registro + "\"" + ") ){";
			String quebraLinha = "strs1 = tEI.stringToArray(line, \"|\");";
			String criaObjeto = registro.toLowerCase() + " = new " + registro + "();";
			
			if(contador == 1) {
				System.out.println(ifInit);
				System.out.println(quebraLinha);
				System.out.println(criaObjeto);
				System.out.println(mc.escreveSeter(registro.toLowerCase(), tipo, "strs1") );
				
			}
			else {
				System.out.println(mc.escreveSeter(registro.toLowerCase(), tipo, "strs1") );
			}
			
			
			
			contador++;
			int lista = 2;
			Scanner scan = new Scanner(System.in);
			//System.out.println("Deseja criar lista: 1 - para sim / 2 - para não");
			//lista = scan.nextInt();
			
			//if(lista == 1)
				//System.out.println("");
			if(contador > lTTipo.size())
				System.out.println("}");
			//System.out.println(mc.escreveGeter("c100", tipo) );
		}*/

	}//end main
	
	
	public ArrayList<TTipo> listTTipo(String t){
		
		String semEspacoPontas = t.trim();
		List<String> semVazio = new ArrayList<String>();					
		ArrayList<TTipo> lTTipo = new ArrayList<TTipo>();
		
		String [] vetor;
		
		semEspacoPontas.replace("\\s", " ");
		vetor = semEspacoPontas.split(" ");
	
		
		
		for(String teste : vetor) {
			if(teste.length() > 1) //|| !teste.equals("\t") || !teste.equals("\n") || !teste.equals("\r")
				semVazio.add(teste);
		}
		//System.out.println("Tamanho de semVazio Ã©: " + semVazio.size());
		//System.out.println("Mostrando strings de listTip sem vazio");
			
		for(int i = 1; i< semVazio.size();i++) {
			TTipo tipo = new TTipo();
			tipo.setTipo(semVazio.get(0).trim());
			tipo.setIdentifier(semVazio.get(i).trim());
			lTTipo.add(tipo);			
		}
				
		
		return lTTipo;
		
	}
	
	public static List<TTipo> atributeFromFile() {

		String fullPath = "C:\\JavaCode\\Desktop\\tFontAtribute.txt";

		String line = "";
		String bigString = "";

		List<String> strs = new ArrayList<>();
		List<TTipo> tTipos = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);
			char teste;
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				
				if (line.matches(".+")) {
					
					line = line.trim();
					bigString += line;
					
					/*teste = line.charAt(0);
					if ((teste == '0' || teste == '1' || teste == '2' || teste == '3' || teste == '4' || teste == '5'
							|| teste == '6' || teste == '7' || teste == '8' || teste == '9') && line.charAt(1) != '-'
							&& line.charAt(1) != '.' && line.charAt(2) != '-') {
						strs.add(line);
						// System.out.println(line);
					}*/
				}
				// System.out.println(line);
			} // while

			//
		} catch (IOException e) {
			System.out.println("Pego pelo catch de IOException");
			e.printStackTrace();
		}
		
		String arr[] = bigString.split(";");
		
		for(String p : arr)
			strs.add(p);
		System.out.println(bigString);
		
		int ind = 0;
		
		
		for(String str : strs) {
			if(str.contains("Calendar") ) {
				String  calen[] = str.split(" ");
				TTipo tTipo = new TTipo();
				tTipo.tipo = calen[0];
				tTipo.identifier = calen[1];
				tTipos.add(tTipo);
			}
			else if( str.contains(",")) {
				List<String> comma = new ArrayList<>();
				
				String  coma[] = str.split(",");
				
				String coma2[] = coma[0].split(" ");				
				/*System.out.println("Imprimindo coma2");
				System.out.println(coma2[0]);
				System.out.println(coma2[1]);*/
				
				for(String c2 : coma2) {
					comma.add(c2);
					System.out.println("Imprimimindo declarações encavaladas");
					System.out.println(c2);
				}	
				for (int i = 1; i < coma.length; i++)
					comma.add(coma[i]);
				
				/*System.out.println("Imprimimindo declarações encavaladas");
				for(String t : comma)
					System.out.println(t);*/
				
				for(int i = 0; i< comma.size(); i++) {
					if(i == coma.length)
						break;					
					TTipo tTipo = new TTipo();
					if(i == 0) {						
						tTipo.tipo = comma.get(0);
						tTipo.identifier = comma.get(i + 1);
					}else {						
						tTipo.tipo = comma.get(0);
						tTipo.identifier = comma.get(i+1);						
					}	
					
					tTipos.add(tTipo);
				}
				
			}//fim else if( str.contains(","))
			
			else {
				String  calen[] = str.split(" ");
				TTipo tTipo = new TTipo();
				tTipo.tipo = calen[0];
				tTipo.identifier = calen[1];
				tTipos.add(tTipo);
			}
		}
		int cont = 0;
		/*for(TTipo t : tTipos) {
			
			System.out.println("Tipo " + cont + " " +  t.tipo);
			System.out.println("Identifier " + cont + " " + t.identifier);			
			cont++;
		}*/
			
		return tTipos;	

	}
	

	public String escreveSeter(String nomeObjeto, TTipo tipo, String nomeLista) {
		
		if(tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");
			
		}
		
		String prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(" ;
		
		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		switch(tipo.getTipo()) {
		
			case "byte" :
				wraper = "Byte.parseByte(";
				break;
				
			case "short" :
				wraper = "Short.parseShort(";
				break;
				
			case "int" :
				wraper = "Integer.parseInt(";
				break;	
		
			case "long" :
				wraper = "Long.parseLong(";
				break;		
		
			case "float" :
				wraper = "Float.parseFloat(";
				break;	
				
			case "Double" :
				wraper = "Double.parseDouble(";
				break;	
				
			case "boolean" :
				wraper = "Boolean.parseBoolean(";
				break;
			case "GregorianCalendar" :
				GregorianCalendar1 = "if(strs1.get(" + contadorSet + ").length() == 8) {\n";
				GregorianCalendar1 += "ano = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,8));\n";
				GregorianCalendar1 += "mes = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
				GregorianCalendar1 += "dia = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2));\n";
				GregorianCalendar1 += "}else {\n ano = 0;	\n mes = 0; \n dia = 0; \n }\n";
				GregorianCalendar1 += "calendar = new GregorianCalendar(ano, mes, dia);\n";			
		
				wraper = "GregorianCalendar(";
				break;				
			case "Time" :
				Time1 = "hora = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2)) -1;\n";
				Time1 += "minuto = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
				Time1 += "segundo = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,6)) -1;\n";
				Time1 += "time = new Time(hora, minuto, segundo);\n";
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
		
		String replace = ".replace(\",\",\".\")";
		
		if(!wraper.equals(""))
			isString = ")";
		
		prefixo += wraper;
		if(tipo.getTipo().equals("float"))
			prefixo +=  nomeLista + ".get(" + contadorSet + ")" + replace + ")" + isString + ";";
		else
			prefixo +=  nomeLista + ".get(" + contadorSet + "))" + isString + ";";
		//c100.setCOD_MOD(strs1.get(4));
		//c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));
		
		if(tipo.getTipo().equals("GregorianCalendar")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(calendar);";
			prefixo =  GregorianCalendar1 + prefixo;
			
		}
		
		if(tipo.getTipo().equals("Time")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(time);";
			prefixo =  Time1 + prefixo;
			
		}
		if(tipo.getIdentifier().equals("Linha")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(nLinha);";
			
			//setLinha(nLinha);
		}
		if(tipo.getTipo().startsWith("ArrayList")) {
			prefixo = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";			
			
		}
		
		contadorSet++;
		return prefixo;
	}
	
	public String escreveConstrutor(String nomeObjeto, TTipo tipo, String nomeLista) {
		
		if(tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");
			
		}
		
		String prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(" ;
		
		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		switch(tipo.getTipo()) {
		
			case "byte" :
				wraper = "Byte.parseByte(";
				break;
				
			case "short" :
				wraper = "Short.parseShort(";
				break;
				
			case "int" :
				wraper = "Integer.parseInt(";
				break;	
		
			case "long" :
				wraper = "Long.parseLong(";
				break;		
		
			case "float" :
				wraper = "Float.parseFloat(";
				break;	
				
			case "Double" :
				wraper = "Double.parseDouble(";
				break;	
				
			case "boolean" :
				wraper = "Boolean.parseBoolean(";
				break;
			case "GregorianCalendar" :
				GregorianCalendar1 = "if(strs1.get(" + contadorSet + ").length() == 8) {\n";
				GregorianCalendar1 += "ano = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,8));\n";
				GregorianCalendar1 += "mes = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
				GregorianCalendar1 += "dia = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2));\n";
				GregorianCalendar1 += "}else {\n ano = 0;	\n mes = 0; \n dia = 0; \n }\n";
				GregorianCalendar1 += "calendar = new GregorianCalendar(ano, mes, dia);\n";
				
			
		
				wraper = "GregorianCalendar(";
				break;
				
			case "Time" :
				Time1 = "hora = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2)) -1;\n";
				Time1 += "minuto = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
				Time1 += "segundo = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,6)) -1;\n";
				Time1 += "time = new Time(hora, minuto, segundo);\n";
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
		
		String replace = ".replace(\",\",\".\")";
		
		if(!wraper.equals(""))
			isString = ")";
		
		prefixo += wraper;
		if(tipo.getTipo().equals("float"))
			prefixo +=  nomeLista + ".get(" + contadorSet + ")" + replace + ")" + isString + ";";
		else
			prefixo +=  nomeLista + ".get(" + contadorSet + "))" + isString + ";";
		//c100.setCOD_MOD(strs1.get(4));
		//c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));
		
		if(tipo.getTipo().equals("GregorianCalendar")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(calendar);";
			prefixo =  GregorianCalendar1 + prefixo;
			
		}
		
		if(tipo.getTipo().equals("Time")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(time);";
			prefixo =  Time1 + prefixo;
			
		}
		if(tipo.getIdentifier().equals("Linha")) {
			prefixo = nomeObjeto + "." + "set" + tipo.getIdentifier() + "(nLinha);";
			
			//setLinha(nLinha);
		}
		if(tipo.getTipo().startsWith("ArrayList")) {
			prefixo = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";			
			
		}
		
		contadorSet++;
		return prefixo;
	}
	
	
	public String escreveGeter(String nomeObjeto, TTipo tipo) {
		
		
		
		String prefixo = nomeObjeto + "." + "get" + tipo.getIdentifier() + "();" ;
		//c100.getIND_EMIT() 
		//c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));
		
		return prefixo;
	}

}
