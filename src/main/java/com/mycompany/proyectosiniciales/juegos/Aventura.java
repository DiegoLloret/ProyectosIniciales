/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosiniciales.juegos;

/**
 *
 * @author Admin
 */
/*
public class Aventura {
    Personaje prota= new Personaje();
    Prueba foso=new Prueba("Foso",2,3);
    Personaje escudero= new Personaje("Sancho",2,2,3,1,1,3,1,1,2,1);
    Personaje consejero= new Personaje("Manolo",1,1,2,3,3,2,3,3,2,1);
    Personaje musico= new Personaje("Mozart",1,3,2,3,3,2,1,1,2,1);
    Personaje [] grupo= new Personaje[4];
    public Aventura() {
    }
    public void IniciarAventura(){
        CrearProta();
        CrearGrupo();
        Introduccion();
        System.out.println(LanzarDados(5));
        SaltarFoso();
        
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
        System.out.println(" destreza: ");
        prota.destreza=Integer.parseInt(sc.nextLine());
        System.out.println(" constitucion: ");
        prota.constitucion=Integer.parseInt(sc.nextLine());
        System.out.println(" carisma: ");
        prota.carisma=Integer.parseInt(sc.nextLine());
        System.out.println(" manipulacion: ");
        prota.manipulacion=Integer.parseInt(sc.nextLine());
        System.out.println(" compostura: ");
        prota.compostura=Integer.parseInt(sc.nextLine());
        System.out.println(" inteligencia: ");
        prota.inteligencia=Integer.parseInt(sc.nextLine());
        System.out.println(" astucia: ");
        prota.astucia=Integer.parseInt(sc.nextLine());
        System.out.println(" aplomo: ");
        prota.aplomo=Integer.parseInt(sc.nextLine());
        prota.vida=5+ prota.constitucion;
    }
    public void CrearGrupo(){
        grupo[0]=prota;
        grupo[1]=escudero;
        grupo[2]=consejero;
        grupo[3]=musico;
    }
    public void Introduccion(){
        System.out.println("\n EStas con Gandalf huyendo del Balrog cuando de repente llegais a un puente con un foso");
    }
    public void SaltarFoso(){
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
    }
}
*/