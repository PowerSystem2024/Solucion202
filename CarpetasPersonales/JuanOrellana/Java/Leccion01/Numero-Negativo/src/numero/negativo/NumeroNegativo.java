/*
 Ejercicio 1: Leer un numero  y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 */
package numero.negativo;

import java.util.Scanner;

public class NumeroNegativo {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero que no sea negativo, para saber su cuadrado:  ");
        Scanner teclado = new Scanner(System.in);
        int ingreso = teclado.nextInt();
        
        
        while(ingreso > 0){
            
            double resultado = Math.pow(ingreso, 2);
            System.out.println("El numero " + ingreso + " elevado al cuadrado es: " + resultado );
            
        }
    }
    
}
