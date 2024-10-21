package Ciclos03;

import javax.swing.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero != 0){
            if(numero % 2 ==0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es impar");
            }
           numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero: "));
        }
        JOptionPane.showMessageDialog(null, "Ingreso el numero " + numero + "finaliza el programa");
    }
}
