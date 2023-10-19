package atencionClientes;

import java.util.concurrent.Semaphore;

class Cliente implements Runnable {
    private int id;
    private Semaphore semaforo;

    public Cliente(int id, Semaphore semaforo) {
        this.id = id;
        this.semaforo = semaforo;
    }

    public void run() {
        try {
            // El cliente espera a que haya un permiso disponible en el semáforo
            semaforo.acquire();
            System.out.println("El cliente " + id + " está siendo atendido.");
            Thread.sleep(5000);
            System.out.println("El cliente " + id + " ha sido atendido.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // El cliente libera el permiso que utilizó en el semáforo
            semaforo.release();
        }
    }
}