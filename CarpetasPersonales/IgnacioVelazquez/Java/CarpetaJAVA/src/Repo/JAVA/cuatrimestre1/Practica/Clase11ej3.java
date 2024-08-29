package Repo.JAVA.cuatrimestre1.Practica;
/*
Leer 2 números; si son iguales que los multiplique, si el:
primero es mayor que el segundo que los reste y si no que
los sume
*/

import java.util.Scanner;

public class Clase11ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Ingrese el segundo número: ");
        double num2 = Double.parseDouble(entrada.nextLine());

        // Calcular el resultado según la comparación
        double resultado;
        if (num1 == num2) {
            resultado = num1 * num2;
            System.out.println("Los números son iguales, su producto es: " + resultado);
        } else if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("La diferencia entre los números es: " + resultado);
        } else {
            resultado = num1 + num2;
            System.out.println("La suma de los números es: " + resultado);
        }
    }

}
