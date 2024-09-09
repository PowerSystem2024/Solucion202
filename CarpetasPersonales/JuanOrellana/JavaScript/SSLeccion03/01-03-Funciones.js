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

//ste código define y ejecuta inmediatamente una función anónima que toma dos argumentos, 
// los suma, y luego imprime el resultado en la consola. 
// El uso de una IIFE es común en JavaScript para evitar la contaminación del espacio de nombres global 
// y para crear un contexto local que no interfiera con otras partes del código.

