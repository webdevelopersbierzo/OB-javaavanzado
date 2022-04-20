package com.company;

public class Main {

    public static void main(String[] args) {
        // apartado 1
//	  Coche coche1 = new Coche();
//    coche1.aumentarVelocidad();
//    coche1.aumentarVelocidad();
//    coche1.encenderCoche();
//    System.out.println(coche1);

        // apartado 2
        Coche cocheFerrari = new CocheDeportivo();
        cocheFerrari.encenderCoche();
        cocheFerrari.aumentarVelocidad();
        cocheFerrari.aumentarVelocidad();
        cocheFerrari.aumentarVelocidad();
        cocheFerrari.disminuirVelocidad();
        System.out.println(cocheFerrari);

    }
}
