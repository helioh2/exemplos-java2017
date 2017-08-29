/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrida;

/**
 *
 * @author Lenovo
 */
public class RegistroDiario {
    
    private Data data;
    private double distancia;
    private int duracao;
    private String comentario;
   
 
    public RegistroDiario(Data data, double distancia, int duracao, String comentario) {
        this.data = data;
        this.distancia = distancia;
        this.duracao = duracao;
        this.comentario = comentario;
    }

    public RegistroDiario() {
    }
    
    

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
   
    
}
