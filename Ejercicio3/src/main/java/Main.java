import models.Direccion;
import models.Empresa;

public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle La Libertad", "Granada, Nicaragua", "505222");
        Empresa empresa = new Empresa("DIMARCAS", direccion);
        empresa.mostrarDetalles();
    }
}
