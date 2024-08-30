/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
 */
package Ciclos04;

import java.util.Scanner;

public class EjercicioScanner04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(teclado.nextLine());

        int contador = 0;

        while (num >= 0) {
            System.out.println("El numero "+ num + " es positivo. Ingrese otro numero");
            num = Integer.parseInt(teclado.nextLine()); 
            contador++;
        }
        System.out.println("Ingreso " + contador + " numeros positivos.");
    }

}
