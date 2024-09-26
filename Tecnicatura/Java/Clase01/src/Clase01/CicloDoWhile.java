
package Clase01;

public class CicloDoWhile {
    
    public static void main(String[] args) {
        
        var contador = 0; //Inferencia de tipos
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
    }
}
