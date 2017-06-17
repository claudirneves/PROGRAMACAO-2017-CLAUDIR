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
public class Funcionario extends Pessoa{
    private int numeroCadastroEmpresa;
    private double salario;
    
    public int getNumeroCadastroEmpresa(){
        return numeroCadastroEmpresa;
    }
    public double getSalario(){
        return salario;
    }
    public void setNumeroCadastroEmpresa(int numeroCadastroEmpresa){
        this.numeroCadastroEmpresa = numeroCadastroEmpresa;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
