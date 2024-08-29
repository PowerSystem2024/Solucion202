package Repo.JAVA.cuatrimestre1.Practica;
/*
Determinar si un alumno aprueba o reprueba un curso, sabiendo que
aprobará si su promedio de tres calificaciones es mayor o igual a 70
reprueba caso contrario.
*/
import java.util.Scanner;

public class Clase11ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar calificaciones del alumno
        System.out.print("Ingrese la primera calificación: ");
        double cal1 = Integer.parseInt(entrada.nextLine());

        System.out.print("Ingrese la segunda calificación: ");
        double cal2 = Integer.parseInt(entrada.nextLine());

        System.out.print("Ingrese la tercera calificación: ");
        double cal3 = Integer.parseInt(entrada.nextLine());

        // Calcular el promedio
        double promedio = (cal1 + cal2 + cal3) / 3;

        // Determinar si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("¡Estudiante aprobado!");
        } else {
            System.out.println("Estudiante reprobado.");
        }
    }
}
