package com.mycompany.jugueteria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SALAS
 */
public class Juguete {
    private String nombre;
    private Double precio;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
    public void preparar() {
        System.out.printf("Juguete Preparado");

    }

    public void empaquetar() {
        System.out.printf("Juguete Empaquetado");
  
    }

    public void etiquetar() {
        System.out.printf("Juguete Etiquetado");
       
    }

    @Override
    public String toString() {
        return "Juguete{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    
}
