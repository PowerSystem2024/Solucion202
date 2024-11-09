//CLASE 10

package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resutlado = Operaciones.sumar(7, 9);
        System.out.println("resutlado = " + resutlado);
        
        var resultado2 = Operaciones.sumar(5.0, 7); //Uno de los dos tiene que ser double
        System.out.println("resultado2 = " + resultado2);
        
        var resutlado3 = Operaciones.sumar(8, 6L); //L = long
        System.out.println("resutlado3 = " + resutlado3);
    }
}
