package makeCode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MakeDAO<T> {
	
	public String insertStatement(Field[] fields, Class classe) {
		String sql = "insert into ";
		String classeComand = classe.getName() + fields.toString();
		
		return sql + classeComand;
	}
	
	public String makeAdiciona(MakeDAO<T> tipo) {
		
		Class<T> classT = (Class<T>) tipo.getClass();
		List<T> declaredFields = new ArrayList<>();
		Field[] fields = classT.getDeclaredFields();		
		
		StringBuffer makeCode = new StringBuffer();
		
		makeCode.append(insertStatement(fields, classT));
		
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
		MakeDAO<TTipo> tipo = new MakeDAO<>();
		String teste = tipo.makeAdiciona(tipo);
		System.out.println(teste);
		
	}
	
}
