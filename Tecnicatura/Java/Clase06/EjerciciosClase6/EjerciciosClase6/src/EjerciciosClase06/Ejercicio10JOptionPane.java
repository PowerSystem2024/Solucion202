/*
EJERCICIO 10:
PEDIR 10 NUMEROS Y ESCRIBIR LA SUMA TOTAL
HACERLO CON LA CLASE SCANNER Y JOPTIONPANE
 */
package EjerciciosClase06;

import javax.swing.JOptionPane;

public class Ejercicio10JOptionPane {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma= suma+num;
            contador++;
        }while(contador < 10);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: " + suma);
    }
}