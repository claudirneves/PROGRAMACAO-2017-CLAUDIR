/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio7;

/**
 *
 * @author Claudir
 */
public class Retangulo extends Forma{
    private float comprimento;
    private float largura;
    
    public float getComprimento(){
        return comprimento;
    }
    public float getLargura(){
        return largura;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    public void setLargura(float largura){
        this.largura = largura;
    }
    @Override
    public float calculaArea(float largura, float comprimento){
        float area;
        area = largura * comprimento;
        return area;
    }
    @Override
    public String toString(){
        return "Cor: "+ this.getCor() + "\nLargura: "+this.largura +
                "\nComprimento: "+this.comprimento +
                "\nÁrea: "+ this.calculaArea(largura, comprimento);
    }

    
}
