/*
EJERCICIO 12:
PEDIR UN NUMERO Y CALCULAR EL FACTORIAL
HACERLO CON SCANNER Y JOPTIONPANE
 */
package ejerciciosCiclosClase07;

import javax.swing.JOptionPane;

public class Ejercicio12JOptionPane {
    public static void main(String[] args) {
        int num;
        long factorial;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
        if(num < 0){
            JOptionPane.showMessageDialog(null, "El factorial no se aplica a numeros negativos.");
        }
        else{
            factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + factorial);
        }
    }
}