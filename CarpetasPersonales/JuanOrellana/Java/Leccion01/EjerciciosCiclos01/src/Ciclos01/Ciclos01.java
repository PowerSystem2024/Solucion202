/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 */
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num >= 0){ //Mientras el numero sea igual o mayor a cero
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("El numero " + num + " elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(entrada.nextLine()); //Aqui agregamos otro punto de ingreso del numero
        }
        System.out.println("El sistema salio por numero negativo");
    }         
}
