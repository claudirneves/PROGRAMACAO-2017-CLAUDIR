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
public class Empresa {
    private Funcionario[] vetorFuncionario = new Funcionario[2];
    private int contFuncionario = 0;
    public void listaFuncionario(){
        Funcionario funcionario;
        for(int i=0; i<vetorFuncionario.length;i++){
            funcionario = vetorFuncionario[i];
            if(funcionario != null){
                System.out.println(funcionario.toString());
            }
       }
    }
    public void cadastarFuncionario(Funcionario funcionario){
        if(contFuncionario < vetorFuncionario.length){
            vetorFuncionario[contFuncionario] = funcionario;
            System.out.println("Funcionario Cadastrado!");
            contFuncionario++;
        }else{
            System.out.println("Funcionario não Cadastrado!");
        }
    }
}
