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
public class SimpleJugueteFactory {
    // 2)
    // Simple Factori es una estrategia simple
    public Juguete crearJuguete(String nombre){
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
