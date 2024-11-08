package pasoPorReferencia;
//Trabajmos aqui con memria de tipo hip
import Clases.Persona; //Aqui importamos la clase de otro paquete

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Esther"; //Hemos tenido que colocar antes de la variable en la clase Persona "public" para poder verlo aqui
        System.out.println("Persona = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos es: " + persona1); //Nos muestra el espacio de memoria hip: Clases.Persona@1d81eb93
        System.out.println("El cambio que hicimos es: " + persona1.nombre);
        
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: " + persona2.nombre );

    }
    
    public static void cambiarValor(Persona persona){ //Parametro por referencia
        persona.nombre = "Maria";
    }
    
    public static  Persona cambiarElValor(Persona persona){ //Metodo de tipo object
        
        if (persona == null) {
            System.out.println("Valor de persona es invalido : Null");
            return null;
        } else {
            persona.nombre = "Monica";
            //El return apunta a la finalizacion del programa
            return persona; //Retorno de tipo object 
        }
        
    }

}
