/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojava1;

import banco.ContaCorrente;

/**
 *
 * @author Lenovo
 */
public class ExemploJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("William", 1234, 56789);
        ContaCorrente conta2 = new ContaCorrente("Julio", 1235, 56789, 100000);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        
    }
    
}
