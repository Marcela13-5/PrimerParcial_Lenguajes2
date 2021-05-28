package Util;
import Model.Vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Garaje {

    Set<Vehiculo> setVehiculo = new HashSet<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        setVehiculo.add(vehiculo);
    }

    public void mostrarVehiculos(){
        setVehiculo.forEach(System.out::println);
    }

}
