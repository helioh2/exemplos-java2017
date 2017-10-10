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
public class Gerente extends Funcionario {
    
    private int senha;
    private List<Funcionario> gerenciados;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public double getBonificacao() {
        return salario*0.1 + 1000;
    }


    
    
    
    
    
    
}
