/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor ijfoweri.
 */
package com.mycompany.proyectosiniciales.juegos;

/**
 *
 * @author Diego
 */
public class Jugador {
    String Nombre;
      int boleto[];
      int aciertos;
      int premio;

    public Jugador(String Nombre, int[] boleto, int aciertos, int premio) {
        this.Nombre = Nombre;
        this.boleto = boleto;
        this.aciertos = aciertos;
        this.premio = premio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    public int[] getBoleto() {
        return boleto;
    }
    
    public void setBoleto(int[] boleto) {
        this.boleto = boleto;
    }
    
    
}
