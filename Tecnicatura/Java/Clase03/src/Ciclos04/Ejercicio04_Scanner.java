/*Ejercicio04 Pedir numeros hasta que se teclee uno negativo
Mostrar cuantos numeros se han introducido
*/

/* CLASE SCANNER*/

package Ciclos04;

import java.util.Scanner;

public class Ejercicio04_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >=0){
            System.out.println("EL numero " + numero + " es positivo");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ha ingresado " + conteo+ " numeros positivos");
    }
}
