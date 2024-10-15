/*
Ahora veremos clases en JavaScript. En éste video se verá la sintaxis para crearlas, es decir, a partir de una 
clase se crearan objetos de esa clase. A diferencia de los objetos una clase es  una plantilla. Así es que en la 
clase se definirán los atributos y métodos que deseamos que contengan los objetos. A partir deésta plantilla se 
podrán crear instancias. Así es que un objeto es una instancia en una clase. En realidad la clase no contiene 
valores y si los tiene se aplicaran a todos los objetos que se creen. Una clase tendrá nombre, atributos y 
métodos, estas tres cosas son las características de la clase. Los objetos que se creen con la clase poseerán 
las mismas características. Los objetos no comparten información entre ellos, cada uno contiene sus propios 
valores.
*/

class Persona{
    constructor(nombre, apellido){ // metodo constructor
        this.nombre = nombre;
        this.apellido = apellido;
    }


}

//Objeto 1
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1);

//Objeto 2
let persona2 = new Persona('Juan', 'Perez');
console.log(persona2);