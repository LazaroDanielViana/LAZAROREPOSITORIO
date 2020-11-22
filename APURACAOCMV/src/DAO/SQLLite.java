package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLLite {
	static Connection connection = null;
	
	
	public static void main(String[] args) throws SQLException {
		testaSQLLite();
	}

	public static void testaSQLLite() throws SQLException {
		
		try {
			// create a database connection
			/*connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.*/
			String sqlTabela = "CREATE TABLE IF NOT EXISTS MovimentoESS("
					+ "id Integer PRIMARY KEY,"
					+"CNPJ VARCHAR,"
					+ "data Date,"
					+"historico VARCHAR,"
					+"codigoMercadoria VARCHAR,"
					+"descricao VARCHAR,"
					+"NCM VARCHAR,"
					+"numNotaFiscal INTEGER,"
					+"CFOP VARCHAR,"
					+"CST_ICMS INTEGER,"
					+"quantidadeUnitario DOUBLE,"
					+"custoUnitario DOUBLE,"
					+"totalUnitario DOUBLE,"
					+"vlItem DOUBLE,"
					+"vlICMS DOUBLE,"
					+"vlICMSST DOUBLE,"
					+"CEST INTEGER,"
					+"vlCOFINS DOUBLE,"
					+"vlPIS DOUBLE,"
					+"quantidadeSaldo DOUBLE,"
					+"custoSaldo DOUBLE,"
					+"totalSaldo DOUBLE"
					+");";
			createTable( sqlTabela);
			
			/*statement.executeUpdate("drop table if exists person");
			statement.executeUpdate("create table person (id integer, name string)");
			statement.executeUpdate("insert into person values(1, 'leo')");
			statement.executeUpdate("insert into person values(2, 'yui')");
			ResultSet rs = statement.executeQuery("select * from person");
			while (rs.next()) {
				// read the result set
				System.out.println("name = " + rs.getString("name"));
				System.out.println("id = " + rs.getInt("id"));
			}*/
		}
		finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
	}
	
	public static void createTable(String stringTabela) throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		statement.setQueryTimeout(30); // set timeout to 30 sec.
		try {
			statement.executeUpdate(stringTabela);
			statement.execute(".tables");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
