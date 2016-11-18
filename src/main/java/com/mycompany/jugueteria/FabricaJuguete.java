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
public class FabricaJuguete {
    
        private SimpleJugueteFactory factory;
        
        public FabricaJuguete(SimpleJugueteFactory factory){
            this.factory=factory;
        }
    
    public Juguete producirJuguete(String nombre){
        
        Juguete juguete;
        
        
        juguete= factory.crearJuguete(nombre);
        
        /*
        1)
        Juguete juguete;
        switch(nombre){
            case "Carro":
                juguete=new Carro();
                break;
            case "Helicoptero":
                juguete = new Helicoptero();
                break;
            case "SapoSaltarin":
                juguete = new SapoSaltarin();
                break;
            default:
                juguete=null;
        }
        */
        
        juguete.preparar();
        juguete.empaquetar();
        juguete.etiquetar();
        return juguete;
    }
}
