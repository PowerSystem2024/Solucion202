/*
En éste video veremos hosting y clases. Cuando trabajamos con clases no se aplica el concepto de hosting. 
Primero debe definirse la clase para poder utilizarla. Si trabajamos con funciones podemos primero llamar la 
función y luego definirla ya que se aplica el concepto de hosting. Entonces, hosting no se puede realizar con 
las clases pero sí con las funciones. 
*/

// No se puede iniciar un objeto antes de la clase que le permite hacer la instancia
// let persona3 = new Persona('Carla', 'Ponce') // Esto no debe hacerse

/*
La línea comentada let persona3 = new Persona('Carla', 'Ponce') sugiere que se está intentando crear una 
instancia de la clase Persona antes de que la clase haya sido definida. En JavaScript, el hoisting afecta las 
declaraciones de variables y funciones, pero las clases tienen un comportamiento diferente.

Las clases no se elevan como las funciones. Esto significa que no puedes usar una clase (es decir, crear una 
instancia de ella) antes de que sea declarada en el código. Si intentas hacerlo, se producirá un error de 
referencia, ya que Persona no estará definida en ese momento.
*/

class Persona{
    constructor(nombre, apellido){ // metodo constructor
        this._nombre = nombre; // Al atributo le asignamos un _
        this._apellido = apellido;
    }
    // Creando nuestro metodo get
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    // Creando nuestro metodo set
    set nombre(nombre){ // Con el set modificamos el valor del atributo
        this._nombre = nombre;    
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

}