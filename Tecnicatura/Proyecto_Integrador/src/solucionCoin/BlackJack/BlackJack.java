package solucionCoin.BlackJack;
import solucionCoin.Juego;
import solucionCoin.Jugador;
import solucionCoin.Utilidades;

import java.util.Scanner;

public class BlackJack extends Juego {
    private Mazo mazo;
    private Mano manoJugador;
    private Mano manoCrupier;
    private double apuesta;
    private Jugador jugadorBJ;

    Scanner scanner = new Scanner(System.in);
    Utilidades util = new Utilidades();

    // Constructor
    public BlackJack(Jugador jugador) {
        mazo = new Mazo();
        manoJugador = new Mano();
        manoCrupier = new Mano();
        apuesta = 0.0;
        jugadorBJ = jugador;
    }


    @Override
    public void iniciarJuego() {
        cargando();
        System.out.print("Bienvenido al Juego de Black Jack");
        int opcion;
        do{
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("""
                    1 - Jugar
                    2 - Ingresar Dinero
                    3 - Consultar Saldo
                    4 - Salir
                    """);
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    apostar();
                    break;
                case 2:
                    System.out.print("\nDigite el monto que desea ingresar ");
                    jugadorBJ.setPlata(Double.parseDouble(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print(jugadorBJ.getNombre()+ " Tienes el saldo de $" + jugadorBJ.getPlata());
                    break;
                case 4:
                    System.out.println("Hasta luego..");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        while (opcion != 4);
    }

    // Método para iniciar el juego
    @Override
    public void apostar() {
        if (jugadorBJ.getPlata() == 0){
            System.out.print("Debe ingresar dinero para poder apostar. ");

        }else{
            System.out.print("Ingresa tu apuesta: ");
            apuesta = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            if (apuesta> jugadorBJ.getPlata()){
                System.out.print("No tiene suficiente dinero para poder realizar esta apuesta. ");
            } else {
                // Repartir cartas iniciales
                repartirCartasIniciales();

                // Mostrar las manos iniciales
                Mano.mostrarManos(manoJugador, manoCrupier, false);

                // Turno del jugador
                turnoJugador();

                // Turno del crupier
                if (!manoJugador.sePasoDe21()) {
                    turnoCrupier();
                }

                // Determinar ganador
                determinarGanador();
            }
        }

    }

    private void repartirCartasIniciales() {
        manoJugador.agregarCarta(mazo.repartirCarta());
        manoCrupier.agregarCarta(mazo.repartirCarta());
        manoJugador.agregarCarta(mazo.repartirCarta());
        manoCrupier.agregarCarta(mazo.repartirCarta());
    }

    private void turnoJugador() {
        boolean jugadorSePlanta = false;
        while (!jugadorSePlanta && !manoJugador.sePasoDe21()) {
            System.out.print("""
                    Elija una opcion
                        1- Pedir una carta
                        2- Plantarse
                    """);
            int respuesta = Integer.parseInt(scanner.nextLine());
            if (respuesta==1) {
                util.imprimirSeparador();
                manoJugador.agregarCarta(mazo.repartirCarta());
                Mano.mostrarManos(manoJugador, manoCrupier, false);
            } else {
                jugadorSePlanta = true;
            }
        }
    }

    private void turnoCrupier() {
        util.limpiarPantalla();
        util.imprimirSeparador();
        while (manoCrupier.getValorMano() <= 16) {
            System.out.println("el crupier esta tomando una carta");
            util.pausar(1000);
            manoCrupier.agregarCarta(mazo.repartirCarta());
        }
        Mano.mostrarManos(manoJugador, manoCrupier, true);
    }

    private void determinarGanador() {
        int valorJugador = manoJugador.getValorMano();
        int valorCrupier = manoCrupier.getValorMano();

        if (valorJugador > 21) {
            System.out.println("¡Te has pasado de 21! Perdiste.");
            perderApuesta(apuesta);
            manoJugador.limpiarMano();
            manoCrupier.limpiarMano();
        } else if (valorCrupier > 21) {
            System.out.println("¡El crupier se ha pasado de 21! Has ganado.");
            ganarApuesta(apuesta);
            manoJugador.limpiarMano();
            manoCrupier.limpiarMano();
        } else if (valorJugador == valorCrupier) {
            System.out.println("Empate.");
            empatar();
            manoJugador.limpiarMano();
            manoCrupier.limpiarMano();
        } else if (valorJugador > valorCrupier) {
            System.out.println("¡Has ganado!");
            ganarApuesta(apuesta);
            manoJugador.limpiarMano();
            manoCrupier.limpiarMano();
        } else {
            System.out.println("Has perdido.");
            perderApuesta(apuesta);
            manoJugador.limpiarMano();
            manoCrupier.limpiarMano();
        }
    }

    private void ganarApuesta(double apuesta) {
        jugadorBJ.setPlata(this.apuesta);
        System.out.println("Has ganado $" + this.apuesta * 2 + ".");
    }

    private void perderApuesta(double apuesta) {
        jugadorBJ.setPlata(this.apuesta*-1);
        System.out.println("Has perdido $" + apuesta + ".");
    }

    private void empatar() {
        System.out.println("Tu apuesta de $" + apuesta + " te ha sido devuelta.");
    }

    private void cargando(){
        System.out.println(
                """
        
                !  ██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗
                !  ██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝
                !  ██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝
                !  ██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗
                !  ██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗
                !  ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝
                
        
                !  ┓ ┏┓┏┓┳┓┳┳┓┏┓
                !  ┃ ┃┃┣┫┃┃┃┃┃┃┓
                !  ┗┛┗┛┛┗┻┛┻┛┗┗┛ ♦♦♦
   
                """
        );

        util.pausar(2000);
        util.limpiarPantalla();

    }


}