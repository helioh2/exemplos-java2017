/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class NovoEmptyJUnitTest {
    
    public NovoEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeInserirDinheiro() {
        TicketMachine tm1 = new TicketMachine(10);
        tm1.inserirDinheiro(10);
        assertEquals(10, tm1.getBalanco(), 0.001);
        tm1.imprimirBilhete();
        assertEquals(0, tm1.getBalanco(), 0.001);
        assertEquals(10, tm1.getTotal(), 0.001);
        tm1.inserirDinheiro(5);
        assertEquals(5, tm1.getBalanco(), 0.001);
        tm1.imprimirBilhete();
        assertEquals(5, tm1.getBalanco(), 0.001);
        assertEquals(15, tm1.getTotal(), 0.001);
    }
}
