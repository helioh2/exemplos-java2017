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
public class ControleBonificacoes {
    
    private double totalBonificacoes = 0;
    
    public void registra(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
    
    
    
}
