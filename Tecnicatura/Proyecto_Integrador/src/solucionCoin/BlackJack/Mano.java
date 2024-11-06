package solucionCoin.BlackJack;

public class Mano {
    private Carta[] cartas;
    private int numCartas;  // número actual de cartas en la mano
    private static final int MAX_CARTAS = 11;  // máximo de cartas posibles en BlackJack

    // Constructor
    public Mano() {
        cartas = new Carta[MAX_CARTAS];
        numCartas = 0;
    }

    // Método para agregar una carta a la mano
    public void agregarCarta(Carta carta) {
        if (numCartas < MAX_CARTAS) {
            cartas[numCartas] = carta;
            numCartas++;
        } else {
            System.out.println("No se pueden agregar más cartas a la mano");
        }
    }

    // Método para calcular el valor de la mano
    public int getValorMano() {
        int valor = 0;
        int numAses = 0;  // contador de Ases

        // Primera pasada sumartodo excepto las A
        for (int i = 0; i < numCartas; i++) {
            String valorCarta = cartas[i].getValor();
            if (valorCarta.equals("A")) {
                numAses++;
            } else if (valorCarta.equals("J") || valorCarta.equals("Q") || valorCarta.equals("K")) {
                valor += 10;
            } else {
                valor += Integer.parseInt(valorCarta);
            }
        }

        // Segunda pasada: manejar los Ases
        for (int i = 0; i < numAses; i++) {
            if (valor + 11 <= 21) {
                valor += 11;
            } else {
                valor += 1;
            }
        }

        return valor;
    }

    // Método para limpiar la mano (descartar todas las cartas)
    public void limpiarMano() {
        for (int i = 0; i < numCartas; i++) {
            cartas[i] = null;
        }
        numCartas = 0;
    }

    // Método para verificar si tiene BlackJack
    public boolean tieneBlackJack() {
        return numCartas == 2 && getValorMano() == 21;
    }

    // Método para verificar si se pasó de 21
    public boolean sePasoDe21() {
        return getValorMano() > 21;
    }

    // Método para obtener el número de cartas
    public int getNumCartas() {
        return numCartas;
    }

    // Método para mostrar las cartas en formato visual
    public void mostrarCartasVisual() {
        if (numCartas == 0) {
            System.out.println("No hay cartas en la mano");
            return;
        }

        // Obtener la visualización de todas las cartas
        String[][] cartasVisuales = new String[numCartas][];
        for (int i = 0; i < numCartas; i++) {
            cartasVisuales[i] = cartas[i].obtenerVisualizacion();
        }

        // Mostrar las cartas línea por línea
        for (int linea = 0; linea < 7; linea++) {
            for (int carta = 0; carta < numCartas; carta++) {
                System.out.print(cartasVisuales[carta][linea] + " ");
            }
            System.out.println();
        }
        System.out.println("Valor total: " + getValorMano());
    }

    // Método para mostrar ambas manos (jugador y crupier)
    public static void mostrarManos(Mano manoJugador, Mano manoCrupier, boolean mostrarTodosCrupier) {
        System.out.println("\nMano del Crupier:");
        if (!mostrarTodosCrupier && manoCrupier.getNumCartas() > 0) {
            // Mostrar solo la primera carta del crupier y el resto ocultas
            String[][] cartaVisible = new String[1][];
            cartaVisible[0] = manoCrupier.cartas[0].obtenerVisualizacion();

            // Crear carta oculta
            String[] cartaOculta = {
                    "┌─────────┐",
                    "│ ? ? ? ? │",
                    "│         │",
                    "│    ?    │",
                    "│         │",
                    "│ ? ? ? ? │",
                    "└─────────┘"
            };

            // Mostrar primera línea de todas las cartas
            for (int linea = 0; linea < 7; linea++) {
                System.out.print(cartaVisible[0][linea] + " ");
                for (int i = 1; i < manoCrupier.getNumCartas(); i++) {
                    System.out.print(cartaOculta[linea] + " ");
                }
                System.out.println();
            }
        } else {
            manoCrupier.mostrarCartasVisual();
        }

        System.out.println("\nTu mano:");
        manoJugador.mostrarCartasVisual();
    }
}
