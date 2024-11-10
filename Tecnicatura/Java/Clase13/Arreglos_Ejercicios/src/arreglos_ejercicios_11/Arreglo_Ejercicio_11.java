/*
Ejercicio 11: con la clase Scanner. Leer los 5 elementos numericos que se introduciran ordenados de forma
creciente. Estos los guardaremos en una tabla de tamaño 10. Leer el numero N, e insertarlo en el lugar 
adecuado para que la tabla continue ordenada. 
 */
package arreglos_ejercicios_11;

import java.util.Scanner;

public class Arreglo_Ejercicio_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];

        // Leer 5 elementos en orden creciente
        System.out.println("Introduce 5 números en orden creciente:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = entrada.nextInt();
            // Validación para asegurar que los números sean crecientes
            if (i > 0 && tabla[i] < tabla[i - 1]) {
                System.out.println("Error: los números deben estar en orden creciente.");
                i--;  // Repetir la entrada actual
            }
        }

        // Leer el número N
        System.out.print("Introduce un número para insertarlo en orden: ");
        int N = entrada.nextInt();

        // Insertar N en el lugar correcto
        int pos = 5;  // Empezamos después de los primeros 5 elementos
        while (pos > 0 && tabla[pos - 1] > N) {
            tabla[pos] = tabla[pos - 1];  // Mover elementos a la derecha
            pos--;
        }
        tabla[pos] = N;  // Insertar N en la posición adecuada

        // Mostrar la tabla resultante
        System.out.println("Tabla final:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}
