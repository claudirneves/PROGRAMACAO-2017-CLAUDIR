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
public class TestaExercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro = new Livro();
        Autor autor = new Autor();

        autor.setNome("Kathy Sierra");
        autor.setEmail("kathysierra@yahoo.com.br");
        autor.setSexo('F');

        livro.setNome("Use a Cabeça Java");
        livro.setAutor(autor);
        livro.setPreco(101.49);
        livro.setQuantidadeEstoque(500);

        System.out.println("Livro: " + livro.getNome());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Quantidade: " + livro.getQuantidadeEstoque());
    }
    
}
