/*
Ejercicio 1: Leer un numero y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un numero negativo
 */
package ejercicioalcuadrado;

import javax.swing.JOptionPane;

public class EjAlCuadradoObjPane {
    public static void main(String[] args) {
        
        int numero, cuadrado;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                
        while(numero >= 0){
          cuadrado = (int)Math.pow(numero, 2);
          System.out.println("El numero " + numero + " elevado al cudrado es: " + cuadrado );
          
         numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
      }
        System.out.println("El programa a finalizado por numero negativo");
    }
    
}
