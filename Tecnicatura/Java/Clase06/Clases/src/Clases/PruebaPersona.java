//Plantilla armada para mostrar la clase creada de Perosna
package Clases;

public class PruebaPersona 
{
    public static void main(String[] args) {
        // Instanciamos el constructor para construir un objeto
        Persona persona1 = new Persona(); //Creamos el objeto con el constructor Persona()
        persona1.nombre = "Juan"; //El valor hexadecimal normalmente comienza con 0x
        persona1.apellido =  "Orellana";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2); //@3d494fbf espacio de memoria dado a persona2
        System.out.println("persona1  = " + persona1 ); //@133314b espacio de memoria dado a persona1
        persona2.obtenerInformacion(); //Nombre: null. Apellido: null
        
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordadini";
        persona2.obtenerInformacion();
    }
}
