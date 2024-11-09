
package ar.com.codesystem.test;

import ar.com.codesystem.ventas.*;

public class Ventas {

    public static void main(String[] args) {
        //Agregando productos
        //Tarea: Agregar mas objetos de tipo producto
        //Crear mas objetos de tipo Orden
        Producto producto1 = new Producto("Pantalon", 9500);
        Producto producto2 = new Producto("Camisa", 4500);
        Producto producto3 = new Producto("Zapatos", 12000);
        Producto producto4 = new Producto("Gorra", 2500);
        Producto producto5 = new Producto("Cinturon", 3500);
        Producto producto6 = new Producto("Calcetines", 1500);
        Producto producto7 = new Producto("Chaqueta", 18000);
        Producto producto8 = new Producto("Bolso", 8000);
        Producto producto9 = new Producto("Reloj", 5000);
        Producto producto10 = new Producto("Gafas", 6000);
        Producto producto11 = new Producto("Cartera", 4000);
        Producto producto12 = new Producto("Llavero", 2000);
        Producto producto13 = new Producto("Funda para celular", 1000);
        Producto producto14 = new Producto("Cargador", 2500);
        Producto producto15 = new Producto("Auriculares", 3500);
        Producto producto16 = new Producto("Mousepad", 1200);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        // Agregamos productos a orden1
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);

        // Agregamos productos a orden2
        orden2.agregarProducto(producto10);
        orden2.agregarProducto(producto11);
        orden2.agregarProducto(producto12);
        orden2.agregarProducto(producto13);
        orden2.agregarProducto(producto14);
        orden2.agregarProducto(producto15);
        orden2.agregarProducto(producto16);
        
        //Imprimimos por pantall
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
    
}
