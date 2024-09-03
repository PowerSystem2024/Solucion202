package clase12;
import java.util.Scanner;
public class Clase12 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de horas: ");        
    int horas = Integer.parseInt(entrada.nextLine());
    int semanas = horas / 168;
    int residuoSemana = horas % 168;
    int dias = residuoSemana  / 24;
    residuoSemana = residuoSemana % 24;
    int horas2 = residuoSemana;
    System.out.println("Las horas ingresadas equivalen a: " + semanas + " semanas. " + dias + " dias. " + horas2 + " horas.");
    }
}

