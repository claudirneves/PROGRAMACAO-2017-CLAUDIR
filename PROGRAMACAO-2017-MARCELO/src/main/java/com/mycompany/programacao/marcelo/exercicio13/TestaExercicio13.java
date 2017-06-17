/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio13;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class TestaExercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediaAluno media = new MediaAluno();
        Scanner entrada = new Scanner(System.in);
        int nota, c = 1;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a " + c + "ª nota: ");
            nota = entrada.nextInt();
            if (nota < 101) {
                media.addNotas(nota);
                c++;
            } else {
                System.out.println("Nota deve ser menor que 101!");
                i--;
            }
        }
        System.out.println(media.calculaMedia(media.notas));
    }

}
