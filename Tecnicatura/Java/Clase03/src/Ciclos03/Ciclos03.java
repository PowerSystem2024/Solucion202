/*
Ej 03 Leer los numeros hasta que se introduzca un cero
Para cada uno indicar si es par o impar, primero con clase Scanner, luego clase JOptionPane
 */

package Ciclos03;
import java.net.SocketOption;
import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if(numero % 2 ==0){
                System.out.println("El numero " + numero + " es par");
            }
            else{
                System.out.println("El numero " + numero + " es impar");
            }
            System.out.println("Ingrese otro numero");
            numero = Integer.parseInt(entrada.nextLine());
        }
    }
}
