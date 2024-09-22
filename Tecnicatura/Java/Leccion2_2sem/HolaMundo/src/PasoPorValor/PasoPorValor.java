
package PasoPorValor;


public class PasoPorValor {
    public static void main(String[] args) {
    var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Solo enviamos una copia
        System.out.println("valorX = " + valorX);
    }
    
    public static void cambioValor(int arg1){ //Parámetro por Valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        
    }
    
    
    
    
    
    
}
