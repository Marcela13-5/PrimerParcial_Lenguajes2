package com.company;

public class Avion extends Vehiculo{

    private int altitudMaxima;

    public Avion(Enum color, String referencia, String velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Altitud Maxima: " + altitudMaxima;
    }
}
