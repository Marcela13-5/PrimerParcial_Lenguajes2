package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo {

    private Enum color;
    private String referencia;
    private String velocidadMaxima;

    private static int[] Garaje = new int[3];

    public Vehiculo(Enum color, String referencia, String velocidadMaxima) {
        this.color = color;
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Enum getColor() {
        return color;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String toString(){
        return "Color: " + color +
                " Referencia: " + referencia +
                " Velocidad Máxima: " + velocidadMaxima;
    }



}
