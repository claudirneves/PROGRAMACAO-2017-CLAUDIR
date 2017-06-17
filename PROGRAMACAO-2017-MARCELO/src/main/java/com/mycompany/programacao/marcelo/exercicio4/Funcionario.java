/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio4;

/**
 *
 * @author Claudir
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String nomeSuperior;

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String gerNomeSuperior() {
        return nomeSuperior;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNomeSuperior(String nomeSuperior) {
        this.nomeSuperior = nomeSuperior;
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nCargo: " +
                this.cargo + "\nChefe: " + this.nomeSuperior;
    }
}
