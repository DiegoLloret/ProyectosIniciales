/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Diego
 */
public class Rifa {
     ArrayList<Jugador> baseDeDatosJugadores;
     
    int boletoGanador[]= new int [5];
 
    public Rifa(){
      baseDeDatosJugadores=new ArrayList<Jugador>();
    }
   
    public int[] getBoletoGanador() {
        return boletoGanador;
    }

    public void setBoletoGanador(int[] boletoGanador) {
        this.boletoGanador = boletoGanador;
    }

  
    public int[] GenerarBoleto(){
        int boleto[]= new int[5];
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
                    
                     añadirJugador(baseDeDatosJugadores);
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
                    recorrerJugadores(baseDeDatosJugadores);
                    
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
   System.out.print("\n"+" boleto ganador: (");
        for (int i = 0; i <boleto.length; i++) {
          if(i==boleto.length-1){
                System.out.print(boleto[i]);
          }else{
            System.out.print(boleto[i]+" ,");
          }
    }System.out.println(")");
}
    public int ResolucionRifa(int boleto[],int resultado[]){
    int acierto=0;
    for (int i = 0; i < boleto.length; i++) {
        for (int j = 0; j < resultado.length; j++) {
           if(boleto[i]==resultado[j]){
               acierto++;
           }
            
        }
    }
    return acierto;
}
    public void añadirJugador(ArrayList<Jugador> baseDeDatosJugadores){
       String nombre;
         Scanner cadenas = new Scanner(System.in);
    System.out.println("antes de añadir jugador.");
        System.out.println("Dime el nombre del jugador");
         nombre=cadenas.next();
       
        Jugador j =new Jugador(nombre, GenerarBoleto(),0,0);
        
    baseDeDatosJugadores.add(j);
        System.out.println("jugador: "+j.getNombre());
        pintarBoleto(j.getBoleto());
   
}
      public void pintarBoleto(int []boleto){
   System.out.print("\n"+" boleto: (");
        for (int i = 0; i <boleto.length; i++) {
          if(i==boleto.length-1){
                System.out.print(boleto[i]);
          }else{
            System.out.print(boleto[i]+" ,");
          }
    }System.out.println(")");
}
 public void recorrerJugadores(ArrayList<Jugador> baseDeDatosJugadores){
     for (int i = 0; i < baseDeDatosJugadores.size(); i++) {
         System.out.println("nombre: "+ baseDeDatosJugadores.get(i).getNombre()+"\n boleto: "+ baseDeDatosJugadores.get(i).getBoleto()+"\n aciertos: "+ baseDeDatosJugadores.get(i).aciertos+"\n`premio: "+baseDeDatosJugadores.get(i).getPremio());
     }
 }     
}
