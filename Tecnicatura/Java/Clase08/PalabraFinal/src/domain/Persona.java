//CLASE 10

package domain;


public class Persona { // ES una clase constante
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;
    
    //Get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void imprimir(){ //Creamos un metodo con lo que es final
        System.out.println("Método para imprimir");
    }
}
