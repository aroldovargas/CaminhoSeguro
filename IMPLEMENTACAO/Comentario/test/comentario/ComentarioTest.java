/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentario;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emanuel
 */
public class ComentarioTest {
    
    public ComentarioTest() {
    }

    /**
     * Test of getId_usuario method, of class Comentario.
     */

    @Test
    public void testSetId_usuario() throws Exception {
        System.out.println("setComentario");
        String id = "";
        Comentario instance = new Comentario();
        
        try {
            instance.setId_usuario(id);
            fail("O teste para inserir nome de usuário falhou");
        } catch (Exception ex) {
            Logger.getLogger(ComentarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setRua method, of class Comentario.
     */
    @Test
    public void testSetRua() throws Exception {
        System.out.println("setRua");
        String rua = " ";
        Comentario instance = new Comentario();
        
        try {
            instance.setRua(rua);
            fail("O teste para inserir nome da rua falhou");
        } catch (Exception ex) {
            Logger.getLogger(ComentarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setCrime method, of class Comentario.
     */
    @Test
    public void testSetCrime() throws Exception {
        System.out.println("setCrime");
        String rua = " ";
        Comentario instance = new Comentario();
        
        try {
            instance.setRua(rua);
            fail("O teste para inserir nome da rua falhou");
        } catch (Exception ex) {
            Logger.getLogger(ComentarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * Test of setComentario method, of class Comentario.
     */
    @Test
    public void testSetComentario() throws Exception {
        System.out.println("setComentario");
        String comentario = " ";
        Comentario instance = new Comentario();
        
        try {
            instance.setRua(comentario);
            fail("O teste para inserir nome da rua falhou");
        } catch (Exception ex) {
            Logger.getLogger(ComentarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
