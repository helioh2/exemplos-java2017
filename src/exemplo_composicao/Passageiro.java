/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_composicao;

import exemplo_heranca.*;

/**
 *
 * @author Lenovo
 */
public class Passageiro {
    
    private Pessoa pessoa;
    protected int numeroSmiles;

    public Passageiro(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
       

    public void setNumeroSmiles(int numeroSmiles) {
        this.numeroSmiles = numeroSmiles;
    }

    public int getNumeroSmiles() {
        return numeroSmiles;
    }
    
     public String getNome() {
        return "sr. " + pessoa.getNome();
    }

    public void setNome(String nome) {
        pessoa.setNome(nome);
    }

    public String getEndereco() {
        return pessoa.getEndereco();
    }

    public void setEndereco(String endereco) {
        pessoa.setEndereco(endereco);
    }
    
    
    
}
