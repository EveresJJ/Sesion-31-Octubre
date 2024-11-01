public class Persona {

        private String nombre;
        private String apellido;
        private String genero;

        public Persona(String nombre, String apellido, String genero) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
        }

        // Método para mostrar la información completa de la persona
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Género: " + genero);
        }

        // Métodos para obtener información de los atributos
        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getGenero() {
            return genero;
        }

        // Métodos para establecer nuevos valores en los atributos
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public static void main(String[] args) {
            Persona persona = new Persona("Javier", "Espinoza", "Masculino");
            persona.mostrarInformacion(); // Muestra la información de la persona
        }
    }






