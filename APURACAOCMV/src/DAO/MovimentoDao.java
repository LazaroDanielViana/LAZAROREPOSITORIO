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

	private Connection conexao;

	public MovimentoDao() throws SQLException {
		this.conexao = ConnectionFactory.getConexao(new String[] { "jdbc:sqlite:sample.db" });
	}
	public void createTable(){
	String sql= "CREATE TABLE IF NOT EXISTS sample.MovimentoESS(id Integer PRIMARY KEY,	CNPJ String,Date data,"+
				+"historico String,	codigoMercadoria String,descricao String,NCM String,numNotaFiscal int,CFOP String,
				CST_ICMS int,
				quantidadeUnitario double,
				custoUnitario double,
				totalUnitario double,
				vlItem double,
				vlICMS double,
				vlICMSST double,
				CEST int,
				vlCOFINS double,
				vlPIS double,
				quantidadeSaldo double,
				custoSaldo double,
				totalSaldo double,
				objetoFonteInformacao Object,
				set Set,
				keyValueMap Map,

				);
				}

	
	
	

	public void adiciona(MovimentoESS	movimentoESS) throws SQLException{
		String sql = "INSERT INTO MovimentoESS( CNPJ, data, historico, codigoMercadoria, descricao, NCM, numNotaFiscal, CFOP, CST_ICMS, quantidadeUnitario, custoUnitario, totalUnitario, vlItem, vlICMS, vlICMSST, CEST, vlCOFINS, vlPIS, quantidadeSaldo, custoSaldo, totalSaldo, objetoFonteInformacao, set, keyValueMap) values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, movimentoESS.getCNPJ());
		//stmt.setCalendar(2, movimentoESS.getData());
		//Date dateSQL = new java.sql.Date(1);
		stmt.setDate(2, new java.sql.Date(1), movimentoESS.getData());
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
		//stmt.setObject(22, movimentoESS.getObjetoFonteInformacao());
		//stmt.setSet(23, movimentoESS.getSet());
		//stmt.setMap(24, movimentoESS.getKeyValueMap());
		stmt.execute();
		stmt.close();
		}

}