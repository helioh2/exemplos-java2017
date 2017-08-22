/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Lenovo
 */
public class TicketMachine {
    private double preco;
    private double balanco;
    private double total;

    public TicketMachine(double preco) {
        this.preco = preco;

    }

    public double getBalanco() {
        return balanco;
    }

    public double getTotal() {
        return total;
    }
    
    
public void inserirDinheiro(double valor){
    this.balanco += valor;
    this.total += valor;    
}    
public void imprimirBilhete(){
    if(balanco >= preco){
        System.out.println("Bilhete");
        this.balanco = 0;
    }else{
        System.out.println("Coloque mais dinheiro");
    }
    
}


}
