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
public class Endereco {
    private String rua;
    private String cep;
    
    public String getRua(){
        return rua;
    }
    public String getCep(){
        return cep;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public String formataCep(){
       return cep.substring(0,5)+
               "-"+cep.substring(5,8);           
    }
}
