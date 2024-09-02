package Repo.JAVA.cuatrimestre2.Practica;

import javax.swing.*;

public class clase3_ciclos_ej5 {
    /*
    Ejercicio 5: Realizar un juego para adivinar un número para ello generar un número aleatorio entre 0-100 y luego ir pidiendo números indicando
     "es mayor" ó  "es menor" con respecto a N.
    El proceso termina cuando el usuario acierta y mostramos el número de intentos realizados"
     */


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Comienza el Juego");

        int numAleatorio = (int) (Math.random()*(101));
        int num,contador = 0;

        System.out.println("numAleatorio = " + numAleatorio);

        do {
          num = Integer.parseInt(JOptionPane.showInputDialog(null,"Intente adivinar el número"));

          contador++;
          if (num == numAleatorio) {
              JOptionPane.showMessageDialog(null,"Correcto el número era "  + numAleatorio + " necesitaste "+ contador+ " intentos");
              break;
          }
          if (num < numAleatorio) {
              JOptionPane.showMessageDialog(null,"Es mayor.. Vuelve a intentarlo");
          }else{
              JOptionPane.showMessageDialog(null,"Es Menor..Vuelve a intentarlo");
          }
        }while(num != numAleatorio);




    }
}
