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
public class TelaComentarioTest {
    
    public TelaComentarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of telaComentario method, of class TelaComentario.
     */
    @Test
    public void testDadosUsuario() throws Exception {
        System.out.println("dadosUsuario");
        TelaComentario instance = new TelaComentario();
        
        String id = "20";
        String rua = "Avenida Brasil";
        String crime = "";
        String comentario = "Ocorrência registrada a noite aproximadamente as 22:40";

        Comentario result = new Comentario(id,rua,crime,comentario);
   
        
        try {
            GuardarComentario salvar_dados = new GuardarComentario();
            salvar_dados.salvarComentario(result); 
        } catch (Exception ex) {
            fail("O teste para inserir no arquivo falhou");
            Logger.getLogger(TelaComentarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    

        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
