package Repo.JAVA.cuatrimestre2.Practica;

import javax.swing.*;

/*
 *Ej 1: Leer un número e indicar si es positivo o negativo. el proceso se repetira hasta que se introduzca un cero
 */
public class clase2_ciclos_ej_2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));

        while (numero != 0) {
            if (numero >0) {
                JOptionPane.showMessageDialog(null, "el numero = " + numero + " es positivo ");
            }
            else {
                JOptionPane.showMessageDialog(null, "el numero = " + numero + " es negativo ");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        JOptionPane.showMessageDialog(null, " saliendo del programa...");

    }
}

