
package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        
        int edades[][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades [0][0] = 5; //Llenado manual
        edades [0][1] = 7; //Es una diferente columna
        edades [1][0] = 98;
        edades [1][1] = 10;
        edades [2][0] = 24;
        edades [2][1] = 34;
                        
        System.out.println("edades 0 - 0 = " + edades [0][0]);
        System.out.println("edades 0 - 1 = " + edades [0][1]);
        System.out.println("edades 1 - 0 = " + edades [1][0]);
        System.out.println("edades 1 - 1 = " + edades [1][1]);
        System.out.println("edades 2 - 0 = " + edades[2][0]);
        System.out.println("edades 2 - 1 = " + edades[2][1]);

        System.out.println("************ Ahora con el ciclo for mostramos la matriz ************");

        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + " - " + col + ": " + edades[fila][col]);
            }
        }

        //Sintaxis clasica
        //String frutas[][] = new String[3][2]; 
        //Sintaxis simplificada
        String frutas[][] = {{"Limon", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzanas"}};
        imprimir(frutas);
//        for (int fila = 0; fila < frutas.length; fila++) {
//            for (int col = 0; col < frutas[fila].length; col++) {
//                System.out.println("frutas " + fila + " - " + col + ": " + frutas[fila][col]);
//            }
//        }
        
        //Creamos una matriz de objetos
        Persona personas [][] = new Persona[2][3];
        
        //Asignamos un valor a la matriz
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("María");
        personas[0][2] = new Persona("Pedro");
        personas[1][0] = new Persona("Luis");
        personas[1][1] = new Persona("Ana");
        personas[1][2] = new Persona("Debora");
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {

        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + " - " + j + ": " + matriz[i][j]);
            }
        }
    }
}
