
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        //CICLO WHILE
        var conteo = 0; //Inferencia de tipos
        while(conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }
        
        //CICLO DO WHILE
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
        
        //CICLO FOR
        /*Este maneja un numero determinado de interacion, a diferenca del ciclo whilw y do while
        que manejan un numero indeterminado de interaciones.
        El ciclo for tiene una condicion que se tieneque revisar, si es verdadera se ejecuta el 
        codigo dentro del cilo, si es falsa no ejecuta nada dentro del ciclo.
        Cuando la condicion se cumple este comienza un incremento decremento hasta que la condicion
        sea falsa y salga.*/
        
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0 ){
                System.out.println("contando = " + contando);
                break;  //romper un ciclo
            }
        }
        
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0 ){
                continue; // Vamos a la siguiente iteración
            }
            System.out.println("contando = " + contando);
        }
        
        //Uso de etuqeutas (Labels)
        //uso dela palabras break y continie junto a las etiqeutas (labels)
        inicio: //tiene que estar antes del ciclo
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0 ){
                System.out.println("contando = " + contando);
                break inicio;
            }
        }
    }
}
