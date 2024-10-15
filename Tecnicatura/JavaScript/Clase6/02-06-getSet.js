// --------------------------- Metdo set y get -------------------------------
/*
En este video veremos los métodos get y set. en particular veremos aquí el método get. Tanto el método get y set 
irían debajo del constructor, ahí encontramos los atributos. el método get es para poder leer la información de 
los atributos y el método set es para modificar los valores del atributo. El método get no se puede llamar igual 
que la propiedad, que el atributo de nuestra clase 
*/

class Persona{
    constructor(nombre, apellido){ // metodo constructor
        this._nombre = nombre; // Al atributo le asignamos un _
        this._apellido = apellido;
    }
    // Creando nuestro metodo get
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    // Creando nuestro metodo set
    set nombre(nombre){ // Con el set modificamos el valor del atributo
        this._nombre = nombre;    
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

}

// --------------------- Objeto 1 ---------------------
let persona1 = new Persona('Martin', 'Perez');

// Llamamos al metodo get, de manera indirecta estamos accediendo al valor del atributo de nombre 
console.log(persona1.nombre);
console.log(persona1.apellido);


// Llamamos al metodo set
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Castro'
console.log(persona1.nombre);
console.log(persona1.apellido);

// ------------------- Objeto 2 -----------------------
let persona2 = new Persona('Juan', 'Perez');

// Llamamos al metodo get
console.log(persona2.nombre);
console.log(persona2.apellido);

// Llamamos al metodo set
persona2.nombre = 'Maria Laura';
persona2.apellido = 'Mallea'
console.log(persona2.nombre);
console.log(persona2.apellido);