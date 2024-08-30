package Repo.JAVA.cuatrimestre2.Practica;

import java.util.Scanner;

public class clase3_ciclos_ej3 {

    /*
    * Ejercicio 3: Leer números hasta que se introduzca un cero .Para cada caso indicar si es PAR o IMPAR.
    * UTILIZANDO CLASE SCANNER
    * */

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int num = 1;

        while (num != 0 ){
            System.out.print("Ingrese un numero: ");
            num = consola.nextInt();
            if(num==0){
                System.out.println("Saliendoooo-....");
                break;
            }
            if (num %2 == 0){
                System.out.println("El número ingresado es  PAR");
            }else{
                System.out.println("El número ingresado es IMPAR");
            }
        }
    }
}
