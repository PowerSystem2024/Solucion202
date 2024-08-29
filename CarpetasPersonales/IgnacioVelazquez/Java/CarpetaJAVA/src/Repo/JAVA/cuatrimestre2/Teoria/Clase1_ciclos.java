package Repo.JAVA.cuatrimestre2.Teoria;

public class Clase1_ciclos {

    public static void main(String[] args) {
        /*
         * Sintaxis básica:
         * ----------------
         * while (condición) {
         *     // Bloque de código que se ejecuta mientras la condición sea verdadera
         * }
         *
         */


        int conteo = 0;

        while(conteo <= 10 ){
            System.out.println("conteo = " + conteo);
            conteo++;
        }

        /*
         * Ciclo do-while
         * --------------
         *
         * El ciclo `do-while` es similar al `while`, pero con una diferencia clave:
         * el bloque de código se ejecuta al menos una vez, ya que la condición se
         * evalúa después de la ejecución.
         *
         * Sintaxis:
         * ---------
         * do {
         *     // Bloque de código
         * } while (condición);
         *
         * Ejemplo:
         */
        int j = 1;
        do {
            System.out.println(j);  // Se imprime j
            j++;                    // Se incrementa j
        } while (j <= 3);           // Condición: se repite mientras j <= 5


        /*
         * Ciclo for
         * ---------
         *
         * El ciclo `for` se utiliza cuando se conoce de antemano el número de
         * iteraciones. Es ideal para iterar sobre arreglos o rangos de valores.
         *
         * Sintaxis:
         * ---------
         * for (inicialización; condición; actualización) {
         *     // Bloque de código
         * }
         *
         * Ejemplo:
         */
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);  // Imprime valores de 1 a 5
        }

        /*
         * break y continue
         * ----------------
         *
         * - `break` se usa para salir de un ciclo inmediatamente.
         * - `continue` se usa para saltar a la siguiente iteración del ciclo.
         *
         * Ejemplo de break:
         */

        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                break;  // Sale del ciclo cuando m es 3
            }
            System.out.println(m);
        }

        /*
         * Ejemplo de continue:
         */

        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;  // Salta la iteración cuando n es 3
            }
            System.out.println(n);
        }

        /*
         * Etiquetas (Labels)
         * ------------------
         *
         * Las etiquetas permiten identificar un ciclo para usarlo con `break` o
         * `continue` en ciclos anidados.
         *
         * Ejemplo:
         */

        inicio:  // Etiqueta para el ciclo externo
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                if (x == 2 && y == 2) {
                    System.out.println("salgo del ciclo");
                    break inicio;  // Sale del ciclo etiquetado
                }
                System.out.println("x=" + x + ", y=" + y);
            }
        }



    }
}
