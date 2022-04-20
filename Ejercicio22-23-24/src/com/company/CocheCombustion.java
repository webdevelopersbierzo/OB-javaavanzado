package com.company;

public class CocheCombustion extends Coche{
    int velocidad;
    boolean encendido= false;
    boolean reservaGasolina = false;

    public boolean encenderReserva(){
        reservaGasolina = true;
        return reservaGasolina;
    }
    @Override
    void aumentarVelocidad() {

    }

    @Override
    void disminuirVelocidad() {

    }

    @Override
    boolean encenderCoche() {
        return false;
    }
}
