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
    }
    
    // Vamos a crear otro modulo
    public static void miMetodo(){
        //Se vuelve a difinir el tipo de variable de a
        //Esta variable no puede trascender desde el modulo anterior. El alacance de variable es dentro de un metodo
        int a = 10;  //Una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}
