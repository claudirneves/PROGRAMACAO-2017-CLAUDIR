/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio2;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class TestaExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays arr = new Arrays();
        Scanner entrada = new Scanner(System.in);
        int c=0;
      /*  System.out.println("Informe o tamanho do vertor");
        arr.quant = entrada.nextInt();*/
        for(int i=0;i<arr.array.length;i++){
            c++;
            System.out.printf("Informe o "+c+"º número do vetor: ");
            arr.array[i] = entrada.nextInt();
        }
        System.out.println("A Soma dos valores do vetor é: "+arr.soma(arr.array));
    }
    
}
