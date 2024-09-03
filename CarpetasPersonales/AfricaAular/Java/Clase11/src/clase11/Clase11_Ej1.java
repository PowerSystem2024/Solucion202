package clase11;
import java.util.Scanner;
public class Clase11_Ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primer nota: ");
        var nota1 = Float.parseFloat(entrada.nextLine());
        System.out.println("nota1 = " + nota1);
        System.out.println("Ingrese la segunda nota: ");
        var nota2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la tercera nota: ");
        var nota3 = Float.parseFloat(entrada.nextLine());
        var promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota final promediada es: " + promedio);
        if(promedio >= 7){
            System.out.println("APROBADO");
        }
        else{
            System.out.println("DESARPOBADO");
        }
    }   
    
}
