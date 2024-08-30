package Repo.JAVA.cuatrimestre2.Practica;


import javax.swing.*;

public class clase3_ciclos_ej3b {
    public static void main(String[] args) {


        int num = 1;

        while (num != 0 ){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(num==0){
               JOptionPane.showMessageDialog(null,"Saliendoooo-....");
                break;
            }
            if (num %2 == 0){

                JOptionPane.showMessageDialog(null,"El número ingresado " + num + " es  PAR");
            }else{
                JOptionPane.showMessageDialog(null,"El número ingresado " + num + " es IMPAR");
            }
        }
    }
}
