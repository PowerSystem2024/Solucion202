// CLASE 10
/*
Uso de la palabra final
Esta palabra tiene diferentes significados dependiendo donde 
se aplique:
    variables: Evita cambiar el valor que almacena la variable
    métodos: Evita que se modifique la definicion o el comportamiento
             de un método desde una subclase (hija)
    Clases: Evita que se creen clase hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estático para convertir una
variables en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase math en la cuál todos sus atributos
son de tipo static y final, es por esto que el variable pi* se conoce
como una constante.
*/
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 10313124;
        System.out.println("miDni = " + miDni );
        //miDni = 12323232; //No se puede modificar
        //Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi metodo constante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //No se puede asignar una nieva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        //Lo que se puede hacer es modificar el valor del atributo que lo acabamos de hacer
        //palabra reservada final para COSNTATNES
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}
