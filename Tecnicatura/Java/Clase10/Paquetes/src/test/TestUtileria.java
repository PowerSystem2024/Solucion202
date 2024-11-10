
package test;

import ar.com.codesystem.Utileria; //(import1)
//import ar.com.codesystem.*; Para importar todas las clases del paquete (import1)
//import static ar.com.codesystem.Utileria.imprimir; //Solo aplica para metodos estaticos (import2)

public class TestUtileria {
    
    public static void main(String[] args) {
        Utileria.imprimir("Saludos desde Java"); //(import1)
        //imprimir("Terminamos en unos minutos..."); //No es comun ver esta sintaxis (import2)
        //ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando!!"); //Tampoco es recomendable esta forma (import3)
    }
    
}
