package makeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import util.WhatType;




public class GetAtribute {
	
	ArrayList<String> stringToArrayAtribute(String s,  String sep ){

		ArrayList<Integer> indices = new ArrayList<Integer>();

		for(int i = 0; i < s.length(); i++){
			if( s.substring(i, i+1).equals(sep) )
				indices.add(new Integer(i) );
		}
		
		ArrayList<String> strs = new ArrayList<String>();


		for(int i = 0; i < indices.size() -1; i++){
			strs.add(s.substring( indices.get(i).intValue() + 1, indices.get(i +1).intValue() )     );
		}		
		return strs;


	}
	
	

	public static void main(String[] args) {
		
		
		GetAtribute mc = new GetAtribute();		
		
		String fullPath = "C:\\JavaCode\\Desktop\\tFontAtribute.txt";		
		
		String line = "";		
		
		ArrayList<String> strs = new ArrayList<String>();				
			
		try{  		
			FileReader fr = new FileReader(fullPath);
			BufferedReader reader = new BufferedReader(fr);		  
    	    char teste;
		    while( (line = reader.readLine() ) != null ){ 
    	    	
    	    	//System.out.println("Mostrando o valor da linha: " + line);
    	    	if(line.length() > 1) {
    	    		teste = line.charAt(0); 
    	    		//System.out.println("O valor do teste é: "+ teste);
    	    		if( (teste == '0' || teste == '1' || teste == '2' ||  teste == '3' || teste == '4' || teste == '5' ||  teste == '6' || teste == '7' || teste == '8' ||  teste == '9') && line.charAt(1) != '-' && line.charAt(1) != '.' && line.charAt(2) != '-') {
    	    			if(WhatType.isNumeric(line.substring(0, 2)  )    && !WhatType.isNumeric(line.substring(2, 3)  )                 )
    	    				strs.add(line);
    	    			//System.out.println("Linha dentro do if: "+line);
    	    		}	
    	    	}	
    	    		//System.out.println(line);
     		}//while  
      
        //
    	}catch(IOException e){
		System.out.println("Pego pelo catch de IOException");
		e.printStackTrace();
		}
		
		String sufixoClasse = "";
		
		sufixoClasse = JOptionPane.showInputDialog("Informe o nome da classe contendo os atributos: ");
		
		//ArrayList<String> strs2 = new ArrayList<String>();
		String atrib = "";
		
		for(String teste1 : strs) {
			if(!teste1.equals("")) {
			
				atrib = RegexL.pegaAtributo(teste1);
					
				System.out.println(atrib+"_"+sufixoClasse);
				//strs2 = mc.stringToArrayAtribute(teste1, " ");
				
				/*for(String testeag : strs2) {
					System.out.println("Testando stringToArrayAtribute");
					System.out.println(testeag);
				}*/
			}	
			/*if(strs2.size() >= 1)	
			;	*///
		}
		

	}//end main


}
