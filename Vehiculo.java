package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo {

    private String color;
    private String referencia;
    private String velocidadMaxima;

    private static Vehiculo[] garaje = new Vehiculo[3];

    public Vehiculo(String color, String referencia, String velocidadMaxima) {
        this.color = color;
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(Vehiculo vehiculo){
        this.color = vehiculo.getColor();
        this.referencia = vehiculo.getReferencia();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();

    }

    public static boolean espacioGaraje(){
        boolean garajeLleno = false;
        int i;
        for (i=0; i<garaje.length;i++){
            if (garaje[i]== null){
                garajeLleno = false;
            }else {
                garajeLleno = true;
            }
        }

        return garajeLleno;
    }

    public String getColor() {
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
