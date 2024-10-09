let x = 10; // Variable primitiva
console.log(x.lenght);
console.log("Tipos primitivos");

//OBJETO
let persona = {
    nombre: "Emmanuel",
    apellido: "Herrera",
    email: "emmanuelhk34@gmail.com",
    edad: 32,
    idioma: "ESP",
    get lang(){
        return this.idioma.toUpperCase(); // Convierte las minusculas en mayusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ // Metodo o funcion en JS
        return this.nombre+' '+this.apellido;
    },
    // Este es el metodo get
    get nombreEdad(){ 
        return "Nombre: "+this.nombre+", Edad: "+this.edad
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "5492222222";
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]); // Accedemos como si fuera un arreglo
console.log("Usamos el ciclo for in");

// For in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona) {
    console.log(propiedad);  
    console.log(persona[propiedad]);  
}
console.log("Cambiamos y eliminamos un error");
persona.apellida = "Gandini"; // Cambiamos dinamicamente un valor del objeto
delete persona.apellido;
console.log(persona);

// Distintas formas de imprimir un objeto

// Numero 1: La mas sencila es concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objego: ") 
console.log("FORMA 1: ");
console.log(persona.nombre+", "+persona.apellida);

// Numero 2: A traves del ciclo for in
console.log("FORMA 2: ");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Numero 3: Con la funcion Object.values()
console.log("FORMA 3: ");
let personaArray = Object.values(persona);
console.log(personaArray);

// Numero 4: Utilizaremos el metodo JSON.stringify
console.log("FORMA 4: ");
let personaString = JSON.stringify(persona);
console.log(personaString);


// 5.1 Métodos get y set Parte 1 y 2
console.log("Comenzamos a utilizar el metodo get")
console.log(persona.nombreEdad);

console.log("Comenzamos con el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);


// 5.2 Constructores de objetos
function Persona3(nombre, apellido, email){ // Este es el constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+", "+this.apellido;
    }
}
let padre = new Persona3("Leo", "Lopez", "llooppeezzl@gmail.com");
padre.nombre = "Luis";
padre.telefono = "5492222222"; // Propiedad exclusiva del objeto padre
console.log(padre);

let madre = new Persona3("Laura", "Contretra", "ccoontreral@gmail.com");
console.log(madre);
console.log(madre.telefono); // La propiedad no esta definida

// 5.3 Agregar métodos al constructor del objeto
console.log(padre.nombreCompleto); // Aparece el simbolo de funtion si no le agregamos los parentesis despues de padre.nombreCompleto
console.log(padre.nombreCompleto()); // Utilizamos la funcion
console.log(madre.nombreCompleto()); // Tambien puede utilizarse en el objeto de madre


// 5.4 Distintas formas de crear objetos
// TODO DESPUES DE NEW ES CONSIDERADO OBJETO
// Caso Objeto 1: 
let miObjeto1 = new Object(); // Sintaxis formal
// Caso Objeto 2:
let miObjeto2 = {}; // Sintaxis breve y recomendada

// Caso String 1:
let miCadena1 = new String("Hola"); // Sintaxis formal
// Caso String 2:
let miCadena2 = "Hola"; // Sintaxis breve y recomendada

// Caso con numeros 1:
let miNumero1 = new Number(1); // Sintaxis formal
// Caso con numeros 2:
let miNumero2 = 1; // Sintaxis breve y recomendada

// Caso con Boolean 1:
let miBoolean1 = new Boolean(false); // Sintaxis formal
// Caso con Boolean 2:
let miBoolean2 = false; // Sintaxis breve y recomendada

// Caso con Arreglos 1:
let miArreglo1 = new Array(); // Sintaxis formal
// Caso con Arreglos 2:
let miArreglo2 = []; // Sintaxis breve y recomendada

// Caso con Funtion 1:
let miFuncion1 = new function(){}; // Sintaxis formal
// Caso con Funtion 2:
let miFuncion2 = function(){}; // Sintaxis breve y recomendada


// 5.5 El uso de prototype
Persona3.prototype.telefono = "261222222";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "5493332222";
console.log(madre.telefono);


// 5.6 El uso de call
let persona4 = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto2: function(titulo, telefono){
        return titulo+": "+this.nombre+" "+this.apellido+" "+telefono;
        //return this.nombre+" "+this.apellido;
    }
}

let persona5 = {
    nombre: "Carlos",
    apellido: "Bianchi"
}

console.log(persona4.nombreCompleto2("Lic.", "5494444444"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing.", "5495555555"));


// 5.7 El uso de apply
// Manda a llamar a un metodo a un objeto que no tiene ese metodo pero que si esta en otro objeto
// La unica diferencia con call es la forma, pero el resultado es el mismo
// Con call simplemente se pasan los argumentos por separados
// Con apply se pasa un arreglo con todos los valores de los argumentos
let arreglo = ["Ing.", "5497777777"]
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));