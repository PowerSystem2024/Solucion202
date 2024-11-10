/*
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package EjerciciosCiclos;

import javax.swing.JOptionPane;

public class EjJOptionPane {
    
    public static void main(String[] args) {
        
        long factorial = 1;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        for (int i = 1; i <= numero; i++){
            
            factorial *= i;
            
        }
        
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: " + factorial );
    }
    
}
