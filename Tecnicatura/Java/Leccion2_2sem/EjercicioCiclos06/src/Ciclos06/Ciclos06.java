/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
la suma de todos los números introducidos.
*/
package Ciclos06; // Paquete especificado como Ciclos06

import java.util.Scanner;

public class Ciclos06 {
    
    public static void main(String[] args) {
    
        int numero, suma = 0;
        Scanner entrada = new Scanner(System.in); // Creación del objeto Scanner
        
        do {
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;  
            
        } while(numero != 0); 
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
