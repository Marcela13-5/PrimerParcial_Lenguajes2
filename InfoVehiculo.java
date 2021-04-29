package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InfoVehiculo {

    private static Scanner teclado = new Scanner(System.in);


    public Vehiculo ingresarInfo(){

        System.out.println("Ingrese el color del vehiculo");
        Color color = menuColores();
        teclado.nextLine();

        System.out.println("Ingrese la referencia del vehiculo");
        String referencia = teclado.nextLine();

        System.out.println("Ingrese la velocidad maxima del Vehiculo");
        double velocidadMaxima = Double.parseDouble(teclado.nextLine());//REVISAR COMO SE HARA INGRESO DEL double

        return new Vehiculo(color,referencia,velocidadMaxima);


    }

    private static Color menuColores(){
        boolean opcionColor = false;

        while (!opcionColor){

            System.out.println("¿Que color del menú quieres?");
            System.out.println("1. NEGRO");
            System.out.println("2. BLANCO");
            System.out.println("3. AZUL");
            System.out.println("4. VERDE");
            System.out.println("5. GRIS");

            try {
                int opcionColorMenu = teclado.nextInt();

                switch (opcionColorMenu) {

                    case 1:
                        opcionColor = true;
                        return Color.NEGRO;

                    case 2:
                        opcionColor = true;
                        return Color.BLANCO;

                    case 3:
                        opcionColor = true;
                        return Color.AZUL;

                    case 4:
                        opcionColor = true;
                        return Color.VERDE;

                    case 5:
                        opcionColor = true;
                        return Color.GRIS;

                    default:
                        System.out.println("Solo puedes elegir entre las opciones del 1 al 5");
                        teclado.nextLine();

                }
            }catch (InputMismatchException exception){
                System.out.println("Debes insertar un número del 1 al 5");
                teclado.nextLine();
            }

        }
        return Color.ERROR;
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
