/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numeros impares
 */
package EjercicioCiclos;

import javax.swing.JOptionPane;

public class EjScanner {

    public static void main(String[] args) {
        
        long producto = 1; 
        for (int i = 1; i <= 20; i += 2){ //El aumento paunta a ir solo por los pares
            producto *= i;
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los numeros impares es: \n" + producto);
        
    }
    
    
}
