package solucionCoin.BlackJack;


public class Carta {
    private String palo;
    private String valor;


    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Método para obtener el símbolo del palo
    private String obtenerSimbolo() {
        return switch (palo) {
            case "C" -> "♥";
            case "D" -> "♦";
            case "P" -> "♠";
            case "T" -> "♣";
            default -> "?";
        };
    }

    // Método para ajustar el valor para la visualización
    private String obtenerValorAjustado() {
        return switch (valor) {
            case "10" -> "10";
            default -> valor + " ";
        };
    }

    // Método para obtener la representación visual de la carta
    public String[] obtenerVisualizacion() {
        String valorAjustado = obtenerValorAjustado();
        String simbolo = obtenerSimbolo();

        return new String[]{
                "┌─────────┐",
                "│ " + valorAjustado + "      │",
                "│         │",
                "│    " + simbolo + "    │",
                "│         │",
                "│       " + valorAjustado + "│",
                "└─────────┘"
        };
    }
}