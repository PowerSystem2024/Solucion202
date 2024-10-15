// Dentro de los parantesis son los llamados parametros
// Al momento de ser llamada la funcion van a ser llamados los parametros como argumentos

// Hoisting: el hoisting es el comportamiento de JavaScript de mover las declaraciones al inicio 
// del contexto de ejecución,
// pero solo las declaraciones, no las inicializaciones.

miFuncion(6, 6) //Hoisting

function miFuncion (a, b){

    console.log("Sumamos: " + (a + b))
    //return a + b;

}

// Llamamos a la funcion
miFuncion(5, 4); //Ahora le pasamos los argumentos

let resultado = miFuncion(6, 7);
console.log(resultado) // Me dice 'undefined' por lo que comente el return

// Funciones de tipo "expresiones"
// Este video trata de funciones expresión o anónimas. La función puede ser asignada a una variable 
// y así evitar poner un nombre a la función. 
// En una función de tipo expresión se debe poner sí o sí el punto y coma debido a que va en una sóla línea 
// y cada línea de código debe ser cerrada

// Declaramos una funcion de tipo expresion o anonima
let x = function(a, b){return a + b};
resultado = x(5, 6); // Al llamarla se pide la variable y argumentos
console.log(resultado);

// ---------- Funciones de tipo self e invoking. ------------------------
// Un ejemplo de una Immediately Invoked Function Expression (IIFE)
// En ella la función está definida pero no se la asigna a ninguna variable. 
// También es una función anónima, pero se puede llamar a sí misma antes de cerrar la función con punto y coma. 
// Se llama a sí misma al comienzo con parámetros y al final con los argumentos. 
// Ésta función no se puede reutilizar porque no se le está asignando a ninguna variable y 
// tampoco se le asigna ningún nombre, sólo se manda a llamar a sí misma una única vez

(function (a, b){

    console.log('Ejecutando la funcion: ' + (a + b));

})(9, 6);

// Este código define y ejecuta inmediatamente una función anónima que toma dos argumentos, 
// los suma, y luego imprime el resultado en la consola. 
// El uso de una IIFE es común en JavaScript para evitar la contaminación del espacio de nombres global 
// y para crear un contexto local que no interfiera con otras partes del código.

// ---------- Metodo arguments y toString ------------------------
// Una función es un tipo de dato. 
// En este video vemos el método arguments y el método toString. 
// Las funciones pueden ser descriptas como objetos. 
// -->> "Arguments" sólo puede utilizarse dentro del bloque de la función, 
// el método -->> "toString" es un método que nos permite comprobar que las funciones puden ser descriptas 
// como objetos, convierte a la función en texto. 
// Hay que recordar que función y método son exáctamente lo mismo 

console.log(typeof miFuncion);

function miFuncionDos(a, b){
    console.log(arguments. length); // La propiedad de "arguments" es un array
}

miFuncionDos(5, 7);

// toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto); // Convierte la funcion en texto

// Funciones flecha. Arrow functions, son una sintaxis más concisa para escribir funciones anónimas.
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);
console.log(resultado)

// Argumentos, valores que pasamos cuando llamamos a una funcion
// La funcion se puede llamar como objeto

// Funcion de tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); // Muestra el parametro de a: 
    console.log(arguments[1]); // Muestra el parametro de b:
    // console.log(arguments[2]); // Esto lo puedo agregar al return

    return a + b + arguments[2];
}

resultado2 = sumar(3, 6, 7); // En JavaScript no es necesario que coincida el numero de argumentos con el numero de parametros
console.log(resultado2);

// Ahora veremos de sumar todo aplicando el concepto de hosting
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++){
        suma += arguments[i]; // "Arguments" es para arreglos
    }
    return suma;
}

// Paso por valor y paso por referencia
// Al asignar un valor numerico a una variable, lo entendemos como valor primitivo, ya que no tiene ni propiedades ni metodos

// Tipos primitivos 
let k = 10;
function cambiarValor(a){
    a = 20; // Aqui tenemos otra variable en otro espacio de memoria
}

cambiarValor(k);
console.log(k); // Paso por valor, pasamos la variable K por la funcion pero fue solo una copia

// Paso por referencia
// Vamos a tener que crear un objeto, porque se le puede asociar y agregar propiedades

// Paso por Referencia: Se refiere a cuando pasas un objeto (o un array) a una función. 
// La función puede modificar el objeto original porque está trabajando con una referencia al objeto en la memoria.
// El paso por referencia es una característica poderosa en JavaScript, 
// especialmente cuando trabajas con objetos complejos y necesitas que las funciones modifiquen esos objetos directamente.

// Paso por Valor: Ocurre con tipos de datos primitivos como números y cadenas, donde la función recibe una copia del valor, 
// y cualquier modificación dentro de la función no afecta el valor original.

const persona = {
    nombre: "Juan",
    apellido: "Lepez"
}

console.log(persona);

function cambiarValorObjeto(p1){
    // Esta funcion va a pasar un valor hexadecimal. 
    // 'p1' va a estar llamando al objeto persona dentro de un espacio de memoria determinado
    // A traves de la variable p1 accedemos a los atributos de la funcion
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);