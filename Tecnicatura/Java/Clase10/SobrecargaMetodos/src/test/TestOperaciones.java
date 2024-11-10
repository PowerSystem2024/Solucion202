
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        var resultado1 = Operaciones.sumar(7, 9);
        System.out.println("resultado1 = " + resultado1);
        
        var resultado2 = Operaciones.sumar(5.7, 7);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(8, 6L); //Va a ejecutar el metodo double por soportar el tipo Long
        System.out.println("resultado3 = " + resultado3);
    }
}
