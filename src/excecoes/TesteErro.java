/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

class TesteErro {

    public static void main(String[] args) {
        System.out.println("inicio do main");

        metodo1();
        try {
            metodoArquivo();
        } catch (FileNotFoundException ex) {
            System.out.println("Nao foi possível abrir o arquivo para leitura");
            ex.printStackTrace();
        }
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            metodo2();
        } catch (RuntimeException e) {
            System.out.println("Erro no array!!!");
        }

        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("fim do metodo2");
    }

    public static void metodoArquivo() throws FileNotFoundException {

        new java.io.FileInputStream("arquivo.txt");

    }

}
