/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Aroldo
 */
public interface InterfaceBD {
    public ArrayList select(String condicao) throws SQLException;
    public void insert(Object obj) throws SQLException;
    public void delete(int id) throws SQLException;
    public void update(Object obj) throws SQLException;
    
    public int quantidade(Object obj)  throws SQLException;
}
