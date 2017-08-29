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
public class Lampada {
    
    private boolean aceso = false;

    public Lampada() {
    }
    
    public void acender() {
        this.aceso = true;
    }
    
    public void apagar() {
        this.aceso = false;       
    }

    public boolean isAceso() {
        return aceso;
    }
    
    
    
    
}
