package makeCode;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import modelFCE.MovimentoESS;
import util.WriteGettersSetters;

public class MakeDAO {

	public static String insertStatement(Field[] fields, Object tipo) {
		String simpleClassName = tipo.getClass().getSimpleName();
		String simpleObjectName = simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1);
		String methodHeader = "public void adiciona(" + simpleClassName +"	"+ simpleObjectName   + "){\n";
		String sql = "String sql = \"INSERT INTO " + tipo.getClass().getSimpleName();

		StringBuffer makeCode = new StringBuffer();
		makeCode.append("( ");
		StringBuffer makeCode2 = new StringBuffer();
		makeCode2.append("values( ");

		// JurosCompostos (capital, taxa, periodo, montante, juros,nomeCalculo,data) " +
		// "values(?,?,?,?,?,?,?)";
		for (int i = 0; i < fields.length; i++) {
			if (i < fields.length - 1) {
				makeCode.append(fields[i].getName() + ", ");
				makeCode2.append("?, ");
			} else {
				makeCode.append(fields[i].getName() + ") ");
				makeCode2.append("?)\";\n\n");
			}

		}
		// PreparedStatement stmt = conexao.prepareStatement(sql);
		// stmt.setDouble(1, js.getCapital());
		// ...
		// stmt.execute();
		// stmt.close();

		StringBuffer makeCode3 = new StringBuffer();
		makeCode3.append("PreparedStatement stmt = conexao.prepareStatement(sql);\n");

		for (int i = 0; i < fields.length; i++) {
			makeCode3.append("stmt.set" + WriteGettersSetters.firstLetterToUpper(fields[i].getType().getSimpleName()) + "(" + (i + 1) + ", " + simpleObjectName+"."
					+ WriteGettersSetters.buildGetMethodName(fields[i].getName()) + "());\n");
			
			if (i == fields.length - 1) {
				makeCode3.append("stmt.execute();\n" + "stmt.close();\n}");
			}

		}

		String classeComand = (makeCode.toString() + makeCode2.toString() + makeCode3.toString());

		return (methodHeader + sql + classeComand);
	}

	public static String alteraStatement(Field[] fields, Object tipo) {
		String simpleClassName = tipo.getClass().getSimpleName();
		String simpleObjectName = simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1);
		String methodHeader = "public void altera(" + simpleClassName +"	" + simpleObjectName  + "){\n";
		
		String sql = "String sql = \"UPDATE " + tipo.getClass().getSimpleName() + " SET ";

		StringBuffer makeCode = new StringBuffer();
		makeCode.append(" ");

		// set capital=?, taxa=?, periodo=?, montante=?, juros=?, nomeCalculo=?,data=?
		// where id=?";
		for (int i = 0; i < fields.length; i++) {
			if (i < fields.length - 1) {
				if (!(i == fields.length - 1)) {
					makeCode.append(fields[i].getName() + "=?, ");
				}
			} else {
				makeCode.append(fields[i].getName() + "=? ");
				makeCode.append(" where id=?\";\n");

			}
		}
		// PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
		// stmt.setDouble(1, js.getCapital());
		// ...
		// stmt.execute();
		// stmt.close();

		StringBuffer makeCode3 = new StringBuffer();
		makeCode3.append("PreparedStatement stmt = this.conexao.prepareStatement(sql);\n");

		for (int i = 0; i < fields.length; i++) {
			makeCode3.append("stmt.set" + WriteGettersSetters.firstLetterToUpper(fields[i].getType().getSimpleName()) + "(" + (i + 1) + ", "+ simpleObjectName+"."+
					WriteGettersSetters.buildGetMethodName(fields[i].getName()) + "());\n");
			if (i == fields.length - 1) {
				makeCode3.append("stmt.executeUpdate();\n" + "stmt.close();\n}");
			}

		}

		String classeComand = (makeCode.toString() + makeCode3.toString());

		return (methodHeader + sql + classeComand);
	}

	public static String deleteStatement(Field[] fields, Object tipo) {
		String simpleClassName = tipo.getClass().getSimpleName();
		String simpleObjectName = simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1);
		String methodHeader = "public void delete(" + simpleClassName + simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1)  + "){\n";
		String sql = "String sql = \"DELETE FROM " + tipo.getClass().getSimpleName() + " WHERE id=?\";\n";

		StringBuffer makeCode = new StringBuffer();
		makeCode.append("PreparedStatement stmt = this.conexao.prepareStatement(sql);\n");
		makeCode.append("stmt.setInt(1, " + simpleObjectName+".getId());\n");
		makeCode.append("stmt.executeUpdate();\n" + "stmt.close();\n}");

		return (methodHeader + sql + makeCode.toString());
	}

	public static String selectStatement(Field[] fields, Object tipo) {
		String simpleClassName = tipo.getClass().getSimpleName();
		String simpleObjectName = simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1);
		String methodHeader = "public void select(" + simpleClassName +" " + simpleObjectName  + "){\n";
		String sql = "String sql = \"SELECT *FROM " + tipo.getClass().getSimpleName() + ";\n";
		StringBuffer makeCode = new StringBuffer();
		makeCode.append("PreparedStatement stmt = this.conexao.prepareStatement(sql);\n");
		makeCode.append("ResultSet rs = stmt.executeQuery();\n");
		makeCode.append("List<"+ tipo.getClass().getSimpleName() +"> minhaLista = new ArrayList<"+ tipo.getClass().getSimpleName() +">();\n");
		makeCode.append("while (rs.next()) {\n");
		makeCode.append(tipo.getClass().getSimpleName() + " " +simpleObjectName+" = new "+ tipo.getClass().getSimpleName() +"();\n");
		for (int i = 0; i < fields.length; i++) {
			makeCode.append("stmt.set" + WriteGettersSetters.firstLetterToUpper(fields[i].getType().getSimpleName()) + "(" + (i + 1) + ", "+simpleObjectName+"."+
					WriteGettersSetters.buildGetMethodName(fields[i].getName()) + "());\n");
			
			if (i == fields.length - 1) {
				makeCode.append("minhaLista.add(" +simpleObjectName+");\n");
				makeCode.append("}\nstmt.execute();\n" + "stmt.close();\n");
				
			}
			

		}
		makeCode.append("return minhaLista;\n}");
		
		

		return (methodHeader +sql + makeCode.toString());
	}
	
	public static<T> String selectByArgumentStatement(Field[] fields, Object tipo, T campo, T value, String operator) {
		
		String simpleClassName = tipo.getClass().getSimpleName();
		String simpleObjectName = simpleClassName.substring(0, 1).toLowerCase()+simpleClassName.substring(1);
		String methodHeader = "public <List"+tipo.getClass().getSimpleName()+ "> getListaPorArgumento("  + campo.getClass().getSimpleName() + " " + campo +","+ campo.getClass() + " " + value+  " ," + "\"" +operator+ "\"){\n";
		String sql = "String sql = \"SELECT *FROM " + tipo.getClass().getSimpleName() +" WHERE "+ campo + " " + operator + " " + "?"+ "\";\n";
		StringBuffer makeCode = new StringBuffer();
		makeCode.append("PreparedStatement stmt = this.conexao.prepareStatement(sql);\n");
		makeCode.append("stmt.set"+value.getClass() + "( 1 , "+value + ");\n");
		makeCode.append("ResultSet rs = stmt.executeQuery();\n");
		makeCode.append("List<"+ tipo.getClass().getSimpleName() +"> minhaLista = new ArrayList<"+ tipo.getClass().getSimpleName() +">();\n");
		makeCode.append("while (rs.next()) {\n");
		makeCode.append(tipo.getClass().getSimpleName() + simpleObjectName+" = new "+ tipo.getClass().getSimpleName() +"();\n");
		for (int i = 0; i < fields.length; i++) {
			makeCode.append("stmt.set" + WriteGettersSetters.firstLetterToUpper(fields[i].getType().getSimpleName()) + "(" + (i + 1) + ", "+simpleObjectName+"."+
					WriteGettersSetters.buildGetMethodName(fields[i].getName()) + "());\n");
			
			if (i == fields.length - 1) {
				makeCode.append("minhaLista.add("+simpleObjectName+ ");\n");
				makeCode.append("}\nstmt.execute();\n" + "stmt.close();\n");
				
			}
			

		}
		makeCode.append("return minhaLista;\n}");
		
		

		return (methodHeader +sql + makeCode.toString());
	}
	
	
	
	

	public static String makeSQLComand(Field[] fields, Object tipo, String tipoComandoSQL) {

		StringBuffer makeCode = new StringBuffer();
		if (tipoComandoSQL.equalsIgnoreCase("insertStatement")) {
			makeCode.append(insertStatement(fields, tipo));
		} 
		else if (tipoComandoSQL.equalsIgnoreCase("alteraStatement")) {
			makeCode.append(alteraStatement(fields, tipo));
		} 
		else if (tipoComandoSQL.equalsIgnoreCase("deleteStatement")) {
			makeCode.append(deleteStatement(fields, tipo));
		}
		else if (tipoComandoSQL.equalsIgnoreCase("selectStatement")) {
			makeCode.append(selectStatement(fields, tipo));
		}

		return makeCode.toString();

	}
	/*
	 * public void remove(JurosSimples js) throws SQLException { String sql =
	 * "delete from JurosSimples where id=?"; PreparedStatement stmt =
	 * conexao.prepareStatement(sql); stmt.setInt(1, js.getId()); stmt.execute();
	 * stmt.close();
	 * 
	 * }
	 */
	/*
	 * public void altera(JurosSimples js) throws SQLException { String sql =
	 * "update JurosSimples set capital=?, taxa=?, periodo=?, montante=?, juros=?, nomeCalculo=?,data=? where id=?"
	 * ; try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
	 * stmt.setDouble(1, js.getCapital()); stmt.setDouble(2, js.getTaxa());
	 * stmt.setDouble(3, js.getPeriodo()); stmt.setDouble(4, js.getMontante());
	 * stmt.setDouble(5, js.getJuros()); stmt.setInt(6, js.getId());
	 * stmt.setString(7, js.getNomeCalculo()); java.sql.Date dataSql = new
	 * java.sql.Date(js.getData().getTime()); stmt.setDate(8, dataSql);// new
	 * java.sql.Date(js.getData().getTime())
	 * 
	 * stmt.executeUpdate(); stmt.close(); JOptionPane.showMessageDialog(null,
	 * "Saindo de alterar()"); } catch (SQLException e) { throw new
	 * RuntimeException(e); }
	 * 
	 * }
	 */
	/*
	 * public void adiciona(JurosCompostos js) throws SQLException{
	 * 
	 * String sql =
	 * "insert into JurosCompostos (capital, taxa, periodo, montante, juros,nomeCalculo,data) "
	 * + "values(?,?,?,?,?,?,?)"; PreparedStatement stmt =
	 * conexao.prepareStatement(sql); stmt.setDouble(1, js.getCapital());
	 * stmt.setDouble(2, js.getTaxa()); stmt.setDouble(3, js.getPeriodo());
	 * stmt.setDouble(4, js.getMontante()); stmt.setDouble(5, js.getJuros());
	 * stmt.setString(6,js.getNomeCalculo()); java.sql.Date dataSql = new
	 * java.sql.Date(js.getData().getTime()); stmt.setDate(7,dataSql);
	 * stmt.execute(); stmt.close();
	 * 
	 * }
	 */

	public static void main(String[] args) {

		String teste = makeSQLComand(MovimentoESS.class.getDeclaredFields(), new MovimentoESS(), "insertStatement");
		System.out.println(teste);
		String teste2 = makeSQLComand(MovimentoESS.class.getDeclaredFields(), new MovimentoESS(), "alteraStatement");
		System.out.println(teste2);
		String teste3 = makeSQLComand(MovimentoESS.class.getDeclaredFields(), new MovimentoESS(), "deleteStatement");
		System.out.println(teste3);
		teste3 = makeSQLComand(MovimentoESS.class.getDeclaredFields(), new MovimentoESS(), "selectStatement");
		System.out.println(teste3);
		teste3 = selectByArgumentStatement(MovimentoESS.class.getDeclaredFields(), new MovimentoESS(),
				new Integer( new MovimentoESS().getCEST()), new Integer(1), "<");
		System.out.println(teste3);

	}

}
