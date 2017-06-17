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
public class Matrizes {
    public void imprimeMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\t%d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] multipicaMatriz(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[2][2];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                for (int k = 0; k < matrizA.length; k++) {
                    resultado[i][j] = matrizA[i][k] * matrizB[k][j];

                }

            }
        }
        return resultado;
    }
}
