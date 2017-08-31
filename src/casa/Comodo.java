/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.HashSet;
import java.util.Set;


public class Comodo {
    
    private Lampada lampada;
    private Set<Movel> moveis;

    public Comodo() {
        moveis = new HashSet<>();
    }
    
    public void iluminar(){
        if (lampada != null){
            this.lampada.acender();  
        }
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }
    
    public void addMovel(Movel movel){
        this.moveis.add(movel);
    }
    
    public void removeMovel(Movel movel){
        this.moveis.remove(movel);
    }

    public Set<Movel> getMoveis() {
        return moveis;
    }

    public Lampada getLampada() {
        return lampada;
    }
    
    
    
    
}
