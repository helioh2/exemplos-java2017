package exemplo_composicao;

import figuras.Elipse;
import figuras.Figura;
import figuras.Retangulo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     
        Pessoa p = new Pessoa();
        p.setNome("fulaninho");
        System.out.println(p.getNome());
        
        Passageiro p2 = new Passageiro(p);
        
        System.out.println(p2.getNome());
        
        Tripulacao p3 = new Tripulacao(p);
        
        System.out.println(p3.getNome());
        
        Pessoa p4 = new Passageiro(new Tripulacao(p));
        
  
        
        
//        System.out.println(t.getEndereco());
       
    }
    
}
