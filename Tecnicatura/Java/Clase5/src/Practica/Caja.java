package Practica;

public class Caja {
    int alto;
    int ancho;
    int profundidad;

    public Caja(int alto, int ancho, int profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public int calcularVolumen(){
        return alto * ancho * profundidad;
    }
}
