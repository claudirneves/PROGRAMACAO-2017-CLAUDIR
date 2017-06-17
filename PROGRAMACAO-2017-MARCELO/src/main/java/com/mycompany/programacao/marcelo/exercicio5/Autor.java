/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio5;

/**
 *
 * @author Claudir
 */
public class Autor {
    private String nome;
    private String email;
    private char sexo;
    
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public char getSexo(){
        return sexo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return  nome + "\nE-mail: " + email + "\nSexo: " + sexo;
    }
}
