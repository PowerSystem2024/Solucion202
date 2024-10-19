let x = 10; // Variable de tipo primitivo

console.log(x.lenght); 
console.log("------------ Tipo primitivos ------------")

// Objeto memoria, queda en un espacio de memoria
let persona = {
    // Creamos atributos
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){ // Metodo o funcion en Javascript
        return this.nombre + " " + this.apellido; // this apunta a una variable (puntero?)
    }
}

console.log(persona.nombre); // Con el operador de punto podemos acceder a ese espacio de memoria
console.log(persona.apellido);
console.log(persona.edad);
console.log(persona.email);
console.log(persona);
console.log(persona.nombreCompleto())
console.log("------------ Ejecutando con un objeto ------------ ")

// Creamos otro objeto
let persona2 = new Object(); // Debe crear un objeto en memoria
persona2.nombre = 'Juan'; // Le agregamos atributos al objeto
persona2.direccion = 'Salada 14';
persona2.telefono = 2645554321;

console.log(persona2.telefono)
console.log("------------ Creando un nuevo objeto ------------ ")

// Otra forma de acceso como arreglo
console.log(persona['apellido'])
console.log(" ")
console.log("------------ Usamos el ciclo for in ------------ ")
// Otra forma de acceso con un "for in" y lo hacemos como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log(" ")

console.log("------------ Cambiamos y eliminamos un error ------------ ")
// Cambiamos dinamicamente un valor del objeto
persona.apellido = 'Betancud'; 
persona.apellidos = 'Orellana'; // Creamos asi otra propiedad
console.log(persona)
delete persona.apellidos; // Borramos el error (propiedad con su valor)
console.log(persona)

console.log("------------ Otras formas de imprimir un objeto ------------ ")
// Numero 1, la mas sencilla: concatenar cada valor de cada propiedad
console.log("Forma 1: concatenacion")
console.log(persona.nombre + " " + persona.apellido);

// Numero2: A traves de un ciclo for in
console.log("Forma 2: Ciclo for in")
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Numero3: La funcion Object.values()
// Regresa nuestro objeto pero como un arreglo
console.log("Forma 3: Object.values()")
let personaArray = Object.values(persona);
console.log(personaArray)

// Numero 4: Utilizaremos el metodo JSON.stringfy
console.log("Forma 4: JSON.stringify")
let personaString = JSON.stringify(persona) // Convierte nuestro objeto y lo convierte en una cadena
console.log(personaString)