package Repo.JAVA.cuatrimestre2.Practica;

import java.util.Scanner;

public class clase1_ciclos_ej_1 {
    public static void main(String[] args) {
        /*
         *Ej 1: Leer u número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
         */
        Scanner consola = new Scanner(System.in);
        System.out.println("...::: Programa de calculo de cuadrado :::...");
        System.out.println("Ingrese un número no negativo para calcular su cuadrado, o un negativo para salir.");
        int num = 0;
       do {
           System.out.println("Ingresa un numero: ");
           num = consola.nextInt();
            if(num>0){
                int cuadrado = (int)Math.pow(2,num);
                System.out.println("su cuadrado es = " + cuadrado);
            }
       }while(num>=0);

        System.out.println(" eligio un negativo finalizamos");
    }
}
