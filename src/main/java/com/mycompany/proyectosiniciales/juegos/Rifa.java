/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

import static com.mycompany.proyectosiniciales.juegos.MenuInicial.añadirJugador;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Diego
 */
public class Rifa {
    
    int boletoGanador[]= new int [5];
 
    public Rifa(){
     
    }
   
    public int[] getBoletoGanador() {
        return boletoGanador;
    }

    public void setBoletoGanador(int[] boletoGanador) {
        this.boletoGanador = boletoGanador;
    }

  
    public int[] GenerarBoleto(int[] boleto){
        for (int i = 0; i < boleto.length; i++) {
            int numeroRandom=ThreadLocalRandom.current().nextInt(0, 100 + 1);
            System.out.println(numeroRandom);
            boleto[i]= numeroRandom;
        }
        return boleto;
    }
    public  void menuRifa(){
    int opcionRifa = -1;
    Scanner numeros = new Scanner(System.in);
     do {
        
            System.out.println("Elige una opcion: ");
            System.out.println("1. Añadir jugador");
            System.out.println("2. boleto ganador");
            System.out.println("3. dar premio");
            System.out.println("0. Salir");
            opcionRifa = numeros.nextInt();

            switch (opcionRifa) {
                case 1:
                     System.out.println("Ejecutando metodo rifa");
                     Jugador j1= new Jugador("Paco");
                     j1.comprarBoleto(10);
                     añadirJugador(j1);
                    break;
                case 2:
                     System.out.println("Ejecutando opcion 2");
                     boletoGanador=resultadoRifa();
                     pintarBoletoGanador(boletoGanador);
                    break;
                case 3:
                     System.out.println("Ejecutando opcion 3");
                    break;
                 case 0:
                    System.out.println("Muchas gracias por jugar.");
                    break;
                default:
                    System.out.println("Opcion incorrecta, lea atentamente.");
                    break;
            }
        } while (opcionRifa != 0);

    }
    public int[] resultadoRifa(){
     int resultado[]= new int [5];
    for (int i = 0; i <resultado.length; i++) {
       
            int numeroRandom=ThreadLocalRandom.current().nextInt(0, 100 + 1);
            System.out.println(numeroRandom);
            resultado[i]= numeroRandom;
        }
    return resultado;
}
    
    public void pintarBoletoGanador(int []boleto){
   System.out.print("\n boleto ganador: (");
        for (int i = 0; i <boleto.length; i++) {
           
            System.out.print(boleto[i]+" ");
           
    }System.out.println(")");
}
}
