package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ufprsp
 */
public class Retangulo implements Figura {
    
    
    private double lado1;
    private double lado2;
    private Pos pos;
    
    public double area(){
        return lado1*lado2;
    }
    
    public void desenhar() {
        System.out.println("Desenhei um retangulo "+lado1+" "+lado2+ " "+pos);
    }
    
    
}
