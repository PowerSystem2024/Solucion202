/*
Ejercicio Resuelto por el profesor. El personal esta como Caja
Ejercicio1: Crear un proyecto segun las especificaciones mostradas a continuacion
La formula de volumen es = ancho*alto*profundidad
 */
package caja;

public class CajaAriel { //Clase publica
    
    //Atributos caracteristicas
    int ancho;
    int alto;
    int profundo;
    
    // Metodos y constructores (acciones)
    
    public CajaAriel(){ //Constructor 1 = vacio
        }
    
    //Constructor con parametros
    public CajaAriel(int ancho, int alto, int profundo){ //Constructor 2
        
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
    }
    
    public int calcularVolumen(){ //Metodo para calcular
        return ancho * alto * profundo;
    }
}
