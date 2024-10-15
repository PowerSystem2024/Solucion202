/*
Una función es un bloque de código reutilizable que se puede ejecutar cuando se llame, opcionalmente con parámetros, y puede devolver un valor.
*/
// El hoisting es un comportamiento en JavaScript donde las declaraciones de funciones se mueven "al principio" de su ámbito antes de que el código se ejecute.
Suma(3, 7); // por ese efecto del hoisting podemos llamar a la función antes de declararla.
//ejemplo de sintaxis

function Suma(a, b) {
  console.log("sumamos : " + (a + b));
  return a + b;
}

let resultado = Suma(3, 6);
console.log(resultado);

//return siempre existe por más que no sea declarado
//Si una función no tiene una declaración return, devolverá undefined por defecto.

//funciones Expresión o anonimas
//Una función anónima es una función que no tiene un nombre asignado.
//Se utiliza principalmente en expresiones o como argumentos a otras funciones.
//Este enfoque permite escribir código más conciso y encapsular comportamiento sin necesidad de nombrar la función.
const miFuncion = function (a, b) {
  return a + b;
};
console.log(miFuncion(2, 2));

//funciones tipo self e Invoking
//En ella la función está definida pero no se la asigna a ninguna variable.
//También es una función anónima, pero se puede llamar a sí misma antes de cerrar la función con punto y coma. Se llama a sí misma al comienzo con parámetros y al final con los argumentos.
//Ésta función no se puede reutilizar porque no se le está asignando a ninguna variable y tampoco se le asigna ningún nombre, sólo se manda a llamar a sí misma una única vez
(function (a, b) {
  console.log("ejecutando la función : " + (a + b));
})(6, 6);

//Una función es un tipo de dato. En este video vemos el método arguments y el método toString. Las funciones pueden ser descriptas como objetos.
//Arguments sólo puede utilizarse dentro del bloque de la función, el método toString es un método que nos permite comprobar que las funciones puden ser descriptas como objetos, convierte a la función en texto.
// Hay que recordar que función y método son exáctamente lo mismo
console.log(typeof miFuncion);

function miFuncion2(a, b) {
  console.table(arguments);
  console.log(arguments.length);
}

miFuncion2("pepe", "pipi");

let textoDeFuncion = miFuncion.toString();
console.log(textoDeFuncion);
