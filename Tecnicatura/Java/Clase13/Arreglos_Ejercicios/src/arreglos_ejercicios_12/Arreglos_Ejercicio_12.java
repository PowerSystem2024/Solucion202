/*
 Ejercicio 12: con la clase Scanner. Leer por teclado una tabla de 10 elementos numericos enteros
 y una posicion (entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar huecos.
 */
package arreglos_ejercicios_12;

import java.util.Scanner;

public class Arreglos_Ejercicio_12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        int pos, i;

        // Leer la tabla de 10 números enteros
        System.out.println("Ingrese los 10 números enteros:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Leer la posición para eliminar
        System.out.print("\nIngrese la posición para eliminar (0-9): ");
        pos = scanner.nextInt();

        // Validar posición
        if (pos >= 0 && pos < 10) {
            // Eliminar el elemento en la posición dada
            for (i = pos; i < 9; i++) {
                tabla[i] = tabla[i + 1];
            }
            tabla[9] = 0; // O cualquier valor para indicar fin de tabla

            // Mostrar la tabla en forma de columnas y filas
            System.out.println("\nTabla después de eliminar el elemento en posición " + pos + ":");
            for (i = 0; i < 9; i++) {
                System.out.print(tabla[i] + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("Posición inválida.");
        }
    }
}
