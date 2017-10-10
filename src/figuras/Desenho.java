/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Lenovo
 */
public interface Desenho {
    
    default public void desenhar(){
        System.out.println("Desenha um desenho generico.");
    }
    
    
//    public void desenhar();
}
