/*
Ejercicio 15: Leer los 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar 
la posicion en que se encuentra. Si no esta, áindicarlo con un mensaje. 
 */
package arreglos_ejercicio_15;

import java.util.Scanner;

public class Arreglos_Ejercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];
        int n, pos = -1;
        int i;

        // Leer los 10 números enteros ordenados crecientemente
        System.out.println("Ingrese los 10 números enteros ordenados crecientemente:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = entrada.nextInt();
        }

        // Leer el número N para buscar
        System.out.print("\nIngrese el número N para buscar: ");
        n = entrada.nextInt();

        // Buscar N en la tabla
        for (i = 0; i < 10; i++) {
            if (tabla[i] == n) {
                pos = i;
                break;
            }
        }

        // Mostrar la tabla en forma de filas y columnas
        System.out.println("\nTabla de números enteros:");
        for (i = 0; i < 10; i++) {
            System.out.print(tabla[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        // Mostrar resultado de la búsqueda
        if (pos != -1) {
            System.out.println("\nEl número " + n + " se encuentra en la posición " + (pos + 1) + ".");
        } else {
            System.out.println("\nEl número " + n + " no se encuentra en la tabla.");
        }
    }
}
