/*
En Java, el modificador de acceso protected se utiliza para controlar el acceso a miembros (métodos y variables) de una clase.

¿Qué hace protected?

    Acceso dentro de la misma clase: Los miembros declarados como protected son accesibles dentro de la clase que los define.
    Acceso desde subclases: Los miembros protected también son accesibles desde cualquier subclase directa o indirecta de la clase que los define, independientemente del paquete donde se encuentren.
    Acceso desde el mismo paquete: Al igual que con default (sin modificador), los miembros protected son accesibles desde cualquier clase dentro del mismo paquete.

Diferencias con otros modificadores

    public: Accesible desde cualquier clase, sin restricciones.
    default (sin modificador): Accesible solo dentro del mismo paquete.
    private: Accesible solo dentro de la misma clase.

Uso común

    Herencia: En clases abstractas o bases que esperan ser extendidas. Permite a las subclases acceder y sobreescribir métodos protegidos.
    Encapsulación: Para ocultar implementaciones pero permitir acceso controlado a subclases o clases del mismo paquete.
    APIs y bibliotecas: En clases que forman parte de APIs públicas, permitiendo a usuarios extendernas y personalizar comportamientos.
*/
package domain;

public class Persona {
    //Atributos de herencia
    protected String nombre;
    protected  char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio: este es para crear objetos sin necesidad de inicializar los atributos de la clase
    public Persona(){
        // Constructor 1
    }
    
    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { //Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
