/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Lenovo
 */
public enum FaixaPreco {
    
    BARATO(1), MODERADO(2), CARO(3);

    private int valor;
    
    private FaixaPreco(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ""+valor; 
    }
    
    
    
    
}
