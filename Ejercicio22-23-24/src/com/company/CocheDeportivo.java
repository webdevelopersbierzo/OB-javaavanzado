package com.company;

public class CocheDeportivo implements Coche{
    int velocidad;
    boolean encendido = false;
    int numeroOcupantes = 2;


    @Override
    public void aumentarVelocidad() {
        velocidad +=15;
    }

    @Override
    public void disminuirVelocidad() {
        velocidad -= 15;
    }

    @Override
    public boolean encenderCoche() {
        encendido = true;
        return encendido;
    }

    @Override
    public String toString() {
        return "CocheDeportivo{" +
                "velocidad=" + velocidad +
                ", encendido=" + encendido +
                ", numeroOcupantes=" + numeroOcupantes +
                '}';
    }
}
