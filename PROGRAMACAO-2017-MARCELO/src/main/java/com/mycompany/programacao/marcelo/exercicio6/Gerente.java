/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacao.marcelo.exercicio6;

import java.util.List;

/**
 *
 * @author Claudir
 */
public class Gerente extends Funcionario{
    List<Funcionario> funcionariosGerencioados;
    private double bonusSalarial;
    
    public double getBonusSalarial(){
        return bonusSalarial;
    }
    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }
}
