package com.company;

public class Yate extends Vehiculo{

    private int pesoMaximo;

    public Yate(String color, String referencia, String velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, int pesoMaximo){
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Peso Máximo: " + pesoMaximo;
    }
}
