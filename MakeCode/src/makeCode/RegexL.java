package makeCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexL {

	public static String pegaCNPJCPF(String cnpjCPF) {

		String mydata = "";
		Pattern pattern = Pattern.compile("(\\d{11,14})");
		Matcher matcher = pattern.matcher(cnpjCPF);
		if (matcher.find()) {
			mydata = matcher.group(1);
			if (mydata.length() == 11) {
				mydata = mydata.substring(0, 3) + "." + mydata.substring(3, 6) + "." + mydata.substring(6, 9) + "-"
						+ mydata.substring(9, 11);
			} else if (mydata.length() == 14) {
				mydata = mydata.substring(0, 2) + "." + mydata.substring(2, 5) + "." + mydata.substring(5, 8) + "/"
						+ mydata.substring(8, 12) + "-" + mydata.substring(12, 14);
			}
		}

		return mydata;

	}

	public static String pegaAtributo(String atributo) {

		String mydata = "";
		Pattern pattern = Pattern.compile("([a-zA-Z_]+)");
		Matcher matcher = pattern.matcher(atributo);
		if (matcher.find()) {
			mydata = matcher.group(1);
			/*
			 * if(mydata.length() == 11) { mydata = mydata.substring(0, 3) + "." +
			 * mydata.substring(3, 6) + "." + mydata.substring(6, 9) + "-" +
			 * mydata.substring(9, 11); } else if(mydata.length() == 14) { mydata =
			 * mydata.substring(0, 2) + "." + mydata.substring(2, 5) + "." +
			 * mydata.substring(5, 8) + "/" + mydata.substring(8, 12)+"-"+
			 * mydata.substring(12, 14); }
			 */
		}

		return mydata;

	}

	public static String pegaTwoNumbers(String atributo) {

		String mydata = "";
		Pattern pattern = Pattern.compile("([0-9][0-9][ \t]+)");
		Matcher matcher = pattern.matcher(atributo);
		String t = "";
		if (matcher.find()) {
			mydata = matcher.group(1);
			t = mydata;
			/*
			 * if(mydata.length() == 11) { mydata = mydata.substring(0, 3) + "." +
			 * mydata.substring(3, 6) + "." + mydata.substring(6, 9) + "-" +
			 * mydata.substring(9, 11); } else if(mydata.length() == 14) { mydata =
			 * mydata.substring(0, 2) + "." + mydata.substring(2, 5) + "." +
			 * mydata.substring(5, 8) + "/" + mydata.substring(8, 12)+"-"+
			 * mydata.substring(12, 14); }
			 */
		}

		return t;

	}

	public static boolean isInteger(String s) {
		// cria um array de char
		boolean d = true;

		if (s.length() >= 1) {
			char[] c = s.toCharArray();

			for (int i = 0; i < c.length; i++) {
				// verifica se o char não é um dígito
				if (!Character.isDigit(c[i])) {
					d = false;
					break;
				}
			}

		}
		else {
			d = false;
		}			
		return d;

	}
	
	public static boolean isNumber(String argument) {
		String p = "[-]?\\d*[.]?[,]?\\d+";
		
		boolean result = Pattern.matches(p, argument);
		return result;
		
	}
	

	public static void main(String[] args) {
		/*String atributo = "03 CNPJ_CPF_COL Número do CNPJ ou CPF do local da coleta C 014 - OC";

		String teste = "";

		teste = pegaTwoNumbers(atributo);
		System.out.println(teste);*/
		
		
		// [-]? com ou sem o sinal de subtração
		// \d* zero ou mais dígitos
		// [.]? com ou sem ponto
		// \d+ um ou mais números

		System.out.println( isNumber("44.2"));
		System.out.println( isNumber("44,2"));
		System.out.println( isNumber("0"));
		System.out.println( isNumber(".0"));
		System.out.println( isNumber("0.0"));
		System.out.println( isNumber("0,0"));
		
		
	}

}
