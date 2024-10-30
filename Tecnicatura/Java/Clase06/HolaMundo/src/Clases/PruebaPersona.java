// 4.2 Creación de un Objeto
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //Llamamos al constructor para convertir en objeto a persona1 (crear objeto se le llama instanciar)
        persona1.nombre = "Emmanuel"; //Asignamos un String al atributo nombre
        persona1.apellido = "Herrera"; //Asignamos un String al atributo apellido
        persona1.obtenerInformacion(); //Llamamos al metodo que recibe las caracteristicas de los atirbutos nombre y apellido y los imprime
        //El valor hexadecimalnormalmente comienza con 0x
        
        // 4.3 Creación de un Objeto más
        Persona persona2 = new Persona();
        System.out.println ("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Ariel";
        persona2.apellido = "Betancud";
        persona2.obtenerInformacion();
    }
}