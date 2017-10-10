package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ufprsp
 */
public abstract class Figura {
    
    protected Pos pos;
    
    public abstract double area();
    
    public void desenhar(){
        System.out.println("Desenhar figura geometrica generico");
    }
    
}
