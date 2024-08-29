package Repo.JAVA.cuatrimestre2.Practica;

import javax.swing.*;
import java.util.Scanner;

/*
 *Ej 1: Leer un número e indicar si es positivo o negativo. el proceso se repetira hasta que se introduzca un cero
 * con la clase scanner
 */
public class clase2_ciclos_ej_3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = consola.nextInt();

        while (numero != 0) {
            if (numero >0) {
                System.out.println("el numero = " + numero + " es positivo ");
            }
            else {
                System.out.println("el numero = " + numero + " es negativo ");
            }

            System.out.println("Digite otro número");
            numero = consola.nextInt();
        }

        System.out.println(" saliendo del programa");
    }
}