package figuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ufprsp
 */
public class Elipse extends Figura implements Comparable {
    
    private int raio1;
    private int raio2;
    
    public double area(){
        return 0.0;
    }
    
    public void desenhar() {
        System.out.println("Desenhei uma elipse "+raio1+" "+raio2+ " "+pos);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Elipse){
            Elipse outra = (Elipse) o;
            return this.raio1*this.raio2 - outra.raio1*outra.raio2;
        }
        return -1;
    }

    public void setRaio1(int raio1) {
        this.raio1 = raio1;
    }

    public void setRaio2(int raio2) {
        this.raio2 = raio2;
    }

    @Override
    public String toString() {
        return this.raio1+","+this.raio2;
                
    }
    
    
}
