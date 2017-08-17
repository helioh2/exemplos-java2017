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
        
        conta1.depositar(200000);
        
        System.out.println("O saldo de " + 
                conta1.getNomeCliente() +" agora é: " + 
                conta1.getSaldo());
        
        conta2.sacar(80000);
        
        System.out.println("O saldo de " + 
                conta2.getNomeCliente() + " agora é: "+
                conta2.getSaldo());
        
        conta2.transferir(20000, conta1);
        
        System.out.println("O saldo de " + 
                conta1.getNomeCliente() +" agora é: " + 
                conta1.getSaldo());
        
        System.out.println("O saldo de " + 
                conta2.getNomeCliente() + " agora é: "+
                conta2.getSaldo());
        
        
        
        Object objetoQualquer = new Object();
        
        ContaCorrente conta3 = new ContaCorrente("fulano", 1234, 56789);
        ContaCorrente conta4 = new ContaCorrente("fulano", 1234, 56789);
        
        if (conta3.equals(conta4)){
            System.out.println("OK!");
        } else {
            System.out.println("SQN!");
        }
        
        System.out.println(conta3);
        System.out.println(conta4);
        
    }
    
}
