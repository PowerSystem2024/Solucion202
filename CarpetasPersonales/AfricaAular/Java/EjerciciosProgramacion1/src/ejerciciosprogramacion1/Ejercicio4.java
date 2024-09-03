
package ejerciciosprogramacion1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otoño";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Mes desconocido";
                break;
        }
        System.out.println("Estación = " + estacion);
    }
}
