/*
Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un cero. 
 */
package Ejercicio02;

import java.util.Scanner;

public class Ej2Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero != 0) {
            if (numero < 0){
                System.out.println("El numero ingresado es negativo");
                System.out.println("Ingrese otro numero: ");
                numero = Integer.parseInt(entrada.nextLine());
            } else {
                System.out.println("El numero ingresado es positivo");
                System.out.println("Ingrese otro numero: ");
                numero = Integer.parseInt(entrada.nextLine());
            }
        }
        System.out.println("Usted salio del programa");
    }
}
