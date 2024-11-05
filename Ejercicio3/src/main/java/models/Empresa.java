package models;

public class Empresa {
    private String nombreEmpresa;
    private Direccion direccion;

    public Empresa(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Direccion: " + direccion.obtenerDetalles());
    }
}
