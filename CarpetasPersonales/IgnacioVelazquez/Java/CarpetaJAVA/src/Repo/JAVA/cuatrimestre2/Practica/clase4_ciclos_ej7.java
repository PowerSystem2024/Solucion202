package Repo.JAVA.cuatrimestre2.Practica;

import java.util.Scanner;

public class clase4_ciclos_ej7 {
    public static void main(String[] args) {
        /*
        Ejercicio 7 con clase scanner: pedir números hasta que se introduzca uno negativo y calcular la media.
         */

        int num,contador=0,suma=0;
        double media = 0;

        Scanner consola = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            num = consola.nextInt();
            suma+=num;
            if (num !=0) contador++;

        }while (num !=0 );

        media=suma/contador;
        System.out.println("La media es: "+media);
        System.out.println("suma = " + suma);
        System.out.println("contador = " + contador);
    }
}
