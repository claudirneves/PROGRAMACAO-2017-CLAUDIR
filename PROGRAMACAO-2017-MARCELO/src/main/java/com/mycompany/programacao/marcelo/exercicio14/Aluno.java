/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio14;

/**
 *
 * @author Claudir
 */
public class Aluno extends Pessoa {
    private String instituicao;
    
    public String getinstituicao(){
        return instituicao;
    }
    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }
    
    public Aluno(){
        
    }
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nFaculdade: " +
                this.getinstituicao() +"\n"+ this.getEndereco();
    }
}
