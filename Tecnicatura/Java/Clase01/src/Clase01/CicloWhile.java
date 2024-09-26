package Clase01;

public class CicloWhile {

    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        while (conteo <= 7) {
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }
    }
    
}
