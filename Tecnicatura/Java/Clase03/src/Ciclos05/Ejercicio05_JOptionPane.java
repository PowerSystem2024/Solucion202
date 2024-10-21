package Ciclos05;

import javax.swing.*;

public class Ejercicio05_JOptionPane {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random()*100);
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(numero<aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un  numero mayor");
            }
            else if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un  numero menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "FELICIDADES!!! Acertaste el numero");
            }
            conteo++;
        }while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Acertaste despues de " + conteo+ " intentos");
    }
}
