
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // 6.2 Alcance de variables
        var a = 10; // En variables locales si se puede utilizar var
        int b = 7; // MEMORIA STACK PARA VARIABLES LOCALES != MEMORIA HEAP PARA OBJETOS Y ATRIBUTOS
        miMetodo(); // Llamamos al metodo nuevo [ESTO SE IMPRIME EN PRIMER LUGAR]
        // 5.1 Clase Aritmética: Creamos un objeto
        Aritmetica aritmetica1 = new Aritmetica(); // Con el new se inicializan los atributos [ESTO SE IMPRIME EN SEGUNDO LUGAR]
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // aritmetica1 = null;
        aritmetica1.sumarNumeros(); // [ESTO SE IMPRIME EN TERCER LUGAR]
        // 5.2 Clase Aritmética: Creamos un método, recorremos con Debbug
        // Para almacenar un objeto o los atributos se utiliza la memoria heap (esto no se visualiza-es algo dentro de java con netbeans)
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado); // [ESTO SE IMPRIME EN CUARTO LUGAR]
        // 5.3 Paso de argumentos a un método
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado = " + resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmecia2 = new Aritmetica(5, 8); // Al asignar los valores llamamos al constructor dos
        System.out.println("arimetica2 = " + aritmecia2.a);
        System.out.println("arimetica2 = " + aritmecia2.b);
        
        // 6.3 Engineer Java: Memoria stack y heap, tratamiento de residuos
        // No es necesario recurrir al null ni al metodo gc que es pesado para el tema de residuos
        // En codigo no se recomiendo el trataiento de residuos
        //aritmetica1 = null;
        //System.gc();
        
        // 7.1 Uso de la palabra this Parte 1 y crear una clase a continuación de otra
        Persona persona = new Persona("Emmanuel", "Herrera");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
    // Modularidad: creamos un nuevo metodo
    public static void miMetodo() {
        //a = 10; // Aqui la variable a no puede usarse ya que el alcance de las variables locales es dentro de un metodo
        System.out.println("Aqui hay otro metodo");
        // Los atributos tienen mayor alcance que una variable local
    }
}

// 7.1 Uso de la palabra this Parte 1 y crear una clase a continuación de otra
// A continuacion crearemos otra clase
// De las clases que se crean si una es publica el resto no podra ser publica
// Se creara una clase default o package es decir sin especificar el modificador de acceso
class  Persona{
    String nombre;
    String apellido;
    // Aqui creamos un metodo constructor donde tampoco se le asigna
    // un modificador de acceso porque se crea uno por default
    // Al ser default a este metodo solo se podra acceder dentro del package operaciones
    Persona(String nombre, String apellido){ // Constructor
        // 7.5 Uso de la palabra this Parte 3
        super(); // Metodo constructor de la clase padre object
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
}
// 7.4  Uso de la palabra this Parte 2
class Imprimir{
    public Imprimir(){ // Constructor
        super(); // El constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona){ // Metodo
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
}
}