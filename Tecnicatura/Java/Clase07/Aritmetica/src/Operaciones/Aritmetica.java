package Operaciones;

public class Aritmetica {

    // Atributos de la clase
    int a; // Para almacenar un objeto o los atributos se utiliza la memoria heap
    int b;

    // El constructor es un metodo especial. 
    /* Tres objetivos: 
    primero = crea un objeto
    segundo = reserva un espacio de memoria
    tercero = inicializa los atributos de la clase */
    
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este constructor numero uno");
    } //El constructor vacio hay que armarlo porque ya por default no se va a armar al haber otro constructor
    
    //Vamos a hacer sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }
    
    //Metodos
    public void sumarNumeros() { //void tipo de retorno vacio

        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno() {
        // Aca solo vamos a devolver un valor entero
        return a + b;
    }

    //El argumento es la informacion que va a recibir el metodo
    public int sumarConArgumentos(int arg1, int arg2) { //Aqui nunca se puede usar la inferencia de tipo "var"

        this.a = arg1; //El argumento arg1 se asigna al atributo this.a
        this.b = arg2; //La utilizacion del this es opcional
        //return a + b;
        return sumarConRetorno(); //Esto no es aconsejable como buena practica

    }

}
