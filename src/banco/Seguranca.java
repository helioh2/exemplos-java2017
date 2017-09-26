/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Lenovo
 */
public class Seguranca extends Funcionario {
    
    private double adicionalNoturno;
    
    public Seguranca(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 500;
    
    }
    
    
    
    
    
    
}
