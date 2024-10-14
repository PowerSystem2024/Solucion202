package Teoria;

public class Aritmetica {
    //Atributos de la clase

    int a; // variables locales
    int b;

    /*
    El constructor es un método especial que tiene como función:
        1-construye un objeto
        2-reserva un espacio de memoria
        3-Inicializa los atributos de la clase
     */


    public Aritmetica() {
        System.out.println("se esta ejecutando el constructor 1");
    }

    public Aritmetica( int a, int b) {

        this.a = a;
        this.b = b;
        System.out.println("se ejecuta el constructor 2");
    }

}
