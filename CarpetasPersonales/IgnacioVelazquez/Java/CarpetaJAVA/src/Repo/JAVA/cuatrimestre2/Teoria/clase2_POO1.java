package Repo.JAVA.cuatrimestre2.Teoria;

public class clase2_POO1 {
    public static void main(String[] args) {
        /*
         * - **Clase**: Es una plantilla que define un tipo de objeto. Contiene
         *   atributos (variables) y métodos (funciones) que describen el
         *   comportamiento del objeto.
         * - **Objeto**: Es una instancia de una clase. Un objeto tiene un estado
         *   (definido por sus atributos) y un comportamiento (definido por sus métodos).
         * - **Constructor**: Es un método especial que se utiliza para crear objetos.
         * - **Encapsulamiento**: Es el principio de ocultar los detalles internos de
         *   un objeto y exponer solo lo necesario.
         * - **Herencia**: Permite crear nuevas clases basadas en clases existentes.
         * - **Polimorfismo**: Permite que objetos de diferentes clases sean tratados
         *   como objetos de una clase común.
        * */


        // Definición de la clase Persona
        class Persona {
            private String nombre;
            private int edad;

            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
            // Métodos getter y setter
            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public void mostrarInfo() {
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        }

        // Crear un objeto de la clase Persona y usar sus métodos
        Persona persona1 = new Persona("Ignacio", 32);
        persona1.mostrarInfo();

    }
}
