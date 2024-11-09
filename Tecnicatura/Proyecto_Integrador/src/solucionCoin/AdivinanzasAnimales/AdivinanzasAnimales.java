
package solucionCoin.AdivinanzasAnimales;

import solucionCoin.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdivinanzasAnimales {
    private List<Animal> animales;
    private Scanner scanner;
    private Jugador jugador;

    public AdivinanzasAnimales(Jugador jugador) {
        this.animales = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.jugador = jugador;
        this.inicializarAnimales();
        this.solicitarPlata();
        this.jugar();
    }

    public Jugador getJugador() {
        return this.jugador;
    }


    private void inicializarAnimales() {
        animales.add(new Animal("Perro", "Soy un animal doméstico, leal y me gusta jugar.",
                new String[]{"A) Gato", "B) Perro", "C) Conejo", "D) Hamster"}, "B"));
         
        animales.add(new Animal("Gato", "Soy independiente, me gusta dormir y tengo bigotes largos.",
                new String[]{"A) Ratón", "B) Perro", "C) Gato", "D) Conejo"}, "C"));
        
        animales.add(new Animal("Elefante", "Soy grande, tengo una trompa larga y soy muy inteligente.",
                new String[]{"A) Elefante", "B) Jirafa", "C) Hipopótamo", "D) Rinoceronte"}, "A"));
        
        animales.add(new Animal("Tigre", "Soy un gran felino, tengo rayas y soy un excelente cazador.",
                new String[]{"A) León", "B) Leopardo", "C) Tigre", "D) Pantera"}, "C"));
    }

    private void solicitarPlata() {
        if(this.jugador.getPlata() == 0){
            System.out.print("Ingrese la cantidad de plata con la que desea comenzar: ");
            this.jugador.setPlata(scanner.nextDouble());
            scanner.nextLine(); // Limpiar el buffer de entrada
        } else {
            System.out.print("cantidad de dinero disponible: ");
            System.out.print(this.jugador.getPlata());
        }
    }

    public void jugar() {
        System.out.println("*************Juego de Adivinanzas: Animales *************");
        System.out.println("\n¡Bienvenido al juego de adivinanzas de animales!");
        System.out.println("Por cada respuesta correcta ganarás 10 de plata.");
        System.out.println("Por cada respuesta incorrecta perderás 5 de plata.");
        System.out.println("Si no respondes, perderás 2 de plata.\n");   
        System.out.println(" ");
        System.out.println("                    /\\_/\"");                                                              
        System.out.println("               ____/ o o \\");
        System.out.println("              /~____ =ø= /");                          
        System.out.println("             (______)__m_m)");
        System.out.println(" ");
        System.out.println("                  _");
        System.out.println("                 /.\\" );                            
        System.out.println("                 Y  \\");
        System.out.println("                /    \\");
        System.out.println("              //     /");
        System.out.println("             |/ /\\_================");
        System.out.println("             / /");
        System.out.println("            / /");
        System.out.println("            \\/");
        System.out.println(" ");
        System.out.println("               __");
        System.out.println("             >(° )");
        System.out.println("               )/");
        System.out.println("              /(____/\\");
        System.out.println("             /        )");
        System.out.println("             \\ `  =~~/");
        System.out.println("              `---Y-"); 
        System.out.println(" ");
        System.out.println("               _");
        System.out.println("              C°) , ,");
        System.out.println("              ( \\/^U^\\");
        System.out.println("               (      \\");
        System.out.println("                 i(__.i\\*");
        System.out.println("                 /|   / \\");
        System.out.println("               o u  o   o");
        System.out.println(" ");
        System.out.println("*************Juego de Adivinanzas: Animales *************");
        
        for (Animal animal : animales) {
            System.out.println("Descripción: " + animal.getDescripcion());
            System.out.println("\nOpciones:");
            for (String opcion : animal.getOpciones()) {
                System.out.println(opcion);
            }
            
            System.out.print("\nElige una opción (A, B, C o D): ");
            String respuestaUsuario = scanner.nextLine().trim().toUpperCase();
            
            if (respuestaUsuario.equals(animal.getRespuestaCorrecta())) {
                System.out.println("\n¡Correcto! +10 de plata");
                plata += 10;
            } else if (respuestaUsuario.isEmpty()) {
                System.out.println("\nNo has ingresado una respuesta. -2 de plata");
                plata -= 2;
            } else if (!respuestaUsuario.matches("[A-D]")) {
                System.out.println("\nOpción inválida. Debes elegir A, B, C o D. -2 de plata");
                plata -= 2;
            } else {
                System.out.println("\nIncorrecto. La respuesta correcta era: " + 
                    animal.getOpciones()[animal.getRespuestaCorrecta().charAt(0) - 'A'] +
                    "\n-5 de plata");
                plata -= 5;
            }
            
            System.out.println("Plata actual: " + plata);
            System.out.println("\n" + "=".repeat(50) + "\n");
        }
        System.out.println("¡Juego terminado! Tu plata final es $: " + plata );
        System.out.println("**************************************************");
        System.out.println("  Gracias por jugar");
        System.out.println("                   __   __  ");
        System.out.println("                 ( s \\Y/ s )");
        System.out.println("                  \\_<>|<>_/");
        System.out.println("                   (_/|\\_) ");
        System.out.println("");
        System.out.println("**************************************************");
        
    }
}