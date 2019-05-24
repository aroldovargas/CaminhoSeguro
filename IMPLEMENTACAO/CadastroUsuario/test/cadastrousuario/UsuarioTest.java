/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

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
 * @author 20171BSI0146
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome()  {
        System.out.println("setNome");
        String nome = " ";
        Usuario instance = new Usuario();
        try {
            instance.setNome(nome);
            fail("O teste para inserir nome de usuário falhou, espera um valor diferente de vazio");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setSexo method, of class Usuario.
     */
    @Test
    public void testSetSexo() throws Exception {
        System.out.println("setSexo");
        String sexo = "masc";
        Usuario instance = new Usuario();
        
        try {
            instance.setNome(sexo);
            fail("O sexo informado deve ser diferente de vazio ou informado como M ou F");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setIdade method, of class Usuario.
     */
    @Test
    public void testSetIdade() throws Exception {
        System.out.println("setIdade");
        String idade = "-10";
        Usuario instance = new Usuario();
        
        try {
            instance.setNome(idade);
            fail("A idade deve ser maior que 0");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "emanuel@hotmail";
        Usuario instance = new Usuario();
        try {
            instance.setNome(email);
            fail("O e-mail informado está no formato inválido ou com um número de caracteres menor do que 12");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    /*
    @Test
    public void testSetLogin() throws Exception {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        try {
            instance.setNome(login);
            fail("O e-mail informado está no formato inválido ou com um número de caracteres menor do que 12");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void testSetSenha() throws Exception {
        System.out.println("setSenha");
        String senha = "emc1";
        Usuario instance = new Usuario();
        try {
            instance.setNome(senha);
            fail("A senha deve ser diferente do nome e a senha deve ter no minimo 5 caracteres");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setCpf method, of class Usuario.
     */
    @Test
    public void testSetCpf() throws Exception {
        System.out.println("setCpf");
        String cpf = "161068869";
        Usuario instance = new Usuario();
        try {
            instance.setNome(cpf);
            fail("O CPF deve ter 11 digitos");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}