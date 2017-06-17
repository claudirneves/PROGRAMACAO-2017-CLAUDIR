/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio1;

/**
 *
 * @author Claudir
 */
public class Pais {
      private String nome;
    private String capital;
    private double dimensao;
    private Pais vizinhos[];

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public boolean equals(Pais outro_pais) {
        return this.nome.equals(outro_pais.getNome())
                && this.capital.equals(outro_pais.getCapital());
    }

    public void setvizinhos(Pais... paisVizinho) {
        int paisesIguais = 0;
        for (int i = 0; i < paisVizinho.length; i++) {
            if (!this.equals(paisVizinho[i])) {
                paisesIguais++;
            }
        }
        this.vizinhos = new Pais[paisVizinho.length - paisesIguais];
        int contVizinhos = 0;
        for (int i = 0; i < paisVizinho.length; i++) {
            if (!this.equals(paisVizinho[i])) {
                this.vizinhos[contVizinhos] = paisVizinho[i];
                contVizinhos++;
            }
        }
    }

    public Pais[] getVizinhos() {
        return vizinhos;
    }

    public Pais[] vizinhosComum(Pais outro_pais) {
        int totalVizinhos = 0;
        for (Pais paisVizinhos : vizinhos) {
            for (Pais outroVizinho : outro_pais.vizinhos) {
                if (paisVizinhos.equals(outroVizinho)) {
                    totalVizinhos++;
                }
            }
        }
        if (totalVizinhos > 0) {
            int contVizinhoComum = 0;
            Pais[] vizinhoComum = new Pais[totalVizinhos];
            for (Pais paisVizinhos : vizinhos) {
                for (Pais outroVizinho : outro_pais.vizinhos) {
                    if (paisVizinhos.equals(outroVizinho)) {
                        vizinhoComum[contVizinhoComum] = outroVizinho;
                        contVizinhoComum++;
                    }
                }
            }
            return vizinhoComum;
        }
        return null;
    }
    public void listaVizinhos(Pais[] lista){
        for(Pais pais : lista){
            System.out.println(pais.getNome());
        }
        System.out.println();
    }
    public Pais(){
        
    }
}
