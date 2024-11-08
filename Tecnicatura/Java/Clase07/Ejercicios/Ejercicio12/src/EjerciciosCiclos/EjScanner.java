/*
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package EjerciciosCiclos;

import java.util.Scanner;

public class EjScanner {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        long factorial = 1;
        
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        
        for (int i = 1; i <= numero; i++){
            
            factorial *= i;
            
        }
        
        System.out.println("\nEl factorial del numero ingresado es: " + factorial);
        
    }
}
