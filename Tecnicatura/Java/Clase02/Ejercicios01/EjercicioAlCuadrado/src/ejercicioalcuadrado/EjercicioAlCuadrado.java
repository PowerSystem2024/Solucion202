/*
Ejercicio 1: Leer un numero y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un numero negativo
*/
package ejercicioalcuadrado;

import java.util.Scanner;

public class EjercicioAlCuadrado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(teclado.nextLine());
                
      while(numero >= 0){
          cuadrado = (int)Math.pow(numero, 2);
          System.out.println("El numero " + numero + " elevado al cudrado es: " + cuadrado );
          
          System.out.println("Digite otro numero: ");
          numero = Integer.parseInt(teclado.nextLine());
      }
        System.out.println("El programa a finalizado por numero negativo");
    }
    
}
