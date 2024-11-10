/*
Ejercicio 4: Con la clase Scanner, leer los 10 numeros, guardados en un arreglo.
Debemos mostrarlos en el siguiente orden, el primero, el ultimo, el segundo, el penultimo... en ese orden
 */
package arreglo_ejercicio_4;

import java.util.Scanner;

public class Arreglo_Ejercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los números en el orden solicitado
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
            System.out.println("Número " + (10 - i) + ": " + numeros[9 - i]);
        }
    }
}
