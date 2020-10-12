package makeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MakeJPQL {



	public static void main(String[] args) {

		MakeJPQL mc = new MakeJPQL();

		String fullPath = "C:\\JavaCode\\Desktop\\tFontConstuctor.txt";

		String line = "";

		String bigString = "";

		int contaLinha = 0;
		String classeSimplificadora = JOptionPane.showInputDialog("Informe o nome completo da classe simplificadora: ");
		String classeContenedora = JOptionPane.showInputDialog("Informe o nome completo da classe contenedora: ");
		
		String JPQL = "\"SELECT NEW "+ classeSimplificadora +"( ";

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
					/*
					 * Pattern pattern = Pattern.compile("Calendar"); Matcher matcher =
					 * pattern.matcher(line); if (matcher.find()) { line = line.trim(); String[]
					 * vetorCalendar = line.split("\\s"); line = vetorCalendar[0] + " " +
					 * vetorCalendar[1] + ";"; // System.out.println("Line quando tem Calendar: "+
					 * line); }
					 * 
					 * pattern = Pattern.compile("Time"); matcher = pattern.matcher(line); if
					 * (matcher.find()) { line = line.trim(); String[] vetorCalendar =
					 * line.split("\\s"); line = vetorCalendar[0] + " " + vetorCalendar[1] + ";"; //
					 * System.out.println("Line quando tem Calendar: "+ line); }
					 */

					bigString += line.replace(",", " ");
				}
				contaLinha++;
			} //end while

			//
		} catch (IOException e) {
			System.out.println("Pego pelo catch de IOException");
			e.printStackTrace();
		}

		String[] vetor;
		vetor = bigString.split(";");

		List<TTipo> lTTipo = new ArrayList<TTipo>();
		// System.out.println("Mostrando a chamada a listTip");
		MakeConstructor mk = new MakeConstructor();
		for (String teste : vetor) {
			lTTipo.addAll(mk.listTTipo(teste));
		}
		
		String listaColunas = "";

		for (TTipo tipo : lTTipo) {
			listaColunas += "f." + tipo.getIdentifier()+ ", ";
			
		}
		
		JPQL += listaColunas + ") FROM " +classeContenedora + "f\"";
		System.out.println(JPQL);

		

	}// end main

}
