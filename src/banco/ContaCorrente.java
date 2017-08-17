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
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public boolean transferir(double valor, ContaCorrente outra) {
        if (this.sacar(valor)){
            outra.depositar(valor);
            return true;
        }     
        return false;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ContaCorrente){
            ContaCorrente outro = (ContaCorrente) obj;
            if (this.agencia == outro.agencia && this.numero == outro.numero){
                return true;
            }     
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
