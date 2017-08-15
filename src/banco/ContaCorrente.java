/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

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
    
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    
    
    
}
