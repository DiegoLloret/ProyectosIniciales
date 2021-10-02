/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MenuInicial {
    
    public static void main(String[] args) {
       
        Scanner numeros = new Scanner(System.in);
        Scanner cadenas = new Scanner(System.in);
        

        int opcion = -1;
       
        Rifa rifa= new Rifa();
        Aventura aventura= new Aventura();

        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Rifa");
            System.out.println("2. aventura");
          

            System.out.println("0. Salir");
            opcion = numeros.nextInt();

            switch (opcion) {
                case 1:
                     System.out.println("Ejecutando rifa");
                     rifa.menuRifa();
                    break;
                case 2:
                     System.out.println("Ejecutando Aventura");
                     aventura.IniciarAventura();
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
        } while (opcion != 0);

    }





}
