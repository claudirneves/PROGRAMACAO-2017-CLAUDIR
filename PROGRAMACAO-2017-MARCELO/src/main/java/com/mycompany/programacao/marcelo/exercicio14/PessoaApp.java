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
public class PessoaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        AlunoPos alunoPos = new AlunoPos();
        Endereco endereco = new Endereco();
        
        endereco.setLogradouro("Itaparica");
        endereco.setBairro("Acapulco");
        endereco.setNumero(205);
        endereco.setCidade("Bataguassu");
        endereco.setUf("MS");
        endereco.setCep("79780000");
        
        aluno.setNome("Claudir Neves");
        aluno.setEndereco(endereco);
        aluno.setInstituicao("Estácio de Sá");
        
        alunoPos.setNome("Claudir Ferreira");
        alunoPos.setEndereco(endereco);
        alunoPos.setAnoIngresso(2019);
        
        System.out.println(aluno.toString());
        System.out.println("---------------------------------------------");
        System.out.println(alunoPos.toString());
    }
    
}
