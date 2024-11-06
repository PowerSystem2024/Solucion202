// 7.6 Encapsulamiento Parte 1

package dominio;

public class Persona {
    // Atributos
    // Si no ponemos private o public sera default es decir sera del package... no se podra acceder desde otro package
    private String nombre; //String va con mayusculas porque no es primitivo como double, boolean, etc.
    private double sueldo;
    private boolean eliminado;
    
    // Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){// Siempre debe ser el mismo nombre que la clase
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    // 8.3 Método toString
    public String toString(){
        return "Persona [ nombre: "+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+" ]";
    }
}