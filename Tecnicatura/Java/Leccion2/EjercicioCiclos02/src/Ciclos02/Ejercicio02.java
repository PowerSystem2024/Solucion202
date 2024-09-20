/* 
EJERCICIO 02 CON CLASE SCANNER:
LEER UN NÚMERO E INDICAR SI ES POSITIVO O NEGATIVO.
EL PROCESO SE REPETIRA HASTA QUE SE INTRODUZCA UN CERO 0.
 */
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un número para saber si es positivo o negativo.\nSi desea finalizar el programa ingrese 0");
        number = Integer.parseInt(entrada.nextLine());
        while (number != 0) {
            if (number > 0) {
                System.out.println("El número es POSITIVO");
            } else if (number < 0) {
                System.out.println("El número es NEGATIVO");
            }
            System.out.println(" ");
            System.out.println("Ingrese un otro número para saber si es positivo o negativo.\nSi desea finalizar el programa ingrese 0");
            number = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Fin del programa.");

    }
}
