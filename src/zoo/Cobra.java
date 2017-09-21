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
public class Cobra implements Animal{

    private double peso;
    private double comprimento;
    
    @Override
    public void come() {
        System.out.println("Engole inteiro.");
    }

    @Override
    public void move() {
        System.out.println("Rasteja.");
    }

    @Override
    public void bebe() {
        System.out.println("Bebe folha do orvalho.");
    }
    
}
