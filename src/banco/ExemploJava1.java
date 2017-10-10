package banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zoo.Animal;
import zoo.Cobra;
import zoo.Leao;
import zoo.Macaco;


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
        
//        Funcionario fulano = new Funcionario("fulano", "2782828", 1500);       
        Funcionario boss = new Gerente("boss", "2929292", 7000);
        Funcionario severino = new Seguranca("severino", "2782828", 5000);
        Secretaria maria = new Secretaria("maria", "256252", 4000);
        
//        severino = boss;
        
//        System.out.println(fulano.getBonificacao());
        System.out.println(boss.getBonificacao());
        System.out.println(severino.getBonificacao());
        System.out.println(maria.getBonificacao());
        
        ControleBonificacoes controleBonificacoes = new ControleBonificacoes();
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
//        controleBonificacoes.registra(fulano);
//        controleBonificacoes.registra(boss);
//        controleBonificacoes.registra(severino);
//        controleBonificacoes.registra(maria);
        
        List<Funcionario> lista = Arrays.asList(boss, severino, maria);
        controleBonificacoes.registra(lista);
        
        
        System.out.println(controleBonificacoes.getTotalBonificacoes());
    }
    
}