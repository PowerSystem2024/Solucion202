package Repo.JAVA.cuatrimestre2.Practica;

import java.util.Scanner;

public class clase4_ciclos_ej6 {
    public static void main(String[] args) {
        /*
        CLASE SCANNER
        Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de  todos los números introducidos
         */


        int num, suma = 0;
        Scanner consola = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero: ");
            num = consola.nextInt();

            suma += num;

            if (num==0 ){
                System.out.println("La suma de los numeros ingresados fue= " + suma);
                System.out.println("saliendoo.... ");
            }
        }while (num != 0);
    }
}
