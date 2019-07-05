/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import Crime.Dominio.Crime;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Harrison Sanches
 */
public class CrimeBD implements InterfaceBD{
    
    
//   Tá inserindo no banco. ta Ok!
    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        Crime novo = (Crime) obj;
        
        stmt = c.prepareStatement("INSERT INTO CRIMEBASE" + "(id, data, hora, tipo_crime, sexo, idade, cidade, bairro, rua)" + "values(?,?,?,?,?,?,?,?,?)");
        stmt.setInt(1, novo.getId());
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            java.sql.Date data = new java.sql.Date(format.parse(novo.getData()).getTime());
            stmt.setDate(2,data);
        } catch (ParseException ex) {
            Logger.getLogger(CrimeBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        stmt.setString(3, novo.getHora());
        stmt.setString(4, novo.getTipo_Crime());
        stmt.setString(5, novo.getSexo());
        stmt.setInt(6, novo.getIdade());
        stmt.setString(7, novo.getCidade());
        stmt.setString(8, novo.getBairro());
        stmt.setString(9, novo.getRua());
       
        stmt.execute();
        
        stmt.close();
        c.close();
    }

    
    //conversar sobre o que retornar aqui (resolvido)
    @Override
    public ArrayList select(String condicao) throws SQLException {
        return null;   
    }
    
    // deletando ok!;
    @Override
    public void delete(int id) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        PreparedStatement stmt;
        
        stmt = c.prepareStatement("DELETE FROM CRIMEBASE where ID= ? ;");
        
        stmt.setInt(1, id);
        
        stmt.execute();
        
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException {
        Connection c;
        PreparedStatement stmt;
        c = ConexaoBD.getInstance();
        
        Crime  novo = (Crime)obj;
        stmt = c.prepareStatement("UPDATE CRIMEBASE SET data = ?, hora = ?, tipo_crime = ?, sexo = ?, idade = ?, cidade = ? , bairro = ?, rua = ? WHERE (id = ?)");
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            java.sql.Date data = new java.sql.Date(format.parse(novo.getData()).getTime());
            stmt.setDate(1,data);
        } catch (ParseException ex) {
            Logger.getLogger(CrimeBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        stmt.setString(2, novo.getHora());
        stmt.setString(3, novo.getTipo_Crime());
        stmt.setString(4, novo.getSexo());
        stmt.setInt(5, novo.getIdade());
        stmt.setString(6, novo.getCidade());
        stmt.setString(7, novo.getBairro());
        stmt.setString(8, novo.getRua());
        stmt.setInt(9, novo.getId());
       
        stmt.execute();
        
        stmt.close();
        c.close();
    }
       
    
        @Override
        public int quantidade(Object Object) throws SQLException {
        Crime novo = (Crime) Object;
        int quantidade_teste = 0;
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        stmt = c.prepareStatement("SELECT count(*) as quantidade " +
            "FROM crimebase where rua = ?");
        
        stmt.setString(1, novo.getRua());
        
       
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            quantidade_teste = rs.getInt("quantidade");
        }
        
        rs.close();
        stmt.close();

       return quantidade_teste;
    }
    
}