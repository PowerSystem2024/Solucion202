package Ciclos04;

import javax.swing.*;

public class Ejercicio04_JOptionPAne {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un  numero:"));
        while(numero >=0){
           JOptionPane.showMessageDialog(null, "EL numero " + numero + " es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado " + conteo + " numeros positivos");
    }
}
