package solucionCoin.BlackJack;

public class Mazo {
    private Carta[] mazo;
    private int cartasUsadas;

    // Arrays con los valores y palos posibles
    private static final String[] PALOS = {"C", "D", "T", "P"};
    private static final String[] VALORES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    Mazo(){
        mazo= new Carta[52];
        cartasUsadas= 0;
        crearMazo();
        mezclarMazo();
    }


    // Método para crear el mazo
    public void crearMazo(){
        int indice = 0;
        // Por cada palo
        for (String palo : PALOS) {
            // Por cada valor
            for (String valor : VALORES) {
                Carta carta = new Carta();
                carta.setPalo(palo);
                carta.setValor(valor);
                mazo[indice] = carta;
                indice++;
            }
        }
    }


    // Método para mezclar el mazo
    public void mezclarMazo() {

        for (int i = mazo.length - 1; i > 0; i--) {

            // Genera un índice aleatorio entre 0 e i
            int rand = (int)(Math.random() * (i + 1));
            // Intercambia las cartas en las posiciones i y rand
            Carta temp = mazo[i];
            mazo[i] = mazo[rand];
            mazo[rand] = temp;
        }
        cartasUsadas = 0; // Reinicia el contador de cartas usadas
    }

    // Método para repartir una carta
    public Carta repartirCarta() {
        // Verifica si quedan cartas en el mazo
        if (cartasUsadas == 52) {
            reiniciarMazo();
            repartirCarta();
        }
        cartasUsadas++;
        return mazo[cartasUsadas - 1];
    }

    // Método para reiniciar el mazo
    public void reiniciarMazo() {
        cartasUsadas = 0;
        mezclarMazo();
    }

    // Método para saber cuántas cartas quedan
    public int cartasRestantes() {
        return 52 - cartasUsadas;
    }
}
