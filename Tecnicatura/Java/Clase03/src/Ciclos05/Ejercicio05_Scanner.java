/*
Realizar un juego para adivinar un numero, para ello generar un  nuemero aleatorio entre 0-100,
y luego ir pididiendo numeros indicando "es mayor" o "es menor" segun sea el caso respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos
 */
package Ciclos05;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio05_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero , aleatorio , conteo = 0;
        aleatorio = (int) (Math.random()*100);
        do{
            System.out.println("Ingrese un n numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("digite un numero mayor");
            } else if (numero > aleatorio) {
                System.out.println("Digite un  numero menor");
            }
            else{
                System.out.println("Has adivinado el numero!!!");
            }
            conteo++;
        }while (numero != aleatorio);
        System.out.println("Adivinaste el numero despues de " + conteo + " intentos");
    }
}
