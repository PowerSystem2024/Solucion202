package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        int a = 10; //Variables locales
        var b = 7; //Memoria stack (solo almacena variables locales)
        miMetodo(); //Llamamos al nuevo metodo
        //Creacion de objeto
        Aritmetica aritmetica1 = new Aritmetica();
        //Asignamos valor a los atributos del objeto
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        //Llamamos al metodo del objeto
        aritmetica1.sumarNumeros();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 16);
        System.out.println("resultado = " + resultado);
        
        System.out.println("aritmetica1.a = " + aritmetica1.a);
        System.out.println("aritmetica1.b = " + aritmetica1.b);
        
        //Armamos un nuevo objeto pero pasandole argumentos a la clase
        Aritmetica artimetica2 = new Aritmetica(5, 8);
        System.out.println("artimetica2.a = " + artimetica2.a);
        System.out.println("artimetica2.b = " + artimetica2.b);
        
        //aritmetica1 = null; //Esto es para limpiar el espacio de memoria que utiliza el objeto aritmetica1
        // No es necesario hacer esa limpieza, por eso no se utiliza. 
        //System.gc(); //Esto se utiliza para limpiar y elimnar todos los residuos de nuestro programa al finalizar
        // Tampoco es necesario porque es muy pesado y ya lo hace solo Java
        
        //Creamos un objeto desde la clase
        Persona persona = new Persona("Juan", "Orellana");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }
    
    // modularidad, creamos otro metodo
    public static void miMetodo(){
        //Se vuelve a difinir el tipo de variable de a
        //Esta variable no puede trascender desde el modulo anterior. El alacance de variable es dentro de un metodo
        int a = 10;  //Una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}
// Creamos otra clase
/*La otra clase no puede ser de clase publica
El tipo de modificador va a ser "default" o "package"*/
class Persona{
    //Creamos dos atriubutos
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){ //Constructor
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir(); //Creamos un objeto
        new Imprimir().imprimir(this);
        // this.nombre = nombre es el punto de memoria donde esta guardado-
        this.nombre = nombre; //this apunta al atributo, es para que el compilador sepa diferenciar el atributo de la variable
        this.apellido = apellido; // Para utilizar la variable igual al identificador de la variable le asignamos con un this
        System.out.println("Objeto persona usando this: " + this);
    }
}

class  Imprimir{
    public Imprimir(){
        super(); //El constructor de la clase padre para reservar memoria
    }
    
    public void imprimir(Persona persona){ //Metodo dentro de la clase imprimir
        System.out.println("Persona desde la clase imprimir "+ persona);
        System.out.println("Impresion del objeto actual (this): "+ this);
    }
}