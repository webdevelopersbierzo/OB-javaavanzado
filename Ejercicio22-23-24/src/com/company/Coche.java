package com.company;

public class Coche{
    public int velocidad;
    public boolean encendido= false;

    public void aumentarVelocidad(){
        velocidad+=15;
    }
    public void disminuirVelocidad(){
        velocidad--;
    }
    public boolean encenderCoche(){
        encendido= true;
        return encendido;
    }

    public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" +
                "velocidad=" + velocidad +
                ", encendido=" + encendido +
                '}';
    }
}
