/*
El método GET en JavaScript se utiliza para hacer solicitudes HTTP de tipo GET a un servidor para obtener recursos o datos. En otras palabras, el método GET permite solicitar información desde un servidor, y el servidor responde con los datos solicitados.

El método GET se utiliza comúnmente en combinación con la API Fetch de JavaScript para hacer solicitudes HTTP a un servidor y obtener datos en formato JSON, texto, HTML u otros formatos. Por ejemplo, la siguiente función en JavaScript utiliza el método GET y la API Fetch para obtener datos de una API en línea que devuelve información sobre la cotización de Bitcoin:

javascriptCopy code
function obtenerCotizacionBitcoin() { fetch("https://api.coindesk.com/v1/bpi/currentprice.json") .then(response => response.json()) .then(data => { const precioBitcoin = data.bpi.USD.rate; console.log("El precio actual de Bitcoin en USD es:", precioBitcoin); }) .catch(error => { console.error("Hubo un error al obtener la cotización de Bitcoin:", error); }); }

En este ejemplo, la función obtenerCotizacionBitcoin() utiliza el método fetch() para hacer una solicitud HTTP de tipo GET a la API de Coindesk, que devuelve información sobre la cotización de Bitcoin en diferentes monedas. Luego, se utiliza el método json() para convertir la respuesta en un objeto JavaScript, y se accede a la propiedad USD.rate para obtener el precio actual de Bitcoin en dólares estadounidenses. Finalmente, se muestra el precio en la consola.

Es importante tener en cuenta que el método GET es una forma de hacer solicitudes HTTP seguras, ya que no cambia el estado del servidor ni modifica los datos. Por lo tanto, el método GET se utiliza comúnmente para obtener recursos o datos del servidor, mientras que los métodos POST, PUT y DELETE se utilizan para modificar los datos en el servidor.
*/
let persona = {
    // Creamos atributos
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES',
    nombreCompleto: function(){ // Metodo o funcion en Javascript
        return this.nombre + " " + this.apellido; // this apunta a una variable (puntero?)
    },
    get nombreEdad(){ // este es el metodo get
        return "El nombre es: " + this.nombre + ". Edad: " + this.edad;
    },
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){ // Para cuando recupere la informacion lo haga en mayuscula o minuscula
        // Convierte todos los str en mayuscula no importa como lo ingrese el usuario
        this.idioma = lang.toUpperCase(); // Aqui vamos a usarlo para modificarlo
    }
}

console.log("Comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

// Se verá el concepto de set que en inglés significa establecer o modificar. El método set se utilizará para modificar los valores de los objetos. Se combinará el uso del set con el uso del get.
console.log('Comenzamos con el metodo get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);