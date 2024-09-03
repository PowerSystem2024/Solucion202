//            ----- CLASE CICLOS -----

// INSTRUCCIONES PARA USAR CON QUOKKA:
// 1. Asegúrate de tener Quokka instalado en tu editor de código (Visual Studio Code, Sublime Text, etc.).
// 2. Abre este archivo en tu editor.
// 3. Inicia una sesión de Quokka (en VS Code, usa el comando "Start Quokka" desde la paleta de comandos o usa el atajo `Ctrl+Shift+P`).
// 4. Descomenta el bloque de código que quieres ejecutar, puedes modificar segun tus necesidades.
// 5. Observa los resultados en el margen derecho del editor o en la ventana emergente de Quokka.

// ----WHILE----
//Itera MIENTRAS la condición sea verdadera
      // while (condición) {
      //   // Código a ejecutar mientras la condición sea verdadera
      // }

// let contador = 0;
// while(contador<3){
//   contador++;
// }
// console.log("Fin del WHILE")

// ----DO WHILE----
// Se ejecuta primero todo el codigo y luego la condición
      // do {
      //   // Código a ejecutar
      // } while (condición);

// let conteo = 0
// do{
//   console.log(conteo)
//   conteo++
// }while(conteo <3)
//   console.log("Fin del DO WHILE")

// ----FOR----
// Define inicialización, la condición y el incremento o decremento
// Tiene un número finito
      // for (inicializar=0; condición ; incremento de la variable)

// for (let contando = 0; contando <3; contando ++){
//   console.log(contando)
// }
// console.log("Fin del For")

//----BREAK----
// Interrumpe inmediatamente el ciclo cuando se cumple la condición que establecimos

// for (let contando = 1; contando <=10; contando ++){
//   if(contando % 2 ==0){
//     console.log(contando);
//     break;
//   }
// }
// console.log("Se interrumpio el ciclo ")

//---- CONTINUE -----
// Salta a la siguiente iteración omitiendo la ejecución de la actual

for (let contando = 0; contando <= 10; contando++){
  if(contando %2 !==0){
    continue;
  }
  console.log(contando)
}

// ----LABELS----
// No son una buena practica, se usan en combinación con "break" y "continue" para salir o saltar a una parte específica del código

// inicio:
// for (let contando = 0; contando <= 10; contando++) {
//   if (contando % 2 !== 0) {
//     break inicio;
//   }
//   console.log(contando)
// }
// console.log("termina el ciclo")
