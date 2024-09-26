
package Clase01;

public class Labels {
    
    public static void main(String[] args) {
        
        /*
        Donde más se utiliza labels es en ciclos anidados.
        En estos ejemplos hay redundancia ya que se imprime lo mismo que 
        si no utilizaramos las labels
        */
        
        System.out.println("Uso de las palabras break y continue junto a las etiquetas (labels)");
        
        System.out.println("Break y labels");
        
        inicio1:
        for (var contando = 0; contando <= 7; contando++) {
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break inicio1;
            }
        }
        
        System.out.println("Continue y labels");
        
        inicio2:
        for (var contando = 0; contando <= 7; contando++) {
            if(contando % 2 != 0){
                continue inicio2; // Vamos a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
    }
    
}
