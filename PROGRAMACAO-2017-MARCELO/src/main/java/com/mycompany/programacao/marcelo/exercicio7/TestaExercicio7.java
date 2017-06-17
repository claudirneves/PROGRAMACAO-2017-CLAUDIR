/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio7;

/**
 *
 * @author Claudir
 */
public class TestaExercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
        
        retangulo.setComprimento(5.5f);
        retangulo.setLargura(3f);
        retangulo.setCor("Azul");
        
        triangulo.setAltura(6.3f);
        triangulo.setBase(5f);
        triangulo.setCor("Vermelho");
        
        System.out.println("----RETÂNGULO----");
        System.out.println(retangulo.toString());
        System.out.println("\n----TRIÂNGULO----");
        System.out.println(triangulo.toString());
    }
    
}
