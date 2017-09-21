package figuras;

import java.awt.Color;
import java.util.ArrayList;
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
        
       
        
        Figura ret1 = new Retangulo();
        Elipse elip1 = new Elipse();
        
        Figura fig1;
        fig1 = new Retangulo();
        Figura fig2 = null;
        Figura fig3 = null;
        Figura fig4 = null;
        List<Figura> figs = new ArrayList();
        figs.add(fig2);
        figs.add(fig3);
        figs.add(fig4);
        
        figs = instanciarFiguras(figs);
        
        System.out.println(figs);
        
        desenharTodas(figs);
        
        pintaDentro(fig1, Color.red);
        pintaDentro(elip1, Color.PINK);
      
    }
    
    
    
    static void pintaDentro(Figura fig, Color cor) {
        System.out.println("Pinta figura "+fig+ " com a cor" +cor);
    }
    
    
    
    static void desenharTodas(List<Figura> figs) {
//        for (Figura fig: figs) {
//            if (fig instanceof Retangulo){
//                desenharRetangulo(fig);
//            } else if (fig instanceof Elipse) {
//                desenharElipse(fig);
//            }
//        }

        for (Figura fig: figs){
            fig.desenhar();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    static List<Figura> instanciarFiguras(List<Figura> figs){
        
        int cont = 0;
        List<Figura> res = new ArrayList<>();
        for (Figura fig : figs) {
            if (cont % 2 == 0) {
                fig = new Retangulo();
            } else {
                fig = new Elipse();
            }
            res.add(fig);
            
            cont++;
        }
        return res;
        
        
        
    }
    
    
    
    
    
}
