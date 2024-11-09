//CLASE 10
/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la 
suma de cada fila y de cada columna.
*/
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFila, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFila = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int [nFila][nCol];
        int filas[] = new int [nFila];
        int columnas[] = new int [nCol];
        
        System.out.println("Rellenando la matriz: ");
        for (int i = 0; i < nFila; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("MAtriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMAtriz Original: ");
        for (int i = 0; i < nFila; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println(matriz[i][j]+"");
            }
            System.out.println("");
        }
        
        //Sumando las filas
        posFila = 0;
        for (int i = 0; i < nFila; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        
        //Sumando las columnas
        posCol = 0;
        for (int i = 0; i < nCol; i++) {
            sumaCol = 0;
            for (int j = 0; j < nFila; j++) {
                sumaCol += matriz[i][j];
            }
            columnas[posCol] = sumaCol;
            posCol++;
        }
        
        System.out.println("\nLa suma de la fila es: ");
        for (int i = 0; i < nFila; i++) {
            System.out.println(filas+" - ");
        }
        System.out.println("");
        
        System.out.println("\nLa suma de la columnas es: ");
        for (int i = 0; i <nCol; i++) {
            System.out.println(columnas+" - ");
        }
        System.out.println("");
    }
}
