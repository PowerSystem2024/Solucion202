// 8.1 Encapsulamiento Parte 2: hacer tarea
// 8.2 Encapsulamiento Parte 3: default-package, public, private

package test;

// Formas de importar: import dominio.Persona o dominio.* 
// Esto no quiere decir que se activa ese espacio de memoria
// Al importar solo se reserva el posible acceso
import dominio.Persona; // Si se encuentra en otro paquete se debe importar


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Emmanuel", 50000, false);
        System.out.println("persona1: "+persona1.toString());
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        // Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        // la modificacion sin encapsulamiento era persona1.nombre = ""
        // System.out.println("El nombre es: " + persona1.nombre); // Error
        System.out.println("persona1 con su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        
        /* 
        TAREA:
        CREAR OTRO OBJETO DE TIPO PERSONA
        ASIGNAR VALORES DE MANERA INICIAL E IMPRIMIRLO
        LUEGO MODIFICAR SUS VALORES Y VOLVER A IMPRIMIR
        */
        
        // Creacion de nuevo objeto
        Persona persona2 = new Persona("Luciana", 75000, true); // Asignacion de valores: String, double, boolean
        // Impresion a traves del metodo get
        System.out.println("persona2 su nombre es: "+persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        // Modificacion con método set
        persona2.setNombre("Lu");
        persona2.setSueldo(100000);
        persona2.setEliminado(false);
        // Imprimimos con metodo get los valores de persona2 modificados
        System.out.println("\npersona 2 con los valores modificados: ");
        System.out.println("persona2 su nombre es: "+persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        
        // 8.3 Método toString
        System.out.println("persona1: "+persona1.toString());
        System.out.println("persona1 = " + persona1); // De esta forma llama automaticamente al toString creado en la class Persona
    }
}
