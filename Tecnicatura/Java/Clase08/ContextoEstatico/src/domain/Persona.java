
package domain;

public class Persona {

    // Cargamos atributos private es decir se asocian a la Persona pero no directamente a los objetos
    private int idPersona;
    private static int contadorPersona; //No es estatico asique se reinicializa en 0
    private String nombre;
    
    // Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No utilizar el operador this, se utiliza la class
        // Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }
    // Manualmente colocamos this. en los get
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
