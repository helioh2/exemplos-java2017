/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ControleBonificacoes {
    
    private double totalBonificacoes = 0;
    

    
    public void registra(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }
    
    public void registra(List<Funcionario> funcionarios){
        for (Funcionario funcionario : funcionarios){
           this.registra(funcionario);
        }
    }
    
    public boolean registra(){
        return true;
    }

    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
    
    
    
}
