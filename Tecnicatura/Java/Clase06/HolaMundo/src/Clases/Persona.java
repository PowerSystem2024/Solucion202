
package Clases;

public class Persona {
        // COMO UNA BUENA PRACTICA RECOMIENDA COLOCAR AL INICIO LOS ATRIBUTOS DEL OBJETO
        
        // ATRIBUTOS DE CLASE (CARACTERÍSTICAS)
        public String nombre; // Se coloca public adelante para que pueda ser usado en la clase PasoPorReferencia
        public String apellido;
        
    // 4.1 Métodos: METODOS DE LA CLASE (ACCIONES)
        public void obtenerInformacion(){
            System.out.println("Nombre = " + nombre);
            System.out.println("Apellido = " + apellido);
        }
    }