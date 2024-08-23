/*
Ejercicios 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero.
 */
package Ciclos02;

import javax.swing.JOptionPane; //Importo la clase a utilizar

public class Ejercicio02 {
    public static void main(String[] args) {
        
        int num; //Defino las variables
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (num != 0) {
            if (num > 0){
                //System.out.println("El numero es positivo");
                JOptionPane.showMessageDialog(null, "El numero " + num + " es Positivo");
            } else{
                //System.out.println("El numero es negativo");
                JOptionPane.showMessageDialog(null, "El numero " + num + " es Negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        //System.out.println("Salio del sistema");
        JOptionPane.showMessageDialog(null, "Usted ingreso el "+ num + " . Finaliza el programa.");
    }
}
