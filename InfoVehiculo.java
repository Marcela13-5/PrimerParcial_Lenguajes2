package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InfoVehiculo {

    Scanner teclado = new Scanner(System.in);


    public Vehiculo ingresarInfo(){

        System.out.println("Ingrese el color del carro");
        Color color = menuColores;

    }

    private static Color menuColores(){
        boolean opcionColor = false;

        while (!opcionColor){

            System.out.println("¿Que color del menú quieres?");
            System.out.println("1. BLANCO");
            System.out.println("2. NEGRO");
            System.out.println("3. GRIS");
            System.out.println("4. AZUL");
            System.out.println("5. ROSA");

            try {
                int opcionColorMenu = teclado.nextInt();

                switch (opcionColorMenu) {

                    case 1:
                        opcionColor = true;
                        return ColorPrenda.BLANCO;

                    case 2:
                        opcionColor = true;
                        return ColorPrenda.NEGRO;

                    case 3:
                        opcionColor = true;
                        return ColorPrenda.GRIS;

                    case 4:
                        opcionColor = true;
                        return ColorPrenda.AZUL;

                    case 5:
                        opcionColor = true;
                        return ColorPrenda.ROSA;

                    default:
                        System.out.println("Solo puedes elegir entre las opciones del 1 al 5");
                        teclado.nextLine();

                }
            }catch (InputMismatchException exception){
                System.out.println("Debes insertar un número del 1 al 5");
                teclado.nextLine();
            }

        }
        return ColorPrenda.ERROR;
    }
}
