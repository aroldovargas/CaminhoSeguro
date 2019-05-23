/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20162bsi0155
 */
public class TelaEnderecoTest {
    
    public TelaEnderecoTest() {
    }

    /**
     * Test of getEndereco method, of class TelaEndereco.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        TelaEndereco instance = new TelaEndereco();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
