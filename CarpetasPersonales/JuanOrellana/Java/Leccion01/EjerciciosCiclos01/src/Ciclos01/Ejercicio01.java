/*
 
 */
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int num, cuadrado;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (num >= 0){ //Mientras el numero sea igual o mayor a cero
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("El numero " + num + " elevado al cuadrado es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("El sistema salio por numero negativo");
    }
    
}
