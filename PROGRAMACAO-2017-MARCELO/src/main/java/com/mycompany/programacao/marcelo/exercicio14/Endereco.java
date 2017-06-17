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
public class Endereco {
     private String logradouro;
    private String bairro;
    private int numero;
    private String cidade;
    private String uf;
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String formataCEP(){
        return cep.substring(0,5)+
               "-"+ cep.substring(5,8);
    }
    @Override
    public String toString(){
        return "Rua: " + this.logradouro + "\nBairro: "+ this.bairro +
                "\nCidade: " + this.cidade + "\nUF: " + this.uf +
                "\nCEP: " + this.formataCEP();
    }
}
