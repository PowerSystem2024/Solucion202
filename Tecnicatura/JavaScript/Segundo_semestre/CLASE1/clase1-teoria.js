// 1.1 Ciclo While
// El ciclo 'while' se repite mientras la condición sea verdadera.
// Se evalúa la condición antes de ejecutar el bloque de código.

let contador = 0;
console.log("Ejemplo de ciclo while:");
while (contador < 5) {
  console.log("Contador en while:", contador);
  contador++; // Incrementamos del contador para evitar un ciclo infinito.
}

// 1.2 Ciclo do While
// A diferencia de 'while', el ciclo 'do while' ejecuta el bloque al menos una vez,
// ya que la condición se evalúa después de ejecutarlo.

let contadorDo = 0;
console.log("Ejemplo de ciclo do while:");
do {
  console.log("Contador en do while:", contadorDo);
  contadorDo++; // Incrementamos del contador.
} while (contadorDo < 5);

// 1.3 Ciclo For
// El ciclo 'for' es muy útil cuando conoces el número de iteraciones de antemano.
// Está compuesto por tres partes: inicialización, condición y actualización.

console.log("Ejemplo de ciclo for:");
for (let contando = 0; contando < 5; contando++) {
  console.log("Contador en for:", contando);
}

// 1.4 Palabra reservada Break
// 'break' se utiliza para salir de un ciclo de manera anticipada, cuando se cumple una condición.

console.log("Ejemplo de break en un ciclo for:");
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    break; // Salta fuera del ciclo cuando i es igual a 5.
  }
  console.log("i con break:", i);
}

// 1.5 Palabra reservada Continue
// 'continue' se utiliza para saltar a la siguiente iteración del ciclo,
// ignorando el resto del código en la iteración actual.

console.log("Ejemplo de continue en un ciclo for:");
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    continue; // Salta esta iteración cuando i es igual a 5.
  }
  console.log("i con continue:", i);
}

// 1.6 Etiquetas Labels
// Las etiquetas (labels) permiten asociar un nombre a un ciclo,
// lo que es útil para controlar múltiples ciclos anidados.
// 'break' y 'continue' pueden hacer referencia a estas etiquetas.

console.log("Ejemplo de labels con break:");
// Etiqueta llamada 'outerLoop'
outerLoop: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    if (i === 1 && j === 1) {
      break outerLoop; // Sale del ciclo exterior cuando i=1 y j=1.
    }
    console.log(`i = ${i}, j = ${j}`);
  }
}

console.log("Ejemplo de labels con continue:");
// Etiqueta llamada 'outerLoop2'
outerLoop2: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    if (i === 1 && j === 1) {
      continue outerLoop2; // Salta a la siguiente iteración del ciclo exterior.
    }
    console.log(`i = ${i}, j = ${j}`);
  }
}
