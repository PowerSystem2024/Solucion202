/*
Ejercicio 5: Realizar un juego para adivinar un numero, 
para ello generar un numero aleatorio entre 0-100 y 
luego ir pidiendo numeros indicando "es mayor" o "es menor" con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos. 
 */
 
 // Ejercicio solucionado por el profe Ariel.
 // Con JOption
package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclos05ArielJOption {
    public static void main(String[] args) {
          int num, aleatorio, contador = 0;
        
         aleatorio = (int) (Math.random() * 100);
         
         do{
             num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
             
             if (num < aleatorio) {
                 JOptionPane.showMessageDialog(null, "Digite un numero mayor");
             } 
             else if (num > aleatorio) {
                 JOptionPane.showMessageDialog(null, "Digite un numero menor");
             }
             else {
                 JOptionPane.showMessageDialog(null, "FELICIDADES!!! Has adivinado el numero!!!");
             }
             contador++;
         } while (num != aleatorio) ;
         JOptionPane.showMessageDialog(null, "Adivinaaste el numero en " + contador + " intentos");
    }
}
