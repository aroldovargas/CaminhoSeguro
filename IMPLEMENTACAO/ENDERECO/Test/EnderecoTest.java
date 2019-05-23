/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maparisco;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20162bsi0155
 */
public class EnderecoTest {
    
    public EnderecoTest() {
    }
    /**
     * Test of setNomeRua method, of class Endereco.
     */
    @Test
    public void testSetNomeRua() {
        System.out.println("setNomeRua");
        String nomeRua = "";
        Endereco instance = new Endereco();
        try {
            instance.setNomeRua(nomeRua);
            fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(EnderecoTest.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    /**
     * Test of setNomeBairro method, of class Endereco.
     */
    @Test
    public void testSetNomeBairro(){
        System.out.println("setNomeBairro");
        String nomeBairro = "";
        Endereco instance = new Endereco();
        try {
            instance.setNomeBairro(nomeBairro);
            fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(EnderecoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Test of setNomeCidade method, of class Endereco.
     */
    @Test
    public void testSetNomeCidade(){
        System.out.println("setNomeCidade");
        String nomeCidade = "";
        Endereco instance = new Endereco();
        try {
            instance.setNomeCidade(nomeCidade);
            fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(EnderecoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
