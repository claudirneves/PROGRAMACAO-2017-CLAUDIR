/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio9;

/**
 *
 * @author Claudir
 */
public class MaiorNumero {
    public String mariorNumero(int primeiroNumero, int segundoNumero){
        if(primeiroNumero > segundoNumero){
            return "O maior númeor é: "+Integer.toString(primeiroNumero);
        }else if(segundoNumero > primeiroNumero){
            return "O maior númeor é: " +Integer.toString(segundoNumero);
        }else
            
        return "Os número são iguais!";
        
    }
}
