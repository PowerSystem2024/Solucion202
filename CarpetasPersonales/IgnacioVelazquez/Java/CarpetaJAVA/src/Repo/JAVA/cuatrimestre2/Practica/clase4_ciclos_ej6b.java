package Repo.JAVA.cuatrimestre2.Practica;

import javax.swing.*;

public class clase4_ciclos_ej6b {
    public static void main(String[] args) {
        /*
        JOptionPane
        Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de  todos los números introducidos
        */
        int num, suma = 0;

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma += num;
        }while(num != 0);

        JOptionPane.showMessageDialog(null, "La suma es: " + suma);

    }
}
