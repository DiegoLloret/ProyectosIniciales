/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Aventura {
    Personaje prota= new Personaje();
    Prueba foso=new Prueba("Foso",2,3);
    Personaje boxeador1= new Personaje("Logan Paul",10,5);
    Personaje boxeador2= new Personaje("floyd mayweather",20,10);
    Personaje boxeador3= new Personaje("Muhammad Ali",20,15 );
    
    public Aventura() {
    }
    public void IniciarAventura(){
        CrearProta();
        
        Introduccion();
        System.out.println(LanzarDados(5));
       // SaltarFoso();
        
    }
    public int LanzarDados(int numeroDados){
        int exitos=0;
        int numeroRandom= (int) (Math.random()*10+1);
        for (int i = 0; i < numeroDados; i++) {
            if (numeroRandom>7){
                exitos++;
            }
        }
        return exitos;
    }
    public void CrearProta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nombre: ");
        prota.nombre=sc.nextLine();
        System.out.println(" fuerza: ");
        prota.fuerza=Integer.parseInt(sc.nextLine());
        System.out.println(" defensa: ");
        prota.defensa=Integer.parseInt(sc.nextLine());
        prota.vida=100;
    }
    
    public void Introduccion(){
        System.out.println("\n Estas apunto de tener una pelea de boxeo que podrá coronarte como el mejor boxeador de la historia");
    }
   /* public void SaltarFoso(){
        int exitos=0;
        for (int i = 0; i < grupo.length; i++) {
              exitos=LanzarDados(grupo[i].fuerza+grupo[i].destreza);
        System.out.println(grupo[i].nombre+" Intenta saltar el foso");
        System.out.println("exitos:"+exitos);
        if(exitos>=foso.dificultad){
            
            System.out.println(prota.nombre+" salta el foso");
        }else{
            System.out.println(grupo[i].nombre+" se ha caido y sufre "+foso.daño);
            grupo[i].vida-=foso.daño;
            System.out.println("le quedan "+grupo[i].vida+" puntos de vida");
        }
        }
    }*/
}
