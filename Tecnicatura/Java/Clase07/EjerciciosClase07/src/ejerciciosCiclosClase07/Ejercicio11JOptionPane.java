/*
EJERCICIO 11:
DISEÑAR UN PROGRAMA QUE MUESTRE EL PRODUCTO DE LOS 10 PRIMEROS NUMEROS IMPARES
HACERLO CON JOPTIONPANE
 */
package ejerciciosCiclosClase07;

import javax.swing.JOptionPane;

public class Ejercicio11JOptionPane {
    public static void main(String[] args) {
        int producto = 1;
        int contador = 0;
        for (int i = 1; contador < 10; i++) {
            if (i % 2 != 0) {
                producto *= i;
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números pares es: " + producto);
    }
}