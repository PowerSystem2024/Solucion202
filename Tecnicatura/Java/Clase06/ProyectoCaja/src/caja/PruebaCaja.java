/*
PROYECTO CAJA.
EJERCICIO 01:
CREAR UN PROYECTO SEGUN LAS ESPECIFICACIONES
MOSTRADAS A CONTINUACION
LA FORMULA ES: VOLUMEN = ANCHO * ALTO * PROFUNDIDAD
 */
package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        float ancho = 3;
        float alto = 2;
        float profundo = 6;
    
        Caja caja1 = new Caja();
        caja1.ancho = ancho;
        caja1.alto = alto;
        caja1.profundo = profundo;
        float resultado = caja1.volumen();
        System.out.println("Volumen de caja 1: " + resultado);
    
        Caja caja2 = new Caja(2, 4, 6);
        
        float resultado2 = caja2.volumen();
        System.out.println ("Volumen de caja 2: " + resultado2);
    }
}
