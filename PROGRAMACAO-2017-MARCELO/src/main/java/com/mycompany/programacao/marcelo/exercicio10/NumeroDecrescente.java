/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio10;

/**
 *
 * @author Claudir
 */
public class NumeroDecrescente {
    public int ordemDecrescente(int numero){
        int ordem=0;
        for(int i=0;i<=numero;i++){
            ordem = numero - i;
            System.out.println(ordem);
        }
        return ordem;
    }
}
