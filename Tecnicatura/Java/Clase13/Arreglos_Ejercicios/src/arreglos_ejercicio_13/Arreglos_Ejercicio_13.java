/*
Ejercicio 13: con clase Scanner. Leer los 10 enteros en una tabla. Guardar en otra tabla los elementos
pares de la primera, y a continuacion los elementos impares. 
 */
package arreglos_ejercicio_13;

import java.util.Scanner;

public class Arreglos_Ejercicio_13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tablaOriginal = new int[10];
        int[] tablaParesImpares = new int[10];
        int i, j = 0;

        // Leer los 10 números enteros
        System.out.println("Ingrese los 10 números enteros:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaOriginal[i] = entrada.nextInt();
        }

        // Separar números pares e impares
        for (i = 0; i < 10; i++) {
            if (tablaOriginal[i] % 2 == 0) {
                tablaParesImpares[j++] = tablaOriginal[i];
            }
        }
        for (i = 0; i < 10; i++) {
            if (tablaOriginal[i] % 2 != 0) {
                tablaParesImpares[j++] = tablaOriginal[i];
            }
        }

        // Mostrar la tabla en forma de columnas y filas
        System.out.println("\nTabla con números pares e impares separados:");
        for (i = 0; i < 10; i++) {
            System.out.print(tablaParesImpares[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
