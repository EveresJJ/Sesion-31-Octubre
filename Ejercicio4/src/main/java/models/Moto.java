package models;

public class Moto extends Vehiculo {
    private boolean tienePlaca;

    public Moto(String marca, String modelo, int anio, boolean tienePlaca) {
        super(marca, modelo, anio);
        this.tienePlaca = tienePlaca;
    }

    public boolean isTienePlaca() {
        return tienePlaca;
    }

    @Override
    public void imprimirInformacion(){
        super.imprimirInformacion();
        System.out.println("Tiene placa: " + tienePlaca);
    }
}
