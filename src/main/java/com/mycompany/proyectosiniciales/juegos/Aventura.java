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
 * @author Admin
 */
public class Aventura {

    int limite = 2;
    Personaje prota = new Personaje();
    Personaje boxeador1 = new Personaje("Logan Paul", 10, 5);
    Personaje boxeador2 = new Personaje("floyd mayweather", 20, 10);
    Personaje boxeador3 = new Personaje("Muhammad Ali", 20, 15);
    Golpe golpe1 = new Golpe("Jab", 5, 7);
    Golpe golpe2 = new Golpe("directo", 6, 6);
    Golpe golpe3 = new Golpe("Uppercut", 7, 5);
    Golpe golpe4 = new Golpe("Crochet", 8, 4);
    ArrayList<Golpe> BaseGolpes = new ArrayList<Golpe>();
    ArrayList<Personaje> baseDeDatosBoxeadores = new ArrayList<Personaje>();

    public Aventura() {
    }

    public void IniciarAventura() {
        int nbox;
        CrearProta();
        AñadirBoxeador();
        AñadirGolpe();
        PintarBoxeador(baseDeDatosBoxeadores);
        nbox = ElegirContrincante();
        Introduccion(baseDeDatosBoxeadores, nbox);
        Pelear(prota, baseDeDatosBoxeadores.get(nbox), limite);

    }

    public int LanzarDados() {

        int numeroRandom = (int) (Math.random() * 10 + 1);

        return numeroRandom;
    }

    public void CrearProta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre: ");
        prota.nombre = sc.nextLine();
        System.out.println(" fuerza: ");
        prota.fuerza = Integer.parseInt(sc.nextLine());
        System.out.println(" defensa: ");
        prota.defensa = Integer.parseInt(sc.nextLine());
        prota.vida = 100;
    }

    public void Introduccion(ArrayList<Personaje> baseDeDatosBoxeadores, int nbox) {
        Personaje p = baseDeDatosBoxeadores.get(nbox);
        System.out.println("\n Estas apunto de tener una pelea de boxeo que podrá coronarte como el mejor boxeador de la historia contra " + p.getNombre());
        System.out.println("Cuantas rondas quieres que dure el combate?");
        Scanner sc = new Scanner(System.in);
        limite = sc.nextInt();
    }

    public void AñadirBoxeador() {
        baseDeDatosBoxeadores.add(boxeador1);
        baseDeDatosBoxeadores.add(boxeador2);
        baseDeDatosBoxeadores.add(boxeador3);
    }

    public void AñadirGolpe() {
        BaseGolpes.add(golpe1);
        BaseGolpes.add(golpe2);
        BaseGolpes.add(golpe3);
        BaseGolpes.add(golpe4);
    }

    public void PintarBoxeador(ArrayList<Personaje> baseDeDatosBoxeadores) {
        Personaje p;
        System.out.println("Elige a tu contrincante");
        for (int i = 0; i < baseDeDatosBoxeadores.size(); i++) {
            p = baseDeDatosBoxeadores.get(i);

            System.out.println(i + "  boxeador: " + p.getNombre() + " con una fuerza de: " + p.getFuerza() + " y una defensa de: " + p.defensa);
        }
    }

    public void PintarGolpes(ArrayList<Golpe> BaseGolpes) {
        Golpe p;
        System.out.println("Elige el golpe que quieres utilizar");

        for (int i = 0; i < BaseGolpes.size(); i++) {
            p = BaseGolpes.get(i);
            System.out.println(i + "  golpe: " + p.getNombre() + " con un daño de: " + p.getDaño() + " y una efectividad de: " + p.efectividad);
        }
    }

    public int ElegirContrincante() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        while (opcion >= baseDeDatosBoxeadores.size()) {
            PintarBoxeador(baseDeDatosBoxeadores);
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public void Golpear(Personaje atacante, Personaje defensor, Golpe golpe) {
        int daño = atacante.fuerza + golpe.daño - defensor.defensa;
        if (LanzarDados() <= golpe.efectividad) {

            if (daño < 1) {
                daño = 1;
                defensor.vida -= daño;
                System.out.println(atacante.nombre + " ha dado " + daño + " a " + defensor.nombre);
            } else {
                defensor.vida -= daño;
                System.out.println(atacante.nombre + " ha dado " + daño + " a " + defensor.nombre);
            }

        } else {
            System.out.println(defensor.nombre + " ha esquivado el golpe de " + atacante.nombre);
        }
    }

    public void Pelear(Personaje atacante, Personaje defensor, int limite) {
        int ngol;
        int ngolpes = 0;

        while (atacante.vida > 0 && defensor.vida > 0 && ngolpes < limite) {

            ngol = ElegirGolpe();
            Golpe g = BaseGolpes.get(ngol);
            Golpear(atacante, defensor, g);
            Golpear(defensor, atacante, ElegirGolpeRandom());
            ngolpes++;
            System.out.println("vida de " + atacante.nombre + " " + atacante.vida + " vida de " + defensor.nombre + " " + defensor.vida);
        }
        if (ngolpes == limite) {

            System.out.println("El combate ha terminado por tiempo y.....");
            if (atacante.vida >= defensor.vida) {
                System.out.println("el ganador a sido " + atacante.nombre + " con un total de puntos " + atacante.vida + " frente a los " + defensor.vida + " puntos de " + defensor.nombre + " y obtiene el titulo al mejor boxeador de la historia");
            } else {
                System.out.println("el ganador a sido " + defensor.nombre + " con un total de puntos " + defensor.vida + " frente a los " + atacante.vida + " puntos de " + atacante.nombre + " y obtiene el titulo al mejor boxeador de la historia");
            }
        } else {
            if (atacante.vida >= defensor.vida) {
                System.out.println("el ganador a sido " + atacante.nombre + " con una vida de " + atacante.vida + " y obtiene el titulo al mejor boxeador de la historia");
            } else {
                System.out.println("el ganador a sido " + defensor.nombre + " con una vida de " + defensor.vida + " y obtiene el titulo al mejor boxeador de la historia");
            }
        }
    }

    public int ElegirGolpe() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        PintarGolpes(BaseGolpes);
        opcion = sc.nextInt();
        while (opcion >= BaseGolpes.size()) {
            PintarGolpes(BaseGolpes);
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public Golpe ElegirGolpeRandom() {
        int numeroRandom = (int) (Math.random() * 3);

        return BaseGolpes.get(numeroRandom);
    }

}
