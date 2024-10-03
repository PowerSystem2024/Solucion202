package Teoria.pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        // la variable hace referencia a este espacio de memoria en la pila
        System.out.println("Integer.toHexString(System.identityHashCode(valorX)) = 0x" + Integer.toHexString(System.identityHashCode(valorX)));

        cambioValor(valorX);
        System.out.println("valorX = " + valorX);
    }
    
    public static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1= 21;
        System.out.println("Integer.toHexString(System.identityHashCode(arg1)) = 0x" + Integer.toHexString(System.identityHashCode(arg1)));

    }
}
