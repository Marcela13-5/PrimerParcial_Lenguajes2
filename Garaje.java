package com.company;

public class Garaje {

    public static int numMaxVehiculos = 10;

    public static Vehiculo[] vehiculos = new Vehiculo[numMaxVehiculos];

    public void agregarVehiculo(Vehiculo vehiculo){
        int celdaDisponible = espacioDisponible();
        vehiculos[celdaDisponible] = vehiculo;
    }

    public void mostrarVehiculos(){
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo != null){
                System.out.println(vehiculo);
            }
        }
    }

    public int espacioDisponible(){
        for (int i = 0; i<vehiculos.length; i++){
            if (vehiculos[i] == null){
                return i;
            }

        }
        return -1;
    }

    public static boolean espacioGaraje(){
        boolean garajeLleno = false;
        int i;
        for (i=0; i<vehiculos.length;i++){
            if (vehiculos[i]== null){
                garajeLleno = false;
            }else {
                garajeLleno = true;
            }
        }

        return garajeLleno;
    }
}
