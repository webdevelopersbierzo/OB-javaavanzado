package com.company;

public class CocheHibrido extends Coche{
    int velocidad;
    boolean encendido= false;
    boolean cargaBateria = false;

    public boolean bateriaBaja(){
        cargaBateria = true;
        return cargaBateria;
    }

    @Override
    void aumentarVelocidad() {
         velocidad++;
    }

    @Override
    void disminuirVelocidad() {
        velocidad--;
    }

    @Override
    boolean encenderCoche() {
       encendido = true;
       return encendido;
    }
}
