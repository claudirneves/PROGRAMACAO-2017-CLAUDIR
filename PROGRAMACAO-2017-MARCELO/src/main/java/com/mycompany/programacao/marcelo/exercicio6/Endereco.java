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
public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    
    public String getLogradour(){
        return logradouro;
    }
    public int getNumero(){
        return numero;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public String getUf(){
        return uf;
    }
    public void setLogradour(String logradouro){
        this.logradouro = logradouro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
}
