//CLASE 11
//Una matriz es considerada un arreaglo de arreglos

package test;

import domain.Persona;


public class TestMAtrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][2]; //Manera de crear una matriz, 3 filas 2 columnas
        System.out.println("edades = " + edades);
        edades[0][0] = 5; //Llenado manual
        edades[0][1] = 7; //Es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2; //Tarea para alumno
        edades[2][1] = 9; //Tarea para alumno
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]); //tarea alumno
        System.out.println("edades 2-1 = " + edades[2][1]); //Tarea alumno
        
        System.out.println("Recorremos la matriz através del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades "+fila+"-"+col+": "+edades[fila][col]);
            }
        }
        
        
        //Sintaxis clásica
        //String frutas[][] = new String [3][2];
        
        //Sintaxis simplificada
        String frutas [][] = {{"Limon", "Pomelo"},{"Ciruela", "Kiwi"},{"Banana", "Manzana"}};
        imprimir(frutas);
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas "+i+"-"+j+": "+frutas[i][j]);
//            }
//        }
        
        //Creamos una Matriz de objetos
        Persona personas[][] = new Persona[2][3]; //Importamos la clase Persona
        //Asignamos valores a la matriz
        personas[0][0] = new Persona("Ariel");
        personas[0][1] = new Persona("Osvaldo");
        personas[0][2] = new Persona("Franc"); //Tarea Alumno
        personas[1][0] = new Persona("Ale"); //Tarea Alumno
        personas[1][1] = new Persona("Axel"); //Tarea Alumno
        personas[1][2] = new Persona("Gus"); //Tarea Alumno
        imprimir(personas);
    }
    
    //Creamos un metodo public
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("frutas "+i+"-"+j+": "+matriz[i][j]);
            }
        }
    }
}
