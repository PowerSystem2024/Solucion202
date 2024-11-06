// 9.2 Herencia parte 2

package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Cliente(fecha1, true, "Emmanuel", 'M', 32, "Mathus Hoyos");
        System.out.println("cliente1 = " + cliente1); // Se muestra la Clase hija y la Clase padre las cuales ambas son un solo objeto
    }
}
