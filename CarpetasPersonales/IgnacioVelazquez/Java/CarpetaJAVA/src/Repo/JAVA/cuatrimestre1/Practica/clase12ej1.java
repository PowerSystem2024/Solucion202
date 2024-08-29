package Repo.JAVA.cuatrimestre1.Practica;
/*

Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.


 */



import java.util.Scanner;

public class clase12ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar número total de horas
        System.out.print("Ingrese el número total de horas: ");
        int horasTotales = Integer.parseInt(entrada.nextLine());

        // 1 semana = 7*24hs = 168
        // Calcular semanas
        int semanas = horasTotales / 168;
        int horasRestantesSemana = horasTotales % 168;

        // Calcular días
        int dias = horasRestantesSemana / 24;
        int horasRestantesDia = horasRestantesSemana % 24;

        // Mostrar resultado
        System.out.printf("Equivalen a: " + semanas+ " semanas, " + dias + " días y " + horasRestantesDia+ " horas.");
    }
}
