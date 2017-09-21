/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Lenovo
 */
public class Macaco implements Animal {

    private String comidaFavorita;
    private double peso;
    
    
    @Override
    public void come() {
        System.out.println("Come com a mão.");
    }

    @Override
    public void move() {
        System.out.println("Pulando galho.");
    }

    @Override
    public void bebe() {
        System.out.println("Bebe com a mão.");
    }
    
}
