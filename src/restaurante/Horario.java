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
public class Horario {
    
    private int horas;
    private int minutos;
    private int segundos;

    public Horario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void tick(){
        this.segundos = (this.segundos + 1) % 60;
        if (this.segundos == 0){           
            this.minutos = (this.minutos + 1) % 60;            
            if (this.minutos == 0){
                this.horas = (this.horas + 1) % 24;
            }
        }
       
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Horario) {
            Horario outro = (Horario) obj;
            return this.horas == outro.horas 
                    && this.minutos == outro.minutos
                    && this.segundos == outro.segundos;
        }
        return false;
    }

    @Override
    public String toString() {
        return horas+":"+minutos+":"+segundos;
    }
    
    
    
}
