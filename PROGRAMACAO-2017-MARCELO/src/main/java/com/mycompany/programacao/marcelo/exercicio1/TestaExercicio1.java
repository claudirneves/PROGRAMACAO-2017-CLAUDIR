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
public class TestaExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pais pais = new Pais();
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780000);
        Pais brasil = new Pais("Brasil", "Basília", 8516000);
        Pais paraguai = new Pais("Paraguai", "Assunção", 406752);
        Pais uruguai = new Pais("Uriguai", "Montevidéu", 176215);
        Pais venezuela = new Pais("Venezuela", "Caracas", 916445);
        Pais peru = new Pais("Peru", "Lima", 1285000);
        Pais chile = new Pais("Chile", "Santiago",756102);
        Pais equador = new Pais("Equador", "Quito",283560);
        
        System.out.println(argentina.equals(argentina));
        System.out.println(brasil.equals(brasil));
        System.out.println(paraguai.equals(paraguai));
        System.out.println(uruguai.equals(uruguai));
        System.out.println(venezuela.equals(venezuela));
        System.out.println(peru.equals(peru));
        System.out.println(chile.equals(chile));
        System.out.println(equador.equals(equador));
        
        argentina.setvizinhos(brasil,chile,paraguai,uruguai);
        brasil.setvizinhos(argentina,paraguai,uruguai,venezuela,peru);
        paraguai.setvizinhos(brasil,argentina);
        uruguai.setvizinhos(brasil,argentina);
        venezuela.setvizinhos(brasil);
        peru.setvizinhos(brasil,chile,equador);
        chile.setvizinhos(peru,argentina);
        equador.setvizinhos(peru);
        
        pais.listaVizinhos(argentina.getVizinhos());
        pais.listaVizinhos(brasil.getVizinhos());
        pais.listaVizinhos(paraguai.getVizinhos());
        pais.listaVizinhos(uruguai.getVizinhos());
        pais.listaVizinhos(venezuela.getVizinhos());
        pais.listaVizinhos(peru.getVizinhos());
        pais.listaVizinhos(chile.getVizinhos());
        pais.listaVizinhos(equador.getVizinhos());
        
        pais.listaVizinhos(argentina.vizinhosComum(brasil));
        pais.listaVizinhos(paraguai.vizinhosComum(brasil));
        pais.listaVizinhos(brasil.vizinhosComum(chile));
        
    
    }
    
}
