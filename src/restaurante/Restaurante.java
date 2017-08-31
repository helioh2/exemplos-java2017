/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Lenovo
 */
public class Restaurante {
    
    private String nome;
    private String tipo;
    private FaixaPreco faixaPreco;
    private Esquina esquina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public FaixaPreco getFaixaPreco() {
        return faixaPreco;
    }

    public void setFaixaPreco(FaixaPreco faixaPreco) {
        this.faixaPreco = faixaPreco;
    }

  

    public Esquina getEsquina() {
        return esquina;
    }

    public void setEsquina(Esquina esquina) {
        this.esquina = esquina;
    }
    
    
    
}
