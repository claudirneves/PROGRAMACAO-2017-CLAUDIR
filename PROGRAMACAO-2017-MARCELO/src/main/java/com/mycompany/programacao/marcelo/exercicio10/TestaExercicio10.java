/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio10;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class TestaExercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroDecrescente numeroD = new NumeroDecrescente();
        Scanner entrada = new Scanner(System.in);
        int numero, ordem;
        System.out.printf("Digite um número inteiro: ");
        numero = entrada.nextInt();
        
        ordem = numeroD.ordemDecrescente(numero);
    }
    
}
