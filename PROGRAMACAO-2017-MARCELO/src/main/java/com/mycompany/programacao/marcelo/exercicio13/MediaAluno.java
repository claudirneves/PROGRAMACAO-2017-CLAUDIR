/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio13;

/**
 *
 * @author Claudir
 */
public class MediaAluno {
     int[] notas = new int[3];

    public void addNotas(int nota) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = nota;
        }

    }

    public double calculaMedia(int[] notas) {
        int soma=0, i;
        double media;
        for (i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma/i;
        return media;
    }
}
