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
public abstract class JugueteFactoryAbstracto {
    public abstract Juguete crearJuguete(String nombre);
    
    // 3
    public Juguete producirJuguete(String nombre){
        
        Juguete juguete;
        
        
        juguete= crearJuguete(nombre);
        
        
        juguete.preparar();
        juguete.empaquetar();
        juguete.etiquetar();
        return juguete;
    }
}
