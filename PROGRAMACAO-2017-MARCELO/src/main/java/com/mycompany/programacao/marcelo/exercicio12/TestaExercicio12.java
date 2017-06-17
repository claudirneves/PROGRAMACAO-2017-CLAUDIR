/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio12;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class TestaExercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrocaNumero troca = new TrocaNumero();
        Scanner entrada = new Scanner(System.in);
        int numA, numB;                
        System.out.printf("Digiteo primeiro número: ");
        numA = entrada.nextInt();
        System.out.printf("Digite o segundo número: ");
        numB = entrada.nextInt();
        System.out.println("--------------------------------");
        System.out.println(troca.trocaNumero(numA, numB));
    }
    
}
