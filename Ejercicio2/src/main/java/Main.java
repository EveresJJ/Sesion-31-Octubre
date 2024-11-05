import models.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Teclado", 2500.20, 10);
        producto.imprimirInformacion();

        producto.actualizarCantidadDisponible(5);
        System.out.println("\nDespues de actualizar la cantidad:");
        producto.imprimirInformacion();
    }
}
