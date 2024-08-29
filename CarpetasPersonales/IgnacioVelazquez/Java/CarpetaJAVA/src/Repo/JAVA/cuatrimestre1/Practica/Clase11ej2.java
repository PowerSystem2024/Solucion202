package Repo.JAVA.cuatrimestre1.Practica;

/*
En un almacen se hace un 20% de descuento a los clientes
cuyacompra supere los $100, ¿Cuál será la cantidad que
pagará una persona por su compra?
*/


import java.util.Scanner;
public class Clase11ej2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar monto total de la compra
        System.out.print("Ingrese el monto total de la compra: $");
        double montoCompra = Integer.parseInt(entrada.nextLine());

        // Calcular descuento (si aplica)
        double descuento = 0;
        if (montoCompra > 100) {
            descuento = montoCompra * 0.20;
        }

        // Calcular monto final
        double montoFinal = montoCompra - descuento;

        // Mostrar mensaje con el monto final
        System.out.printf("El monto final de su compra es: $%.2f\n", montoFinal);
    }
}
