/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Lenovo
 */
public class Pessoa {
    
    private String nome;
    private Comodo comodoAtual;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void entrar(Comodo comodo){
        this.comodoAtual = comodo;
    }
    
}
