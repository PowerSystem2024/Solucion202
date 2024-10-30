
package test;

import domain.Cliente;
import java.util.Date;

public class TestCliente{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(new Date(), true, "Emmanuel", 'M', 32, "Mathus Hoyos");
        System.out.println("cliente1 = " + cliente1);
    }
}
