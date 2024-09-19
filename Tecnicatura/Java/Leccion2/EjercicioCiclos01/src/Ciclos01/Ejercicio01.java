/*
EJERCICIO 01:
LEER UN NÚMERO Y MOSTRAR SU CUADRADO
REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN NÚMERO NEGATIVO
*/

package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int num, cuadrado;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while(num >= 0){
            cuadrado = num*num;
            System.out.println("El cuadrado del número " +num+ " es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        System.out.println("Has ingresado un número inferior a 0.\nFin del programa");
    }
}
