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
public class Tripulacao {
    
    private Pessoa pessoa;
    protected int idTripulacao;

    public Tripulacao(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
        

    public void setIdTripulacao(int idTripulacao) {
        this.idTripulacao = idTripulacao;
    }

    public int getIdTripulacao() {
        return idTripulacao;
    }
    
     public String getNome() {
        return pessoa.getNome() + " à sua disposição.";
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
