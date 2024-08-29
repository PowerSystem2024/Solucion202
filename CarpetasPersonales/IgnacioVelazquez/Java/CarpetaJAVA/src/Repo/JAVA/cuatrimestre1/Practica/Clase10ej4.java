package Repo.JAVA.cuatrimestre1.Practica;
import java.util.Scanner;


public class Clase10ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la primer nota: ");
        double nota1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la segunda nota: ");
        double nota2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la tercer nota: ");
        double nota3 = Integer.parseInt(entrada.nextLine());

        double resultado = (nota1+nota2+nota3);

        System.out.println("La suma de las notas es = " + resultado );

    }

}