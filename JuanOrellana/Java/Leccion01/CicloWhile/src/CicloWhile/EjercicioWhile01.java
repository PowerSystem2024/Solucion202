package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        var conteo = 0; //Inferencia de tipos
        
        while(conteo < 7) {
            System.out.println("Conteo: " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }
        
        System.out.println("");
        System.out.println("Ejercitando con DoWhile");
        
        var contador = 0;
        
        do {            
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
        
        // Primero declaramos la variable
        // Luego declaramos la condicion
        // Y por ultimo le decimos que va a hacer con la variable
        System.out.println("");
        System.out.println("Ahora veremos el ciclo for");
       
        for( var contando = 0; contando < 7; contando++ ){
            System.out.println("contando = " + contando);
        }
        
        System.out.println("");
        System.out.println("Ahora veremos for con break");
        
        for( var conta = 0; conta < 7; conta++ ){
            if (conta % 2 == 0){
                System.out.println("conta = " + conta);
                break; // Si no le colocamos la palabra reservada "break", va a imprimir todos los numeros pares
            }
        }
        
        System.out.println("");
        System.out.println("Ahora veremos for con continue");
        
        for (var contar = 0; contar < 7; contar++ ){ 
            if(contar % 2 != 0){ //Entr al ciclo if cuando es impar
                continue; // Vamos a la siguiente iteracion
            }
            System.out.println("contar = " + contar);
        }
        
        //Uso de la etiqueta (labels).
        System.out.println("");
        System.out.println("Ahora veremos etiquetas Labels");
        
        inicio: // Se trabaja mas eficientemente en los ciclos anidados. Aqui es redundante
        for( var conte = 0; conte < 7; conte++ ){
            if (conte % 2 == 0){
                System.out.println("conta = " + conte);
                break inicio; 
            }
        }
    }
}