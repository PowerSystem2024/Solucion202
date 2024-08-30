/*
Ejercicio 5: Realizar un juego para adivinar un numero, 
para ello generar un numero aleatorio entre 0-100 y 
luego ir pidiendo numeros indicando "es mayor" o "es menor" con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos. 
 */
 
 // Ejercicio solucionado por el profe Ariel
package Ciclos05;

import java.util.Scanner;

public class Ciclo05Ariel {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         int num, aleatorio, contador = 0;
        
         aleatorio = (int) (Math.random() * 100);
         
         do{
             System.out.println("Digite un numero ");
             num = Integer.parseInt(teclado.nextLine());
             
             if (num < aleatorio) {
                 System.out.println("Digite un numero mayor");
             } 
             else if (num > aleatorio) {
                 System.out.println("Digite un numero menor");
             }
             else {
                 System.out.println("\tFELICIDADES!!! Has adivinado el numero!!!");
             }
             contador++;
         } while (num != aleatorio) ;
         System.out.println("\tAdivinaste el numero en: " + contador + " intentos");
        
    
    }
}
