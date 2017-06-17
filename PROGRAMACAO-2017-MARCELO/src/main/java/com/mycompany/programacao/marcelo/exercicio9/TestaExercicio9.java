/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio9;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class TestaExercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaiorNumero maior = new MaiorNumero();
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        System.out.printf("Digite um número inteiro: ");
        numero1 = entrada.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        numero2 = entrada.nextInt();
     
        System.out.println(maior.mariorNumero(numero1, numero2));
    }
    
}
