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
    
    @Test
    public void testDepositar(){
        //preparação
        ContaCorrente cc1 = new ContaCorrente("fulano", 1234, 2324, 500);
        
        //execucao
        cc1.depositar(200);
        
        //verificacao
        assertEquals(700, cc1.getSaldo(), 0.001);
        
    }
    
    @Test
    public void testTransferir(){
        //preparação
        ContaCorrente conta1 = new ContaCorrente("William", 1234, 56789);
        ContaCorrente conta2 = new ContaCorrente("Julio", 1235, 56789, 100000);
        
        //execucao
        assertTrue(conta2.transferir(20000, conta1));
        
        //verificacao
        assertEquals(20000, conta1.getSaldo(), 0.001);
        assertEquals(80000, conta2.getSaldo(), 0.001);
        
        
        // Testa quando nao tem saldo:
        
        //preparação
        conta1 = new ContaCorrente("William", 1234, 56789);
        conta2 = new ContaCorrente("Julio", 1235, 56789, 100000);
        
        //execucao
        assertFalse(conta2.transferir(300000, conta1));
        
        //verificacao
        assertEquals(0, conta1.getSaldo(), 0.001);
        assertEquals(100000, conta2.getSaldo(), 0.001);
        
        
        
        
        
    }
}
