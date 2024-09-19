/*
EJERCICIO 01:
LEER UN NÚMERO Y MOSTRAR SU CUADRADO
REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN NÚMERO NEGATIVO
*/

package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número para obtener el cuadrado del mismo");
        var num = Integer.parseInt(entrada.nextLine());
        while(num >= 0){
            var cuadrado = num*num;
            System.out.println("El cuadrado del número " +num+ " es: " + cuadrado);
            System.out.println("Ingrese un número para obtener el cuadrado del mismo");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Has ingresado un número inferior a 0.\nFin del programa");
    }
}
