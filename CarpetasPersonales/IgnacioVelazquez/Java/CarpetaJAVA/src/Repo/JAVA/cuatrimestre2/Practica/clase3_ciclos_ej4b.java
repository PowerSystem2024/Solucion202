package Repo.JAVA.cuatrimestre2.Practica;

import javax.swing.*;

public class clase3_ciclos_ej4b {
    /*
Ejercicio 4: Pedir número hasta que se teclee uno negativo y mostrar cuantos números se han introducido.
con clase Scaner
 */
    public static void main(String[] args) {
        int num, contador = 0;


        do{
            System.out.print("Ingrese un numero: ");
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if (num > 0){
                contador++;
            }
        }while(num > 0);

        JOptionPane.showMessageDialog(null, "El el total de números ingresado fue : " + contador);
    }
}
