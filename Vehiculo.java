package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo {

    private Color color;
    private String referencia;
    private double velocidadMaxima;

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


    public static  class VehiculoBuilder {

        private Color color;
        private String referencia;
        private double velocidadMaxima;


        public VehiculoBuilder color(Color color){
            this.color = color;
            return this;
        }

        public VehiculoBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }


        public VehiculoBuilder velocidadMaxima(double velocidadMaxima){
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }

        public Vehiculo build(){
            return new Vehiculo(color,referencia,velocidadMaxima);
        }

    }



}
