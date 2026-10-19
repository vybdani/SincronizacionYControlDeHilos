package ni.edu.uam.sincronizacionycontroldehilos;

/**
 * Contador encapsulado cuyo acceso está sincronizado.
 * Solo un hilo a la vez puede ejecutar incrementar() u obtener() sobre la misma instancia.
 */
class ContadorSeguro {
    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized int obtener() {
        return valor;
    }
}
