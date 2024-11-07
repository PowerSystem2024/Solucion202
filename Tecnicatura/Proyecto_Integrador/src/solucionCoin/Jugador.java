package solucionCoin;

public class Jugador {
    String Nombre;
    double plata = 0;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata += plata;
    }
}
