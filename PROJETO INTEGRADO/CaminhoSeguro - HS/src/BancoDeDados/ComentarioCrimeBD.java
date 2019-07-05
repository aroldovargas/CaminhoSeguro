/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import ComentarioCrime.dominio.ComentarioCrime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author harri
 */
public class ComentarioCrimeBD implements InterfaceBD{

//    @Override
//    public Object select(Object obj) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//falta add o id do Comentario...
@Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        PreparedStatement stmt; //criacao - preparacao
        c = ConexaoBD.getInstance(); //conexao com o banco
        ComentarioCrime comentario = (ComentarioCrime) obj;

        stmt = c.prepareStatement("INSERT INTO COMENTARIO" + "(comentario_usuario, id_usuario, id_tipo_comentario)" + "values(?,?,?)");

        stmt.setString(1, comentario.getComentario());
        //stmt.setString(2, comentario.getId_usuario());
        //Obs: retirando o comentário acima o código fica com erro, está sendo informado que não é possível converter Usuario para String. 
        // o erro só é corrigido caso o atributo id_usuario da classe Comentario seja modificado para int em vez de ser um atributo do tipo Usuario.
        stmt.setString(3, "2");



        stmt.execute();

        stmt.close();
        c.close();



    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int quantidade(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList select(String condicao) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
