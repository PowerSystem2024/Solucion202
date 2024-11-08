/*
Ejercicio 10: Pedir 10 numeros y escribir la suma total.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class EjercicioScanner {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        
        do {
            System.out.println("Ingresa un numero");
            numero = Integer.parseInt(entrada.nextLine());
            
            suma += numero;
            contador++;
        } while(contador < 10);
        
        System.out.println("La suma total de los numeros ingresados es: " + suma);
        System.out.println("Fin del programa");
    }
    
}
