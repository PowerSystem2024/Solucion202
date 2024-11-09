package Practica;


public class proyectoCaja {
    public static void main(String[] args) {

   /*
    Crear un proyecto segun las especificaciones mostradas a continuación.
    La formula es : volumen = ancho * alto * profundidad
    */
        Caja Caja1 = new Caja(25, 30, 10 );

        System.out.println("El volumen de la caja 1 es = "+ Caja1.calcularVolumen());
    }
}
