package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ufprsp
 */
public class Elipse implements Figura {
    
    private int raio1;
    private int raio2;
    private Pos pos;
    
    public double area(){
        return 0.0;
    }
    
    public void desenhar() {
        System.out.println("Desenhei uma elipse "+raio1+" "+raio2+ " "+pos);
    }
    
}
