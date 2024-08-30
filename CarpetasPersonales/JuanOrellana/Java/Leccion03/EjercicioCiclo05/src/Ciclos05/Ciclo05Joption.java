/*
 Ejercicio 5: Realizar un juego para adivinar un numero, 
para ello generar un numero aleatorio entre 0-100 y 
luego ir pidiendo numeros indicando "es mayor" o "es menor" con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos. 
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclo05Joption {
    public static void main(String[] args) {
        
        int num;
        int numeroAleatorio = (int) (Math.random() * 101);
        int contador = 0;
        
        //System.out.println("numeroAleatorio = " + numeroAleatorio);
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        while (num != numeroAleatorio ) {
            
            if (num < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Es menor");
                contador++;
            }
            else {
                JOptionPane.showMessageDialog(null, "Es mayor");
                contador++;
            }
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        }
        JOptionPane.showMessageDialog(null, "Acerto en "+ contador+ " intentos");
    }
}
