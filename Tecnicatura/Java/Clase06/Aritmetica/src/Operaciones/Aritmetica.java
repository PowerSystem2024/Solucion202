// 5.1 Clase Aritmética: Creamos un objeto

package Operaciones;

public class Aritmetica {
    // 5.1 Clase Aritmética: Creamos un objeto
    // Atributos de la clase
    int a;
    int b;
    
    // 6.1 Sobrecarga de métodos
    
    // El constructor es un metodo especial!!!
    // El constructor uno vacio se crea por defecto siempre y cuando no hayamos creado otro constructor como el dos
    // Siempre que se cree un constructor con valores el vacio deja de existir por defecto
    // Hay que tenerlo en cuenta en caso de usar un constructor vacio hacerlo nostros mismos
    public Aritmetica(){ // Constructor 1: Este omite valores
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ // Constructor 2: Este asigna dos valores. Inicializando 2 atributos
        // 7.1 Uso de la palabra this Parte 1 y crear una clase a continuación de otra
        // El operador this se pone cuando la variable es igual al atributo sino saldra un error
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecuntado este constructor numero dos");
    }
    
    // Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    // 5.2 Clase Aritmética: Creamos un método, recorremos con Debbug
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    // 5.3 Paso de argumentos a un método
    public int sumarConArgumentos(int a, int b){ // var no se usa para atributos o parametros pero en variables locales si
        //El uso aqui de this es opcional... se hace de forma automatica sin colocarlo
        //Los atributos y argumentos pueden tener el mismo nomre
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //El argumento b se asigna al atributo this.b
        //return a + b;
        // 5.4 Un método llamando a otro método
        return sumarConRetorno(); //Se llama a un metodo dentro de otro que pertenecen a la misma clase
        //Esto de llamar un metodo dentro de otro no se suele hacer da el mismo resultado
        //Por lo que es colocar mas lineas de codigo en vano, es menos eficaz
    }
}