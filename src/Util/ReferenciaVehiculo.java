package Util;

public class ReferenciaVehiculo {

    private String referencia;

    public ReferenciaVehiculo(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "ReferenciaVehiculo{" +
                "referencia='" + referencia + '\'' +
                '}';
    }
}
