/*
EJERCICIO 12:
PEDIR UN NUMERO Y CALCULAR EL FACTORIAL
HACERLO CON SCANNER Y JOPTIONPANE
 */
package ejerciciosCiclosClase07;

import java.util.Scanner;

public class Ejercicio12Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    long factorial;
    System.out.println("Ingrese un número positivo: ");
    int num = Integer.parseInt(entrada.nextLine());
    if(num < 0){
        System.out.println("El factorial no se aplica a numeros negativos.");
    } 
    else{
        factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    System.out.println("El factorial de " + num + " es: " + factorial);
    }
    }
}