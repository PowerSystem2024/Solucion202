/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero.
Para cada  uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOption
 */
package Ciclos03;

import java.util.Scanner;

public class EjercioScanner03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num = Integer.parseInt(teclado.nextLine());
        
        while (num != 0) {
            if (num % 2 == 0){
                System.out.println("El numero " + num + " par");
            }
            else {
                System.out.println("El numero " + num + " impar");
            }
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("El numero ingresado es " + num + " finaliza el programa");
    }   
}
