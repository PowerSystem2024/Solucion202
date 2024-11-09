/*
Uso de la palabra final
Estas palabras tiene diferentes significados dependiendo donde se aplique
    Variable: evita cambiar el valor que almacena la variable
    Metodo: Evita que se modifique la definicion o el comportamiento de un metodo desde una subclase (hija)
    Clases: Evita que se creen clases hijas

Otra caracteristica es que normalmente, cuando trabajamos con variables se combina con el modificador 
de acceso estatico para convertir una variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos son de tipo static y final, es por eso que
la variable pi* se conoce como una constante

 */
package test;

import domain.Persona;

public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miDni = 38202313;
        System.out.println("miDni = " + miDni);
        
        // miDni = 3213213; //No se puede modificar
        //Persona.CONSTANTE_AQUI = 9; //No se puede modificar
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asiignar una nueva referencia
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 = " + persona1.getNombre()); //Se puede modificar su valor pero NO hacer una nueva referencia
       
    }
    
}
