/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jugueteria;

/**
 *
 * @author SALAS
 */
public class Main {
    public static void main(String[] args) {
        //Carro c = new Carro();
        // Creamos una vraible tipo padre, y se implementa el tipo hijo
        JugueteFactoryAbstracto fabricaJuguetes = new JugueteFactoryConcreto();
        Juguete carro;
        carro = fabricaJuguetes.producirJuguete("Carro");
        
        
        System.out.println(carro);
        
        /*
        Carro c = (Carro)fabricaJuguetes.producirJuguete("Carro");
        System.out.println(c);
        */
        
    }
}
