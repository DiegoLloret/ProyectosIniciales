/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MenuInicial {
    static ArrayList<Jugador> baseDeDatos;
    public static void main(String[] args) {
        baseDeDatos=new ArrayList<Jugador>();
        Scanner numeros = new Scanner(System.in);
        Scanner cadenas = new Scanner(System.in);
        

        int opcion = -1;
       
        Rifa rifa= new Rifa();
        

        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Rifa");
            System.out.println("2. aventura");
            System.out.println("3. Confirmar compra");
            System.out.println("4. Crear Usuario");
            System.out.println("5. Dar opinion de un articulo");
            System.out.println("6. Mostrar opiniones de un articulo");

            System.out.println("0. Salir");
            opcion = numeros.nextInt();

            switch (opcion) {
                case 1:
                     System.out.println("Ejecutando metodo rifa");
                     rifa.menuRifa();
                    break;
                case 2:
                     System.out.println("Ejecutando opcion 2");
                    break;
                case 3:
                     System.out.println("Ejecutando opcion 3");
                    break;
                case 4:
                     System.out.println("Ejecutando opcion 4");
                    break;
                case 5:
                    System.out.println("Ejecutando opcion 5");
                    break;
                case 6:
                     System.out.println("Ejecutando opcion 6");
                    break;
                case 0:
                    System.out.println("Muchas gracias por su compra.");
                    break;
                default:
                    System.out.println("Opcion incorrecta, lea atentamente.");
                    break;
            }
        } while (opcion != 0);

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
public static void añadirJugador(Jugador j){
    System.out.println("antes de añadir jugador.");
    baseDeDatos.add(j);
    System.out.println(j.getNombre());
}
}
