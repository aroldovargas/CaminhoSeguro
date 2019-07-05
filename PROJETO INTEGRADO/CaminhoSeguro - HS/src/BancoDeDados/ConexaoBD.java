/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 */
public class ConexaoBD {
    private static Connection instance = null;        
    
    public static synchronized Connection getInstance() {
            try {
                Connection c;
                 String USUARIO = "postgres";
                 String SENHA = "1234";
                 String URL = "jdbc:postgresql://localhost:5432/caminho_seguro";      
                c =  DriverManager.getConnection(URL, USUARIO, SENHA);
                c.setAutoCommit(true);
                instance = c;
                System.out.println("Banco Conectado!");
            } catch (SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        
        return instance;
    }
    
} 
