class Persona { // Clase padre que representa a una persona
    constructor(nombre, apellido) { 
        this._nombre = nombre; // Inicializa el atributo privado _nombre
        this._apellido = apellido; // Inicializa el atributo privado _apellido
    }

    // Método getter para obtener el nombre
    get nombre() {
        return this._nombre; // Devuelve el valor del atributo _nombre
    }

    // Método getter para obtener el apellido
    get apellido() {
        return this._apellido; // Devuelve el valor del atributo _apellido
    }

    // Método setter para establecer un nuevo nombre
    set nombre(nombre) { 
        this._nombre = nombre; // Asigna un nuevo valor al atributo _nombre
    }

    // Método setter para establecer un nuevo apellido
    set apellido(apellido) {
        this._apellido = apellido; // Asigna un nuevo valor al atributo _apellido
    }
}

class Empleado extends Persona { // Clase hija que hereda de Persona
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido); // Llama al constructor de la clase padre (Persona) para inicializar _nombre y _apellido
        this._departamento = departamento; // Inicializa el atributo privado _departamento
    }

    // Método getter para obtener el departamento
    get departamento() {
        return this._departamento; // Devuelve el valor del atributo _departamento
    }

    // Método setter para establecer un nuevo departamento
    set departamento(departamento) {
        this._departamento = departamento; // Asigna un nuevo valor al atributo _departamento
    }
}

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre)