package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Personaje personaje = new Personaje();


        System.out.println("***** RESIDENT EVIL CODE BY NO ONES");

        //Personaje leon S. KJennedy
        //Nombre
        //Edad
        //Cantidad de Vida

        //Personake MR X (TITAN)
        //Nombre
        //virusqueloinfecto
        //cantidadDeVida
        final String nombrePersonaje;
        final byte saludPersonaje;
        byte Edad;

        final String nombreZombie, tipoVirus;
        byte saludZombie;
    }
}

class Personaje{
    String nombre;
    byte salud, Edad;

    public void ataque(){
        System.out.println("Posibles ataques: ");
        System.out.println(" 1. cuchillo" +
                " 2. Matilda");
    }

}