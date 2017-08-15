/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.ContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSacar() {
        //preparação
        ContaCorrente cc1 = new ContaCorrente("fulano", 1234, 2324, 500);
        
        //execucao
        assertTrue(cc1.sacar(200));
        
        //verificacao
        assertEquals(300, cc1.getSaldo(), 0.001);
        
        //preparação
        ContaCorrente cc2 = new ContaCorrente("fulano", 1234, 2324, 500);
        
        //execucao
        assertFalse(cc2.sacar(700));
        
        //verificacao
        assertEquals(500, cc2.getSaldo(), 0.001);
        
    }
}
