
package ejerciciosprogramacion1;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        if (num1 == 1)
            System.out.println("El número es un uno");
        else if (num1 == 2) {
            System.out.println("El número es un dos");
        }
        else if (num1 == 3) {
            System.out.println("El número es un tres");
        }
        else if (num1 == 4) {
            System.out.println("El número es un cuatro");
        }
        else {
            System.out.println("numero desconocido");
        }
    }
}
