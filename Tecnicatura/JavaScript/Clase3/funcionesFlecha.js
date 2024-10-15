//Las funciones flecha son equivalentes a las funciones expresión.
//Su símbolo se construye con dos caracteres: el de = y el de mayor que =>
//recordar que ésta función no utiliza la palabra reservada function, ni la palabra reservada return y tampoco usa llaves.
// tiene el return implicito undefined si se le agregan las llaves.

//sintaxis
const miFunciónFlecha = (a, b) /* <-- parametros */ => a + b;

let primerSuma = miFunciónFlecha(5, 7); // argumentos
console.log(primerSuma);

//la diferencia entre los conceptos de argumentos y parámetros que en la práctica real pueden manejarse de manera equivalente.
//Cuando se define una función las variables que recibirá se conocen como parámetros y cuando se llama la función se ponen los argumentos que son los valores de los parámetros

let sumando = function (a = 4, b = 6) {
  console.log(arguments[0]);
  console.log(arguments[1]);
  console.log(arguments[2]);

  return a + b;
};

let resultado = sumando();
console.log(resultado);

// Ahora veremos paso por valor que se dá cuando utilizamos tipos que no son objetos; como por ejemplo: tipo numérico, tipo booleano, etc.
// En el paso por valor la variable no sufre ningún cambio, la variable sólo pasó una copia.

/*
En JavaScript, los tipos de datos primitivos (números, strings, booleanos, null, undefined y símbolos) se pasan por valor, lo que significa que se hace una copia del valor cuando se pasa a una función. Cualquier cambio en el valor dentro de la función no afectará la variable original fuera de la función.

En cambio, los tipos de datos no primitivos (objetos, arrays y funciones) se pasan por referencia. Esto significa que cuando se pasa un objeto a una función, se pasa una referencia a la ubicación en la memoria del objeto, no una copia del objeto. Cualquier cambio en el objeto dentro de la función afectará el objeto original fuera de la función.

Ejemplo de pasar por valor:
*/

function cambiarValor(a) {
  a = 10;
  console.log("Dentro de la función:", a); // 10
}

let numero = 5;
cambiarValor(numero);
console.log("Fuera de la función:", numero); // 5

/*
En este ejemplo, la variable 'numero' no se ve afectada por el cambio dentro de la función porque se pasa por valor, es decir, se hace una copia.

Ejemplo de pasar por referencia:
*/

function cambiarPropiedad(obj) {
  obj.nombre = "Nuevo Nombre";
  console.log("Dentro de la función:", obj.nombre); // Nuevo Nombre
}

let persona = {
  nombre: "Nombre Original",
};
cambiarPropiedad(persona);
console.log("Fuera de la función:", persona.nombre); // Nuevo Nombre

/*
En este ejemplo, la propiedad 'nombre' del objeto 'persona' se ve afectada por el cambio dentro de la función porque se pasa por referencia, es decir, se pasa una referencia al mismo objeto en memoria.
*/
