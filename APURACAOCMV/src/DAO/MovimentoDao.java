package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.JurosSimples;
import modelFCE.MovimentoESS;

public class MovimentoDao {

	private static Connection conexao;

	public MovimentoDao() throws SQLException {
		this.conexao = ConnectionFactory.getConexao(new String[] { "jdbc:sqlite:sample.db",null, null });
	}

	public void createTable() {
		String tabelaCriada = "CREATE TABLE IF NOT EXISTS sample.MovimentoESS(" + "id Integer PRIMARY KEY,"
				+ "CNPJ VARCHAR," + "data Date," + "historico VARCHAR," + "codigoMercadoria VARCHAR,"
				+ "descricao VARCHAR," + "NCM VARCHAR," + "numNotaFiscal INTEGER," + "CFOP VARCHAR,"
				+ "CST_ICMS INTEGER," + "quantidadeUnitario DOUBLE," + "custoUnitario DOUBLE," + "totalUnitario DOUBLE,"
				+ "vlItem DOUBLE," + "vlICMS DOUBLE," + "vlICMSST DOUBLE," + "CEST INTEGER," + "vlCOFINS DOUBLE,"
				+ "vlPIS DOUBLE," + "quantidadeSaldo DOUBLE," + "custoSaldo DOUBLE," + "totalSaldo DOUBLE" + ");";
	}
	public void adiciona(MovimentoESS	movimentoESS) throws SQLException{
		String sql = "INSERT INTO MovimentoESS ( CNPJ, data, historico, codigoMercadoria, descricao, NCM, numNotaFiscal, CFOP, CST_ICMS, quantidadeUnitario, custoUnitario, totalUnitario, vlItem, vlICMS, vlICMSST, CEST, vlCOFINS, vlPIS, quantidadeSaldo, custoSaldo, totalSaldo) values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, movimentoESS.getCNPJ());
		stmt.setDate(2,new java.sql.Date(1) , movimentoESS.getData());
		stmt.setString(3, movimentoESS.getHistorico());
		stmt.setString(4, movimentoESS.getCodigoMercadoria());
		stmt.setString(5, movimentoESS.getDescricao());
		stmt.setString(6, movimentoESS.getNCM());
		stmt.setInt(7, movimentoESS.getNumNotaFiscal());
		stmt.setString(8, movimentoESS.getCFOP());
		stmt.setInt(9, movimentoESS.getCST_ICMS());
		stmt.setDouble(10, movimentoESS.getQuantidadeUnitario());
		stmt.setDouble(11, movimentoESS.getCustoUnitario());
		stmt.setDouble(12, movimentoESS.getTotalUnitario());
		stmt.setDouble(13, movimentoESS.getVlItem());
		stmt.setDouble(14, movimentoESS.getVlICMS());
		stmt.setDouble(15, movimentoESS.getVlICMSST());
		stmt.setInt(16, movimentoESS.getCEST());
		stmt.setDouble(17, movimentoESS.getVlCOFINS());
		stmt.setDouble(18, movimentoESS.getVlPIS());
		stmt.setDouble(19, movimentoESS.getQuantidadeSaldo());
		stmt.setDouble(20, movimentoESS.getCustoSaldo());
		stmt.setDouble(21, movimentoESS.getTotalSaldo());
		stmt.execute();
		stmt.close();
	}
	
	public void altera(MovimentoESS	movimentoESS) throws SQLException{
		String sql = "UPDATE MovimentoESS SET  CNPJ=?, data=?, historico=?, codigoMercadoria=?, descricao=?, NCM=?, numNotaFiscal=?, CFOP=?, CST_ICMS=?, quantidadeUnitario=?, custoUnitario=?, totalUnitario=?, vlItem=?, vlICMS=?, vlICMSST=?, CEST=?, vlCOFINS=?, vlPIS=?, quantidadeSaldo=?, custoSaldo=?, totalSaldo=?, objetoFonteInformacao=?, set=?, keyValueMap=?  where id=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setString(1, movimentoESS.getCNPJ());
		stmt.setDate(2,  new java.sql.Date(1), movimentoESS.getData());
		stmt.setString(3, movimentoESS.getHistorico());
		stmt.setString(4, movimentoESS.getCodigoMercadoria());
		stmt.setString(5, movimentoESS.getDescricao());
		stmt.setString(6, movimentoESS.getNCM());
		stmt.setInt(7, movimentoESS.getNumNotaFiscal());
		stmt.setString(8, movimentoESS.getCFOP());
		stmt.setInt(9, movimentoESS.getCST_ICMS());
		stmt.setDouble(10, movimentoESS.getQuantidadeUnitario());
		stmt.setDouble(11, movimentoESS.getCustoUnitario());
		stmt.setDouble(12, movimentoESS.getTotalUnitario());
		stmt.setDouble(13, movimentoESS.getVlItem());
		stmt.setDouble(14, movimentoESS.getVlICMS());
		stmt.setDouble(15, movimentoESS.getVlICMSST());
		stmt.setInt(16, movimentoESS.getCEST());
		stmt.setDouble(17, movimentoESS.getVlCOFINS());
		stmt.setDouble(18, movimentoESS.getVlPIS());
		stmt.setDouble(19, movimentoESS.getQuantidadeSaldo());
		stmt.setDouble(20, movimentoESS.getCustoSaldo());
		stmt.setDouble(21, movimentoESS.getTotalSaldo());
		
		stmt.executeUpdate();
		stmt.close();
		
	}
		
	public void delete(MovimentoESS movimentoESS) throws SQLException{
		String sql = "DELETE FROM MovimentoESS WHERE id=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setInt(1, movimentoESS.getId());
		stmt.executeUpdate();
		stmt.close();
	}
	
	
	public List<MovimentoESS> select() throws SQLException {
		String sql = "SELECT *FROM MovimentoESS";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		List<MovimentoESS> minhaLista = new ArrayList<MovimentoESS>();
		while (rs.next()) {
			MovimentoESS movimentoESS = new MovimentoESS();
			stmt.setString(1, movimentoESS.getCNPJ());
			stmt.setDate(2,new java.sql.Date(1), movimentoESS.getData());
			stmt.setString(3, movimentoESS.getHistorico());
			stmt.setString(4, movimentoESS.getCodigoMercadoria());
			stmt.setString(5, movimentoESS.getDescricao());
			stmt.setString(6, movimentoESS.getNCM());
			stmt.setInt(7, movimentoESS.getNumNotaFiscal());
			stmt.setString(8, movimentoESS.getCFOP());
			stmt.setInt(9, movimentoESS.getCST_ICMS());
			stmt.setDouble(10, movimentoESS.getQuantidadeUnitario());
			stmt.setDouble(11, movimentoESS.getCustoUnitario());
			stmt.setDouble(12, movimentoESS.getTotalUnitario());
			stmt.setDouble(13, movimentoESS.getVlItem());
			stmt.setDouble(14, movimentoESS.getVlICMS());
			stmt.setDouble(15, movimentoESS.getVlICMSST());
			stmt.setInt(16, movimentoESS.getCEST());
			stmt.setDouble(17, movimentoESS.getVlCOFINS());
			stmt.setDouble(18, movimentoESS.getVlPIS());
			stmt.setDouble(19, movimentoESS.getQuantidadeSaldo());
			stmt.setDouble(20, movimentoESS.getCustoSaldo());
			stmt.setDouble(21, movimentoESS.getTotalSaldo());
			
			minhaLista.add(movimentoESS);
	}
	stmt.execute();
	stmt.close();
	return minhaLista;
	}
	
	
	
	
	/*
		
		public <ListMovimentoESS> getListaPorArgumento(Integer 0,class java.lang.Integer 1 ,"<"){
			String sql = "SELECT *FROM MovimentoESS WHERE 0 < ?";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setclass java.lang.Integer( 1 , 1);
			ResultSet rs = stmt.executeQuery();
			List<MovimentoESS> minhaLista = new ArrayList<MovimentoESS>();
			while (rs.next()) {
			MovimentoESSmovimentoESS = new MovimentoESS();
			stmt.setString(1, movimentoESS.getCNPJ());
			stmt.setCalendar(2, movimentoESS.getData());
			stmt.setString(3, movimentoESS.getHistorico());
			stmt.setString(4, movimentoESS.getCodigoMercadoria());
			stmt.setString(5, movimentoESS.getDescricao());
			stmt.setString(6, movimentoESS.getNCM());
			stmt.setInt(7, movimentoESS.getNumNotaFiscal());
			stmt.setString(8, movimentoESS.getCFOP());
			stmt.setInt(9, movimentoESS.getCST_ICMS());
			stmt.setDouble(10, movimentoESS.getQuantidadeUnitario());
			stmt.setDouble(11, movimentoESS.getCustoUnitario());
			stmt.setDouble(12, movimentoESS.getTotalUnitario());
			stmt.setDouble(13, movimentoESS.getVlItem());
			stmt.setDouble(14, movimentoESS.getVlICMS());
			stmt.setDouble(15, movimentoESS.getVlICMSST());
			stmt.setInt(16, movimentoESS.getCEST());
			stmt.setDouble(17, movimentoESS.getVlCOFINS());
			stmt.setDouble(18, movimentoESS.getVlPIS());
			stmt.setDouble(19, movimentoESS.getQuantidadeSaldo());
			stmt.setDouble(20, movimentoESS.getCustoSaldo());
			stmt.setDouble(21, movimentoESS.getTotalSaldo());
			stmt.setObject(22, movimentoESS.getObjetoFonteInformacao());
			stmt.setSet(23, movimentoESS.getSet());
			stmt.setMap(24, movimentoESS.getKeyValueMap());
			minhaLista.add(movimentoESS);
			}
			stmt.execute();
			stmt.close();
			return minhaLista;
		}
*/

}