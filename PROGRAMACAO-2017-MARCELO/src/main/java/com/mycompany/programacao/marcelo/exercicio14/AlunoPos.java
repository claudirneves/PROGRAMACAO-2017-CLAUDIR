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
public class AlunoPos extends Pessoa{
     private int anoIngresso;
    
    public int getAnoIngresso(){
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    public AlunoPos(){
        
    }
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nAno Ingresso: "+
                this.getAnoIngresso() +"\n"+ this.getEndereco();
    }
}
