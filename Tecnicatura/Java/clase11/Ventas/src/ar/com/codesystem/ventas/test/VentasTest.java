
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        //Tarea
        //Crear mas objetos de tipo Producto = 10
        //Crear mas objetos de tipo Orden = 2
        
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Zapatos", 7500.00);  
        Producto producto4 = new Producto("Camiseta", 2500.00);  
        Producto producto5 = new Producto("Bufanda", 1500.00);  
        Producto producto6 = new Producto("Sombrero", 3500.00);  
        Producto producto7 = new Producto("Chaqueta", 6000.00);  
        Producto producto8 = new Producto("Jean", 8000.00);  
        Producto producto9 = new Producto("Vestido", 9000.00);  
        Producto producto10 = new Producto("Short", 4800.00);  
      
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        //Agregamos productos primera orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);  
        orden1.agregarProducto(producto4);
       
        //Mostrar la primera orden
        System.out.println("Orden 1:");
        orden1.mostrarOrden();
        
        // Agregar algunos productos a la segunda orden  
        orden2.agregarProducto(producto5);  
        orden2.agregarProducto(producto6);  
        orden2.agregarProducto(producto7);  
        orden2.agregarProducto(producto8);  
        orden2.agregarProducto(producto9);  
        orden2.agregarProducto(producto10);  
        
        // Mostrar la segunda orden  
        System.out.println("\nOrden 2:");  
        orden2.mostrarOrden();     
    }
    
}
