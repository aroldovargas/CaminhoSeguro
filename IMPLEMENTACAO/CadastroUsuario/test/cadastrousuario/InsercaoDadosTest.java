/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20171BSI0146
 */
public class InsercaoDadosTest {
    
    public InsercaoDadosTest() {
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
     * Test of dadosUsuario method, of class InsercaoDados.
     */
    @Test
    public void testDadosUsuario() throws Exception {
        System.out.println("dadosUsuario");
        InsercaoDados instance = new InsercaoDados();
        
        String nome = "Emanuel";
        String sexo = "M";
        String idade = "21";
        String email = "emanuel@gmail.com";
        String login = "emanue1223";
        String senha = "emanuel723";
        String cpf = "16106286806";
        Usuario result = new Usuario(nome,sexo, idade, email, login, senha, cpf);
   
        
        try {
            GuardarDados salvar_dados = new GuardarDados();
            salvar_dados.salvarDados(result); 
        } catch (Exception ex) {
            fail("O teste para inserir no arquivo falhou");
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    

        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
