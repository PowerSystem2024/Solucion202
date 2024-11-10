/*
Ejercicio 14: Leer dos series de 10 enteros, que estarian ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. 
 */
package arreglos_ejercicio_14;

import java.util.Scanner;

public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];
        int i, j = 0, k = 0;

        // Leer tabla A
        System.out.println("Ingrese los 10 números enteros para tabla A (orden creciente):");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaA[i] = entrada.nextInt();
        }

        // Leer tabla B
        System.out.println("\nIngrese los 10 números enteros para tabla B (orden creciente):");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaB[i] = entrada.nextInt();
        }

        // Fusionar tablas A y B en tabla C
        i = j = 0;
        while (i < 10 && j < 10) {
            if (tablaA[i] <= tablaB[j]) {
                tablaC[k++] = tablaA[i++];
            } else {
                tablaC[k++] = tablaB[j++];
            }
        }
        while (i < 10) {
            tablaC[k++] = tablaA[i++];
        }
        while (j < 10) {
            tablaC[k++] = tablaB[j++];
        }

        // Mostrar tablas
        System.out.println("\nTabla A:");
        for (i = 0; i < 10; i++) {
            System.out.print(tablaA[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nTabla B:");
        for (i = 0; i < 10; i++) {
            System.out.print(tablaB[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nTabla C (fusionada):");
        for (i = 0; i < 20; i++) {
            System.out.print(tablaC[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
