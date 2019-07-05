/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import usuario.dominio.Usuario;

/**
 *
 * @author Emanuel
 */
public class UsuarioBD implements InterfaceBD {
    
    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        Usuario usuario = (Usuario) obj;
        
        stmt = c.prepareStatement("INSERT INTO USUARIO" + "(nome, email, login, senha, cpf,idade,sexo)" + "values(?,?,?,?,?,?,?)");
        
//        stmt.setInt(1, usuario.getId_usuario());
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getLogin());
        stmt.setString(4, usuario.getSenha());
        stmt.setLong(5, usuario.getCpf());
        stmt.setInt(6, usuario.getIdade());
        stmt.setString(7, usuario.getSexo());
       
        stmt.execute();
        
        stmt.close();
        c.close();              

    }
    
    
    @Override
    public ArrayList select(String condicao) throws SQLException  {
                
        ArrayList listUsuario;
        listUsuario = new ArrayList();
        
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        stmt = c.prepareStatement("SELECT * FROM USUARIO WHERE LOGIN = ? ;");
        
        stmt.setString(1, condicao);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {

            Usuario usuario = new Usuario();
            
            try {
                usuario.setId_usuario(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));           
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setIdade(rs.getString("idade"));
                usuario.setSexo(rs.getString("sexo"));

                
            } catch (Exception ex) {
                Logger.getLogger(EnderecoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            listUsuario.add(usuario);
        }
        rs.close();
        stmt.close();
        c.close();
        
        return listUsuario;
    }

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
        Usuario usuario = (Usuario) obj;
        
        Usuario  novo = (Usuario)obj;
        
        stmt = c.prepareStatement("UPDATE USUARIO SET nome = ?, email = ?, login = ?, senha = ?, cpf = ?, idade = ? , sexo = ? WHERE (id = ?)");
        stmt.setString(1, usuario.getNome());
//        stmt.setString(3, usuario.getSexo());
//        stmt.setInt(3, usuario.getIdade());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getLogin());
        stmt.setString(4, usuario.getSenha());
        stmt.setLong(5, usuario.getCpf());
        stmt.setInt(6, usuario.getIdade());
        stmt.setString(7, usuario.getSexo());
        stmt.setInt(8, usuario.getId_usuario());
       
        stmt.execute();
        
        stmt.close();
        c.close();              
    }
    
    //preciso ver se vai querer fazer alguma contagem com usuario
    @Override
    public int quantidade(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}