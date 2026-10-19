package ni.edu.uam.sincronizacionycontroldehilos;

/**
 * Parte 1 - Experimento: condición de carrera.
 * Dos hilos incrementan el mismo contador sin protección.
 * El total esperado es 200 000, pero suele salir menor porque contador++ no es atómico.
 */
public class Carrera {
    static int contador = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable trabajo = () -> {
            for (int i = 0; i < 100_000; i++) {
                contador++;
            }
        };

        Thread a = new Thread(trabajo);
        Thread b = new Thread(trabajo);
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Total: " + contador);
    }
}
