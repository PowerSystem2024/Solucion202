// Creacion de array o arreglos

//let autos = new Array('Ferrari', 'Renault', 'BMW'); Esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW']; //Arreglo
console.log(autos);

// Recorremos los elementos de un arreglo
console.log(autos[0]); //Ferrari
console.log(autos[2]); //BMW
console.log("-------------------------")
for (let i = 0; i < autos.length; i++){
    console.log(i + " : " + autos[i]);
}

// Modificamos los elementos del arreglo
autos[1] = 'Volvo'; //Reemplazamos Renault por Volvo
console.log(autos[1]);

// Agregamos nuevos valores al arreglo
autos.push('Audi'); //Agregamos un elemento al final del arreglo
console.log(autos)

//Otraas formas de agregar elementos al arreglo
autos[autos.length] = 'Porsche'; 
/*
autos.length devuelve la longitud actual del array autos.
Al asignar 'Porsche' en el índice autos.length, se está agregando este nuevo elemento al final del array. 
Es equivalente a usar autos.push('Porsche').
*/
console.log(autos)

//Tercera forma de agregar eleemntos teniendo CUIDADO
autos[6] = 'Renault';
/*
Aquí se está asignando 'Renault' al índice 6 del array.
Si autos no tiene 6 elementos al momento de la asignación, 
JavaScript llenará los índices que faltan con undefined para que 'Renault' ocupe el índice 6.
*/
console.log(autos);

autos[-1] = 'Ford';
/*
En JavaScript, los índices de arrays son enteros no negativos. 
Sin embargo, se puede usar un índice negativo como -1, pero esto no agrega 'Ford' a una posición del array; 
en su lugar, crea una propiedad llamada -1 en el objeto array.
Esto no afecta la longitud del array (length) ni el contenido de los elementos accesibles mediante índices normales.
*/
console.log(autos);

// Como preguntar si es un arreglo o Array
console.log(Array.isArray(autos)); //Devuelve un valor booleano

console.log(autos instanceof Array); //Devuelve un valor booleano