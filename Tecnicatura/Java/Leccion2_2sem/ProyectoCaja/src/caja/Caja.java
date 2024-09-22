
package caja; //Package


public class Caja {  //Clase publica caja
    //Atributos (caracteristicas) 
    int ancho;
    int alto;
    int profundo;

    public Caja() { //Contructor 1 = vacio
    }
    
    //Construcotr  con parámetros
    public Caja(int ancho, int alto, int profundo) { //Constructor2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int  calcularVolumen(){ //Método para calcular
        return ancho * alto * profundo; 
    }
    
    
    
}
