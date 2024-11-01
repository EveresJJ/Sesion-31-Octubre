public class Producto {
        private String nombre;
        private double precio;
        private int cantidadDisponible;

        public Producto(String nombre, double precio, int cantidadDisponible) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadDisponible = cantidadDisponible;
        }

        public void actualizarCantidad(int nuevaCantidad) {
            this.cantidadDisponible = nuevaCantidad;
            System.out.println("La cantidad disponible de " + nombre + " ha sido actualizada a " + cantidadDisponible);
        }

        public double calcularValorTotal() {
            double valorTotal = precio * cantidadDisponible;
            System.out.println("El valor total de la existencia de " + nombre + " es: $" + valorTotal);
            return valorTotal;
        }

        // Métodos para obtener información de los atributos
        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }

        // Métodos para establecer nuevos valores en los atributos
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setCantidadDisponible(int cantidadDisponible) {
            this.cantidadDisponible = cantidadDisponible;
        }

        public static void main(String[] args) {
            Producto producto = new Producto("Laptop", 1200.00, 10);
            producto.actualizarCantidad(8);        // Actualiza la cantidad disponible
            producto.calcularValorTotal();         // Calcula el valor total de la existencia
        }
    }




