package Practica;

import javax.swing.*;

public class Ciclos10JOption {
    public static void main(String[] args) {
        int suma = 0;
        int num=0;

        for (int i = 1; i <= 10; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + i + "° número:")); // Convertimos el String a int
            suma += num;
        }

        JOptionPane.showMessageDialog(null, "La suma total fue: " + suma);
    }

}
