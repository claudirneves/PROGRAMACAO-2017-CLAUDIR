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
public class Triangulo extends Forma {
    private float base;
    private float altura;
    
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    @Override
    public float calculaArea(float base, float altura){
        float area;
        area = (base * altura)/2;
        return area;
    }
    @Override
    public String toString(){
        return "Cor: "+ this.getCor() + "\nBase: "+this.base +
                "\nAltura: "+this.altura +
                "\nÁrea: "+ this.calculaArea(base, altura);
    }
}
