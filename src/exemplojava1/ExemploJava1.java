/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojava1;

import banco.ContaCorrente;
import casa.Comodo;
import casa.Lampada;
import casa.Movel;
import casa.Pessoa;
import corrida.Data;
import corrida.RegistroDiario;

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
        
        
        RegistroDiario registro1 = new RegistroDiario();
        Data dataHoje = new Data(28, 8, 2017);
        registro1.setData(dataHoje);
        registro1.setDistancia(5.3);
        registro1.setDuracao(27*60);
        registro1.setComentario("se sentindo bem");
        
        System.out.println(registro1.getData());
        
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        
        Comodo sala = new Comodo();
        pessoa1.entrar(sala);
        
        Lampada lampada = new Lampada();
        sala.setLampada(lampada);
        
        Movel mesa1 = new Movel();
        sala.addMovel(mesa1);
        Movel cadeira1 = new Movel();
        sala.addMovel(cadeira1);
        
        System.out.println(sala.getMoveis());
        
        if (sala.getMoveis().contains(mesa1)) {
            System.out.println("Mesa1 está na sala");
        } else {
            System.out.println("Mesa1 nao está na sala");
        }
        
        System.out.println(sala.getLampada().isAceso());
        
        sala.iluminar();
        
        System.out.println(sala.getLampada().isAceso());
               
        
        
        
    }
    
}
