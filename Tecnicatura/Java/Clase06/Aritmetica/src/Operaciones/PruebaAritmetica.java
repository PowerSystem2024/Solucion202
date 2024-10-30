
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // 6.2 Alcance de variables
        var a = 10; // En variables locales si se puede utilizar var
        int b = 7; // MEMORIA STACK PARA VARIABLES LOCALES != MEMORIA HEAP PARA OBJETOS Y ATRIBUTOS
        miMetodo(); // Llamamos al metodo nuevo
        // 5.1 Clase Aritmética: Creamos un objeto
        Aritmetica aritmetica1 = new Aritmetica(); // Con el new se inicializan los atributos
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // aritmetica1 = null;
        aritmetica1.sumarNumeros();
        // 5.2 Clase Aritmética: Creamos un método, recorremos con Debbug
        // Para almacenar un objeto o los atributos se utiliza la memoria heap (esto no se visualiza-es algo dentro de java con netbeans)
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        // 5.3 Paso de argumentos a un método
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado = " + resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmecia2 = new Aritmetica(5, 8); // Al asignar los valores llamamos al constructor dos
        System.out.println("arimetica2 = " + aritmecia2.a);
        System.out.println("arimetica2 = " + aritmecia2.b);
        
        // 6.3 Engineer Java: Memoria stack y heap, tratamiento de residuos
        //aritmetica1 = null;
        //System.gc();
        // No es necesario recurrir al null ni al metodo gc que es pesado para el tema de residuos
        // En codigo no se recomiendo el trataiento de residuos
    }
    public static void miMetodo() {
        //a = 10; // Aqui la variable a no puede usarse ya que el alcance de las variables locales es dentro de un metodo
        System.out.println("Aqui hay otro metodo");
        // Los atributos tienen mayor alcance que una variable local
    }
}