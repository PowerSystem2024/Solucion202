/*
Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un cero. 
 */
package Ejercicio02;

import javax.swing.JOptionPane;

public class Ej2Joption {

    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while (numero !=0){
            if (numero < 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
            } 
            else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Salio del programa");
    }
    
}
