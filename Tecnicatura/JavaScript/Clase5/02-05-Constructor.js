/*
Se vera el tema de constructores; el constructor es una función especial que se trabajará con objetos en JavaScript. Para llamar una funciónconstructor se utilizará la palabra reservada new lo que reservará espacio en memoria del objeto que se creará. Se recomienda que el nombre de la función empiece co mayúscula.
*/

// Vamos a definir una funcion
function Persona3 (nombre = 'Adrian', apellido, email) { // Constructor

    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }

}

// Con new creamos un objeto Persona3 del mismo tipo
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com') // Es un metodo para crear objetos
padre.nombre = 'Luis'; // Se puede modificar
padre.telefono = '542311234';
console.log(padre);
console.log(padre.nombreCompleto()) // Utilizamos la funcion

let madre = new Persona3('Laura', 'Contrera', 'contreraL@gmail.com');
console.log(madre.nombreCompleto());
console.log(madre.telefono); // La propiedad no esta definida
console.log(madre);

// Diferentes formas de crear objetos 
// Caso objeto 1:
let miObjeto = new Object();

// Caso objeto 2:
let miObjeto2 = {}; // ESta opcion es breve y recomendada

// Caso String 1
let miCadena1 = new String('Hola');

// Caso String 2
let miCadena2 = 'Hola'; // Esta es la sintaxis simplificada y recomendada

// Caso con numeros 1
let miNumero = new Number(1); // ES formal no recomendable

// Caso con numeros 2
let miNumero2 = 1; // Sintaxis recomendada

// Caso con boolean 1
let miBoolean = new Boolean(false); // Formal

// Caso con boolean 1
let miBoolean2 = false; // Sintaxis recomendada

// Caso arreglos 1
let miArreglo1 = new Array(); // Formal

// Caso arreglos 2
let miArreglo2 = []; // Sintaxis recomendada

// Caso function 1
let miFuncion1 = new function(){}; // Todo despues de new es considerado objeto

// Caso function 2
let miFuncion2 = function(){}; // Notacion simplificada y recomendada

// Uso de prototype 
// A través de él se ingresa una propiedad para todos los objetos que formen parte de la función
Persona3.prototype.telefono = '262123232'
console.log(padre)
console.log(madre.telefono)
madre.telefono = '54262123232'
console.log(madre.telefono)

// Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){ // ESta es la funcion que vamos a llamar con el metodo call
        return titulo + ': ' + this.nombre + ' ' + this.apellido + '. Su telefono es: ' + telefono;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic', '545555232412'));

// Aqui abrimos el metodo call 
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5455552321231'))

// --------------------- Método Apply ---------------------------------
/**
 ¿Cuál es la diferencia entre apply y call?

Ambos métodos son similares, pero la principal diferencia radica en cómo se pasan los argumentos:

    apply: espera un array de argumentos.
    call: espera una lista de argumentos separados por comas.
 */
let persona6 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){ 
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ' ' + telefono;
    }
}

let arreglo = ['Ing', '545555232313'];
console.log(persona6.nombreCompleto2.apply(persona5, arreglo));

// ---------------------------------------------------------------------------

function saludar(nombre, edad) {
    console.log("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
  }
  
  const persona7 = {
    nombre: "Juan",
    edad: 30
  };
  
  const argumentos = ["María", 25];
  
  saludar.apply(persona7, argumentos);

  /*
  Este método nos permite llamar a un método que no se encuentra definido en cierto objeto. 
  Apply lee el arreglo y lo está asignando como argumentos. 
  La única diferencia entre call y Apply es que a call se le pasan directamente los argumentos 
  y Apply va necesitar que tengamos a disposición un arreglo en el que estarán ingresados 
  como elementos de ese arreglo los argumentos necesarios para el método que los está requiriendo.
  */