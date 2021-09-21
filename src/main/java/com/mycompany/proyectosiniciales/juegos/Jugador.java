/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

/**
 *
 * @author Diego
 */
public class Jugador {
    String Nombre;
    String DNI;
    int cartera;
    int boleto[];

    public Jugador(String Nombre, String DNI, int cartera, int[] boleto) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.cartera = cartera;
        this.boleto = boleto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
