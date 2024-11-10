/*
Ejercicio 7: Crear una matriz "marco" de tamaño 5*5: todos sus elementos deben ser 0 salvo los bordes 
que deben ser 1. Mostrarla. 
 */
package matriz_ejercicio_7;

public class Matriz_Ejercicio_7 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int i, j;

        // Inicializar matriz con 0
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j] = 0;
            }
        }

        // Establecer bordes en 1
        for (i = 0; i < 5; i++) {
            matriz[0][i] = 1; // Fila superior
            matriz[4][i] = 1; // Fila inferior
            matriz[i][0] = 1; // Columna izquierda
            matriz[i][4] = 1; // Columna derecha
        }

        // Mostrar matriz
        System.out.println("Matriz 'marco' 5x5:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
