
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    
    
     public static void main(String[] args) {
        
        // Inicializar la variable numero con el primer valor ingresado por el usuario
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // Loop que se repite hasta que el usuario ingrese el número 0
        while (numero != 0) {
            if (numero > 0) {
               JOptionPane.showMessageDialog(null, "El número " + numero + " es POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es NEGATIVO");
            }

            // Solicitar otro número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

        // Mensaje al finalizar el programa
     JOptionPane.showMessageDialog(null, "El número " + numero + " finaliza el programa"); 
         
         
         
     }
    
}
