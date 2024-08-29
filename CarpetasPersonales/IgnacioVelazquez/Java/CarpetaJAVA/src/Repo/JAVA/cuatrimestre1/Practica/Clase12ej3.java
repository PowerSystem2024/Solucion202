package Repo.JAVA.cuatrimestre1.Practica;
/*
Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante.
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.
*/

import java.util.Scanner;
public class Clase12ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar calificaciones
        System.out.print("Ingrese la calificación de participación (0-100): ");
        double participacion = entrada.nextDouble();

        System.out.print("Ingrese la calificación del primer examen parcial (0-100): ");
        double examenParcial1 = entrada.nextDouble();

        System.out.print("Ingrese la calificación del segundo examen parcial (0-100): ");
        double examenParcial2 = entrada.nextDouble();


        System.out.print("Ingrese la calificación del examen final (0-100): ");
        double examenFinal = entrada.nextDouble();

        // Calcular la calificación final
        double ponderacionParticipacion = 0.10;
        double ponderacionExamenParcial1 = 0.25;
        double ponderacionExamenParcial2 = 0.25;
        double ponderacionExamenFinal = 0.40;

        double calificacionFinal = (participacion * ponderacionParticipacion)
                + (examenParcial1 * ponderacionExamenParcial1)
                + (examenParcial2 * ponderacionExamenParcial2)
                + (examenFinal * ponderacionExamenFinal);

        // Mostrar la calificación final
        System.out.printf("La calificación final del estudiante es: "+ calificacionFinal);
    }


    }
