import Teoria.Aritmetica;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Aritmetica ar = new Aritmetica(); //devuelve "se esta ejecutando el constructor 1
        Aritmetica ar2 = new Aritmetica(3, 5); //devuelve "se esta ejecutando el constructor 2

        miMetodo();
        System.out.println("ar2 = " + ar2);
    }

    public static void  miMetodo(){
        // a=10 esto daria error por el scope de las variables
        var a = 10;
        System.out.println("a = " + a);
    }
}