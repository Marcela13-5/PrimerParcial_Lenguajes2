package com.company;

public class Carro extends Vehiculo{

    private int numeroDePuertas;


    public Carro(Color color, String referencia, double velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroDePuertas){
        super(vehiculo);
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
