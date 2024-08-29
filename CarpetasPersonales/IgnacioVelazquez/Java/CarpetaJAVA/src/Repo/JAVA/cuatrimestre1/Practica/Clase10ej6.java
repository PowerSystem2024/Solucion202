package Repo.JAVA.cuatrimestre1.Practica;

import java.util.Scanner;

public class Clase10ej6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otoño";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Mes invalido";
                break;
        }
        System.out.println("estacion del año es= " + estacion);
    }
}
