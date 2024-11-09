//CLASE 6
//PASO PRO REFERENCIA
package pasoporreferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor de objeto es: " + persona2.nombre);
    }
    
    //Paso por referencia
    public static void cambiarValor(Persona persona){ //parámetro por referencia
        persona.nombre = "María";
    }
    
    //Palabras return y null
    public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.println("Valor de persona es invalido : Null");
            return null;
        }
        else{
            persona.nombre = "Mónica";
            return persona;
        }
       
    }
}
