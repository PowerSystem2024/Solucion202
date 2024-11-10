/*
Ejercicio 5: con la clase Scanner. Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en 
una tercera de la forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B... En ese orden
 */
package arreglos_ejercicio_5;

import java.util.Scanner;

public class Arreglos_Ejercicio_5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];

        // Leer tabla A
        System.out.println("Ingrese los números para la tabla A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaA[i] = entrada.nextInt();
        }

        // Leer tabla B
        System.out.println("\nIngrese los números para la tabla B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaB[i] = entrada.nextInt();
        }

        // Mezclar tablas A y B en tabla C
        for (int i = 0; i < 10; i++) {
            tablaC[i * 2] = tablaA[i];
            tablaC[i * 2 + 1] = tablaB[i];
        }

        // Mostrar tabla C
        System.out.println("\nTabla C (mezcla de A y B):");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablaC[i] + " ");
        }
    }
}
