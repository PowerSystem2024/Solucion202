package Repo.JAVA.cuatrimestre2.Practica;

import java.util.Scanner;

public class clase3_ciclos_ej4 {
    /*
    Ejercicio 4: Pedir número hasta que se teclee uno negativo y mostrar cuantos números se han introducido.
     */
    public static void main(String[] args) {
        int num, contador = 0;

        Scanner consola = new Scanner(System.in);

        do{
            System.out.print("Ingrese un numero: ");
            num = consola.nextInt();
            if (num > 0){
                contador++;
            }
        }while(num > 0);

        System.out.println("contador = " + contador);
    }
}
