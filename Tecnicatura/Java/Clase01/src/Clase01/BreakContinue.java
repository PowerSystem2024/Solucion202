
package Clase01;

public class BreakContinue {
    
    public static void main(String[] args) {
        
        System.out.println("Break:");
        
        for (var contando = 0; contando <= 7; contando++) {
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break;
            }
        }
        
        System.out.println("Continue:");
        
        for (var contando = 0; contando <= 7; contando++) {
            if(contando % 2 != 0){
                continue; // Vamos a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
    }
    
}
