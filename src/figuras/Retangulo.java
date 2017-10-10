package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ufprsp
 */
public class Retangulo extends Figura implements Desenho {
    
    
    private double lado1;
    private double lado2;
    
    public double area(){
        return lado1*lado2;
    }

    @Override
    public void desenhar() {
        super.desenhar(); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
    
}
