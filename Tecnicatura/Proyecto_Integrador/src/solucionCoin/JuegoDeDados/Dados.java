package solucionCoin.JuegoDeDados;

public class Dados {
    public void mostrarDado(int numero) {
        switch (numero) {
            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
            case 2:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|       |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;
            case 3:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;
            case 4:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            case 5:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            case 6:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            default:
                System.out.println("Entrada Inválida");
                break;
        }
    }
}
