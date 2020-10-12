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


public MovimentoDao()throws SQLException{
       this.conexao = ConnectionFactory.getConexao(new String[]{"jdbc:sqlite:sample.db"});
}

 public void adiciona(MovimentoESS js) throws SQLException{     
	 String CNPJ;

	Calendar data;
	String historico;

	String codigoMercadoria;

	String descricao;

	String NCM;

	int numNotaFiscal;

	String CFOP;

	int CST_ICMS;

	double quantidadeUnitario;

	double custoUnitario;

	double totalUnitario;

	double vlItem;

	double vlICMS;

	double vlICMSST;

	int CEST;

	double vlCOFINS;

	double vlPIS;

	// Saldo saldo = new Saldo();

	double quantidadeSaldo;
	double custoSaldo;
	double totalSaldo;  
 
 
 
 
   String sql = "insert into FCEBasica (capital, taxa, periodo, montante, juros,nomeCalculo,data) " + "values(?,?,?,?,?,?,?)";
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
 /*where capital like ?"*/ 
 public List<JurosSimples> getLista() throws SQLException{
       String sql = "select *from JurosSimples"; 
       try{
       PreparedStatement stmt = this.conexao.prepareStatement(sql);
       
       ResultSet rs = stmt.executeQuery();        
       List<JurosSimples> minhaLista = new ArrayList<JurosSimples>();       
              
     
       
       while(rs.next()){
           JurosSimples js = new JurosSimples(); 
           js.setId(Integer.valueOf(rs.getString("id")));
           js.setNomeCalculo(rs.getString("nomeCalculo"));
           js.setCapital(Double.valueOf(rs.getString("capital")));
           js.setTaxa(Double.valueOf(rs.getString("taxa")));
           js.setPeriodo(Double.valueOf(rs.getString("periodo")));
           js.setMontante(Double.valueOf(rs.getString("montante")));
           js.setJuros(Double.valueOf(rs.getString("juros")));
           
           java.sql.Date dataSql = rs.getDate("data");
           //System.out.println("Nome"+rs.getDate("data"));
           if(rs.getDate("data")==null){
              js.setData(null);
           }else{
               
           java.util.Date dataUtil = new java.util.Date(dataSql.getTime());
           js.setData(dataUtil);
           }
                      
           minhaLista.add(js);
           
           }
       rs.close();
       stmt.close();
       
       /*for(int i = 0;i<minhaLista.size();i++){
           System.out.println("Nome"+minhaLista.get(i).);
       }*/
       
       return minhaLista;
       }catch(SQLException e){
          throw new RuntimeException(e);
      }        
       
   }
   public void altera(JurosSimples js) throws SQLException{
      String sql = "update JurosSimples set capital=?, taxa=?, periodo=?, montante=?, juros=?, nomeCalculo=?,data=? where id=?";
    try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
        stmt.setDouble(1, js.getCapital());
        stmt.setDouble(2, js.getTaxa());
        stmt.setDouble(3, js.getPeriodo());
        stmt.setDouble(4, js.getMontante());
        stmt.setDouble(5, js.getJuros());
        stmt.setInt(6, js.getId());
        stmt.setString(7, js.getNomeCalculo());
        java.sql.Date dataSql = new java.sql.Date(js.getData().getTime());
        stmt.setDate(8,dataSql);//new java.sql.Date(js.getData().getTime())
        
             
       
        
        stmt.executeUpdate();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Saindo de alterar()");
    }catch(SQLException e){
          throw new RuntimeException(e);
      }
         
       
       }
       
    public void altera2(JurosSimples js) {
      String sql = "UPDATE JurosSimples set capital=?, taxa=?,"+
      "periodo=?, montante=?, juros=?, nomeCalculo=?, data=? where id=?";
    
      //, periodo=1, montante=1, juros=100000,
      /*stmt.setDouble(3, js.getPeriodo());
        stmt.setDouble(4, js.getMontante());
        stmt.setDouble(5, js.getJuros());
        stmt.setInt(6, js.getId());
       stmt.setDate(8, null);  
      
      */
      JOptionPane.showMessageDialog(null, "id: "+String.valueOf(js.getId())+String.valueOf(js.getData()));
      try{
      PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setDouble(1, js.getCapital());
        stmt.setDouble(2, js.getTaxa());
        stmt.setDouble(3, js.getPeriodo());
        stmt.setDouble(4, js.getMontante());
        stmt.setDouble(5, js.getJuros());
        stmt.setString(6, js.getNomeCalculo());
        java.sql.Date dataSql = new java.sql.Date(js.getData().getTime());//
        stmt.setDate(7,dataSql);
        
        stmt.setInt(8, js.getId());
       
        stmt.execute();
        
        stmt.close();
       
       //new java.sql.Date(js.getData().getTime()
       /* 
        JOptionPane.showMessageDialog(null, "Antes de stmt execute");
        
        
        //
        JOptionPane.showMessageDialog(null, "Saindo de alterar2()");*/
     
      }catch(SQLException e){
          throw new RuntimeException(e);
      }
         
       
       }
    
    public List getLista(String nome) {
       String sql = "select *from JurosSimples where nomeCalculo like ?";
       try{
       PreparedStatement stmt = this.conexao.prepareStatement(sql);
       stmt.setString(1, nome);
       ResultSet rs = stmt.executeQuery();
       List<JurosSimples> minhaLista = new ArrayList<>();       
         
       
      
       while(rs.next()){
           JurosSimples js = new JurosSimples();  
           js.setId(Integer.valueOf(rs.getString("id")));
           js.setNomeCalculo(rs.getString("nomeCalculo"));
           js.setCapital(Double.valueOf(rs.getString("capital")));
           js.setTaxa(Double.valueOf(rs.getString("taxa")));
           js.setPeriodo(Double.valueOf(rs.getString("periodo")));
           js.setMontante(Double.valueOf(rs.getString("montante")));
           js.setJuros(Double.valueOf(rs.getString("juros")));
           java.sql.Date dataSql = rs.getDate("data");
           
           if(rs.getDate("data")==null){
              js.setData(null);
           }else{
               
           java.util.Date dataUtil = new java.util.Date(dataSql.getTime());
           js.setData(dataUtil);
           }
           
           minhaLista.add(js);
           
       }
       rs.close();
       stmt.close();
       
       return minhaLista;
       }catch(SQLException e){
          throw new RuntimeException(e);
      }
       
   }
   
    public List getListaPorArgumento(Double pValor,String escolha, String operador) {
     
       String sql=  "select *from JurosSimples where " +" " +escolha +" " +operador +" "+ "?";
       JOptionPane.showMessageDialog(null, sql);
       try{
       PreparedStatement stmt = this.conexao.prepareStatement(sql);
       stmt.setDouble(1, pValor);
       ResultSet rs = stmt.executeQuery();
       List<JurosSimples> minhaLista = new ArrayList<>();       
          
       
     
       while(rs.next()){ 
           JurosSimples js = new JurosSimples(); 
           js.setId(Integer.valueOf(rs.getString("id")));
           js.setNomeCalculo(rs.getString("nomeCalculo"));
           js.setCapital(Double.valueOf(rs.getString("capital")));
           js.setTaxa(Double.valueOf(rs.getString("taxa")));
           js.setPeriodo(Double.valueOf(rs.getString("periodo")));
           js.setMontante(Double.valueOf(rs.getString("montante")));
           js.setJuros(Double.valueOf(rs.getString("juros")));
           java.sql.Date dataSql = rs.getDate("data");
           
           if(rs.getDate("data")==null){
              js.setData(null);
           }else{
               
           java.util.Date dataUtil = new java.util.Date(dataSql.getTime());
           js.setData(dataUtil);
           }
           
           minhaLista.add(js);
           
       }
       
       rs.close();
       stmt.close();
       return minhaLista;
       }catch(SQLException e){
          throw new RuntimeException(e);
      }
       
   } //PAREI AQUI: PARAMETRIZAR OS DEMAIS METODOS
   public List getListaPorData(Date pValor, String operador) {
       String parametro ="data";
       String sql=  "select *from JurosSimples where " +parametro +" " +operador +" "+ "?";
       JOptionPane.showMessageDialog(null, sql);
       try{
       PreparedStatement stmt = this.conexao.prepareStatement(sql);
       stmt.setDate(1, pValor);
       ResultSet rs = stmt.executeQuery();
       List<JurosSimples> minhaLista = new ArrayList<>();       
              
       
       while(rs.next()){
           JurosSimples js = new JurosSimples();   
           js.setId(Integer.valueOf(rs.getString("id")));
           js.setNomeCalculo(rs.getString("nomeCalculo"));
           js.setCapital(Double.valueOf(rs.getString("capital")));
           js.setTaxa(Double.valueOf(rs.getString("taxa")));
           js.setPeriodo(Double.valueOf(rs.getString("periodo")));
           js.setMontante(Double.valueOf(rs.getString("montante")));
           js.setJuros(Double.valueOf(rs.getString("juros")));
           java.sql.Date dataSql = rs.getDate("data");
           
           if(rs.getDate("data")==null){
              js.setData(null);
           }else{
               
           java.util.Date dataUtil = new java.util.Date(dataSql.getTime());
           js.setData(dataUtil);
           }
           
           minhaLista.add(js);
           
       }
       rs.close();
       stmt.close();
       return minhaLista;
       }catch(SQLException e){
          throw new RuntimeException(e);
      }
       
   } 
     
   
   public void remove(JurosSimples js) throws SQLException{
       String sql = "delete from JurosSimples where id=?";
       PreparedStatement stmt = conexao.prepareStatement(sql);
       stmt.setInt(1, js.getId());
       stmt.execute();
       stmt.close(); 
       
       
   }
	

}
