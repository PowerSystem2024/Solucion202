class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre
        this._precio = precio
    }

    get isProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template literal: Nos permite insertar codigo dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`
    }
} //Fin de la clase producto

class Orden {
    static contadorordenes = 0;
    static getMAX_PRODUCTOS(){ // Simula una constante
        return 5;
    }
    
    constructor(){
        this._idOrden = ++Orden.contadorordenes;
        this._producto = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._producto.length < Orden.getMAX_PRODUCTOS()){
            this._producto.push(producto); // Tenemos dos tipos de sintaxis:  1
            //this._producto[this._contadorProductosAgregados++] = producto; // Tenemos dos tipos de sintaxis:  2
        }
        else{
            console.log('No se pueden agregar mas productos');
        }
    }// Fin del metodo agregar producto

    calcularTotal(){
    let totalVenta = 0;
    
        for (let producto of this._producto){
            totalVenta += producto.precio;
        } // Fin ciclo for
        return totalVenta;
    }// fin del metodo calcular total

    mostrarOrden(){
        let productosOrden = '';

        for(let productos of this._producto){
            productosOrden += '\n{ ' + productos.toString() + ' }';

        }// Fin del ciclo for

        console.log(`Orden: ${this._idOrden}. Total: ${this.calcularTotal}. Producto: ${productosOrden}`)
    }// Fin del metodo mostrarOrden

}// Fin de la clase Orden



let producto1 = new Producto('Pantalon', 3200)
let producto2 = new Producto('Camisa', 2000)
let producto3 = new Producto('Saco', 5000)
let producto4 = new Producto('Cinturon', 500)

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.mostrarOrden();

let orden2 = new Orden();
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto4);
orden2.mostrarOrden();

// console.log(producto1.toString())
// console.log(producto2.toString())