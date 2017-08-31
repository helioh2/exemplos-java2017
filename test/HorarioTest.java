
import org.junit.Test;
import static org.junit.Assert.*;
import restaurante.Horario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class HorarioTest {
    
    @Test
    public void testTick() {
        
        //Caso 1
        Horario hora1 = new Horario(0,0,0);
        
        hora1.tick();
        
        assertEquals(hora1, new Horario(0,0,1));
        
        //Caso 2
        
        hora1 = new Horario(0,0,59);
        
        hora1.tick();
        
        assertEquals(hora1, new Horario(0,1,0));
        
        
        //Caso 3
        
        hora1 = new Horario(0,59,59);
        
        hora1.tick();
        
        assertEquals(hora1, new Horario(1,0,0));
        
        
        //Caso 4
        
        hora1 = new Horario(23,59,59);
        
        hora1.tick();
        
        assertEquals(hora1, new Horario(0,0,0));
        
        
        
        
    }
    
}
