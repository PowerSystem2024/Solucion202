package clase11;
import java.util.Scanner;
public class Clase11_Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto a pagar: ");
        var monto = Float.parseFloat(entrada.nextLine());
        if(monto >= 100){
            System.out.println("monto = " + monto);
            var descuento = (monto * 0.2F);
            var montoFinal = (monto - descuento);
            System.out.println("El descuento es: " + descuento);
            System.out.println("El monto final a pagar es: " + montoFinal);
        }
        else{
            System.out.println("El descuento es: 0.00");
            System.out.println("El monto final a pagar es: " + monto);
        }
    }
}
