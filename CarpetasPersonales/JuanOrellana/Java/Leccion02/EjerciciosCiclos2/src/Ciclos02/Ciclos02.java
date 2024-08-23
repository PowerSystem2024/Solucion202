/*
Ejercicios 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero.
 */
package Ciclos02;

import java.util.Scanner;

public class Ciclos02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num != 0) {
            if (num > 0){
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es negativo");
            }
            System.out.println("Ingrese un numero");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Salio del sistema");
    }
}
