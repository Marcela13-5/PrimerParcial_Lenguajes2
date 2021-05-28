package Util;
import Model.Color;
import Model.Vehiculo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Garaje {

    Set<Vehiculo> setVehiculo = new HashSet<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        setVehiculo.add(vehiculo);
    }

    public void mostrarVehiculos(){
        setVehiculo.forEach(System.out::println);
    }

    List<ReferenciaVehiculo> referenciaVehiculo = setVehiculo.stream()
            .filter(setVehiculo -> (Vehiculo.getColor() = Color.BLANCO) || (Vehiculo.getColor() = Color.VERDE))
            .map(Vehiculo -> new ReferenciaVehiculo(Vehiculo.getReferencia()));


}
