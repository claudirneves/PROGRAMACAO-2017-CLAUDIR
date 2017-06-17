/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio2;

/**
 *
 * @author Claudir
 */
public class Arrays {
     int[] array = new int[5];
    
    public int soma(int[] array){
        int soma=0;
        for(int i=0;i<array.length;i++){
            soma +=array[i];
        }
        return soma;
    }
}
