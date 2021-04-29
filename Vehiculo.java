package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo {

    private Color color;
    private String referencia;
    private double velocidadMaxima;

    //private static Vehiculo[] garaje = new Vehiculo[3];

    public Vehiculo(Color color, String referencia, double velocidadMaxima) {
        this.color = color;
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(Vehiculo vehiculo){
        this.color = vehiculo.getColor();
        this.referencia = vehiculo.getReferencia();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
    }

    public Color getColor() {
        return color;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String toString(){
        return "Color: " + color +
                " Referencia: " + referencia +
                " Velocidad Máxima: " + velocidadMaxima;
    }



}
