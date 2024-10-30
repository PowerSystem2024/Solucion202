/*
PROYECTO CAJA.
EJERCICIO 01:
CREAR UN PROYECTO SEGUN LAS ESPECIFICACIONES
MOSTRADAS A CONTINUACION
LA FORMULA ES: VOLUMEN = ANCHO * ALTO * PROFUNDIDAD
 */
package caja;

public class Caja {
    float ancho;
    float alto;
    float profundo;
    public Caja(){
    }
    public Caja(float ancho, float alto, float profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public float volumen() {
        return ancho * alto * profundo;
    }
}
