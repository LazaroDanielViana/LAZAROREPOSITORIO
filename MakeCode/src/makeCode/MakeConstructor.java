package makeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MakeConstructor {

	int contadorGet = 0;

	int contadorSet = 0;

	
	
	public static void main(String[] args) {

		MakeConstructor mc = new MakeConstructor();

		String fullPath = "C:\\JavaCode\\Desktop\\tFontConstuctor.txt";

		String line = "";

		String bigString = "";

		int contaLinha = 0;

		try {
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);

			while ((line = reader.readLine()) != null) {

				// System.out.println(line);
				if (line.length() > 1) {
					/*
					 * if(line.contains("Calendar") || line.contains) { String[] vetorCalendar =
					 * bigString.split("\\s"); //line =
					 * System.out.println("Tamanho do vetorCalendar: " + vetorCalendar.length);
					 * System.out.println(vetorCalendar[0] + " " + vetorCalendar[1] + ";" ); }
					 */
					Pattern pattern = Pattern.compile("Calendar");
					Matcher matcher = pattern.matcher(line);
					if (matcher.find()) {
						line = line.trim();
						String[] vetorCalendar = line.split("\\s");
						line = vetorCalendar[0] + " " + vetorCalendar[1] + ";";
						// System.out.println("Line quando tem Calendar: "+ line);
					}

					pattern = Pattern.compile("Time");
					matcher = pattern.matcher(line);
					if (matcher.find()) {
						line = line.trim();
						String[] vetorCalendar = line.split("\\s");
						line = vetorCalendar[0] + " " + vetorCalendar[1] + ";";
						// System.out.println("Line quando tem Calendar: "+ line);
					}

					bigString += line.replace(",", " ");
				}
				contaLinha++;
			} // while

			//
		} catch (IOException e) {
			System.out.println("Pego pelo catch de IOException");
			e.printStackTrace();
		}

		String[] vetor;
		vetor = bigString.split(";");

		List<TTipo> lTTipo = new ArrayList<TTipo>();
		// System.out.println("Mostrando a chamada a listTip");
		for (String teste : vetor) {
			lTTipo.addAll(mc.listTTipo(teste));
		}
		int contador = 1;

		String registro = "";
		registro = JOptionPane.showInputDialog("Informe o nome da classe do(s)\n construtor(es): ");

		String ifInit = "public " + registro + "(){}";
		String ifInit2 = "public " + registro + "(List<String> strs1) {";
		System.out.println(ifInit);
		System.out.println(ifInit2);
		
		if (bigString.contains("Calendar")) {
			System.out.println("int ano, mes, dia;");
		}
		if (bigString.contains("Time")) {
			System.out.println("int hora, minuto, segundo;");
		}
		
		System.out.println( "if(strs1.size() == " + registro +".NUM_CAMPOS" +"){" );
		
		for (TTipo tipo : lTTipo) {	
			System.out.println(mc.escreveConstrutor(tipo));
			

			contador++;
			int lista = 2;
			// Scanner scan = new Scanner(System.in);
			// System.out.println("Deseja criar lista: 1 - para sim / 2 - para não");
			// lista = scan.nextInt();

			// if(lista == 1)
			// System.out.println("");
			if (contador > lTTipo.size())
				System.out.println("}");
			// System.out.println(mc.escreveGeter("c100", tipo) );
		}
		
		mc.contadorSet = 0;
		System.out.println("else{");
		for (TTipo tipo : lTTipo) {	
			System.out.println(mc.escreveConstrutorSimplificado(tipo));
			

			contador++;
			int lista = 2;
			// Scanner scan = new Scanner(System.in);
			// System.out.println("Deseja criar lista: 1 - para sim / 2 - para não");
			// lista = scan.nextInt();

			// if(lista == 1)
			// System.out.println("");
			//if (contador > lTTipo.size())
				//System.out.println("}");
			// System.out.println(mc.escreveGeter("c100", tipo) );
		}
		
		System.out.println("}");
		System.out.println("}");
		

	}// end main

	public List<TTipo> listTTipo(String t) {

		String semEspacoPontas = t.trim();
		List<String> semVazio = new ArrayList<String>();
		List<TTipo> lTTipo = new ArrayList<TTipo>();

		String[] vetor;

		semEspacoPontas.replace("\\s", " ");
		vetor = semEspacoPontas.split(" ");

		for (String teste : vetor) {
			if (teste.length() > 1) // || !teste.equals("\t") || !teste.equals("\n") || !teste.equals("\r")
				semVazio.add(teste);
		}
		// System.out.println("Tamanho de semVazio Ã©: " + semVazio.size());
		// System.out.println("Mostrando strings de listTip sem vazio");

		for (int i = 1; i < semVazio.size(); i++) {
			TTipo tipo = new TTipo();
			tipo.setTipo(semVazio.get(0).trim());
			tipo.setIdentifier(semVazio.get(i).trim());
			lTTipo.add(tipo);
		}

		return lTTipo;

	}

	public String escreveConstrutor(TTipo tipo) {

		
		String nomeLista = "strs1";

		if (tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");
		}
		String prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(";

		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		
		String antePrefixo = "if ( strs1.get(" + contadorSet + ").length() >= 1 " + "&& RegexL.isNumber(strs1.get("
				+ contadorSet + ")) )" + "\n\t";
		
		switch (tipo.getTipo()) {

		case "byte":
			wraper = "Byte.parseByte(";
			break;

		case "short":
			wraper = "Short.parseShort(";
			break;

		case "int":
			wraper = "Integer.parseInt(";
			break;

		case "long":
			wraper = "Long.parseLong(";
			break;

		case "float":
			wraper = "Float.parseFloat(";
			break;

		case "Double":
			wraper = "Double.parseDouble(";
			break;

		case "boolean":
			wraper = "Boolean.parseBoolean(";
			break;
		case "Calendar":
			GregorianCalendar1 = "if(strs1.get(" + contadorSet + ").length() == 8) {\n";
			GregorianCalendar1 += "\t ano = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,8));\n";
			GregorianCalendar1 += "\t mes = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			GregorianCalendar1 += "\t dia = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2));\n";
			GregorianCalendar1 += "}else {\n \t ano = 0;	\n \t mes = 0; \n \t dia = 0; \n }\n";
			GregorianCalendar1 += "Calendar calendar = new GregorianCalendar(ano, mes, dia);\n";

			wraper = "GregorianCalendar(";
			break;
		case "Time":
			Time1 = "hora = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2)) -1;\n";
			Time1 += "minuto = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			Time1 += "segundo = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,6)) -1;\n";
			Time1 += "time = new Time(hora, minuto, segundo);\n";
			wraper = "Time(";
			break;
		case "C101":
			wraper = "C101(";
			break;

		case "C105":
			wraper = "C105(";
			break;

		case "C172":
			wraper = "C172(";
			break;
		case "C177":
			wraper = "C177(";
			break;
		case "C178":
			wraper = "C178(";
			break;
		case "C179":
			wraper = "C179(";
			break;
		case "ArrayList<C110>":
			wraper = "ArrayList<C110>(";
			break;
		case "String":
			wraper = "";
			break;

		}
		String isString = "";

		String replace = ".replace(\",\",\".\")";

		if (!wraper.equals(""))
			isString = ")";

		prefixoSetter += wraper;

		if (tipo.getTipo().equals("float") || tipo.getTipo().equals("double")) {
			// String antePrefixo = "if ((strs1.get(" +contadorSet + ").length() >= 1))";
			prefixoSetter += nomeLista + ".get(" + contadorSet + ")" + replace + ")" + isString + ";";
			prefixoSetter = antePrefixo + prefixoSetter;
		} else if (tipo.getTipo().equals("byte") || tipo.getTipo().equals("short") || tipo.getTipo().equals("int")
				|| tipo.getTipo().equals("long")) {
			prefixoSetter += nomeLista + ".get(" + contadorSet + "))" + isString + ";";
			prefixoSetter = antePrefixo + prefixoSetter;
		}

		else
			prefixoSetter += nomeLista + ".get(" + contadorSet + "))" + isString + ";";
		// c100.setCOD_MOD(strs1.get(4));
		// c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));

		if (tipo.getTipo().equals("Calendar")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(calendar);";
			prefixoSetter = GregorianCalendar1 + prefixoSetter;

		}

		if (tipo.getTipo().equals("Time")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(time);";
			prefixoSetter = Time1 + prefixoSetter;

		}
		if (tipo.getIdentifier().equals("Linha")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(nLinha);";

			// setLinha(nLinha);
		}
		if (tipo.getTipo().startsWith("ArrayList")) {
			prefixoSetter = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";

		}

		contadorSet++;
		return prefixoSetter;
	}
	
public String escreveConstrutorSimplificado(TTipo tipo) {

		
		String nomeLista = "strs1";

		if (tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");
		}
		

		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		//String antePrefixo = "if ( strs1.get(" + contadorSet + ").length() >= 1 " + "&& RegexL.isNumber(strs1.get("
		//		+ contadorSet + ")) )" + "\n\t";
		switch (tipo.getTipo()) {

		case "byte":
			wraper = "Byte.parseByte(";
			break;

		case "short":
			wraper = "Short.parseShort(";
			break;

		case "int":
			wraper = "Integer.parseInt(";
			break;

		case "long":
			wraper = "Long.parseLong(";
			break;

		case "float":
			wraper = "Float.parseFloat(";
			break;

		case "Double":
			wraper = "Double.parseDouble(";
			break;

		case "boolean":
			wraper = "Boolean.parseBoolean(";
			break;
		case "Calendar":
			//GregorianCalendar1 = "if(strs1.get(" + contadorSet + ").length() == 8) {\n";
			//GregorianCalendar1 += "\t ano = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,8));\n";
			//GregorianCalendar1 += "\t mes = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			//GregorianCalendar1 += "\t dia = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2));\n";
			//GregorianCalendar1 += "}else {\n \t ano = 0;	\n \t mes = 0; \n \t dia = 0; \n }\n";
			GregorianCalendar1 += "\t ano = 0;	\n \t mes = 0; \n \t dia = 0; \n \n";
			GregorianCalendar1 += "Calendar calendar = new GregorianCalendar(ano, mes, dia);\n";

			wraper = "GregorianCalendar(";
			break;
		case "Time":
			//Time1 = "hora = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2)) -1;\n";
			//Time1 += "minuto = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			//Time1 += "segundo = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,6)) -1;\n";
			Time1 += "time = new Time(hora, minuto, segundo);\n";
			wraper = "Time(";
			break;
		case "C101":
			wraper = "C101(";
			break;

		case "C105":
			wraper = "C105(";
			break;

		case "C172":
			wraper = "C172(";
			break;
		case "C177":
			wraper = "C177(";
			break;
		case "C178":
			wraper = "C178(";
			break;
		case "C179":
			wraper = "C179(";
			break;
		case "ArrayList<C110>":
			wraper = "ArrayList<C110>(";
			break;
		case "String":
			wraper = "";
			break;

		}
		String isString = "";

		String replace = ".replace(\",\",\".\")";

		if (!wraper.equals(""))
			isString = ")";
		
		
		String prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(";

		//prefixoSetter += wraper;

		if (tipo.getTipo().equals("float") || tipo.getTipo().equals("double") || tipo.getTipo().equals("byte") || tipo.getTipo().equals("short") || tipo.getTipo().equals("int")
				|| tipo.getTipo().equals("long")) {
			// String antePrefixo = "if ((strs1.get(" +contadorSet + ").length() >= 1))";
			prefixoSetter += "0)" + ";";
			//prefixoSetter = antePrefixo + prefixoSetter;
		
		} else if( tipo.getTipo().equals("String")) {
			prefixoSetter += "\"\")" + ";";
		}
		
		else
			prefixoSetter += nomeLista + ".get(" + contadorSet + "))" + isString + ";";
		// c100.setCOD_MOD(strs1.get(4));
		// c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));

		if (tipo.getTipo().equals("Calendar")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(calendar);";
			prefixoSetter = GregorianCalendar1 + prefixoSetter;

		}

		if (tipo.getTipo().equals("Time")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(time);";
			prefixoSetter = Time1 + prefixoSetter;

		}
		if (tipo.getIdentifier().equals("Linha")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(nLinha);";

			// setLinha(nLinha);
		}
		if (tipo.getTipo().startsWith("ArrayList")) {
			prefixoSetter = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";

		}

		contadorSet++;
		return prefixoSetter;
	}


	public String escreveConstrutorCpp(TTipo tipo) {

		String nomeLista = "strs1";

		if (tipo.getIdentifier().equals("linha")) {
			tipo.setIdentifier("Linha");
		}
		String prefixoSetter = "this->" + "set" + tipo.getIdentifier() + "(";

		String wraper = "";
		String GregorianCalendar1 = "";
		String Time1 = "";
		String antePrefixo = "if( strs1[" + contadorSet + "].size() >= 1 )";
		switch (tipo.getTipo()) {

		case "int":
			wraper = "(int)";
			break;

		case "long":
			wraper = "(long)";
			break;

		case "float":
			wraper = "(float)";
			break;

		case "double":
			wraper = "(double)";
			break;

		case "bool":
			wraper = "(bool)";
			break;
		case "Calendar":
			GregorianCalendar1 = "if(strs1.get(" + contadorSet + ").length() == 8) {\n";
			GregorianCalendar1 += "ano = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,8));\n";
			GregorianCalendar1 += "mes = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			GregorianCalendar1 += "dia = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2));\n";
			GregorianCalendar1 += "}else {\n ano = 0;	\n mes = 0; \n dia = 0; \n }\n";
			GregorianCalendar1 += "Calendar calendar = new GregorianCalendar(ano, mes, dia);\n";

			wraper = "GregorianCalendar(";
			break;
		case "Time":
			Time1 = "hora = Integer.parseInt(strs1.get(" + contadorSet + ").substring(0,2)) -1;\n";
			Time1 += "minuto = Integer.parseInt(strs1.get(" + contadorSet + ").substring(2,4)) - 1;\n";
			Time1 += "segundo = Integer.parseInt(strs1.get(" + contadorSet + ").substring(4,6)) -1;\n";
			Time1 += "time = new Time(hora, minuto, segundo);\n";
			wraper = "Time(";
			break;

		case "C101":
			wraper = "C101(";
			break;

		case "C105":
			wraper = "C105(";
			break;

		case "C172":
			wraper = "C172(";
			break;
		case "C177":
			wraper = "C177(";
			break;
		case "C178":
			wraper = "C178(";
			break;
		case "C179":
			wraper = "C179(";
			break;
		case "ArrayList<C110>":
			wraper = "ArrayList<C110>(";
			break;
		case "String":
			wraper = "";
			break;

		}
		String isString = "";

		String replace = ".replace(\",\",\".\")";

		if (!wraper.equals(""))
			isString = ")";

		prefixoSetter += wraper;

		if (tipo.getTipo().equals("float") || tipo.getTipo().equals("double")) {
			// String antePrefixo = "if ((strs1.get(" +contadorSet + ").length() >= 1))";
			prefixoSetter += nomeLista + ".get(" + contadorSet + ")" + replace + ")" + isString + ";";
			prefixoSetter = antePrefixo + prefixoSetter;
		} else if (tipo.getTipo().equals("byte") || tipo.getTipo().equals("short") || tipo.getTipo().equals("int")
				|| tipo.getTipo().equals("long")) {
			prefixoSetter += nomeLista + ".get(" + contadorSet + "))" + isString + ";";
			prefixoSetter = antePrefixo + prefixoSetter;
		}

		else
			prefixoSetter += nomeLista + ".get(" + contadorSet + "))" + isString + ";";
		// c100.setCOD_MOD(strs1.get(4));
		// c100.setCOD_SIT(Byte.parseByte(strs1.get(5)));

		if (tipo.getTipo().equals("Calendar")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(calendar);";
			prefixoSetter = GregorianCalendar1 + prefixoSetter;

		}

		if (tipo.getTipo().equals("Time")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(time);";
			prefixoSetter = Time1 + prefixoSetter;

		}
		if (tipo.getIdentifier().equals("Linha")) {
			prefixoSetter = "this." + "set" + tipo.getIdentifier() + "(nLinha);";

			// setLinha(nLinha);
		}
		if (tipo.getTipo().startsWith("ArrayList")) {
			prefixoSetter = "list" + tipo.getTipo().substring(10, 14) + " = new " + tipo.getTipo() + "();";

		}

		contadorSet++;
		return prefixoSetter;
	}

}
