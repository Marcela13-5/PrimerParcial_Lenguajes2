package Util;
import Model.Color;
import Model.Vehiculo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Garaje {

    Set<Vehiculo> setVehiculo = new HashSet<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        setVehiculo.add(vehiculo);
    }

    public void mostrarVehiculos(){
        setVehiculo.stream()
                .filter(vehiculo -> vehiculo.getColor == Color.AZUL || vehiculo.getColor == Color.NEGRO);
        setVehiculo.forEach(System.out::println);
    }

    public void valorVelocidadMaxima(){
        setVehiculo.stream()
                .max(Comparator.comparing(vehiculo -> vehiculo.getVelocidadMaxima()));
    }

    public void valorVelocidadMenor(){
        setVehiculo.stream()
                .min(Comparator.comparing(vehiculo -> vehiculo.getVelocidadMaxima()));
    }

    public valorReferenciaVehiculo(){
        setVehiculo.stream()
                .filter(vehiculo -> (Vehiculo.getColor() = Color.BLANCO) || (Vehiculo.getColor() = Color.VERDE))
                .map(vehiculo -> new ReferenciaVehiculo(Vehiculo.getReferencia()));
    }


}
