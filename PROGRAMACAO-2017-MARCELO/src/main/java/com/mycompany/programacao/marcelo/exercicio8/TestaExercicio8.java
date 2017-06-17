/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio8;

/**
 *
 * @author Claudir
 */
public class TestaExercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Endereco endereco = new Endereco();
        
        endereco.setCep("79004140");
        endereco.setRua("José Luiz Pereira");
        
        System.out.println("Rua: "+endereco.getRua());
        System.out.println("CEP: "+endereco.formataCep());
    }
    
}
