/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio5;

/**
 *
 * @author Claudir
 */
public class Livro {
    private String nome;
    private Autor autor;
    private double preco;
    private int quantidadeEstoque;
    
    public String getNome(){
        return nome;
    }
    public Autor getAutor(){
        return autor;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
