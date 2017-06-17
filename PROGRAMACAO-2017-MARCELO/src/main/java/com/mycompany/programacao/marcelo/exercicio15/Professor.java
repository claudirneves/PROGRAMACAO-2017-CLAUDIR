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
public abstract class Professor {
    private int codigo;
    private String nome;
 
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
