/* 
EJERCICIO 02 CON CLASE JOptionPane:
LEER UN NÚMERO E INDICAR SI ES POSITIVO O NEGATIVO.
EL PROCESO SE REPETIRA HASTA QUE SE INTRODUZCA UN CERO 0.
 */
package Ciclos02;

import javax.swing.JOptionPane;

public class Ejercicio02_Con_JOptionPane {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para saber si es positivo o negativo.\nSi desea terminar el programa ingrese 0"));
        while (num != 0) {
            if (num > 0) {
                System.out.println("Es un número POSITIVO");
            } else if (num < 0) {
                System.out.println("Es un número NEGATIVO");
            } else {
                System.out.println(" ");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para saber si es positivo o negativo.\nSi desea terminar el programa ingrese 0"));
        }
        System.out.println("Fin del programa.");
    }
}
