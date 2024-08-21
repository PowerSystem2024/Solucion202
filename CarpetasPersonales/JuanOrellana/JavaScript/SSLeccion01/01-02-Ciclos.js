//While

let contador = 0;

while(contador < 3){
    console.log(contador);
    contador++;
}

console.log("Fin del ciclo while");

// do while

let conteo = 0;

do {
    console.log(conteo);
    conteo++;
} while (conteo < 3);

console.log("Fin del ciclo do while");

// for

for(let contando = 0; contando < 3; contando++){
    console.log(contando);
}

console.log("Fin del ciclo for");

// Palabra reservada break

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break; //Si no le pongo el break me muestra todos los pares hasta el 10
    }
}

console.log("Termina el ciclo al encontrar el primer numero par");

// La palabra continue

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue; // Si encuentra un impar pasa a la siguiente iteracion
    }
    console.log(contando)
}
console.log("Termina el ciclo");

// La palabra continue y Etiquetas labels
// Las etiqeutas nos ayudan a ir a una parte especifica del programa
// No esta recomendada las etiquetas labels

inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        break inicio; // Con la etiqueta inicio estamos diciendole que rompa el programa
    }
    console.log(contando)
}
console.log("Termina el ciclo");

