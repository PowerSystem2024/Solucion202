/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
 */
package Ciclos04;

import javax.swing.JOptionPane;

public class EjercicioJOption04 {
    
    public static void main(String[] args) {
        
        int num;
        int contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        while (num >= 0) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es positivo");
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero: "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Usted digito " + contador + " numeros");
    }
    
}
