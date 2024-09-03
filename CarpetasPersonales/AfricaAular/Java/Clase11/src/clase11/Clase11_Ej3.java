package clase11;
import java.util.Scanner;
public class Clase11_Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo número: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        if(num1 == num2){
            var multiplicar = (num1 * num2);
            System.out.println("Resultado de la multiplicación = " + multiplicar);
        }
        else if(num1 > num2){
            var restar = (num1 - num2);
            System.out.println("Resultado de la resta = " + restar);
        }
        else{
            var sumar = (num1 + num2);
            System.out.println("Resultado de la suma = " + sumar);
        }
    }
}
