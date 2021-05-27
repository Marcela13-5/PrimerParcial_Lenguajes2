package Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menuGaraje() {
        Garaje garaje = new Garaje();
        InfoVehiculo infoVehiculo = new InfoVehiculo();

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
                teclado.nextLine();

                switch (opcionMenu){

                    case 1:


                        boolean arregloConEspacio = Garaje.espacioGaraje();
                        if (arregloConEspacio){
                            System.out.println("");
                            System.out.println("No hay espacio en el Garaje");
                            System.out.println("");
                        }
                        boolean salir1 = false;
                        int opcionMenu1;

                        if (!arregloConEspacio){
                            while (!salir1) {

                                System.out.println("Que vehiculo deseas agregar:");
                                System.out.println("1. Avion");
                                System.out.println("2. Yate");
                                System.out.println("3. Carro");
                                System.out.println("4. Salir");


                                try {

                                    System.out.println("Por favor elija una opción del menú: ");
                                    opcionMenu1 = teclado.nextInt();

                                    switch (opcionMenu1){

                                        case 1:
                                            garaje.agregarVehiculo(infoVehiculo.ingresarInfoAvion());
                                            break;

                                        case 2:
                                            garaje.agregarVehiculo(infoVehiculo.ingresarInfoYate());
                                            break;

                                        case 3:
                                            garaje.agregarVehiculo(infoVehiculo.ingresarInfoCarro());

                                        case 4:
                                            System.out.println("Has seleccionado la opción salir, muchas gracias por visitarnos");
                                            salir1 = true;
                                            break;

                                        default:
                                            System.out.println("Solo puedes elegir entre las opciones del 1 al 4");
                                            System.out.println("");
                                            teclado.nextLine();

                                    }

                                }catch (InputMismatchException exception){
                                    System.out.println("Debes insertar un número del 1 al 5");
                                    System.out.println("");
                                    teclado.nextLine();
                                }

                            }

                        }

                        break;


                    case 2:
                        garaje.mostrarVehiculos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opción salir, muchas gracias por visitarnos");
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
