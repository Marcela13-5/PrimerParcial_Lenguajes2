package com.company;
import java.util.Scanner;

public class InfoVehiculo {

    Scanner teclado = new Scanner(System.in);


    public Vehiculo ingresarInfo(){

        System.out.println("Ingrese el color del vehiculo");
        String color = teclado.nextLine();

        System.out.println("Ingrese la referencia del vehiculo");
        String referencia = teclado.nextLine();

        System.out.println("Ingrese la velocidad maxima del vwhiculo");
        String velocidadMaxima = teclado.nextLine();

        return new Vehiculo(color,referencia,velocidadMaxima);


    }

    public Avion ingresarInfoAvion(){
        System.out.println("Ingrese la informacón del Avión");
        Vehiculo vehiculo = ingresarInfo();
        System.out.println("Ingrese la informacón de la altiutd Maxima");
        int altitudMaxima = teclado.nextInt();
        teclado.nextLine();
        return new Avion(vehiculo,altitudMaxima);
    }

    public Yate ingresarInfoYate(){
        System.out.println("Ingrese la informacón del Yate");
        Vehiculo vehiculo = ingresarInfo();
        System.out.println("Ingrese la informacón del peso maximo");
        int pesoMaximo = teclado.nextInt();
        teclado.nextLine();
        return new Yate(vehiculo,pesoMaximo);
    }

    public Carro ingresarInfoCarro(){
        System.out.println("Ingrese la informacón del Carro");
        Vehiculo vehiculo = ingresarInfo();
        System.out.println("Ingrese la informacón del numero de puertas");
        int numeroDePuertas = teclado.nextInt();
        teclado.nextLine();
        return new Carro(vehiculo,numeroDePuertas);
    }
}
