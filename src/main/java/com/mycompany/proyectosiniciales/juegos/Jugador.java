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
    int cartera;
    int boleto[];

     public Jugador(String Nombre){
         this.Nombre = Nombre; 
     }
    public Jugador(String Nombre, int cartera, int[] boleto) {
        this.Nombre = Nombre;
        
        this.cartera = cartera;
        this.boleto = boleto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getCartera() {
        return cartera;
    }

    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    public int[] getBoleto() {
        return boleto;
    }

    public void setBoleto(int[] boleto) {
        this.boleto = boleto;
    }
    
    public int [] comprarBoleto(int precio){
        Rifa a;
        if(cartera>precio){
            a= new Rifa();
            a.GenerarBoleto(boleto);
        }
        return boleto;
    }
}
