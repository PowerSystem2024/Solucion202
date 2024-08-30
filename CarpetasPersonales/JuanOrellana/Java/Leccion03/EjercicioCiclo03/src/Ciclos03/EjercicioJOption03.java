/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero.
Para cada  uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOption
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class EjercicioJOption03 {
    
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(num != 0){
            if (num % 2 == 0){
                 JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
            }
            else{
                 JOptionPane.showMessageDialog(null, "El numero " + num + " es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "A salido con exito del programa");
        System.out.println("");
    }
    
}
