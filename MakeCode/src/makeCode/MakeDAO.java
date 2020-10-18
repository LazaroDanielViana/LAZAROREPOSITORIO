package makeCode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MakeDAO<T> {
	
	
	public static String insertStatement(Field[] fields, Object tipo) {
		String sql = "insert into ";
		
		StringBuffer makeCode = new StringBuffer();
		makeCode.append("( ");
		StringBuffer makeCode2 = new StringBuffer();
		makeCode2.append("values( ");
		
		System.out.println("FieldsLength vale: " + fields.length);
		
		for(int i = 0; i< fields.length; i++) {
			if(i < fields.length -1) {
				makeCode.append(fields[i].getName() + ", ");
				makeCode2.append("?, ");
			}
			else {
				makeCode.append(fields[i].getName() + ") ");
				makeCode2.append("?);");
			}
			
		}
		
		String classeComand = tipo.getClass().getSimpleName() + (makeCode.toString() + makeCode2.toString());
		
		return (sql + classeComand);
	}
	
	public static String makeAdiciona(Field[] fields, Object tipo) {
		
		StringBuffer makeCode = new StringBuffer();
		
		makeCode.append(insertStatement(fields, tipo));
		
		return makeCode.toString();
		
	}
	 /*
	 public void adiciona(JurosCompostos js) throws SQLException{     
         
	        String sql = "insert into JurosCompostos (capital, taxa, periodo, montante, juros,nomeCalculo,data) " + "values(?,?,?,?,?,?,?)";
	        PreparedStatement stmt = conexao.prepareStatement(sql);
	        stmt.setDouble(1, js.getCapital());
	        stmt.setDouble(2, js.getTaxa());
	        stmt.setDouble(3, js.getPeriodo());
	        stmt.setDouble(4, js.getMontante());
	        stmt.setDouble(5, js.getJuros());
	        stmt.setString(6,js.getNomeCalculo());
	        java.sql.Date dataSql = new java.sql.Date(js.getData().getTime());
	        stmt.setDate(7,dataSql);
	        stmt.execute(); 
	        stmt.close();       
	      
	   }
	*/
	
	public static void main(String[] args) {		
		
		String teste = makeAdiciona(TTipo.class.getDeclaredFields(), new TTipo());
		System.out.println(teste);
		
	}
	
}
