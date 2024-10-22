package solucionCoin;

public class Utilidades {
    // Constante para determinar cuántas líneas "limpian" la pantalla
    private static final int LINEAS_LIMPIEZA = 50;

    /**
     * Limpia la pantalla imprimiendo múltiples líneas en blanco
     */
    public static void limpiarPantalla() {
        for (int i = 0; i < LINEAS_LIMPIEZA; i++) {
            System.out.println();
        }
    }

    /**
     * Pausa la ejecución por los milisegundos especificados
     */
    public static void pausar(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Imprime una línea separadora para mejor legibilidad
     */
    public static void imprimirSeparador() {
        System.out.println("\n========================================\n");
    }

    /**
     * Espera a que el usuario presione ENTER
     */
    public static void presionarEnterParaContinuar() {
        System.out.println("\nPresiona ENTER para continuar...");
        try {
            System.in.read();
            // Limpiamos el buffer
            while (System.in.available() > 0) {
                System.in.read();
            }
        } catch (Exception e) {
            // Ignorar excepciones
        }
    }
}
