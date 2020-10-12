package makeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;



public class GetGetters {
	
	public static void main(String[] args) {
		
		
		//GetGetters mc = new GetGetters();
		
		
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
		
		MakeConstructor mc2 = new MakeConstructor();
		String [] vetor;
		vetor = bigString.split(";");
		
		ArrayList<TTipo> lTTipo = new ArrayList<TTipo>();
		//System.out.println("Mostrando a chamada a listTip");
		for(String teste : vetor) {
			lTTipo.addAll( mc2.listTTipo(teste) );
		}
		int contador = 1;
		
		//String registro = "";
		//registro = JOptionPane.showInputDialog("Informe o nome da classe: ");
		
		for(TTipo tipo : lTTipo) {				
			
			
			//String ifInit = "public " + registro + "(ArrayList<String> strs1) {";		
			//String ifInit2 = "public " + registro + "(){}";
			String prefixo = "writer.write(c170.get";
			String sufixo = "()  + \";\");";
			
			System.out.println(prefixo + tipo.identifier + sufixo);
			//writer.write(c100.getCNPJFILIAL()  + ";");
			
			/*if(contador == 1) {
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
*/		}

	}//end main


}
