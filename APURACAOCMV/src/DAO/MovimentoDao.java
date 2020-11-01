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

	public void adiciona(MovimentoESS movimentoESS){
		String sql = "INSERT INTO MovimentoESS( serialVersionUID, numColuna, CNPJ, data, historico, codigoMercadoria, descricao, NCM, numNotaFiscal, CFOP, CST_ICMS, quantidadeUnitario, custoUnitario, totalUnitario, vlItem, vlICMS, vlICMSST, CEST, vlCOFINS, vlPIS, quantidadeSaldo, custoSaldo, totalSaldo, objetoFonteInformacao, set, keyValueMap) values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setlong(1, js.getSerialVersionUID());
		stmt.setint(2, js.getNumColuna());
		stmt.setString(3, js.getCNPJ());
		stmt.setCalendar(4, js.getData());
		stmt.setString(5, js.getHistorico());
		stmt.setString(6, js.getCodigoMercadoria());
		stmt.setString(7, js.getDescricao());
		stmt.setString(8, js.getNCM());
		stmt.setint(9, js.getNumNotaFiscal());
		stmt.setString(10, js.getCFOP());
		stmt.setint(11, js.getCST_ICMS());
		stmt.setdouble(12, js.getQuantidadeUnitario());
		stmt.setdouble(13, js.getCustoUnitario());
		stmt.setdouble(14, js.getTotalUnitario());
		stmt.setdouble(15, js.getVlItem());
		stmt.setdouble(16, js.getVlICMS());
		stmt.setdouble(17, js.getVlICMSST());
		stmt.setint(18, js.getCEST());
		stmt.setdouble(19, js.getVlCOFINS());
		stmt.setdouble(20, js.getVlPIS());
		stmt.setdouble(21, js.getQuantidadeSaldo());
		stmt.setdouble(22, js.getCustoSaldo());
		stmt.setdouble(23, js.getTotalSaldo());
		stmt.setObject(24, js.getObjetoFonteInformacao());
		stmt.setSet(25, js.getSet());
		stmt.setMap(26, js.getKeyValueMap());
		stmt.execute();
		stmt.close();
		}

	public void altera(MovimentoESSmovimentoESS){
		String sql = UPDATE MovimentoESS SET  serialVersionUID=?, numColuna=?, CNPJ=?, data=?, historico=?, codigoMercadoria=?, descricao=?, NCM=?, numNotaFiscal=?, CFOP=?, CST_ICMS=?, quantidadeUnitario=?, custoUnitario=?, totalUnitario=?, vlItem=?, vlICMS=?, vlICMSST=?, CEST=?, vlCOFINS=?, vlPIS=?, quantidadeSaldo=?, custoSaldo=?, totalSaldo=?, objetoFonteInformacao=?, set=?, keyValueMap=?  where id=?;
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setlong(1, js.getSerialVersionUID());
		stmt.setint(2, js.getNumColuna());
		stmt.setString(3, js.getCNPJ());
		stmt.setCalendar(4, js.getData());
		stmt.setString(5, js.getHistorico());
		stmt.setString(6, js.getCodigoMercadoria());
		stmt.setString(7, js.getDescricao());
		stmt.setString(8, js.getNCM());
		stmt.setint(9, js.getNumNotaFiscal());
		stmt.setString(10, js.getCFOP());
		stmt.setint(11, js.getCST_ICMS());
		stmt.setdouble(12, js.getQuantidadeUnitario());
		stmt.setdouble(13, js.getCustoUnitario());
		stmt.setdouble(14, js.getTotalUnitario());
		stmt.setdouble(15, js.getVlItem());
		stmt.setdouble(16, js.getVlICMS());
		stmt.setdouble(17, js.getVlICMSST());
		stmt.setint(18, js.getCEST());
		stmt.setdouble(19, js.getVlCOFINS());
		stmt.setdouble(20, js.getVlPIS());
		stmt.setdouble(21, js.getQuantidadeSaldo());
		stmt.setdouble(22, js.getCustoSaldo());
		stmt.setdouble(23, js.getTotalSaldo());
		stmt.setObject(24, js.getObjetoFonteInformacao());
		stmt.setSet(25, js.getSet());
		stmt.setMap(26, js.getKeyValueMap());
		stmt.executeUpdate();
		stmt.close();
		}

	public void delete(MovimentoESSmovimentoESS){
		String sql = DELETE FROM MovimentoESS WHERE id=?;
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setInt(1, js.getId());
		stmt.executeUpdate();
		stmt.close();

		String sql = SELECT *FROM MovimentoESS;
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		List<MovimentoESS> minhaLista = new ArrayList<MovimentoESS>();
		while (rs.next()) {
		MovimentoESS js = new MovimentoESS();
		stmt.setlong(1, js.getSerialVersionUID());
		stmt.setint(2, js.getNumColuna());
		stmt.setString(3, js.getCNPJ());
		stmt.setCalendar(4, js.getData());
		stmt.setString(5, js.getHistorico());
		stmt.setString(6, js.getCodigoMercadoria());
		stmt.setString(7, js.getDescricao());
		stmt.setString(8, js.getNCM());
		stmt.setint(9, js.getNumNotaFiscal());
		stmt.setString(10, js.getCFOP());
		stmt.setint(11, js.getCST_ICMS());
		stmt.setdouble(12, js.getQuantidadeUnitario());
		stmt.setdouble(13, js.getCustoUnitario());
		stmt.setdouble(14, js.getTotalUnitario());
		stmt.setdouble(15, js.getVlItem());
		stmt.setdouble(16, js.getVlICMS());
		stmt.setdouble(17, js.getVlICMSST());
		stmt.setint(18, js.getCEST());
		stmt.setdouble(19, js.getVlCOFINS());
		stmt.setdouble(20, js.getVlPIS());
		stmt.setdouble(21, js.getQuantidadeSaldo());
		stmt.setdouble(22, js.getCustoSaldo());
		stmt.setdouble(23, js.getTotalSaldo());
		stmt.setObject(24, js.getObjetoFonteInformacao());
		stmt.setSet(25, js.getSet());
		stmt.setMap(26, js.getKeyValueMap());
		minhaLista.add(js);
		}
		stmt.execute();
		stmt.close();
		return minhaLista;
		}


}