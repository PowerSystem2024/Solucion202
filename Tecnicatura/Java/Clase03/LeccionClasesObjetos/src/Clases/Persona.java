
package Clases;
/*
clasee es una plantilla, posse un nombre, posee atributos y metodos
un ojheto es una instancia de una clase.
Pesona(Clase)-> Armando (Objeto)
             -> Karla (Objeto)
*/
/*
Persona
----------------------------------
ATRIBUTOS
nombre: String
genero: char
ocupacion: String
------------------------------------
MÉTODOS
obtenerNombre(): String
obtenerGenero(): String
obtenerOcupacion():  String
modificarNombre(nombre: String)
modificarGenenro(genero: String)
modificarOcupacion(ocupacion: String)
*/
public class Persona {
    //Atributos de clase (Caracteristicas)
    public String nombre;
    public String apellido;
    
    //Clase 4
    //Es nuestra plantilla
    //Métodos de la clase (Acciones)
    public void obtenerInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
