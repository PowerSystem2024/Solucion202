// Tarea: Todos los ejercicio hechos en otros lenguajes traerlos aquí con la sintaxis de JavaScript, por supuesto ejercicios de ciclos.

//RANGO
// Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
console.log("Rango de 0 a 10 con números divisibles entre 3");
for (let i = 0; i <= 10; i++) {
    if (i % 3 === 0) {
        console.log(i);
    }
}

// Ejercicio 2: Crear un rango de números de 2 a 6 e imprimirlos
console.log("Rango con valores de inicio = 2 y fin = 6");
for (let i = 2; i <= 6; i++) {
    console.log(i);
}

// Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2
console.log("Rango con valores de inicio = 3, fin = 10, incremento = 2");
for (let i = 3; i < 11; i += 2) {
    console.log(i);
}

//TUPLA
// Dada la siguiente tupla (array en JavaScript)
const tupla = [13, 1, 8, 3, 2, 5, 8]; // Definimos la tupla

// Creamos una lista que solo incluya los números menores a 5 e imprime por consola [1, 3, 2]
const lista = []; // Definimos la lista

// Filtramos los elementos menores a 5 de la tupla
for (let elemento of tupla) {
    if (elemento < 5) {
        lista.push(elemento);
    }
}

console.log(lista);

