/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_heranca;

/**
 *
 * @author Lenovo
 */
public class Tripulacao extends Pessoa {
    
    protected int idTripulacao;

    public void setIdTripulacao(int idTripulacao) {
        this.idTripulacao = idTripulacao;
    }

    public int getIdTripulacao() {
        return idTripulacao;
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
