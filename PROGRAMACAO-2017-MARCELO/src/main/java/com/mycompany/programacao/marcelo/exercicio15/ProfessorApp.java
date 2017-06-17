/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio15;

/**
 *
 * @author Claudir
 */
public class ProfessorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfessorEspecialista especialista = new ProfessorEspecialista();
        ProfessorMestre mestre = new ProfessorMestre();
        
        especialista.setCodigo(1);
        especialista.setNome("Claudir Neves");
        especialista.setCursoEspecializacao("Ciência de Dados");
        
        mestre.setCodigo(2);
        mestre.setNome("Claudir Ferreira");
        mestre.setCursoMestrado("Programação");
        
        System.out.println(especialista.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(mestre.toString());
    }
    
}
