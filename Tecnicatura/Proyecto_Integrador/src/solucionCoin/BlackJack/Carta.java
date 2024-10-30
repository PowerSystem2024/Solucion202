package solucionCoin.BlackJack;


public class Carta {
    private String palo;
    private String valor;
    private boolean isDisponible;

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

    public boolean getIsDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        this.isDisponible = disponible;
    }

    public String[] obtenerCarta() {
        if (valor == null || palo == null) {
            return new String[]{"Error: Valor o palo de la carta no inicializado."};
        }

        String valorAjustado = switch (valor) {
            case "10" -> "10";
            default -> valor + " ";
        };

        String simboloPalo = switch (palo) {
            case "C" -> "♥";
            case "D" -> "♦";
            case "P" -> "♠";
            case "T" -> "♣";
            default -> "?";
        };

        return new String[]{
                "┌─────────┐",
                "│ " + valorAjustado + "      │",
                "│         │",
                "│    " + simboloPalo + "    │",
                "│         │",
                "│      " + valorAjustado + " │",
                "└─────────┘"
        };
    }
}