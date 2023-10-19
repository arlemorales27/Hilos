package atencionClientes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SimulacionAtencionClientes {
    public static void main(String[] args) {
        // Creamos un executor con 5 hilos para atender a los clientes
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Creamos un semáforo con 3 permisos, que representa la cantidad de clientes que pueden ser atendidos al mismo tiempo
        Semaphore semaforo = new Semaphore(3);

        // Creamos 10 clientes que requieren atención
        for (int i = 1; i <= 10; i++) {
            Cliente cliente = new Cliente(i, semaforo);
            executor.execute(cliente);
        }

        // Cerramos el executor
        executor.shutdown();
    }
}
