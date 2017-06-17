/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio11;

/**
 *
 * @author Claudir
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        long multiplica = 1;
        for (int i = 1; i < 30; i++) {
            if (i % 2 == 0) {
                multiplica *= i;
            } else {

                soma += i;

            }
        }
        System.out.printf("Soma dos Impares Menos que 30: " + soma + "\n");
        System.out.printf("Multiplicação dos Pares Menores que 30: " + multiplica);
    }
    
}
