/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio12;

/**
 *
 * @author Claudir
 */
public class TrocaNumero {
    public String trocaNumero(int numA, int numB){
        int troca;
        troca = numA;
        numA = numB;
        numB = troca;
        return "Primeiro Número: "+Integer.toString(numA) +
                "\nSegundo Número: " + Integer.toString(numB);
    }
}
