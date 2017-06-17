/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio6;

/**
 *
 * @author Claudir
 */
public class Cliente extends Pessoa{
    private Endereco endereco;
    private int telefone;
    
    public Endereco getEndereco(){
        return endereco;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setEnderenco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}
