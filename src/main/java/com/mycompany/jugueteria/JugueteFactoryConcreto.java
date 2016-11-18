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
public class JugueteFactoryConcreto extends JugueteFactoryAbstracto{

    @Override
    public Juguete crearJuguete(String nombre) {
        // 4
        Juguete juguete;

        switch (nombre) {
            case "Carro":
                juguete = new Carro();
                break;
            case "Helicoptero":
                juguete = new Helicoptero();
                break;
            case "SapoSaltarin":
                juguete = new SapoSaltarin();
                break;
            default:
                juguete = null;
        }

        return juguete;
    }
    
}
