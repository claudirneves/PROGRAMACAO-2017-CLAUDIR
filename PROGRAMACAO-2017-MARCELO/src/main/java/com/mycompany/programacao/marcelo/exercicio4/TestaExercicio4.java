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
public class TestaExercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Claudir Neves");
        funcionario.setCargo("Analista de Suporte");
        funcionario.setNomeSuperior("Lucie Yamakawa");
        Empresa empresa = new Empresa();
        
        empresa.cadastarFuncionario(funcionario);
        
        empresa.listaFuncionario();
    }
    
}
