/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Diego
 */
public class Rifa {
    int precio;
    int boleto[]= new int [5];
    int aciertos;
    public Rifa(){
     
    }
    public Rifa(int precio, int aciertos) {
        this.precio = precio;
        this.aciertos = aciertos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int[] getBoleto() {
        return boleto;
    }

    public void setBoleto(int[] boleto) {
        this.boleto = boleto;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    public int[] GenerarBoleto(int[] boleto){
        for (int i = 0; i < boleto.length; i++) {
            int numeroRandom=ThreadLocalRandom.current().nextInt(0, 100 + 1);
            System.out.println(numeroRandom);
            boleto[i]= numeroRandom;
        }
        return boleto;
    }
}
