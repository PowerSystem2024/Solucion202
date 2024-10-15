
package Operaciones;


public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //El contructor es un método especial
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este constructor número uno");
    }
   //Estamos viendo lo quen se llama sebrecarga de contructores
    public Aritmetica(int a, int b){ //Constructor 2
        this. a = a;
        this. b = b;
        System.out.println("Se esta ejecutando este contructor número dos");
    }
   
    //Método
    public void sumarNumero(){
        int resultado = a + b ;
        System.out.println("resultado = " + resultado);

    }
    
    public int sumarConRetorno(){
      // int resultado = a + b; 
      // return resultado;
         return a + b; 
        
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
       this.a = arg1; //El argumento a se asigna al atributo this.a
       this.b = arg2;
        //return a + b ;
        return this.sumarConRetorno ();
        
    }
    
        
    
    
}
