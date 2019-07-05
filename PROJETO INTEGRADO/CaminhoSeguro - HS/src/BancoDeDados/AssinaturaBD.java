/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import Assinatura.dominio.Assinatura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aroldo
 */
public class AssinaturaBD {
    public ArrayList select(String condicao) throws SQLException {
        String[] lst = condicao.split("&");
                
        ArrayList listAssinatura = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("QUERY");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Assinatura assinatura = new Assinatura();

            
            try {
                assinatura.setIdAssinatura(rs.getInt("id"));
               
                assinatura.setId_usuario(rs.getInt("usuario"));
                assinatura.setStatus(rs.getString("status"));
                assinatura.setFormaPagamento(rs.getString("forma_pagto"));                         
                assinatura.setValor(rs.getDouble("valor"));
                assinatura.setDataInicio(rs.getDate("data_inic"));
                
                
            } catch (Exception ex) {
                Logger.getLogger(EnderecoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            listAssinatura.add(assinatura);
        }
        rs.close();
        stmt.close();
        c.close();
        
        return listAssinatura;
    }

    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Assinatura novo = (Assinatura)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO ENDERECO() values();");
        if(rs.next()){
            novo.setIdAssinatura(rs.getInt(1));
        }
        rs.close();
        stmt.close();
        c.close();
    }

    public void delete(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE FROM ENDERECO where ID=" + id + ";";
        
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
    public void update(Object obj) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Assinatura novo = (Assinatura)obj;
        String sql = "UPDATE ENDERECO "
                + "WHERE id ="+ novo.getIdAssinatura() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}