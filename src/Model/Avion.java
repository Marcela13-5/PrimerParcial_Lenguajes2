package Model;

public class Avion extends Vehiculo {

    private int altitudMaxima;

    public Avion(Color color, String referencia, double velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
    }
    /*ESTO ES UN COMENTARIO*/
    public Avion(Vehiculo vehiculo, int altitudMaxima){
        super(vehiculo);
        this.altitudMaxima = altitudMaxima;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Altitud Maxima: " + altitudMaxima;
    }
}
