/*
Ejercicio 6: Utilizando dos matrices de tamaño 5*9 y 9*5, cargar la primera y trasponerla en la segunda. 
 */
package matriz_ejercicio_6;

import java.util.Scanner;

public class Matriz_Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matrizA = new int[5][9];
        int[][] matrizB = new int[9][5];
        int i, j;

        // Cargar matriz A
        System.out.println("Ingrese los elementos de la matriz A (5x9):");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 9; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        // Trasponer matriz A en matriz B
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 9; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }

        // Mostrar matriz A
        System.out.println("\nMatriz A (5x9):");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 9; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar matriz B (trasposición de A)
        System.out.println("\nMatriz B (trasposición de A, 9x5):");
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        entrada.close();
    }

}
