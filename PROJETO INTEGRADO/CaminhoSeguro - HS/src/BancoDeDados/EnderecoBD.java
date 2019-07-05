/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import Crime.Dominio.Crime;
import Endereco.dominio.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aroldo
 */
public class EnderecoBD implements InterfaceBD{

    public ArrayList select(String condicao) throws SQLException {
        String[] lst = condicao.split("&");
                
        ArrayList listCrime = new ArrayList();
        
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        stmt = c.prepareStatement("SELECT * FROM CRIMEBASE WHERE RUA = ? AND BAIRRO = ? AND CIDADE = ? ;");
        
        stmt.setString(1, lst[0]);
        stmt.setString(2, lst[1]);
        stmt.setString(3, lst[2]);  
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {

            Crime crime = new Crime();
            
            try {
                crime.setId(rs.getString("id"));
                crime.setRua(rs.getString("rua"));
                crime.setBairro(rs.getString("bairro"));
                crime.setCidade(rs.getString("cidade"));           
                crime.setTipo_Crime(rs.getString("tipo_Crime"));
                crime.setData(rs.getString("data"));
                crime.setHora(rs.getString("hora"));
       
                
            } catch (Exception ex) {
                Logger.getLogger(EnderecoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            listCrime.add(crime);
        }
        rs.close();
        stmt.close();
        c.close();
        
        return listCrime;
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Endereco novo = (Endereco)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO endereco(rua, bairro, cidade, classificacao, descricao, quantidade) VALUES('"
                + novo.getNomeRua()+"','" + novo.getNomeBairro()+ "'," + novo.getNomeCidade()+ ",'"
                + novo.getClassificacao()+ "','"+ novo.getDescricao() + "','" + novo.getQuantCrimes()+"') RETURNING id");
        if(rs.next()){
            novo.setIdEndereco(rs.getInt(1));
        }
        rs.close();
        stmt.close();
        c.close();
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE FROM endereco WHERE ID=" + id + ";";
        
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Endereco novo = (Endereco)obj;
        String sql =  "UPDATE endereco "
                + "SET rua ="+ novo.getNomeRua() + ", "
                + "bairro="+ novo.getNomeBairro() + ", "
                + "cidade="+ novo.getNomeCidade() + ", "
                + "classificacao="+ novo.getClassificacao() + ", "
                + "descricao="+ novo.getDescricao() + ", "
                + "quantidade="+ novo.getQuantCrimes() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

//    @Override
//    public Object select(Object obj) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int quantidade(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}