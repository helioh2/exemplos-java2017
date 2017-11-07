    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import exceptions.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ContaCorrente {
    
    //atributos:
    private double saldo;
    private int numero;
    private int agencia;
    private String nomeCliente;
    
  
    public ContaCorrente(String nomeCliente, int agencia, int numero) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;       
    }
    
    public ContaCorrente(String nomeCliente, int agencia, int numero, double saldo) {
        this(nomeCliente, agencia, numero);
        this.saldo = saldo;
    }
    
    
    //metodos
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    
    
    /**
     * Metodo que saca se houver saldo
     * @param valor
     * @return true se foi possível sacar, senão falso
     */
    public void sacar(double valor) throws SaldoInsuficienteException  {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo.");
        }    
        
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Valor excede o saldo disponível.");
        }

        //else
        this.saldo -= valor;
        
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void transferir(double valor, ContaCorrente outra) throws SaldoInsuficienteException {
//        try {
            this.sacar(valor);
//        } catch (SaldoInsuficienteException ex) {
//            throw new RuntimeException("Saldo insuficiente para transferir");
//        }
        outra.depositar(valor);      
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ContaCorrente){
            ContaCorrente outro = (ContaCorrente) obj;
            return this.agencia == outro.agencia && this.numero == outro.numero;
        }
        return false;
    }

    @Override
    public String toString() {
        return "--Agencia: "+agencia+"; Conta:"+numero+"---\n"+
                "Nome: "+nomeCliente+"\n"+
                "Saldo: "+saldo+"\n"+
                        "-----------------------";
                       
    }
    
    
    
    
    
    
    
    
    
    
}
