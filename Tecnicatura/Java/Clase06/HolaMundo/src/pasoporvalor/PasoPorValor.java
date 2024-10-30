/*
6.5 POO: Paso por valor
 */
package pasoporvalor;

public class PasoPorValor {
    
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Solo le enviamos una copia
        System.out.println("valorX = " + valorX);
    }
    
    public static void cambioValor(int arg1){ //Parametros por valor
        System.out.println("ar1 = " + arg1);
        arg1 = 15;
    }   
}