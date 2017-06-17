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
public class ProfessorEspecialista extends Professor {
    private String cursoEspecializacao;

    public ProfessorEspecialista() {
        
    }
    
    public String getCursoEspecializacao(){
        return cursoEspecializacao;
    }
    public void setCursoEspecializacao(String cursoEspecializacao){
        this.cursoEspecializacao = cursoEspecializacao;
    }
    
    @Override
    public String toString(){
        return"Código: " +this.getCodigo()+"\nNome: " + this.getNome() +
                "\nCurso Especialista: "+this.getCursoEspecializacao();
    }
}
