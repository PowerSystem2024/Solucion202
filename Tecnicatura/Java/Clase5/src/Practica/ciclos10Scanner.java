package Practica;

import java.util.Scanner;

public class ciclos10Scanner {
    public static void main(String[] args) {
        /*
        Pedir 10 nùmeros y escibir la suma total
         */

        Scanner sc = new Scanner(System.in);
        int num = 0, suma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese el " + i + "° numero ");
            num = sc.nextInt();
            suma += num;
        }

        System.out.println("La suma total fue = " + suma);

    }
}