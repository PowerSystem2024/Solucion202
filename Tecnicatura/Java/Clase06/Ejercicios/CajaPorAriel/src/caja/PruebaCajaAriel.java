/*
Ejercicio Resuelto por el profesor. El personal esta como Caja
Ejercicio1: Crear un proyecto segun las especificaciones mostradas a continuacion
La formula de volumen es = ancho*alto*profundidad
 */
package caja;

public class PruebaCajaAriel {
    
    public static void main(String[] args) { //Metodo main
        
        //Variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;
        
        CajaAriel caja1 = new CajaAriel(); //Instanciamos el objeto, constructor vacio
        caja1.alto = medidaAlto;
        caja1.ancho = medidaAncho;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen(); //Llamamos al metodo
        
        //Primer resultado 
        System.out.println("Resultado del volumen de la caja1 = " + resultado);
        
        CajaAriel caja2 = new CajaAriel(2, 4, 6); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("Resultado volumen caja2 = " + caja2.calcularVolumen());
        
        
    }
}
