package com.company;

public class Carro extends Vehiculo{

    private int numeroDePuertas;


    public Carro(Enum color, String referencia, String velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Numero de Puertas: " + numeroDePuertas;
    }
}
