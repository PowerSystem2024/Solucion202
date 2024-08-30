/*
Ejercicio 5: Realizar un juego para adivinar un numero, 
para ello generar un numero aleatorio entre 0-100 y 
luego ir pidiendo numeros indicando "es mayor" o "es menor" con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos. 

 */
package Ciclos05;

import java.util.Scanner;

public class Ciclo05 {
    public static void main(String[] args) {
        
        int num;
        int contador = 0;
        int numeroAleatorio = 0;
        
        numeroAleatorio = (int) (Math.random() * 101);
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = Integer.parseInt(teclado.nextLine());
        
        while (num != numeroAleatorio) {
            
            if (num < numeroAleatorio){
                System.out.println("El numero ingresado es menor");
                contador++;
            }
            else {
                System.out.println("El numero ingresado es mayor");
                contador++;
            }
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(teclado.nextLine());
            
        }
        
        System.out.println("Acerto!! Usted ingreso " + contador + " numeros antes");
    }
    
}
