package solucionCoin.JuegoDeDados;

import java.util.Random;
import java.util.Scanner;

public class JugarDados {
    private double plata; // Saldo inicial-> TRAER PLATA DESDE UTILS!!!
    private Dados dados;

    // Constructor
    public JugarDados(double saldoInicial) {
        this.plata = saldoInicial;
        this.dados = new Dados();
    }

    // Método
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.printf("Tu saldo es: $%.2f%n", plata);
            System.out.print("Ingresa tu apuesta: ");
            double apuesta = scanner.nextDouble();

            // Validación
            if (apuesta > plata) {
                System.out.println("No tienes suficiente saldo para esa apuesta. Inténtalo de nuevo.");
                continue;
            }

            // Restar la apuesta del saldo
            plata -= apuesta;

            // Lanzar los dados
            int dado1 = random.nextInt(6) + 1; // Dado 1
            int dado2 = random.nextInt(6) + 1; // Dado 2
            int resultado = dado1 + dado2;

            System.out.printf("Has sacado un %d y un %d, total: %d%n", dado1, dado2, resultado);
            dados.mostrarDado(dado1); // Mostrar el dado 1
            dados.mostrarDado(dado2); // Mostrar el dado 2

            // Verificar
            if (resultado == 7) {
                System.out.println("¡Recuperas tu apuesta! El total de los dados es 7.");
                plata += apuesta;
            } else if (resultado >= 8) {
                System.out.println("¡Felicidades! Has ganado el doble de tu apuesta.");
                plata += apuesta * 2;
            } else if (dado1 == dado2) {
                System.out.println("¡Dobles! Has duplicado todo tu saldo. ¡FELICIDADES!");
                plata *= 2;
            } else if (resultado <= 6) {
                System.out.println("Lo siento, has perdido.");
            }

            System.out.printf("Tu saldo es: $%.2f%n", plata);
            System.out.print("¿Deseas seguir jugando? (1 = Sí, 0 = No): ");
            int seguirJugando = scanner.nextInt();
            if (seguirJugando == 0) {
                break;
            }
        }

        System.out.println("Gracias por jugar a los Dados.");
        scanner.close();
    }

    // Método principal-inicia el juego
    public static void main(String[] args) {
        JugarDados juego = new JugarDados(1000.0); //Saldo para test, luego traer saldo inicial de "plata"
        juego.jugar(); // Iniciar el juego
    }
}