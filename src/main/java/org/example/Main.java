package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Personaje personaje = new Personaje();
        Zombie zombie = new Zombie();


        System.out.println("***** RESIDENT EVIL CODE BY NO ONES");
        /*
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
         */

        System.out.println(personaje.nombrePersonaje + " VS " + zombie.nombreZombie);
    }
}

class Personaje {
    Scanner scanner = new Scanner(System.in);
    final String nombrePersonaje = "Leon S. Kenny";
    final short saludPersonaje = 150;
    byte Edad, opcionAtaque, ataque;

    public void Ataque() {
        System.out.println("Posibles ataques: ");
        System.out.println(" 1. cuchillo" +
                "\n 2. Matilda" +
                "\n 3. Escopeta" +
                "\n 4. Rifle" +
                "\n 5. magnum");
        System.out.print("Elija la opcion de ataque: ");
        scanner.nextByte();
        switch (opcionAtaque){
            case 1:
                ataque = 10;
            case 2:
                ataque = 30;
            case 3:
                ataque = 50;
            case 4:
                ataque = 75;
            case 5:
                ataque = 100;
        }
    }
}

class Zombie  {
    Scanner scanner = new Scanner(System.in);

    final String nombreZombie = "Zombie1";
    final short saludZombie = 200;
    byte opcionAtaque, ataque;

    public void ataqueZombie(){
        System.out.println("Posibles ataques: ");
        System.out.println(" 1. Mordida" +
                " \n2. Garra");
        System.out.print("Elija la opcion de ataque: ");
        scanner.nextByte();
        switch (opcionAtaque){
            case 1:
                ataque = 50;
            case 2:
                ataque = 75;
        }
    }

}