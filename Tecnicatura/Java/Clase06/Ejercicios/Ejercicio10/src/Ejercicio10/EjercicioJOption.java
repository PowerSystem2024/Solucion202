/*
Ejercicio 10: Pedir 10 numeros y escribir la suma total.
 */
package Ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class EjercicioJOption {
    
    public static void main(String[] args) {
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        
            suma += numero;
            contador++;
        } while(contador < 10);
        
        JOptionPane.showMessageDialog(null, "La suma total de los numeros ingresados es: "+ suma);
        JOptionPane.showMessageDialog(null, "Fin del programa");
        
    }
}
