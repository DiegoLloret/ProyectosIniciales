/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

/**
 *
 * @author Admin
 */
public class Personaje {
    String nombre;
    int fuerza, defensa;
    int vida=100;
    
    
    

    public Personaje() {
    }

    public Personaje(String nombre, int fuerza, int defensa) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa= defensa;
        
    }
    
    
}
