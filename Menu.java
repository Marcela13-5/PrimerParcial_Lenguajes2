package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void menuGaraje() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcionMenu;

        System.out.println("BIENVENIDOS AL GARAJE");
        System.out.println("");

        while (!salir){

            System.out.println("Que deseas realizar en nuestro garaje:");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Mostrar garaje");
            System.out.println("3. Salir");

            try{

                System.out.println("Por favor elija una opción del menú: ");
                opcionMenu = teclado.nextInt();

                switch (opcionMenu){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo puedes elegir entre las opciones del 1 al 3");
                        System.out.println("");
                        teclado.nextLine();
                }

            }catch (InputMismatchException exception){
                System.out.println("Debes insertar un número del 1 al 3");
                System.out.println("");
                teclado.nextLine();

            }



        }

    }
}
