package Repo.JAVA.cuatrimestre1.Practica;
/*
Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow
 */

import java.util.Scanner;
public class Clase12ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar valores de a y b
        System.out.print("Ingrese el valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = entrada.nextDouble();

        // Calcular el cuadrado de la suma
        double cuadradoSuma = Math.pow(a + b, 2); // Utilizar Math.pow para elevar a la potencia

        // Mostrar el resultado
        System.out.printf("El cuadrado de la suma de "+ a + " + "+ b+ " es igual a = "+ cuadradoSuma);
    }
}
