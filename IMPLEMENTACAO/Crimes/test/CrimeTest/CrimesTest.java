package CrimeTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author harri
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;


public class TestCrimes {
    public TestCrimes() {
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

     @Test
    public void testDadosUsuario() throws Exception {
        System.out.println("Crimes");
        TestCrimes instance = new TestCrimes();
        
        String data = "20/06/1994"; 
        String hora = "12:00" ;
        String tipo_Crime = "Assassinato";
        String vitima = "M";  
        Crimes final = new Crimes(data,hora,tipo_Crime,vitima);
   
        
        try {
            GravaArquivo salvando = new GravaArquivo();
            salvando.salvarCrime(final); 
        } catch (Exception ex) {
            fail("O teste para inserir no arquivo falhou");
            Logger.getLogger(CrimesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    

        
    }
    
    
}
