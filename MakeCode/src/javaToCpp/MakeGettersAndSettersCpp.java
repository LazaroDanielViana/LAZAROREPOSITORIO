package javaToCpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import makeCode.MakeConstructor;
import makeCode.TTipo;
import util.WriteGettersSetters;

public class MakeGettersAndSettersCpp {

	public static String converteTipoJavaToCpp(String tipoJava) {
		Hashtable<String, String> hashTypeConverter = new Hashtable();
		hashTypeConverter.put("byte", "int");
		hashTypeConverter.put("short", "int");
		hashTypeConverter.put("int", "int");
		hashTypeConverter.put("long", "long");
		hashTypeConverter.put("float", "float");
		hashTypeConverter.put("double", "double");

		hashTypeConverter.put("String", "string");
		hashTypeConverter.put("boolean", "bool");

		hashTypeConverter.put("Calendar", "struct tm");
		hashTypeConverter.put("List<", "vector");
		return hashTypeConverter.get(tipoJava);

	}

	public static boolean isPrimaryType(String type) {
		Hashtable<String, String> hashTypeConverter = new Hashtable();
		hashTypeConverter.put("byte", "int");
		hashTypeConverter.put("short", "int");
		hashTypeConverter.put("int", "int");
		hashTypeConverter.put("long", "long");
		hashTypeConverter.put("float", "float");
		hashTypeConverter.put("double", "double");

		hashTypeConverter.put("String", "string");
		hashTypeConverter.put("boolean", "bool");

		hashTypeConverter.put("Calendar", "struct tm");
		hashTypeConverter.put("List<", "vector");
		return hashTypeConverter.get(type) != null;
	}

	public static void main(String[] args) {

		MakeConstructorCpp mc = new MakeConstructorCpp();

		String fullPath = "C:\\JavaCode\\Desktop\\CodeC++.txt";

		String line = "";

		String bigString = "";

		int contaLinha = 0;

		String nomeClass = "";
		nomeClass = JOptionPane.showInputDialog("Informe o nome da classe: ");
		System.out.println("class " + nomeClass + " { \n");

		try {
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);
			while ((line = reader.readLine()) != null) {

				// System.out.println(line);
				if (line.length() > 1) {
					
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

		ArrayList<TTipo> lTTipo = new ArrayList<TTipo>();
		// System.out.println("Mostrando a chamada a listTip");

		for (String teste : vetor) {
			lTTipo.addAll(mc.listTTipo(teste));
		}

		// escrevendo ATRIBUTOS
		for (TTipo tipo : lTTipo) {
			String modifier = "";
			if (tipo.getModifiers() != null)
				modifier = tipo.getModifiers()[0];

			if (tipo.getTipo().contains("List<")) {
				System.out.println(modifier + " " + tipo.getTipo().replaceAll("List", "vector") + " "
						+ tipo.getIdentifier() + ";");
			} else if (!tipo.getTipo().contains("byte") && !tipo.getTipo().contains("short")
					&& !tipo.getTipo().contains("int") && !tipo.getTipo().contains("long")
					&& !tipo.getTipo().contains("float") && !tipo.getTipo().contains("double")
					&& !tipo.getTipo().contains("String") && !tipo.getTipo().contains("boolean")
					&& !tipo.getTipo().contains("Calendar")) {
				System.out.println(tipo.getTipo() + " " + tipo.getIdentifier() + ";");
			} else {

				System.out.println(modifier + " " + MakeGettersAndSettersCpp.converteTipoJavaToCpp(tipo.getTipo()) + " "
						+ tipo.getIdentifier() + ";");
			}
		}
		// escrevendo getters an setters
		System.out.println("public:\n");
		for (TTipo tipo : lTTipo) {
			System.out.println(WriteGettersSetters.buildGetMethodNameCpp(tipo));
			System.out.println(WriteGettersSetters.buildSetMethodNameCpp(tipo));

		}
		// escrevendo constructor
		int contador = 1;
		for (TTipo tipo : lTTipo) {

			String constructor1P = nomeClass + "(vector<string> strs1) {";
			String constructor0P = nomeClass + "(){}";
			String destructor = "~ " + nomeClass + "(){}";

			if (contador == 1) {
				System.out.println(constructor0P);
				System.out.println(destructor);
				System.out.println(constructor1P);
				if (bigString.contains("Calendar")) {
					System.out.println("struct tm calendar;");
				}
				if (bigString.contains("Time")) {
					System.out.println("struct tm time;");
				}

				System.out.println(mc.escreveConstrutorCpp(tipo));

			} else {
				if (isPrimaryType(tipo.getTipo()))
					System.out.println(mc.escreveConstrutorCpp(tipo));
			}

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
		System.out.println("\n };");

	}// end main

}// end Class
