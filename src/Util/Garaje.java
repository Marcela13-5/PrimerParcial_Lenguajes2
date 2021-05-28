package Util;
import Model.Vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Garaje {

    public static int numMaxVehiculos = 3;

    /*public static Vehiculo[] vehiculos = new Vehiculo[numMaxVehiculos];*/

    Set<Vehiculo> setVehiculo = new HashSet<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        /*int i = espacioDisponible();
        if(i == -1) {
            System.out.println("No hay espacio en el garaje");
            }else {*/
            setVehiculo.add(vehiculo);
            /*int celdaDisponible = espacioDisponible();

            vehiculos[celdaDisponible] = vehiculo;
        }*/

        /*ESTO ES UN COMENTARIO*/

    }

    public void mostrarVehiculos(){
         /*for (Vehiculo vehiculo: vehiculos){
            if (vehiculo != null){
                System.out.println(vehiculo);
            }
        }

          */

        setVehiculo.forEach(System.out::println);
    }

    /*public int espacioDisponible(){
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
    }*/
}
