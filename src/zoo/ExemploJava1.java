package zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ExemploJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Animal bicho1 = new Leao();
       Animal bicho2 = new Cobra();
       Animal bicho3 = new Macaco();
       
       Leao leao1 = (Leao) bicho1;
       leao1.ruge();
       
       List<Animal> bichos = new ArrayList<>();
       bichos.addAll(Arrays.asList(bicho1, bicho2, bicho3));
       for (Animal bicho: bichos){
           bicho.come();
       }
       
        
        
    }
    
}