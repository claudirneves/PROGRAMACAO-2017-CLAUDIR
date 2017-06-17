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
public class ProfessorMestre extends Professor{
    private String cursoMestrado;
    
    public String getCurosMestrado(){
        return cursoMestrado;
    }
    public void setCursoMestrado(String cursoMestrado){
        this.cursoMestrado = cursoMestrado;
    }
    
    public ProfessorMestre(){
       
    }
    
    @Override
    public String toString(){
        return "Código: " +this.getCodigo()+"\nNome: " + this.getNome() +
                "\nCurso Mestrado: "+this.getCurosMestrado();
    }
}
