
package test;

public class TestArreglos {
    
    public static void main(String[] args) {
        
        int edades[] = new int [3]; //Instanciamos un objeto de tipo Arreglos, son de la clase object
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        edades[1] = 19;
        edades[2] = 9;
        System.out.println("edades indice 0 = " +  edades[0]);
        System.out.println("edades indice 1 = " + edades[1]);
        System.out.println("edades indice 2 = " + edades[2]);
        
        //edades[3] = 12; //Fuera de rango, error en tiempo de ejecucion
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos " + i + ": "+ edades[i]);
        }
    }
}
