// 9.1 Comenzamos, crear una nueva carpeta Lección6: estamos en herencia parte 1

package domain;

public class Persona { // Aqui por defecto sucede: class Persona extends Object
    // Atributos de Herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    // Constructor vacio: crear objetos sin necesidad de inicializar los atributos
    public Persona(){ // Constructor 1
        
    }
    
    public Persona(String nombre){ // Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
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

    // 9.7 Modificamos el método toString en la clase padre
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString()); // Esto muestra el espacio de memoria
        sb.append('}');
        return sb.toString();
    }

    
    
}