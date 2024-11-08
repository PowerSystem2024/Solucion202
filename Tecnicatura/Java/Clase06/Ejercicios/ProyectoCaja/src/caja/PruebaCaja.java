package caja;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        caja1.a = 2;
        caja1.b = 2;
        caja1.c = 2;
        int volumnen = caja1.volumenCaja();
        System.out.println("volumnen = " + volumnen);
    }
    
}
