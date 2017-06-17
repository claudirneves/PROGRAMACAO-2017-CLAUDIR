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
public abstract class Pessoa {
    private String nome;
   private Endereco endereco;
   
   public String getNome(){
       return nome;
   }
   public Endereco getEndereco(){
      return endereco;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setEndereco(Endereco endereco){
       this.endereco = endereco;
   }
}
