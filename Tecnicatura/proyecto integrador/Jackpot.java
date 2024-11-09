import java.util.Random;
import java.util.Scanner;

public class Jackpot {
    public static void main(String[] args) {
        int plata = 100; // Puedes establecer un valor inicial para la plata
        int desicion = 1; // Variable para decidir si se continúa jugando
        Random random = new Random();

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Bienvenido al JackPot 202");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°®");

        // Uso de try-with-resources para asegurar que el Scanner se cierre automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            while (desicion != 2) {
                if (plata < 1) {
                    System.out.println("No tiene suficiente dinero para jugar");
                    do {
                        System.out.println("¿Quiere ingresar dinero? S=1 N=2");
                        desicion = scanner.nextInt();
                        // Uso de "rule switch" para simplificar el switch
                        switch (desicion) {
                            case 1 -> {
                                System.out.println("Ingrese monto:");
                                int creditoin = scanner.nextInt();
                                plata += creditoin;
                                System.out.println("Tienes " + plata + " plata");
                            }
                            case 2 -> System.out.println("Gracias por jugar, adiós");
                            default -> System.out.println("Elección no válida!");
                        }
                    } while (desicion != 1 && desicion != 2);
                } else {
                    boolean seguirJugando = true;
                    while (plata > 0 && seguirJugando) {
                        System.out.print("Ingrese su apuesta (max " + plata + " plata, 0 para salir): ");
                        int apuesta = scanner.nextInt();

                        if (apuesta == 0) { // Permitir salir del juego con apuesta = 0
                            desicion = 2;
                            seguirJugando = false;
                            break;
                        }

                        if (apuesta > plata || apuesta < 1) {
                            System.out.println("Apuesta inválida. Introduce una cantidad entre 1 y " + plata);
                        } else {
                            plata -= apuesta;
                            int carrete1 = random.nextInt(9) + 1;
                            int carrete2 = random.nextInt(9) + 1;
                            int carrete3 = random.nextInt(9) + 1;

                            System.out.println("Los carretes muestran: " + carrete1 + "-" + carrete2 + "-" + carrete3);

                            if (carrete1 == carrete2 && carrete2 == carrete3) {
                                int premio = random.nextInt(6) + 5; // Genera un premio entre 5 y 10
                                plata += premio;
                                System.out.println("¡Felicidades! ¡Has ganado " + premio + " plata!. Te queda " + plata + " plata");
                            } else {
                                System.out.println("Lo siento, no has ganado esta vez. Tienes " + plata + " plata");
                            }

                            // Preguntar si desea volver a jugar
                            System.out.print("¿Quiere volver a tirar? si=1 no=0: ");
                            int elegir = scanner.nextInt();

                            if (elegir == 0) {
                                seguirJugando = false;
                                desicion = 2;
                            } else if (elegir != 1) {
                                System.out.println("Elección incorrecta. Elija si=1 no=0");
                                seguirJugando = false;
                                desicion = 2;
                            }
                        }
                    }
                }
            }
            System.out.println("¡Juego terminado! Tienes " + plata + " plata");
            System.out.println("Gracias por jugar");
        }
    }
}
