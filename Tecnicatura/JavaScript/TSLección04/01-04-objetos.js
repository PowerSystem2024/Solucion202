// 0BJETO

let x = 10; // variable de tipo primitivo
console.log(x.length); // undefined, porque x es un número, no una cadena
console.log("Tipos primitivos");

// Objeto
let persona = {
    nombre: "Carlos",
    apellidos: "Gil",
    email: "cgil@gmail.com",
    edad: 28,
    idioma: "ES",
    get lang(){
        return this.idioma.toUpperCase(); //Conviete las minúsculas a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function() {  //método o función en JavaScript
        return this.nombre + " " + this.apellidos;
    },
    get nombreEdad(){ // Este es el método get
        return "El nombre es: "+this.nombre+", Edad: "+this.edad;
    }
    
}
console.log(persona.nombre); 
console.log(persona.apellidos); 
console.log(persona.email); 
console.log(persona.edad); 
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.dirección = "Salada 14";
persona2.telefono = "334854874576475843";
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");
console.log(persona["apellidos"]);
console.log("Usamos el ciclo for in")
// For in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
console.log(propiedad);
console.log(persona[propiedad]);
}
console.log("Cambiamos y eliminamos un error");
persona.apellida = "Betancud"; // Cambiamos dinamicamente un valor del objeto
delete persona.apellida;  // Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//Número 1: La más sencilla: Concatenar cada valor de cada propiedad
console.log("Número 1: La más sencilla: Concatenar cada valor de cada propiedad");
console.log(persona.nombre+", "+persona.apellidos);

//Número 2: A través del ciclo for in 
console.log("Número 2: A través del ciclo for in"); 
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
console.log("Número 3: La función Object.values()");
//Número 3: La función Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

// número 4 : Utilizaremos el método JSON.stringify
console.log("Distintas formas de imprimir un objeto: Forma 4");
let personaString =JSON.stringify(persona);
console.log(personaString);

