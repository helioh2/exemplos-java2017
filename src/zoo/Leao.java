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
public class Leao implements Animal {

    private double quantoCome;
    private double peso;
    
    
    @Override
    public void come() {
        System.out.println("Leão comeu carne.");
    }

    @Override
    public void move() {
        System.out.println("Leão anda com quatro patas rebolando ou corre");     
    }

    @Override
    public void bebe() {
        System.out.println("Bebe no rio.");
    }
    
    public void ruge() {
        System.out.println("Grrrrraarr");
    }
    
}
