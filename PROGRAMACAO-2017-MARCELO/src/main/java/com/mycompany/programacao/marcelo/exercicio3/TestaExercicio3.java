/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio3;

/**
 *
 * @author Claudir
 */
public class TestaExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrizes m = new Matrizes();
        int[][] matriz = new int[3][3];
        int numero = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero++;
            }
        }
        System.out.println("----Imprime Matriz!----");
        m.imprimeMatriz(matriz);

        System.out.println("----Multiplica Matriz!----");

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];

        matrizA[0][0] = 1;
        matrizA[0][1] = 2;
        matrizA[1][0] = 3;
        matrizA[1][1] = 4;

        matrizB[0][0] = 1;
        matrizB[0][1] = 2;
        matrizB[1][0] = 3;
        matrizB[1][1] = 4;

        m.imprimeMatriz(m.multipicaMatriz(matrizA, matrizB));
        
        int[][] primeiraMatriz = new int[3][2];
        int[][] segundaMatriz = new int[2][3];
        
        primeiraMatriz[0][0] = 10;
        primeiraMatriz[0][1] = 5;
        primeiraMatriz[1][0] = 9;
        primeiraMatriz[1][1] = 60;
        primeiraMatriz[2][0] = 50;
        primeiraMatriz[2][1] = 54;
        
        segundaMatriz[0][0] = 25;
        segundaMatriz[0][1] = 35;
        segundaMatriz[0][2] = 4;
        segundaMatriz[1][0] = 88;
        segundaMatriz[1][1] = 98;
        segundaMatriz[1][2] = 56;
        System.out.println("----Primeira Matriz!----");
        m.imprimeMatriz(primeiraMatriz);
        System.out.println("----Segunda Matriz!----");
        m.imprimeMatriz(segundaMatriz);
    }
    
}
