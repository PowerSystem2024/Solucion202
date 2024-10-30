/*
EJERCICIO 10:
PEDIR 10 NUMEROS Y ESCRIBIR LA SUMA TOTAL
HACERLO CON LA CLASE SCANNER Y JOPTIONPANE
 */
package EjerciciosClase06;

import java.util.Scanner;

public class Ejercicio10Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        do{
            System.out.println("Ingrese un numero: ");
            int num = Integer.parseInt(entrada.nextLine());
            suma= suma+num;
            contador++;
        }while(contador < 10);
        System.out.println("La suma de todos los numeros ingresados es: " + suma);
    }
}